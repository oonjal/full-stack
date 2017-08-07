<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

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
<!-- <script>
function validateform()
{
	//var accNumber = document.myform.accountNumber.value;
	var loanAmt = document.myform.loanAmount.value.toString();
	var annualIncome = document.myform.annualIncome.value.toString();
	var companyName = document.myform.compName.value;
	var designation = document.myform.designation.value;
	var totalExp = document.myform.totalExp.value.toString();
	var expCurrentComp = document.myform.expCurrentComp.value.toString();
	var text;
/* 	var letters = /^[A-Za-z]+$/; */ 
	
	if(loanAmt.length > 16)
	{
		alert( "Please enter 16 or less than 16 digit number" );
		return false;
	}
	
	if(companyName.matches(letters))
	{
		alert( "Please enter only alphabets" );
		return false;
	}
	
	if(designation.matches(letters))
	{
		alert( "Please enter only alphabets" );
		return false;
	}
	
	if(annualIncome != (10*loanAmt)/100)
	{
		alert( "Annual Income should be 10 % of laon amount" );
		return false;
	}
}
</script> -->
<!-- <style>
.error 
{
	color: #ff0000;
	font-weight: bold;
}
</style> -->
<!-- <script>
	$(document).ready(function() {
		$("#loanApplyDate").datepicker({
			minDate : 0,
			maxDate : ""
		});
	});
</script> -->
</head>
<body style="background-color: #cccccc">
	
	<!-- <div style='float: right;'>
		<a href=".\homepage">home page</a>
	</div> -->
	
<%-- 	<div class="container" style="margin-top: 2%">
		<form class="form-horizontal" action="FormValuesToController" method="POST">

			<!-- <div class="form-group row"> -->
			<div class="form-group">
			<label for="accountNumber" class="control-label col-xs-2">Account Number</label>
				<div class="col-xs-10">
					<input class="form-control" path="userDetails.accountNumber" id="userDetails.accountNumber" placeholder="Enter Acc Number" style="width: 25%" />
				</div>
			</div>

			<div class="form-group">
				<label for="loanAmount" class="control-label col-xs-2">Loan Amount</label>
				<div class="col-xs-10">
					<input class="form-control" type="number" path="loanAmount" id="loanAmount" placeholder="Enter loan amt" style="width: 25%"/>
				</div>
			</div>

			<div class="form-group">
				<label for="loanApplyDate" class="control-label col-xs-2">Loan Apply Date</label>
				<div class="col-xs-10">
					<input class="form-control" type="text" path="loanApplyDate" id="loanApplyDate" placeholder="Enter loan Date" 
					onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter loan Date'" style="width: 25%" />
				</div>
			</div>

			<div class="form-group">
				<label for="loanDuration" class="control-label col-xs-2">Loan Duration</label>
				<div class="col-xs-10">
					<select path="loanDuration" id="loanDuration" type="number" style="width: 25%" >
						<option value="">Please select</option>
						<option value="5">5</option>
						<option value="5">10</option>
						<option value="5">15</option>
						<option value="5">20</option>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label for="annualIncome" class="control-label col-xs-2">Annual Income</label>
				<div class="col-xs-10">
					<input class="form-control" type="number" path="annualIncome" id="annualIncome" placeholder="Enter annual Income" style="width: 25%" />
				</div>
			</div>

			<div class="form-group">
				<label for="compName" class="control-label col-xs-2">Company Name</label>
				<div class="col-xs-10">
					<input class="form-control" type="text" path="compName" id="compName" placeholder="Enter Company Name" style="width: 25%" />
				</div>
			</div>

			<div class="form-group">
				<label for="designation" class="control-label col-xs-2">Designation</label>
				<div class="col-xs-10">
					<input class="form-control" type="text" path="designation" id="designation" placeholder="Enter Your Designation" style="width: 25%" />
				</div>
			</div>

			<div class="form-group">
				<label for="totalExp" class="control-label col-xs-2">Total Experience</label>
				<div class="col-xs-10">
					<input class="form-control" type="number" path="totalExp" id="totalExp" placeholder="Enter Your total experience" style="width: 25%" />
				</div>
			</div>

			<div class="form-group">
				<label for="expCurrentComp" class="control-label col-xs-2">Experience with Current Company</label>
				<div class="col-xs-10">
					<input class="form-control" type="number" path="expCurrentComp" id="expCurrentComp" placeholder="Enter exp with current company" style="width: 25%" />
				</div>
			</div>
			<!-- <p>Please Verify the details entered</p> -->
			<div class="form-group">
            	<div class="col-xs-offset-2 col-xs-10">
                	<button type="submit" class="btn btn-primary">Submit Details</button>
            	</div>
        	</div>	
        	</form>	
	</div> 

