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
<sf:form method="POST" modelAttribute="take">
  <span>Account Details</span><br>
   Cash Remain:- Account Number ${t.getAccno()} , Amount ${t.getAmount()}<br>
   <a href="/Site/we">Click here To Go To Home Page</a>
</sf:form>
</body>
</html>