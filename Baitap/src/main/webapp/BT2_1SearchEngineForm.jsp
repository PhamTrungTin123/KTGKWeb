<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="BT2_1.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>One-Stop Web Search!</h1>
   <form action="SearchProcessServlet">
      <label for="searchString">Search keywords:</label> 
      <INPUT TYPE="TEXT" NAME="searchString">
      <P>
         <%
         SearchEngineSpec[] specs = SearchUtilities.getCommonSpecs();
         for (int i = 0; i < specs.length; i++) {
         	String searchEngineName = specs[i].getName(); 
         %>
            <INPUT TYPE="RADIO" NAME="searchEngine" VALUE="<%=searchEngineName%>">
            <%=searchEngineName%><BR>
      <% } %>
         <input type="submit" value="Search">
   </form>

</body>
</html>