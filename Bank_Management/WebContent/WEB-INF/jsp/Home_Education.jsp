<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	href="https://jqueryui.com/jquery-wp-content/themes/jqueryui.com/style.css" />
<title>Home</title>
</head>
<body>
	<div class="container" style="margin-top: 2%">

		<form action="applyeduloan" method="post">
			<div>
				<input type="submit" value="<spring:message code="label.applyeduLoan"/>" class="btn btn-primary" />
			</div>
		</form>
		</br>
		<form action="eduloandetails" method="post">
			<input type="submit" value="<spring:message code="label.fetcheduLoan" />" class="btn btn-primary" />
		</form>
		 </br> </br>
			<div style='float: top-right;'>
				<div "font-weight: bold" class="col-sm-6">
					<a href=".\index"><font color="blue">
					<spring:message	code="label.HomePage" /></font></a>
				</div>
			</div> 
		
	</div>
</body>
</html>