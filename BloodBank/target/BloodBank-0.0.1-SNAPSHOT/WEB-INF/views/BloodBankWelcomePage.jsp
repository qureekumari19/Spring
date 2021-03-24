<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Enter the Donner Details:-<br>
<sf:form method="POST" modelAttribute="donner">
   Name:<sf:input path="name"/><br>
   Address:<sf:input path="address"/><br>
   phone_number:<sf:input path="phone_number"/><br> 
   Blood Group:<sf:input path="bd"/><br>
   <input type="submit" value="GO">
</sf:form>
<a href="/BloodBank/">Click here to go to Home page</a><br>
</body>
</html>