<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<head>
<meta http-equiv="Content-Language" content="en-us">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Form</title>
</head>
<body>
   <h1>Register Form</h1>
   <form action="" method="post">
   <table>
   <tr>
   <td width="30%" align="right">*Email</td>
   <td><input type="text" name="Email" size="37"></td>
   </tr>
   <tr>
   <td width="30%" align="right">*Password</td>
   <td><input type="password" name="password" size="27"></td>
   </tr>
   <tr>
   <td width="30%" align="right">*First name</td>
   <td><input type="text" name="fname" size="27"></td>
   </tr>
   <tr>
   <td width="30%" align="right">*Last name</td>
   <td><input type="text" name="lname" size="37"></td>
   </tr>
   <tr>
   <td align="right" width="30%">Sexual</td>
   <td><input type="radio" name="gen" value="male">Male
   <input type="radio" name="gen" value="female">Female</td>
   </tr>
   <tr>
   <td width="30%" align="right">*Year of birth</td>
   <td><input type="date" name="Date" min="2023-01-01" max="2023-01-30" size="37"></td>
   </tr>
   <tr>
   <td width="30%" align="right">*Industry</td>
   <td><select name ="Industry">
   <option hidden>[Select Industry]</option>
   <optgroup label="New">
   <option>Computer</option>
   </optgroup>
   <optgroup label="Old">
   <option>Distribution</option>
   </optgroup>
   </select></td>
   </tr>
   
   </table>
   </form>
  

</body>
</html>