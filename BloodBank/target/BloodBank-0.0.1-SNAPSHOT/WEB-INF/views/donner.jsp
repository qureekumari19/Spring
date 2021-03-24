<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Thank You For donating Your Blood<br>
<span style="color: red;">${donerdetails.name.toUpperCase()}</span>
	<br> Donner Address:
	<span style="color: red;">${donerdetails.address.toUpperCase()}</span>
	<br> Donner BloodGroup:
	<span style="color: red;">${donerdetails.bd.toUpperCase()}</span>
	<br> Donner Phone-Number:
	<span style="color: red;">${donerdetails.phone_number}</span>
	<br>	
</body>
</html>