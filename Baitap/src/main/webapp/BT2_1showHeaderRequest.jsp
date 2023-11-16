<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <body BGCOLOR="#FDF5E6">
      <H1 ALIGN="CENTER">Showing Request Headers</H1>
      <B>Request Method:</B><%=request.getMethod()%><BR>
      <B>Request URI:</B><%=request.getRequestURI()%><BR>
      <B>Request Protocol:</B><%=request.getProtocol()%><BR><BR>
      <TABLE BORDER=1>
         <TR BGCOLOR="#FFAD00"><TH>Header Name<TH>Header Value 
         <%
         Enumeration<String> headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement(); 
         %>
         <TR><TD><%=headerName%><TD><%=request.getHeader(headerName)%> 
         <% } %>
      </TABLE>
</body>
</html>