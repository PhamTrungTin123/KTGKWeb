<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Ban thich nganh nghe nao nhat trong cac nganh nghe sau day</p>
      <form method="POST" action="SurveyServlet">
         <p><input type="radio" value="giao_vien" name="nghe">Giao Vien</p>
         <p><input type="radio" value="bac_si" name="nghe">Bac Si</p>
         <p><input type="radio" value="doanh_nhan" name="nghe">Doanh Nhan</p>
         <p><input type="radio" value="kien_truc_su" name="nghe">Kien Truc Su</p>
         <p><input type="radio" value="nhac_si" name="nghe">Nhac Si</p>
         <p><input type="radio" value="ca_si" name="nghe">Ca Si</p>
         <p><input type="submit" value="Chon"></p>
      </form>
      

</body>
</html>