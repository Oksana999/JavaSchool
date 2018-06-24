<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	My Registration Page !!!
	
	<br><br>
	<form:form actoin = "/register" method="POST" modelAttribute="user">
		First Name: <form:input path="fName"/>
		<br></br>
		Last Name: <form:input path="lName"/>
		<br></br>
		Email: <form:input path="email"/>
		<br></br>
		Password: <form:input path="password"/>
		
		<input type="submit"/>
	</form:form>
	<br>
	<a href="/">Home</a>
	

</body>
</html>