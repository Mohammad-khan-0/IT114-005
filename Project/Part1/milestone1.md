<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Mohammad Khan (mtk22)</td></tr>
<tr><td> <em>Generated: </em> 10/23/2022 7:25:00 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-milestone1/grade/mtk22" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project</li><li>Create a milestone1.md file inside the project folder</li><li>Git add/commit/push it to Github</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example of the lessons</li><ol><li>Recommended Part 5, but Part 4 should be sufficient</li><li><a href="https://github.com/MattToegel/IT114/tree/Module5/Module5">https://github.com/MattToegel/IT114/tree/Module5/Module5</a>&nbsp;<br></li></ol><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/f2c037/000000?text=Partial"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/197415625-84f534a5-20a0-4129-b496-33656b98034b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>server running and shows clients connected<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/197415928-257b57b5-36fb-49af-a693-265fa16cd7eb.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows clients connected and and waiting for input <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p>(missing)</p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/197418809-3c17caf6-af69-40e6-9df5-366ac91aaf7b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>clients communicating<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/197419304-8ad851f7-35b1-4c7c-ad7e-6ed3e3c15d0d.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>creating and communicating through rooms<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted, and received</td></tr>
<tr><td> <em>Response:</em> <p>messages are sent through client with send methods such as sendMessage() which generates<br>a payoad and sendConnect() will connect payload to output. The server thread has<br>3 helping methods sendMessage()-used to send message to backend, send connectionStatus()- connection of<br>client and send() with writes payload to output. The room can make private<br>rooms and both clients can communicate to the server in 2 different rooms<br>at the same time. The way the client will receieve messages is by<br>connecting to the server and waiting for the payload&nbsp; which is run in<br>a while loop.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist on the right</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/197419567-6890dd36-c58b-42f7-805b-2e0f454a7bd3.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows disconnecting <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <p>A client disconnects by running /disconnect. From server side perspective it has to<br>listen to 1 less socket since 1 client socket dropped. And they both<br>close a connection to each other. It restarts and tries to look for<br>new connection. The server doesn&#39;t crash when clients disconnect because server is binded<br>by the users internet and port number. The client typically needs the server.<br>The server doesn&#39;t need the client.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Mohammad-khan-0/IT114-005/pull/7">https://github.com/Mohammad-khan-0/IT114-005/pull/7</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-milestone1/grade/mtk22" target="_blank">Grading</a></td></tr></table>