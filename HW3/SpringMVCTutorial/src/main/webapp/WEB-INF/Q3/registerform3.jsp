<html>
   <body>
      
      <form action = "result3" method = "Post">
         First Name: <input type = "text" name = "first_name">
         <br />
         Last Name: <input type = "text" name = "last_name" />
		 <br />
		 
		 
		 <label>Date of Birth</label><br>
		 <select name="date_of_birth">
			<option value="">--Please choose an option--</option>
			<option value="1995">1995</option>
			<option value="1996">1996</option>
			<option value="1997">1997</option>
			<option value="1998">1998</option>
			<option value="1999">1999</option>			
			<option value="2000">2000</option>
		 </select>
		
		 
		 <% int sw=0;
		 if(request.getParameter("first_name")==null){
			System.out.println("*");
		 sw = 1; %>
		 <form action = "registerform3" method = "Post">
		 				<p style="color:red;"> you must fill your First Name </p>
		 <% } %>
		 <% if(request.getParameter("last_name")==null){
		    sw = 1; %>
		 		 		<p style="color:red;"> you must fill your Last Name </p>
		 <% } %>
		 <% if(request.getParameter("date_of_birth")==null){
		    sw = 1; %>
		 				<p style="color:red;"> you must chosse your Date of birth </p>
		 <% } %>
		 <%if(sw==0){ %>


		  <% } %>
		 
		 
			
			
		<br />  
         <input type = "submit" value = "Submit" />
		 
		 
      </form>
      
   </body>
</html>