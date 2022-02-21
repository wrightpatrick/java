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
<title>Expense Details</title>
  <!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
      rel="stylesheet" 
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
      crossorigin="anonymous">

</head>
<body>
    <div class="container"> <!-- Beginning of Container -->
        <a type="button" href="/" class="btn btn-info float-end mt-2">Return to Homepage</a>
        <h1 class="display-1">Expense Details</h1>
        <!-- container to view expense -->
			<div class="row">
				<p class="display-6">Expense Name:</p class="display-6">
				<p>${viewTravelExpense.expenseName}</p>
			</div>

			<div class="row">
				<p class="display-6">Vendor:</p class="display-6">
				<p>${viewTravelExpense.vendor}</p>
			</div>

			<div class="row">
				<p class="display-6">Amount:</p class="display-6">
				<p>$${viewTravelExpense.amount}</p>
			</div>

			<div class="row">
				<p class="display-6">Description:</p class="display-6">
				<p>${viewTravelExpense.description}</p>
			</div>
			
    </div> <!-- End of Container -->
</body>
</html>