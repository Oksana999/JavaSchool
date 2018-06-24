<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Projection by TEMPLATED</title>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/test.css"/>
		
	</head>
<body>
	
	<h1 class="header-login logo" >Please, login to start!</h1>
    <br>
    <c:if test = "${not empty message}">
    	${message}
   	</c:if>
    <br>
	<form:form action="login" method="POST" modelAttribute="user">
		Email: <form:input path="email"/>
		<br></br>
		Password: <form:input path="password"/>
		
		<input type="submit"/>
	</form:form>
	<br>
	
	  <a href = "/">Home</a>
	  <a class="active" href="/register">Register</a>
	  
	  <img src="https://img.getbg.net/upload/full/11/563539_goryi_priroda_krasivyiy_verhushki_snejnyie_u_ozero_1920x1080_(www.GetBg.net).jpg" alt="Pic 01" width=1600 height=690/>
</body>
</html>