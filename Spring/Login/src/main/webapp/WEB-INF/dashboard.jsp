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
		<a href="/logout" class="btn btn-outline-warning float-end mt-3">Log Out</a>
		<h1>Welcome, ${loggedInUser.userName}</h1>
		<a href="/books/create" class="btn btn-outline-primary float-end mt-3">Add New Book</a>
		<div class="container mx-auto p-5">
			<h4 class="heading mb-4">All Books</h4>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Title</th>
						<th scope="col">Author</th>
						<th scope="col">Posted By</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="oneBook" items="${allBooks}">
					<tr>
						<td><c:out value="${oneBook.id}" /></td>
						<td><a href="/books/${oneBook.id}"><c:out value="${oneBook.title}" /></a></td>
						<td><c:out value="${oneBook.author}" /></td>
						<td><c:out value="${loggedInUser.userName}" /></td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		  </div>
    </div> <!-- End of Container -->
</body>
</html>