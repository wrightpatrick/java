<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- CSS only -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Fruit Store</title>
</head>
<body>
	<div class="container">
		<h1 class="text-primary">Fruit Store</h1>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Fruit</th>
					<th scope="col">Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="fruits" items="${fruits}">
					<tr>
						<td><c:out value="${fruits.name}"></c:out></td>
						<td><c:out value="${fruits.price}"></c:out></td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>