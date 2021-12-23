<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="index.jsp" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
   
   </head>
<body>

 
	<div style="margin-left:25%; padding:1px 16px; text-align: justify; text-justify: inter-word;" >
	
		<h2 style="text-align: center; color: gray;">JWT INFORMATION</h2>
		<ul>
			<li><p>JWT stands for <b >JSON Web Token</b></p></li>
			<li>
				<p>Structure of JWT is consist of 3 parts HEADER <b style="font-size: 30px">.</b> PAYLOAD <b style="font-size: 30px">.</b>
					SIGNATURE , all are sperated with the "<b>.</b>" .
		 		</p>
		 	</li>
			<li><p>Generally HEADER consist of 2 things </p>
				<ul>
					<li>Type of token </li>	
					<li>Algorithm</li><br>
				</ul>
			</li>
			
			<li><p>Where as PAYLOAD consist of user information such as username role expiration date etc</p></li>
			<li><p>Last part is signature which has signature defined in it.</p></li>
			<li><p>An important point to remember about JWT is that the information in the payload of the JWT is visible to everyone.
			 There can be a "Man in the Middle" attack and the contents of the JWT can be changed. 
			 So we should not pass any sensitive information like passwords in the payload.
			  We can encrypt the payload data if we want to make it more secure. 
			  However we can be sure that no one can tamper and change the payload information. 
			  If this is done the server will recognize it.</p></li>
		</ul>
		
		 
		 
		 
		 <p></p>
	</div>
 
</body>
</html>


