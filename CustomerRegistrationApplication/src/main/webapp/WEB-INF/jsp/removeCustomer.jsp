<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remove Customer</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: violet;">Remove Existing Customer</h3>

	<div id="removeCustomer">
		<form:form action="/removeCustomer" method="post"
			modelAttribute="cust">
			<p>
				<label>Enter Customer Id</label>
				<form:input path="custId" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>
