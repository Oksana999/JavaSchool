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

<div style="width:800px; height:600px; padding:20px; text-align:center; border: 10px solid #787878">
<div style="width:750px; height:550px; padding:20px; text-align:center; border: 5px solid #787878">
       <span style="font-size:50px; font-weight:bold">Certificate of Completion</span>
       <br><br>
       <span style="font-size:25px"><i>This is to certify that</i></span>
       <br><br>
       <!--  <span style="font-size:30px"><b><c:out value="${currentUser.fName}" /></b></span><br/><br/> -->
       <span style="font-size:30px"><b>${currentUser.fName}</b></span><br/><br/>
       <span style="font-size:25px"><i>has completed the course</i></span> <br/><br/>
       <span style="font-size:30px">$course.getName()</span> <br/><br/>
       <span style="font-size:20px">with score of <b>$grade.getPoints()%</b></span> <br/><br/><br/><br/>
       <span style="font-size:25px"><i>dated</i></span><br>
      #set ($dt = $DateFormatter.getFormattedDate($grade.getAwardDate(), "MMMM dd, yyyy"))
      <span style="font-size:30px">$dt</span>
</div>
</div>


<!-- 
 <jsp:useBean id="optionsBean" class="com.claim.controller.OptionsBean" /> 

      <!--   <select>
          <c:forEach var="option" items="${optionsBean.options}">
            <option>${option}</option>
          </c:forEach>
        </select>--> 
<!-- 
		<h1> Congratulations! "${session.getUser.getfName}" You get a certificate !</h1>
		<a href = "/">Home</a> <br>
		
		<c:forEach var="user" items="${fName}">
		<td><c:out value="${session.getUser.fName}"/></td> 
		</c:forEach>
		
		<!--  <c:out vale="${getSession.User.getFname}"/>-->
<!-- 		
		<br>
		
		<img src="http://maxoff.co/wp-content/uploads/2018/05/certificate-template-word-free-unique-certificate-excellence-template-word-of-certificate-template-word-free.png" width="550" height="450"/>			
		<img src="http://s019.radikal.ru/i617/1206/ff/a41c1e11ccc2.jpg" alt="Pic 4" width="300" height="250"/>
		 -->

</body>
</html>