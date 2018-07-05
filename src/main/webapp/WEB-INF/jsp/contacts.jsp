<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.0/normalize.min.css"/>
        <link rel="stylesheet" href="assets/css/app.css"/>
        <link rel="stylesheet" href="assets/css/contacts.css"/>
        <link rel="stylesheet" href="assets/css/headers1.css"/>
        <title>Contacts</title>
        <style>
         body {
			    background-color: #EAE3D7;    
			    background-position:center;
			    background-position:top;
			    background-repeat: no-repeat;
			   }
  </style> 
   </style>
    </head>
    <body>
    <section id="banner">
        <!-- Header -->
        <header id="header">
            <div class="left">
                <a href="/"><div class="logo">
                        <svg id="Layer_1" style="enable-background:new 0 0 96 96;" version="1.1" viewBox="0 0 96 96" xml:space="preserve" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                            <g><path d="M87,9v67.4L48.8,86.6c-0.1,0-0.4,0.1-0.8,0.1c-0.5,0-0.8,0-0.8-0.1L9,76.4V9h36.6h4.9H87 M90.6,3H50.4c-1.3,0-3.6,0-4.9,0   H5.4C4.1,3,3,4.1,3,5.4v73.1c0,1.3,1.1,2.7,2.4,3.1l40.3,10.7c0.7,0.2,1.5,0.3,2.4,0.3s1.7-0.1,2.4-0.3l40.3-10.7   c1.3-0.3,2.4-1.7,2.4-3.1V5.4C93,4.1,91.9,3,90.6,3L90.6,3z"/></g><line class="st0" x1="3" x2="93" y1="18" y2="18"/><g><path class="st0" d="M4,70l41.4,11.3c1.4,0.4,3.7,0.4,5.1,0L92,70"/></g><g><path d="M25,59.6l0.7-2.8c0.3,0.1,0.7,0.2,1,0.2c1,0,1.4-0.7,1.4-2.1v-13H32v12.9c0,2.8-1.1,5.2-4.7,5.2C26.2,60,25.5,59.8,25,59.6   z M27.8,38c0-1.2,1-2,2.3-2c1.3,0,2.3,0.8,2.3,2c0,1.2-1,2-2.3,2C28.8,40,27.8,39.2,27.8,38z"/><path d="M34,51.3c0-2.7,2.2-4.2,7.4-4.7c-0.1-1.2-0.6-1.9-2.1-1.9c-1.1,0-2.2,0.4-3.5,1.2l-1.4-2.5c1.7-1,3.5-1.7,5.6-1.7   c3.4,0,5.2,1.9,5.2,5.9v7.4h-3.2l-0.3-1.3h-0.1c-1.1,1-2.3,1.6-3.8,1.6C35.5,55.2,34,53.5,34,51.3z M41.4,51.1v-2.3   c-2.8,0.4-3.7,1.2-3.7,2.1c0,0.8,0.6,1.2,1.5,1.2C40.1,52.2,40.7,51.8,41.4,51.1z"/><path d="M46.4,41.9h3.9L52,48c0.3,1.3,0.7,2.6,1,4h0.1c0.3-1.4,0.7-2.7,1-4l1.7-6.1h3.7l-4.3,13h-4.5L46.4,41.9z"/><path d="M59.7,51.3c0-2.7,2.2-4.2,7.4-4.7c-0.1-1.2-0.6-1.9-2.1-1.9c-1.1,0-2.2,0.4-3.5,1.2l-1.4-2.5c1.7-1,3.5-1.7,5.6-1.7   c3.4,0,5.2,1.9,5.2,5.9v7.4h-3.2l-0.3-1.3h-0.1c-1.1,1-2.3,1.6-3.8,1.6C61.2,55.2,59.7,53.5,59.7,51.3z M67.1,51.1v-2.3   c-2.8,0.4-3.7,1.2-3.7,2.1c0,0.8,0.6,1.2,1.5,1.2C65.8,52.2,66.4,51.8,67.1,51.1z"/></g></svg>
                    </div></a>
            </div>
            <div class="right">
                <nav id="nav">
                    <!--	<a href="/">Home</a>  -->
                    <a href="register">Register</a>
                    <c:choose>
                        <c:when test="${sessionScope.currentUser == null}">
                            <a href="login">Login</a>
                        </c:when>    
                        <c:otherwise>
                            <a href="logout">Logout</a>
                        </c:otherwise>
                    </c:choose>
                </nav>
                <a href="#navPanel" class="navPanelToggle"><span class="fa fa-bars"></span></a>
            </div>
        </header>

        <div class="inner">
            <h1>Contact Us</h1>
        </div>
    </section>
     
    <div class="container right">	
        <div class="contacts">
            <p><b>Oksana Ross</b></p>
            <p>tel: +1 (510) 634 4209</p>
            <p>mail: oksana.ross@gmail.com</p>
            <p>addr: Broadmoor, CA 94015</p>
        </div>
        <div class="center">
       
        	<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d17863.402170681806!2d-122.50880441043026!3d37.67662693612937!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x808f7c666b029f1f%3A0xf75d69fab1e22ace!2s006122120%2C+Broadmoor%2C+CA+94015!5e0!3m2!1sen!2sus!4v1530469453730" style="position: absolute; top: 330px; left: 550px;" width="650" height="365" frameborder="0" style="border:0" allowfullscreen></iframe>
        </div>
    </div>
    <br>
    <div class="center">       	
            	<a class="myButton" style="position: absolute; top: 750px; left: 780px;" href="/">Home</a>	
            </div>
</body>
</html>