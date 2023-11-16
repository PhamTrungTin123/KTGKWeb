<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import = "BT2.SurveyData,BT2.SurveyItem"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
           SurveyData data = (SurveyData) application.getAttribute("surveyData");
           String description = data.getDescription(request.getParameter("nghe"));
           
        %>
        <p>Cam on ban da tham gia cuoc khao sat</p>
        <b>Nghe nghiep ban yeu thich nhat la: <%=description %></b>
        <h2>Ket qua:</h2>
        Tong so nguoi tham gia binh chon la : <%= data.getToTal() %> trong do:
        <br>
        <br>
        <% for (SurveyItem item : data.getSurveyItems()) { %>
            Co <%= data.getPercent(item.getName()) %> 
            % nguoi tham gia binh chon thich nghe <%= item.getDescription() %><br>
        <% } %>

</body>
</html>