<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank Transaction Form</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
	<h2>Add Transaction</h2>
	<springForm:form method="POST" action="add">
		<table>
			<%-- <tr>
				<td colspan="2"><springForm:errors path="*" cssClass="error" /></td>
			</tr> --%>
			<tr>
				<td><label><strong><spring:message code ="label.transactionId"/></strong></label></td>

				<jsp:useBean id="obj"
					class="com.cognizant.controller.TransactionController" />
				<%-- <jsp:setProperty name="obj" property="currentNumber"/> --%>
				<td><input name="transactionId" value="${transactionId}"
					readonly /></td>
			</tr>

			<tr>
				<td><label><strong><spring:message code ="label.transactionDescription"/></strong></label></td>
				<td><springForm:input path="transactionDescription" /></td>
				<td><springForm:errors path="transactionDescription"
						cssClass="error" /></td>
			</tr>
			<tr>
				<td><label><strong><spring:message code ="label.transactionType"/></strong></label></td>
				<td><springForm:select path="transactionType">
						<springForm:option value="" label="Select Transaction Type" />
						<springForm:option value="DEPOSIT" label="Deposit" />
						<springForm:option value="WITHDRAW" label="Withdraw" />
					</springForm:select></td>
				<td><springForm:errors path="transactionType" cssClass="error" /></td>
				<!-- <td><input name="transactionType" /></td> -->
			</tr>
			<tr>
				<td><label><strong><spring:message code ="label.accountNumber"/></strong></label></td>
				<td><springForm:input path="userDetails.accountNumber" /></td>
				<td><springForm:errors path="userDetails.accountNumber"
						cssClass="error" /></td>
			</tr>
			<tr>
				<td><label><strong><spring:message code =	"label.transactionAmount"/></strong></label></td>
				<td><springForm:input path="transactionAmount" /></td>
				<td><springForm:errors path="transactionAmount"
						cssClass="error" /></td>
			</tr>
			<tr>
				<spring:message code="label.submit" var="labelSubmit"></spring:message>
				<td colspan="2"><input type="submit" value="${labelSubmit}" /></td>
			</tr>
		</table>
	</springForm:form>
</body>
</html>