</body>
</html>	 --%>
		<div class="container" style="margin-top: 2%">
		<form:form method ="post" modelAttribute ="homeLoanDetails" action="FormValuesToController" class="form-horizontal">

			<!-- <div class="form-group row"> -->
			<div class="form-group">
				<label for="accountNumber" class="control-label col-xs-3" style="width: 25%">Account Number</label>
				<div class="col-xs-9">
					<form:input class="form-control" type="number" path="userDetails.accountNumber" placeholder="Enter Acc Number" style="width: 40%" />
				</div>
				<font color=red><form:errors path="userDetails.accountNumber" /></font>
			</div>
<!-- required="required" -->
			<div class="form-group">
				<label for="loanAmount" class="control-label col-xs-3" style="width: 25%">Loan Amount</label>
				<div class="col-xs-9">
					<form:input class="form-control" type="number" path="loanAmount" placeholder="Enter loan amt" style="width: 40%"/>
					<font color =red><form:errors path="loanAmount" /></font>
				</div>
			</div>

			<div class="form-group">
				<label for="loanApplyDate" class="control-label col-xs-3" style="width: 25%">Loan Apply Date</label>
				<div class="col-xs-9">
				<%-- <form:input class="form-control" type="text" path="loanApplyDate"  placeholder="Enter loan Date" style="width: 25%"/> --%>
					<form:input class="form-control" type="date" path="loanApplyDate"  placeholder="Enter loan Date" 
					onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter loan Date'" style="width: 40%"/>
				<font color = red><form:errors path="loanApplyDate" /></font>
				</div>
			</div>

			<div class="form-group">
				<label for="loanDuration" class="control-label col-xs-3" style="width: 25%">Loan Duration</label>
				<div class="col-xs-9">
				<%-- <form:select path=""></form:select> --%>
					<form:select path="loanDuration" type="number" style="width: 40%">
						<!-- <option value="">Please select</option>
						<option value="5">5</option>
						<option value="10">10</option>
						<option value="15">15</option>
						<option value="20">20</option> -->	
						<form:option value="">Please select</form:option>
						<form:option value="5">5</form:option>
						<form:option value="5">10</form:option>
						<form:option value="5">15</form:option>
						<form:option value="5">20</form:option>
					</form:select>
					<font color = red><form:errors path="loanDuration" /></font>
				</div>
			</div>

			<div class="form-group">
				<label for="annualIncome" class="control-label col-xs-3" style="width: 25%">Annual Income</label>
				<div class="col-xs-9">
					<form:input class="form-control" type="number" path="annualIncome" placeholder="Enter annual Income" style="width: 40%" />
				<font color = red><form:errors path="annualIncome"/></font>
				</div>
			</div>

			<div class="form-group">
				<label for="compName" class="control-label col-xs-3" style="width: 25%">Company Name</label>
				<div class="col-xs-9">
					<form:input class="form-control" type="text" path="compName" placeholder="Enter Company Name" style="width: 40%"/>
					<font color = red><form:errors path="compName" /></font>
				</div>
			</div>

			<div class="form-group">
				<label for="designation" class="control-label col-xs-3" style="width: 25%">Designation</label>
				<div class="col-xs-9">
					<form:input class="form-control" type="text" path="designation" placeholder="Enter Your Designation" style="width: 40%"/>
					<font color = red><form:errors path="designation" /> </font>
				</div>
			</div>

			<div class="form-group">
				<label for="totalExp" class="control-label col-xs-3" style="width: 25">Total Experience</label>
				<div class="col-xs-9">
					<form:input class="form-control" type="number" path="totalExp" placeholder="Enter Your total experience" style="width: 40%"/>
					<font color = red><form:errors path="totalExp" /></font>
				</div>
			</div>

			<div class="form-group">
				<label for="expCurrentComp" class="control-label col-xs-3" style="width: 25%">Experience with Current Company</label>
				<div class="col-xs-9">
					<form:input class="form-control" type="number" path="expCurrentComp" placeholder="Enter exp with current company" style="width: 40%"/>
					<font color = red><form:errors path="expCurrentComp" /></font>
				</div>
			</div> 
			<!-- <p>Please Verify the details entered</p> -->
			<div class="form-group">
            	<div class="col-xs-offset-2 col-xs-10">
                	<button type="submit" class="btn btn-primary">Submit Details</button>
            	</div>
        	</div>	
        	</form:form>	
	</div> 
	
	
</body>
</html>