te<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form method="POST" modelAttribute="employee">
  <span>Enter the Donner Details</span><br>
     ID:<sf:input path="id"/><sf:errors path="id"/><br><br>
     Name:<sf:input path="name"/><sf:errors path="name"/><br><br>
     Email:<sf:input path="email"/><sf:errors path="email"/><br><br>
     
  <input type="submit" value="Go">
</sf:form>
</body>
</html>