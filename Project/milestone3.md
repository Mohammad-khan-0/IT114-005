<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone3</td></tr>
<tr><td> <em>Student: </em> Mohammad Khan (mtk22)</td></tr>
<tr><td> <em>Generated: </em> 12/19/2022 11:48:18 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-chatroom-milestone3/grade/mtk22" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Connection Screens </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the screens with the following data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/208005385-7cea62a6-a71c-47ad-94ac-1a22672ec6c7.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>username host and port <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the code for each step of the process</td></tr>
<tr><td> <em>Response:</em> <p>user will run server.java and clientUI.java. after running clientUI.java user will be prompted<br>to enter username and and then enter to the chat room. They will<br>be placed in a default room called lobby.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Chatroom view </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/208006461-b7157517-a6ab-45b0-ba0e-7a1cb7381d41.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>chat room <br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Chat Activities </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show screenshots of the result of the following commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/208006939-a2b62320-3e1a-4294-ac32-232ac76f6878.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>picture of roll and flip in UI <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the code snippets for each command</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/208007068-b2aba432-43f3-40cf-bd13-768b9972f83e.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code of flip and roll <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code flow of each command</td></tr>
<tr><td> <em>Response:</em> <p>for roll the user needs to type in the command /roll and a<br>random number from 1-10 will be generated.&nbsp;<div><br></div><div>flip works the same way the user<br>types in flip and a random option will be generated from heads or<br>tails.</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Custom Text </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of examples</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/208008774-47062344-1ac1-4946-9c19-4818b99027af.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>displays all features<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/208008981-9bf132dd-ec58-4d4e-870d-ccef2eefa76c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/208009043-3310d0ee-e7ff-49e6-b15e-3cbb940fd60e.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how you got the UI side to render the text accordingly</td></tr>
<tr><td> <em>Response:</em> <p>in both flip and roll we have a function called &quot;sendmessage&quot; that has<br>2 paramotors(client and random_int ) . this function is from the server thread<br>and is responsible to send a message to the client through serverthread and<br>the random_int will generate the random numbers that are send and displayed to<br>the client.<div><br></div><div>in flip we have the same thing except we use math.random that<br>will randomly choose 2 options heads or tails&nbsp;</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Whisper </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/f2c037/000000?text=Partial"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing a demo of whisper commands</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> <p>dont have whisper command <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the server-side code snippets of how this feature works</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> <p>not available <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>unable to provide whisper command but it works by getting client name and<br>being able to send a message privately and only to that specified username<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 6: </em> Mute/Unmute </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/f2c037/000000?text=Partial"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots demoing this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/208563786-6de1a1ee-f023-4fe3-b1cb-13683bc97270.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>server thread function <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/208563875-526e47eb-0931-4409-9a32-3841cdfbdcc3.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>rooms <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113269080/208564024-5df253f2-b1ae-4c65-abdd-4c7746dc42ff.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>rooms<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshots of the code snippets that achieve this feature</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> <p>not available <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>in rooms I implemented in the commands &quot;mute&quot; and &quot;unmute &quot; I would<br>later put this in the process commands. from there I went into the<br>server thread and make an array list that has a function to insert<br>the client into the list if muted along with unmuting and checking inside<br>the list.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 7: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Pull request from milestone3 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Mohammad-khan-0/IT114-005/pull/10">https://github.com/Mohammad-khan-0/IT114-005/pull/10</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-chatroom-milestone3/grade/mtk22" target="_blank">Grading</a></td></tr></table>