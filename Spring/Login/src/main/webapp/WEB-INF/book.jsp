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
		<h4>Add Book</h4>
		<form:form action="/create" method="post" modelAttribute="newBook">
			<form:input type="hidden" path="user" value="${idOfLoggedInUser}"/>
			<div>
				<form:label path="title">Title</form:label>
				<form:errors path="title" class="text-danger"/>
				<form:input path="title" type="text" class="form-control"/>
			</div>
			<div>
				<form:label path="author">Author</form:label>
				<form:errors path="author" class="text-danger"/>
				<form:input path="author" type="text" class="form-control"/>
			</div>
			<div>
				<form:label path="myThoughts">My Thoughts</form:label>
				<form:errors path="myThoughts" class="text-danger"/>
				<form:input path="myThoughts" type="text-area" class="form-control"/>
			</div>
			<input type="submit" value="Create" class="btn btn-primary mt-2"/>
		</form:form>
    </div> <!-- End of Container -->
</body>
</html>