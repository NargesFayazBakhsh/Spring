<html>
   <head>
      <title>Register Form Q1</title>
   </head>
   
   <body>
      <center>
      <h1>Register Form Q1</h1>
      
      <ul>
         <li><p><b>First Name:</b>
			<%= request.getParameter("first_name")%>			
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("last_name")%>
         </p></li>
		 <li><p><b>Date of Birth:</b>
			<%= request.getParameter("date_of_birth")%>
		 </p></li>
      </ul>
   </body>
</html>