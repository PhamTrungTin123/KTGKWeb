<jsp:useBean id="numguess" class="BT3_1.NumberGuessBean" scope="session"/>
<jsp:setProperty name="numguess" property="*"/>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="white">
	<% if (numguess.getSuccess()) { %>


	Congratulations! You got it. And after just
	<%= numguess.getNumGuesses() %>
	tries.
	<p>


		<% numguess.reset(); %>


		Care to <a href="numguess.jsp">try again</a>?


		<% } else if (numguess.getNumGuesses() == 0) { %>


		Welcome to the Number Guess game.
	<p>I'm thinking of a number between 1 and 100.
	<p>
	<form method=get>
		What's your guess? <input type=text name=guess> <input
			type=submit value="Submit">
	</form>


	<% } else { %>


	Good guess, but nope. Try
	<b><%= numguess.getHint() %></b>. You have made
	<%=numguess.getNumGuesses() %>
	guesses.
	<p>I'm thinking of a number between 1 and 100.
	<p>
	<form method=get>
		What's your guess? <input type=text name=guess> <input
			type=submit value="Submit">
	</form>





</body>
</html>