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
<title>Edit Expense</title>
<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<!-- Beginning of Container -->
		<h1>Edit Expense Details</h1>

		<!-- form to edit expense -->
		<form:form action="/expense/update/${editTravelExpense.id}" method="post" modelAttribute="editTravelExpense">
			<input type="hidden" name="_method" value="put">
			<div class="mb-3">
				<form:label path="expenseName" class="form-label">Expense Name</form:label>
				<form:errors class="text-danger" path="expenseName"/>
				<form:input path="expenseName" type="text" class="form-control" id="expenseName" name="expenseName"/>
			</div>
			<div class="mb-3">
				<form:label path="vendor" class="form-label">Vendor</form:label>
				<form:errors class="text-danger" path="vendor"/>
				<form:input path="vendor" type="text" class="form-control" id="vendor" name="vendor"/>
			</div>
			<div class="mb-3">
				<form:label path="amount" class="form-label">Amount</form:label>
				<form:errors class="text-danger" path="amount"/>
				<form:input path="amount" type="text" class="form-control" id="amount" name="amount"/>
			</div>
			<div class="mb-3">
				<form:label path="description" class="form-label">Description</form:label>
				<form:errors class="text-danger" path="description"/>
				<form:textarea path="description" class="form-control" id="description" name="description"/>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>
	<!-- End of Container -->
</body>
</html>