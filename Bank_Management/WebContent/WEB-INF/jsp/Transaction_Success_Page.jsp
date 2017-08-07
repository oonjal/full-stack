<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td><label> <strong><spring:message
							code="label.successMessage" arguments="${sessionID}" /></strong></label></td>

		</tr>
	</table>

	<div style="float: top-right; padding: 10px;">
		<div>
			<a href=".\"><font color="blue"><spring:message
						code="label.RedirectHome" /></font></a>
		</div>
	</div>

</body>
</html>