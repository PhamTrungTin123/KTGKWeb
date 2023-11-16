<%@ page language="java" contentType="text/html;charset=utf-8"
     import="BT4.Question" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="quizTest" class="BT4.QuizTest" scope="session" />
   <% Question currentQuestion = quizTest.getCurrentQuestion();%>
   <b>Câu hỏi <%=quizTest.getCurrentQuestionIndex() + 1%>:</b>
   </br>
   <p><%=currentQuestion.getContent()%>
   <form method="post" action="QuizCareerTestServlet">
      <% for (int i = 0; i < currentQuestion.getOptions().length; i++) {%>
         <p><input type="radio" value="<%=i%>" name="choose">
          <%=currentQuestion.getOptions()[i].getContent()%>
      <%}%>
      <p><input type="submit" value="Next" name="next">
   </form>

</body>
</html>