<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Java EE World</title>
</head>
<body>
	<h1>Temperature Converter</h1>
	
	<form action="getTempFServlet"method="post">
	Enter a temperature in Fahrenheit:
	<input type="text"name="userTempF"size="10">
	<input type="submit"value="Calculate Temp in F"/>	
	</form>
	<br>
	<form action="getTempCServlet"method="post">
	Enter a temperature in Celsius:
	<input type="text"name="userTempC"size="10">
	<input type="submit"value="Calculate Temp in C"/>	
	</form>
	
</body>
</html>