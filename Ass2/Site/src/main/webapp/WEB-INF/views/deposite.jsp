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
<sf:form method="POST" modelAttribute="incre">
  <span>Enter the Details to Deposite Money</span><br>
     Account_Number:<sf:input path="accno"/><br><br>
     Amount To Deposite:<sf:input path="amount"/><br><br>     
     
  <input type="submit" value="Go">
</sf:form>
</body>
</html>