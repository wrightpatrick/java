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
		<div class="card mx-auto p-5">
			<h3 class="mb-4">${book.title}</h3>
			<p><strong>Author:</strong> ${book.author}</p>
			<p><strong>My Thoughts:</strong> ${book.myThoughts}</p>
			<form action="/books/${book.id}/delete" method="post">
				<input type="hidden" name="_method" value="delete">
				<input type="submit" value="Delete" class="btn btn-outline-danger">
			</form>
			<a href="/books/${book.id}/edit" class="btn btn-outline-success mx-auto float-end">Edit Details</a>
		</div>
		<div class="d-flex m-4 justify-content-center">
			<a href="/home">Back to Books List</a>
		</div>
	</div> <!-- End of Container -->
</body>
</html>