<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
	<head>
		<title>Projection by TEMPLATED</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css"/>
		<link rel="script" href="assets/js/script.js"/>
		<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.0/normalize.min.css"/>
        <link rel="stylesheet" href="assets/css/style.css"/>
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
       <!--   <script src="script.js"></script> -->
	</head>
	<body>

		<!-- Header -->
			<header id="header">
				<div class="inner">
					<a href="index.html" class="logo"><strong>Programming School</strong></a>
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

		<!-- Banner -->
			<section id="banner">
				<div class="inner">
					<header>
						<h1>Welcome to Our Java School!</h1>
					</header>
					
				

					<div class="flex ">

						<div>
							 
							<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSl2GmUCYZaiscvjyAgfiX4ZUMxsrNq29LqR04ECQ66Sw2pYcB8w" alt="Pic 01" width=100 height=90/>
							<footer>
								<a href="myclass" class="button">Start Your Class</a>
							</footer>

				       </div>  

				       <div>
							 
							<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Duke_%28Java_mascot%29_waving.svg/2000px-Duke_%28Java_mascot%29_waving.svg.png" alt="Pic 01" width=100 height=90/>
							<footer>
								<a href="test" class="button">Test</a>
							</footer>

			         </div>
						
			        <div class="popup hidden">
			            <div class="popup-window">
			                <div class="close">&times;</div>
			                <div class="popup-content">
			                    Hey, this is a popup!
			                </div>
			            </div>
			        </div>
							
					<div>
						 
						<img src="https://us.123rf.com/450wm/sakura28/sakura281703/sakura28170300428/73588350-crystal-trophy-certificate-design-template-on-red-background-vector-illustration.jpg?ver=6" alt="Pic 01" width=100 height=90/>
						<footer>
							<a href="certificate" class="button">Certificate!</a>
						</footer>
					</div>		
			    </div>
		    </div>
	    </section>

		<!-- Three -->
			<section id="three" class="wrapper align-center">
				
				<div class="inner">
					<div class="flex flex-2">
						<article>
							<div class="image round">
								 <img src="http://obrazovanie.by/wp-content/uploads/2016/02/online-study.jpg" alt="Pic 01" width=180 height=120/>
								
								
							</div>
							
							<footer>
								<a href="about" class="button">More about our school</a>
							</footer>
						</article>
						<article>
							<div class="image round">
								<img src="https://st.depositphotos.com/1005893/2625/i/950/depositphotos_26257425-stock-photo-indian-graduate-student-showing-her.jpg" alt="Pic 02" width=180 height=120 />
							</div>
							
							<footer>
								<a href="contacts" class="button">Our Contacts</a>
							</footer>
						</article>
					</div>
				</div>
			</section>

	<!-- 	<script>
			$(document).ready(function () {
			    $(".popup").toggleClass("hidden");
			    
			    $(".close").click(function () {
			        $(".popup").toggleClass("hidden");
			    });
			});
		</script>  -->

		<!-- Scripts -->
	<!--		<script src="src/main/resources/img/static/assets/js/jquery.min.js"height: 300></script>
			<script src="src/main/resources/img/static/assets/js/skel.min.js"></script>
			<script src="src/main/resources/img/static/assets/js/util.js"></script>
			<script src="src/main/resources/img/static/assets/js/main.js"></script> -->

	</body>
</html>