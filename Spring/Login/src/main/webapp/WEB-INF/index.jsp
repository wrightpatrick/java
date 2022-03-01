<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach ; c:if -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!-- Formatting (like dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Club</title>
  <!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
      rel="stylesheet" 
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
      crossorigin="anonymous">

</head>
<body>
    <div class="container"> <!-- Beginning of Container -->
		<h3 class="display-3 text-primary">Welcome!</h3>
		<h5 class="text-muted">Join our growing community.</h5>
		<div class="row"> <!--Row div to get Login next to Register-->
			<div class="col"> <!--Beginning of Register div-->
				<h4>Register</h4>
				<form:form action="/register" method="post" modelAttribute="newUser">
					<div>
						<form:label path="userName">Select a User Name</form:label>
						<form:errors path="userName" class="text-danger"/>
						<form:input path="userName" type="text" class="form-control"/>
					</div>
					<div>
						<form:label path="email">Enter Email</form:label>
						<form:errors path="email" class="text-danger"/>
						<form:input path="email" type="text" class="form-control"/>
					</div>
					<div>
						<form:label path="password">Choose Password</form:label>
						<form:errors path="password" class="text-danger"/>
						<form:input path="password" type="password" class="form-control"/>
					</div>
					<div>
						<form:label path="confirm">Confirm Password</form:label>
						<form:errors path="confirm" class="text-danger"/>
						<form:input path="confirm" type="password" class="form-control"/>
					</div>
					<input type="submit" value="Submit" class="btn btn-primary mt-2"/>
				</form:form>
			</div> <!-- End of Register div -->
			
			<div class="col"> <!--Beginning of Login div-->
				<h4>Login</h4>
				<form:form action="/login" method="post" modelAttribute="newLogin">
					<div>
						<form:label path="email">Enter Email</form:label>
						<form:errors path="email" class="text-danger"/>
						<form:input path="email" type="text" class="form-control"/>
					</div>
					<div>
						<form:label path="password">Enter Password</form:label>
						<form:errors path="password" class="text-danger"/>
						<form:input path="password" type="password" class="form-control"/>
					</div>
					<input type="submit" value="Submit" class="btn btn-outline-primary mt-2"/>
				</form:form>
			</div> <!-- End of Register div -->
		</div> <!--End of row-->
    </div> <!-- End of Container -->
</body>
</html>