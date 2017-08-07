<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet"
	href="https://jqueryui.com/jquery-wp-content/themes/jqueryui.com/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<title>Display Loan Details</title>
</head>
<body style="background-color: #cccccc">
	<div class="container" style="margin-top: 2%">

		<form action="fetch" method="GET">

			<div style="font-weight: bold" class="col-sm-6">Loan Duration:</div>
			<div class="col-sm-6">
				<input name="eduLoanDuration" type="number"
					value="${detailsList.eduLoanDuration}"  
					style="width: 35%" />
			</div>

			</br> </br> 
			<div style='float: top-right;'>
				<div "font-weight: bold" class="col-sm-6">
					<a href=".\homepage"><font color="blue">Home Page</font></a>
				</div>
			</div>

		</form>
	</div>
</body>
</html>