<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 Welcome to the Number Guess game.
   <p>I'm thinking of a number between 1 and 100.
   <form method=get action="NumGuessServlet">
      <p>What's your guess? <input type=text name=guess> 
      <input type=submit value="Submit">
   </form>

</body>
</html>