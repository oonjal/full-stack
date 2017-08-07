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
<form action="view" method = "get">
<table>
		<tr>
           <td><label>Transaction ID:</label></td>
           <td><input name="transactionId" value ="0"/></td>
           </tr>
           <tr>
           <td><label>Account Number:</label></td>
           <td><input name="userDetails.accountNumber" value ="0" /></td>
       </tr>
         <tr>  
         <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr> 
</table>
</form>

<br>
<h3>Transaction List</h3>
<c:if test="${!empty model.transactionDetails}">
	<table class="tg">
	<tr>
		<th width="80">Transaction ID</th>
		<th width="120">Transaction Description</th>
		<th width="120">Transaction Type</th>
		<th width="60">Account Number</th>
		<th width="60">Account Balance</th>
	</tr>
	<c:forEach items="${model.transactionDetails}" var="transactionDetails">
		<tr>
			<td>${transactionDetails.transactionId}</td>
			<td>${transactionDetails.transactionDescription}</td>
			<td>${transactionDetails.transactionType}</td>
			<td>${transactionDetails.userDetails.accountNumber}</td>
			<td>${transactionDetails.accountBalance}</td>
			
		</tr>
	</c:forEach>
	</table>
</c:if> 

</body>
</html>