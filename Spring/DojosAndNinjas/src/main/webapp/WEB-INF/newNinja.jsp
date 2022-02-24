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
<title>Dojo's and Ninja's</title>
  <!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
      rel="stylesheet" 
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
      crossorigin="anonymous">

</head>
<body>
    <div class="container"> <!-- Beginning of Container -->
        <h1>New Ninja</h1>
        <form:form action="/ninjas/create" method="post" modelAttribute="ninja" class="form-control">
			<div>
				<form:label path="dojo">Dojo Location:</form:label>
				<form:errors path="dojo"/>
				<form:select path="dojo" class="form-control">
					<c:forEach items="${allDojos}" var="oneDojo">
						<form:option value="${oneDojo.id}" class="form-control">${oneDojo.name}</form:option>
					</c:forEach>
				</form:select>
				<form:label path="firstName">First Name:</form:label>
				<form:errors path="firstName" class="text-danger"/>
				<form:input path="firstName" type="text" class="form-control"/>
				<form:label path="lastName">Last Name:</form:label>
				<form:errors path="lastName" class="text-danger"/>
				<form:input path="lastName" type="text" class="form-control"/>
				<form:label path="age">Age:</form:label>
				<form:errors path="age" class="text-danger"/>
				<form:input path="age" type="number" class="form-control"/>
				<input type="submit" class="btn btn-primary mt-2" value="Create">
			</div>        
        </form:form>
    </div> <!-- End of Container -->
</body>
</html>