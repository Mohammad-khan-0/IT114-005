<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Mohammad Khan (mtk22)</td></tr>
<tr><td> <em>Generated: </em> 12/22/2022 6:07:53 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-chatroom-milestone4/grade/mtk22" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/209238551-7ab8b438-e55b-4204-a3e8-2a028786c862.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows export button <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/209238623-97fac693-e43d-4707-acf5-42bbcd076b96.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows code for the button but it wont work <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/209238623-97fac693-e43d-4707-acf5-42bbcd076b96.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>not working unfortunately , code is above <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>I tried to make it so when hitting the export button the code<br>would make a txt doc that says chatHistory.txt, but unfortunately it has multiple<br>errors and I have to leave it commented out&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/f2c037/000000?text=Partial"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> <p>not available <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/209238772-21c9810b-5716-43c5-bd1d-07b5eec8edab.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code of mute/unmute <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/209238837-1e73c39a-49bb-46d8-9f06-b5d4857915dd.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code of list <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>so this should add to the users list and from that users list<br>it was supposed to go to chatHistory.txt.&nbsp; It is not working so I<br>sent a pic of the code.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/209238267-bd6ede75-d691-45cb-bcda-bec29da260f2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>mute and unmute<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/209239424-096eb566-ef82-4886-a090-1a1a7d75cf43.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>mute unmute <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>in the line unmutedperoson.sendmessage the line will execute and send a message to<br>a specific client. but they arent actually added.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/f2c037/000000?text=Partial"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> <p>unavailable <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> <p>unavailable <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>I wasn&#39;t able to implement much I apologize in advanced and I am<br>very embarrassed about this project.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-chatroom-milestone4/grade/mtk22" target="_blank">Grading</a></td></tr></table>