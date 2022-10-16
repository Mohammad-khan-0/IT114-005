

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Server {
    int port = 3001;
    // connected clients
    private List<ServerThread> clients = new ArrayList<ServerThread>();

    private void start(int port) {
        this.port = port;
        // server listening
        try (ServerSocket serverSocket = new ServerSocket(port);) {
            Socket incoming_client = null;
            System.out.println("Server is listening on port " + port);
            do {
                System.out.println("waiting for next client");
                if (incoming_client != null) {
                    System.out.println("Client connected");
                    ServerThread sClient = new ServerThread(incoming_client, this);
                    
                    clients.add(sClient);
                    sClient.start();
                    incoming_client = null;
                    
                }
            } while ((incoming_client = serverSocket.accept()) != null);
        } catch (IOException e) {
            System.err.println("Error accepting connection");
            e.printStackTrace();
        } finally {
            System.out.println("closing server socket");
        }
    }
    protected synchronized void disconnect(ServerThread client) {
		long id = client.getId();
        client.disconnect();
		broadcast("Disconnected", id);
	}
    //mf62
    //10-9-2022
    //FlipCoin method, broadcasts the result of coin flip to all clients(for feature 1)
    protected synchronized void FlipCoin(ServerThread client) {
        long id = client.getId();
		Random randomNum = new Random();
        int result=randomNum.nextInt(2);
        if (result==0){
            String message="Flipped heads";
            broadcast(message, id);
        }
        else{
            String message="Flipped tails";
            broadcast(message, id);
        }
		
	}
    //mf62
    //10-9-2022
    //ShuffleMessage method, broadcasts message with characters shuffled to all clients(for feature 2)
    protected synchronized void ShufflMessage(String message,ServerThread client) {
		long id = client.getId();
        String aftershuffle="";
        List<String>chars=Arrays.asList(message.substring(8).split(""));
        Collections.shuffle(chars);
        for (String character:chars)
        {
            aftershuffle+=character;
        }
		broadcast(aftershuffle, id);
	}
    
    protected synchronized void broadcast(String message, long id) {
        if(processCommand(message, id)){

            return;
        }
        // let's temporarily use the thread id as the client identifier to
        // show in all client's chat. This isn't good practice since it's subject to
        // change as clients connect/disconnect
        message = String.format("User[%d]: %s", id, message);
        // end temp identifier
        
        // loop over clients and send out the message
        Iterator<ServerThread> it = clients.iterator();
        while (it.hasNext()) {
            ServerThread client = it.next();
            boolean wasSuccessful = client.send(message);
            if (!wasSuccessful) {
                System.out.println(String.format("Removing disconnected client[%s] from list", client.getId()));
                it.remove();
                broadcast("Disconnected", id);
            }
        }
    }

    private boolean processCommand(String message, long clientId){
        System.out.println("Checking command: " + message);
        //mf62
        //10-9-2022
        //Check command from client if it is coin toss, call FlipCoin method(for feature 1)
        if(message.equalsIgnoreCase("coin toss")){
            broadcast("Requested Coin Toss",clientId);
            Iterator<ServerThread> it = clients.iterator();
            while (it.hasNext()) {
                ServerThread client = it.next();
                if(client.getId() == clientId){
                    FlipCoin(client);
                    
                    break;
                }
            }
            return true;
        }
        //mf62
        //10-9-2022
        //If client adds shuffle before the begining of the message, shuffle the message(for feature 2)
        try{
        if(message.substring(0, 7).equalsIgnoreCase("shuffle")){
            broadcast("Requested Shuffle Message",clientId);
            Iterator<ServerThread> it = clients.iterator();
            while (it.hasNext()) {
                ServerThread client = it.next();
                if(client.getId() == clientId){
                    ShufflMessage(message,client);
                    
                    break;
                }
            }
            return true;
        }} catch (Exception e){
            ;
        }
        
        if(message.equalsIgnoreCase("disconnect")){
            Iterator<ServerThread> it = clients.iterator();
            while (it.hasNext()) {
                ServerThread client = it.next();
                if(client.getId() == clientId){
                    it.remove();
                    disconnect(client);
                    
                    break;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Starting Server");
        Server server = new Server();
        int port = 3000;
        try {
            port = Integer.parseInt(args[0]);
        } catch (Exception e) {
            // can ignore, will either be index out of bounds or type mismatch
            // will default to the defined value prior to the try/catch
        }
        server.start(port);
        System.out.println("Server Stopped");
    }
}