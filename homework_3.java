import java.util.Scanner;
import java.util.Random;


class homework_3{
    /**
     * @param args
     */
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int number = 11;
        int number2 =21;
        int x = 3;

        int int_random = random.nextInt(number);
        int int_random2 = random.nextInt(number2);
       System.out.println("Please enter number 0 - " + (number - 1) );
       //int answer = scan.nextInt();
       //System.out.println(int_random);  shows output of random number
       
       for(int i = 0; i < x;i++){ 
        int answer = scan.nextInt();

        if(answer < int_random){
            System.out.println("higher");
        }
        else{
            System.out.println("lower");
        }
       
        if(answer == int_random){
            System.out.println("Welcome to level 2");
            System.out.println();
            //System.out.println(int_random2); shows output of random number
            x = 3;
            System.out.println("Please enter number 0 - " + (number2 - 1) );

            for(i=0; i<x; i++){
                int answer2 = scan.nextInt();

                if(answer2 < int_random2){
                    System.out.println("higher");
                }
                else{
                    System.out.println("lower");
                }

                if(answer2 == int_random2){
                    System.out.print("WINNER!");
                     break;
                    
                }
         
            }
            
            break;

            }
            if(i>=2){
                System.out.println("LOSER!");
            }     
       
        }

        }
       
    }

    

