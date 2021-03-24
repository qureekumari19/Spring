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
	Doner Name:
	<span style="color: red;">${donerdetails.name.toUpperCase()}</span>
	<br> Doner Address:
	<span style="color: red;">${donerdetails.address.toUpperCase()}</span>
	<br> Doner BloodGroup:
	<span style="color: red;">${donerdetails.bd.toUpperCase()}</span>
	<br> Doner Phone-Number:
	<span style="color: red;">${donerdetails.phone_number}</span>
	<br>	
</body>
</html>