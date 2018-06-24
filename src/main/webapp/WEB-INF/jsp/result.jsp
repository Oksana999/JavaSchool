<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome to Result page !</h1>

	<br>

	<c:if test="${grade.grade eq 'A'}">
	<h2>
		Congratulations!
	</h2>
</c:if>

<h2>Your test score "${grade.grade}"</h2>
	<br>
	<a href="/">Home</a> 

</body>
</html>