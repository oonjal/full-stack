<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker({
			dateFormat : 'yy-mm-dd',
			minDate : 0
		});
	});
</script>
</head>
<body>
	<form:form action="./getWeeklyEventData" method="POST"
		modelAttribute="EventInfoVO">
		<div>
			<form:label path="eventDate">Begin Date:</form:label>
			<form:input type="text" id="datepicker" path="eventDate"
				required="required" />
			<form:errors path="eventDate"></form:errors>
			<input type="submit" class="button" value="Search" />
		</div>


		<br>

		<c:if test="${!empty model.weeklyEventList}">
			<table class="tg">
				<tr>
					<th width="100">Event Name</th>
					<th width="150">Event Type</th>
					<th width="150">Location</th>
					<th width="100">Event Date</th>
					<th width="100">Price</th>
				</tr>
				<c:forEach items="${model.weeklyEventList}" var="weeklyEventList">
					<tr>
						<td>${weeklyEventList.eventName}</td>
						<td>${weeklyEventList.eventType}</td>
						<td>${weeklyEventList.location}</td>
						<td>${weeklyEventList.eventDate}</td>
						<td>${weeklyEventList.price}</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</form:form>
</body>
</html>