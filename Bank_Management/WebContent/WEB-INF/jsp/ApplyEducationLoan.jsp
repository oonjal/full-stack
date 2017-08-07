<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%> --%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet"
	href="https://jqueryui.com/jquery-wp-content/themes/jqueryui.com/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<title>Apply Education Loan</title>
</head>
<body>
	<div class="container" style="margin-top: 2%">
		<form:form name="myForm" action="navigate" method="post" modelAttribute="applyloan" onsubmit="return validateForm()">
			
			<div style="font-weight: bold" class="col-sm-6">
				<spring:message code="label.AccountNum" />
			</div>
			
			<div class="col-sm-6">
				<form:input path="UserDetails.accountNumber" id="accountNumber" type="number"	
					placeholder="Enter the Account Number" onfocus="this.placeholder = ''"
					onblur="this.placeholder = 'Enter the Account Number'" 			
					style="width: 35%" maxlength="16" required="required"/> 
				<div><form:errors path="UserDetails.accountNumber" /></div>										
			</div>
			</br> </br> 
			<div style="font-weight: bold" class="col-sm-6">
				<spring:message code="label.LoanAmt" />
			</div>
			<div class="col-sm-6">
				<form:input path="eduLoanAmount" id="loanAmt" type="number" 
					placeholder="Enter the Loan Amount" onfocus="this.placeholder = ''"	
					onblur="this.placeholder = 'Enter the Loan Amount'"					
					style="width: 35%" maxlength="16" required="required"/>
				<div><form:errors path="eduLoanAmount" /></div>								
			</div>
			</br> </br>
			 
			<div style="font-weight: bold" class="col-sm-6">
				<spring:message code="label.ApplyDate" />
			</div>
			
			<div class="col-sm-6">
				<form:input path="eduLoanApplyDate" id="eduLoanApplyDate" type="text"
					placeholder="Enter Loan Date" onfocus="this.placeholder = ''"
					onblur="this.placeholder = 'Enter Loan Date'"					
					style="width: 35%" required="required"/>
				<div><form:errors path="eduLoanApplyDate"/></div>
			</div>			
			
			<!-- class="form-control" -->
			</br> </br>						 
			<div style="font-weight: bold" class="col-sm-6">
				<spring:message code="label.LoanDuration" />
			</div>
			<div class="col-sm-6">
				<form:select path="eduLoanDuration" type="number">
					<form:option value="1">Please select</form:option>
					<form:option value="5">5</form:option>
					<form:option value="10">10</form:option>
				</form:select>
			</div>
			</br> </br>
			
			<div style="font-weight: bold" class="col-sm-6">
				<spring:message code="label.CourseName" />
			</div>
			<div class="col-sm-6">
				<form:input path="courseName" type="text" 
					placeholder="Enter the Course Name" onfocus="this.placeholder = ''"
					onblur="this.placeholder = 'Enter the Course Name'"					
					style="width: 35%" maxlength="16" required="required" />
			</div>						
			</br> </br>			
			
			<div style="font-weight: bold" class="col-sm-6">
				<spring:message code="label.CourseFee" />
			</div>
			<div class="col-sm-6">
				<form:input path="courseFee" type="number"
					placeholder="Enter the Course Fee" onfocus="this.placeholder = ''"
					onblur="this.placeholder = 'Enter the Course Fee'"					
					style="width: 35%" maxlength="16" required="required" />
			</div>
			</br> </br>
			
			<div style="font-weight: bold" class="col-sm-6">
				<spring:message code="label.FatherName" />
			</div>
			<div class="col-sm-6">
				<form:input path="fatherName" type="text"
					placeholder="Enter the Father Name" onfocus="this.placeholder = ''"
					onblur="this.placeholder = 'Enter the Father Name'"					
					style="width: 35%" maxlength="20" required="required" />
			</div>
			
			</br> </br>
			
			<div style="font-weight: bold" class="col-sm-6">
				<spring:message code="label.IdNumber" />
			</div>
			<div class="col-sm-6">
				<form:input path="idCardNumber" type="number"				
					placeholder="Enter the ID Number" onfocus="this.placeholder = ''"
					onblur="this.placeholder = 'Enter the ID Number'"	
					style="width: 35%" maxlength="20" required="required" />
			</div>

			</br> </br>
			
			<div style="font-weight: bold" class="col-sm-6">
				<spring:message code="label.FatherIncome" />
			</div>
			<div class="col-sm-6">
				<form:input path="fatherAnnualIncome" type="number"					
					placeholder="Enter the Annual Income"
					onfocus="this.placeholder = ''"
					onblur="this.placeholder = 'Enter the Annual Income'"
					style="width: 35%" maxlength="20" required="required" />
			</div> 
			
			</br> </br>

			<div style="font-weight: bold" class="col-sm-6">
				<button type="submit" class="btn btn-primary">
					<spring:message code="label.ApplySubmit" />
				</button>
			</div>
			<div style="font-weight: bold" class="col-sm-6">
				<button type="reset" value="reset" class="btn btn-primary">
					<spring:message code="label.Reset" />
				</button>
			</div>
			</br> </br> </br> </br>
			<div style='float: top-right;'>
				<div "font-weight: bold" class="col-sm-6">
					<a href=".\index"><font color="blue">
					<spring:message	code="label.HomePage" /></font></a>
				</div>
			</div> 
		</form:form>
	</div>
</body>

<script>
	$(document).ready(function() {

		$("#eduLoanApplyDate").datepicker({
			minDate : 0,
			maxDate : ""
		});

	});

	  function validateForm() {

		var LoanAmt = document.myForm.eduLoanAmount.value.toString();
		var LoanDuration = document.myForm.eduLoanDuration.value.toString();
		var CourseName = document.myForm.courseName.value;
		var Coursefee = document.myForm.courseFee.value.toString();
		var FatherName = document.myForm.fatherName.value;
		var IdNumber = document.myForm.idCardNumber.value.toString();
		var FatherAnnualIncome = document.myForm.fatherAnnualIncome.value.toString();
		var letters = /^[a-z]+$/;
		var numbers = /^[0-9]+$/;
		
		if ((LoanAmt.length) > 16 || (LoanAmt <= 0)) {
			alert("Loan amount should be more than 0 and less than 16 Digit");
			return false;
		}

		else if (LoanDuration == 1)  {
			alert("Please select the Loan Duration from drop down");
			return false;
		}
		

		else if ((Coursefee.length > 16) || (Coursefee <= 0)) {
			alert("Course Fee should be more than 0 and less than 16 Digit");
			return false;
		}		

		else if ((IdNumber.length < 5) || (IdNumber.length > 16) || (IdNumber <= 0))  {
			alert("ID Card Number should be more than 5 and less than 16 Digit");
			return false;
		} 
		
		else if ((FatherAnnualIncome.length > 16) || (FatherAnnualIncome <= 0)) {
			alert("Annual Income should be more than 0 and less than 16 Digit");
			return false;
		}
		
		else if(isNaN(parseInt(FatherName)))
		{
			alert("Father Name contains numbers");
			return false;
		}
		
		else if(isNaN(parseInt(CourseName)))
		{
			alert("Course Name contains numbers");
			return false;
		}
		
	}  
</script>

</html>