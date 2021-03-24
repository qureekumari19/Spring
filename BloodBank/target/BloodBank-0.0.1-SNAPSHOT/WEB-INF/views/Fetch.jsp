<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sf:form method="POST" modelAttribute="detail">
      Enter the name Whose details You want to fetch<br>
      <sf:input path="name" /><br>
      <input type="submit" value="Fetch"> 
    </sf:form>    
</body>
</html>