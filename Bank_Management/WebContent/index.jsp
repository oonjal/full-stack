<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank Management System</title>
</head>
<body>
	<h1>Welcome</h1>
<h2><a href=".\load" >Add Transaction</a></h2>
<h2><a href=".\list" >View Transaction</a></h2>
<%-- <table>
		<tr>
           <td><label>Transaction ID:</label></td>
           
           <jsp:useBean id="obj" class = "com.cognizant.controller.ApplicationController"/>
           <jsp:setProperty name="obj" property="currentNumber"/>
           <td><input name="transactionId" value = <%=obj.loadid() %>></td>
           </tr>
    
       <tr>
           <td><label>Description:</label></td>
           <td><input name="transactionDescription"/></td>
       </tr>
       <tr>
           <td><label>Transaction Type:<label></td>
           <td><input name="transactionType" /></td>
       </tr>
       <tr>
           <td><label>Account Number:</label></td>
           <td><input name="userDetails.accountNumber" /></td>
       </tr>
       
       <tr>
           <td><label>Transaction Amount:</label></td>
           <td><input name="transactionAmount" /></td>
       </tr>
        <tr>
         <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr> 
</table> --%>
<!-- </form> -->
<br>
<%-- <h3>Transaction List</h3>
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
</c:if> --%>
</body>
</html>