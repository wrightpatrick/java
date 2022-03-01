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
		<h1>Edit Book</h1>
		<form:form action="/books/${book.id}/update" method="post" modelAttribute="book">
			<input type="hidden" name="_method" value="put">
			<div>
				<form:label path="title">Title:</form:label>
				<form:errors path="title"/>
				<form:input path="title" class="form-control"/>
			</div>
			<div>
				<form:label path="author">Author:</form:label>
				<form:errors path="author"/>
				<form:textarea path="author" class="form-control"/>
			</div>
			<div>
				<form:label path="myThoughts">My Thoughts:</form:label>
				<form:errors path="myThoughts"/>
				<form:input path="myThoughts" class="form-control"/>
			</div>
			<input type="submit" value="Submit" class="btn btn-outline-primary mt-3"/>
		</form:form>
		<form action="/books/${book.id}/delete" method="post">
			<input type="hidden" name="_method" value="delete">
			<input type="submit" value="Delete" class="btn btn-danger mt-3">
		</form>
    </div> <!-- End of Container -->
</body>
</html>