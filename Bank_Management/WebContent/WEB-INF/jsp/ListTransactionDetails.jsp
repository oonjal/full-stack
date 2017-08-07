<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
<h3>Transaction List</h3>
<c:if test="${!empty listTransaction}">
	<table class="tg">
	<tr>
		<th width="80">Transaction ID</th>
		<th width="120">Transaction Description</th>
		<th width="120">Transaction Type</th>
		<th width="60">Account Number</th>
		<th width="60">Account Balance</th>
	</tr>
	<c:forEach items="${listTransaction}" var="transactionDetails">
		<tr>
			<td>${transactionDetails.transactionId}</td>
			<td>${transactionDetails.transactionDescription}</td>
			<td>${transactionDetails.transactionType}</td>
			
		</tr>
	</c:forEach>
	</table>
</c:if> 

</body>
</html>