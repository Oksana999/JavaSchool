<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
   <link rel="stylesheet" href="assets/css/test.css"/>
    <link rel="stylesheet" href="assets/css/header.css"/>
</head>

<body>	
	<div class="header1">	
	
		

		<a class="logo">Welcome to take your test !</a>
	<!--  <h1 class="testHeader">Welcome to take your test !</h1>-->
			<div class="header1-right">
			 <a class="active" href="/">Home</a>
		 	<a class="active" href="myclass">Class</a>
			</div> 
		 <div class="img">
    	  <div class="img-overlay"></div>	
		</div>
	</div>	
	 
	<form:form method="POST" modelAttribute="questions" action="test">
		<table>
			<c:forEach items="${questions.questionsAnswersList}" var="q"
				 varStatus="status"> 
				<!--  <tr>-->
					 <td colspan="3"> 
						<h2>
							<c:out value="${q.question_id}. ${q.question}"></c:out>
							
						</h2>
					 </td> 
				</tr>
				<tr>
					<td><form:radiobutton
							path="questionsAnswersList[${status.index}].right_answer"
							value="a" /></td>
					<td><c:out value="${q.optionA}"></c:out></td>

				</tr>
				<tr>
					<td><form:radiobutton
							path="questionsAnswersList[${status.index}].right_answer"
							value="b" /></td>
					<td><c:out value="${q.optionB}"></c:out></td>

				</tr>

				<tr>
					<td><form:radiobutton
							path="questionsAnswersList[${status.index}].right_answer"
							value="c" /></td>
					<td><c:out value="${q.optionC}"></c:out></td>
				</tr>


<!--  				<br>
				<br> -->
			</c:forEach>
		</table>
		<br><br>
		<!--  <a class="active" href="/">Home</a>-->
		<input class="testFooter" type="submit" value="Submit">
	</form:form>

</body>
</html>