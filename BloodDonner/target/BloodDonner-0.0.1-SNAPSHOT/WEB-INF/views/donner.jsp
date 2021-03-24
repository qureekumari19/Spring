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
<span style="color: red;">${name}</span>
	<br> Donner Address:
	<span style="color: red;">${det.address.toUpperCase()}</span>
	<br> Donner BloodGroup:
	<span style="color: red;">${det.bd.toUpperCase()}</span>
	<br> Donner Phone-Number:
	<span style="color: red;">${det.phone_number}</span>
	<br>	
</body>
</html>