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
<title>Insert title here</title>
</head>
<body>
	<h1>placeholder for results</h1>
	<div class="containter">
		<p>
			In
			<%=session.getAttribute("pickNumber")%>
			years, you will live in
			<%=session.getAttribute("pickCity")%>
			with
			<%=session.getAttribute("pickPerson")%>
			as your roommate,
			<%=session.getAttribute("tradeHobby")%>
			. The next time you see a
			<%=session.getAttribute("somethingLiving")%>
			, you will have good luck. Also,
			<%=session.getAttribute("somethingNice")%>
		</p>
	</div>
</body>
</html>