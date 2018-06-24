 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="assets/css/style.css"/>
<link rel="stylesheet" href="assets/css/header.css"/>
<link rel="stylesheet" href="assets/css/cert.css"/>
<link rel="stylesheet" href="assets/css/button.css"/>
<title>Insert title here</title>
</head>
<body>
	
    	
		
			<a href="/" class="myButton">Home</a>
		
	<div class="testFooter1" >
	    <div class="container">
	    	<div class="cert-outline">
	    	<div class="cert">
				<div class="seal-img"></div>
				<span style="font-size:50px; font-weight:bold">Certificate of Completion</span><br/><br/>
				<span style="font-size:35px"><b>${currentUser.fName} ${currentUser.lName}</b></span><br/><br/>
				<span style="font-size:35px"><i>has completed the course</i></span> <br/><br/>
				<span style="font-size:35px">Java Course</span> <br/><br/>
				<span style="font-size:30px">with score of <b>${grade.grade}</b></span> <br/><br/><br/><br/>
				<span style="font-size:25px"><i>dated</i></span><br>
				<!-- #set ($dt = $DateFormatter.getFormattedDate($grade.getAwardDate(), "MMMM dd, yyyy")) -->
				<span style="font-size:30px">${date}</span>
	           
				<div class="img-bottom-right">
		    		<img src="http://s019.radikal.ru/i617/1206/ff/a41c1e11ccc2.jpg" alt="Pic 04"/>
		    	</div>	
		    </div>
		    </div>
		      
	    </div>
	</div>
</body>
</html>