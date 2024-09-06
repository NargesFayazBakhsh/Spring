<html>
   <head>
      <title>Using GET and POST Method to Read Form Data</title>
   </head>
   
   <body>
      <center>
      <h1>Register Form Q2</h1>
      
      <ul>
         <li><p><b>First Name:</b>
			<%= request.getParameter("first_name")%>
            <% if(request.getParameter("first_name")==""){%>
				<p style="color:red;"> you must fill your First Name </p>
			<% } %>
			
						
         </p></li>
         <li><p><b>Last  Name:</b>
			<%= request.getParameter("last_name")%>
			<% if(request.getParameter("last_name")==""){%>
				<p style="color:red;"> you must fill your Last Name </p>
			<% } %>
         </p></li>
		 <li><p><b>Date of Birth:</b>
			<%= request.getParameter("date_of_birth")%>
			<% if(request.getParameter("date_of_birth")==""){%>
				<p style="color:red;"> you must chosse your Date of birth </p>
			<% } %>
		 </p></li>
      </ul>
   </body>
</html>