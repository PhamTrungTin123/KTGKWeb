<jsp:useBean id="numguess" type="BT3_1.NumberGuessBean" scope="session" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 Congratulations!  You got it.
   And after just <%= numguess.getNumGuesses() %> tries.<p>
   <% numguess.reset(); %>
   Care to <a href="BT3_1start.jsp">try again</a>?

</body>
</html>