<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="BT2_1.LoginBean2_1_3"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>You are successfully logged in!</p>
  <%
      LoginBean2_1_3 bean = (LoginBean2_1_3) request.getAttribute("bean");
      out.print("Welcome, " + bean.getName());
  %>

</body>
</html>