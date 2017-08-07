<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"></link>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Education Loan</title>
</head>
<body>
	<div class="container">
		<div class="">
			<div
				style="font-weight: bold; background-color: #63DEDE; height: 5%; text-align: center; margin-top: 0%"
				class="tag-line-index">
				<h1 style="margin-top: 0%">
					<style>
					h1 {	text-shadow: 3px 3px #E6EC22;
					   }
					</style>
					<font color="blue"><spring:message code="label.title" /></font>
				</h1>
			</div>
		</div>
		
		</br> </br></br> </br>
		<table align="left">
			<tr>
				<form action="eduloansection" method="post">
				<td><input type="submit" value="<spring:message code="label.trans" />" class="btn btn-primary" /></td>
				</form>
			</tr>
		</table>
		
		</br> </br></br> </br>
		<table align="left">
			<tr>
				<form action="eduloansection" method="post">
				<td><input type="submit" value="<spring:message code="label.eduloan" />" class="btn btn-primary" /></td>
				</form>
			</tr>
		</table>
		
		</br> </br></br> </br>
		<table align="left">
			<tr>
				<form action="eduloansection" method="post">
				<td><input type="submit" value="<spring:message code="label.homeloan" />" class="btn btn-primary" /></td>
				</form>
			</tr>
		</table>
	</div>
</body>
<script>
	$(document).ready(function() {
		function blinker() {
			$('.blinking').fadeOut(500);
			$('.blinking').fadeIn(500);
		}
		setInterval(blinker, 1000);
	});
</script>

</html>