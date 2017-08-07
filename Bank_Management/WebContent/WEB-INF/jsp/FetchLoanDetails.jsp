<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Fetch Loan Details</title>
</head>
<body style="background-color: #cccccc">
	<div class="container" style="margin-top: 2%">

		<form action="fetch" method="GET">


			<div style="font-weight: bold" class="col-sm-6">
				<input type="radio" name="Radio" class="radioBtn" value="yes"
					checked="checked" />Identification Card Number:
			</div>
			<div class="col-sm-6">
				<input name="idCardNumber" type="text" id="Field1"
					placeholder="Enter the Id Card number" onfocus="this.placeholder = ''" 
					onblur="this.placeholder = 'Enter the Id Card number'" 
					style="width: 42%" maxlength="16" />
			</div>

			</br> </br>


			<div style="font-weight: bold" class="col-sm-6">
				<input type="radio" name="Radio" class="radioBtn" value="no" />Loan
				Account Number:
			</div>
			<div class="col-sm-6">
				<input name="eduLoanAccountNumber" type="text" id="Field2"
					placeholder="Enter the Loan account number" onfocus="this.placeholder = ''" 
					onblur="this.placeholder = 'Enter the Loan account number'" 
					style="width: 42%" maxlength="20" disable="true" disabled />
			</div>
			</br> </br>
			<div style="font-weight: bold" class="col-sm-6">
				<button type="submit" class="btn btn-primary">Get Loan
					Details</button>
			</div>

			<div style="font-weight: bold" class="col-sm-6">
				<button type="reset" value="reset" class="btn btn-primary">Reset</button>
			</div>

			</br> </br> </br> </br>
			<div style='float: top-right;'>
				<div "font-weight: bold" class="col-sm-6">
					<a href=".\homepage"><font color="blue">Home Page</font></a>
				</div>
			</div>

		</form>
	</div>
</body>
<script>
	$(".radioBtn").click(function() {

			
		if ($("input[name=Radio]:checked").val() == "yes") {
			$("#Field1").attr("disabled", false);
			$("#Field2").attr("disabled", true);
		}

		if ($("input[name=Radio]:checked").val() == "no") {
			$("#Field1").attr("disabled", true);
			$("#Field2").attr("disabled", false);
		}

  })
</script>


</html>