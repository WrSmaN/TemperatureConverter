<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
Celsius: ${userTemperature.getTemp()} <br>
Fahrenheit: ${userTemperatureC.getTemp()} <br>

<a href="index.jsp">Calculate another temperature</a>
</body>
</html>