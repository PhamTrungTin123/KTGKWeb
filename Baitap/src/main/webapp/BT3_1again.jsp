<jsp:useBean id="numguess" type="BT3_1.NumberGuessBean" scope="session" />

<%@ page language="java" contentType="text/html; charset=utf-8"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
 <p>Good guess,but nope.Try</p><%= numguess.getHint() %>.You have made <%=numguess.getNumGuesses() %> guesses
 <p>I'm thinking of a number between 1 and 100</p>
 <p>What your guess? </p>
 <br>
 <form action="get" action="guess" >
 <input type="text" placeholder="Chọn số khác"> 
 <input type="submit" value="submit"></input>
 </form>
</body>
</html>