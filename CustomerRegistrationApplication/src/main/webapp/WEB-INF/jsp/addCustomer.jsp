<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: violet;">Add New Customer</h3>

	<div id="addCustomer">
		<form:form action="/addCustomer" method="post"
			modelAttribute="cust">
			<p>
				<label>Enter Customer Id</label>
				<form:input path="custId" />
			</p>
			<p>
				<label>Enter Customer Name</label>
				<form:input path="custName" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>
