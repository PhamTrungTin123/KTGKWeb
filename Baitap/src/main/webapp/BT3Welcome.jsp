<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome ${registeredUser.firstname} of ${registeredUser.company} company</h1>
<i style="text-decoration: bold underline">You can log in with: </i> 
<form action="">
<table>
<tr>
<td align="right" width="20%">username: ${registeredUser.email} </td>
<td> ${registeredUser.email}</td>
</tr>
</table></form>
    
</body>
</html>