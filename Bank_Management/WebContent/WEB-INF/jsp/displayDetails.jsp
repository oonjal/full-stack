<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="">
	<%-- <c:set var="now" value="<%=new java.util.Date()%>" /> --%>
	<div style='float: right;'>
		<a href=".\homepage">home page</a>
	</div>
	</br>
	<table class="table table-inverse">
		<thead>
			<tr>
				<th>Loan Account Number</th>
				<th>Account Holder Name</th>
				<th>Loan Id</th>
				<th>Loan Amount</th>
				<th>Desgination</th>
				<th>Company Name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${map.details}" var="element">
				<tr>
					<td><c:out value="${element.homeLoanAccountNumber}" /></td>
					<td><c:out value="${element.accountHolderName}" /></td>
					<td><c:out value="${element.homeLoanId}" /></td>
					<td><c:out value="${element.loanAmount}" /></td>
					<td><c:out value="${element.designation}" /></td>
					<td><c:out value="${element.compName}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</form>
</body>
</html>