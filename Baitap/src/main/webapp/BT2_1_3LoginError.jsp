<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>username or password is incorrect!</p>
  <%@include file="BT2_1_3Index.jsp"%>
  <p>Entered username: <%= request.getParameter("name") %></p>
    <p>Entered password: <%= request.getParameter("password") %></p>

</body>
</html>