<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="border: 1px solid #ccc; padding: 5px; margin-bottom: 20px;">

	<a href="${pageContext.request.contextPath}/welcome">Home</a> | &nbsp;

	<a href="${pageContext.request.contextPath}/addCustomer">Add
		Customer</a> | <a href="${pageContext.request.contextPath}/removeCustomer">Remove
		Customers</a> | <a href="${pageContext.request.contextPath}/getCustomers">Show
		Customers</a> | <a href="${pageContext.request.contextPath}/getFaqs">FAQs</a> |
		<a href="${pageContext.request.contextPath}/getInfo">About Us</a> |
		<u><h2 style="color: purple;">
			<a onclick="document.forms['logoutForm'].submit()">Logout</a>
			</h3></u>

	<form id="logoutForm" method="POST" action="${contextPath}/logout">
	</form>

</div>