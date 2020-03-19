<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show Customers</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	      
	<h3 style="color: violet;">Show All Customers</h3>
	<ul>
		<c:forEach var="listValue" items="${customers}">
			<li>${listValue}</li>
		</c:forEach>
	</ul>
</body>
</html>