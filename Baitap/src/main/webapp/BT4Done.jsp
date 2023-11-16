<%@ page language="java" contentType="text/html;charset=utf-8"
    import = "BT4.Conclusion"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>Insert title here</title>
</head>
<body>
  <jsp:useBean id="quizTest" type="BT4.QuizTest" scope="session" />
   <p><b>Cám ơn bạn đã tham gia bài trắc nghiệm!</b>
   <p><b>Tổng điểm của bạn là: </b><%=quizTest.getTotalPoints()%>
   <p><b>Kết luận:</b>
      <% Conclusion con = (Conclusion) request.getAttribute("conclusion"); %>
   <p><%=con.getContent()%>
   <form method="post" action="QuizCareerTestServlet">
      <p><input type="submit" value="Start Again" name="startAgain">

</body>
</html>