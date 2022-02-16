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
<title>Omikuji Form</title>
</head>
<body>
	<div class="container">
		<form action="/formPost" method="post">
			<div class="mb-3">
				<label for="pickNumber" class="form-label">Pick a number
					between 5 to 25</label> <input type="number" class="form-control"
					id="pickNumber" name="pickNumber">
			</div>
			<div class="mb-3">
				<label for="cityName" class="form-label">Enter a city</label> <input
					type="text" class="form-control" id="cityName" name="cityName">
			</div>
			<div class="mb-3">
				<label for="personName" class="form-label">Enter a person's
					name</label> <input type="text" class="form-control" id="personName" name="personName">
			</div>
			<div class="mb-3">
				<label for="tradeHobby" class="form-label">Enter trade or
					hobby</label> <input type="text" class="form-control" id="tradeHobby" name="tradeHobby">
			</div>
			<div class="mb-3">
				<label for="livingThing" class="form-label">Enter any living
					thing</label> <input type="text" class="form-control" id="livingThing" name="livingThing">
			</div>
			<div class="mb-3">
				<label for="somethingNice" class="form-label">Say something
					nice to someone</label>
				<textarea type="text" class="form-control" id="somethingNice" name="somethingNice"></textarea>
			</div>

			<input type="submit" class="btn btn-primary" value="submit">
		</form>
	</div>
</body>
</html>