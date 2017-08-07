<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Example of Bootstrap 3 Vertical Form Layout</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

<script type="text/javascript">

/* function madeAjaxCall(){
 $.ajax({
  type: "post",
  url: "http://localhost:8080/SpringExamples/employee/add.htm",
  cache: false,    
  data:'firstName=' + $("#firstName").val() + "&lastName;=" + $("#lastName").val() + "&email;=" + $("#email").val(),
  success: function(response){
   $('#result').html("");
   var obj = JSON.parse(response);
   $('#result').html("First Name:- " + obj.firstName +"</br>Last Name:- " + obj.lastName  + "</br>Email:- " + obj.email);
  },
  error: function(){      
   alert('Error while request..');
  }
 });
} */
function ajaxcall()
{
var loanid = $("#document.homeloanid");
var homeLoanAccNumber = ;
$.ajax(
	type: "get",
	url: "ViewHomeLoanController/searchHomeLoanDetails",
	dataType: "json",
	success: function(){}
)
}

</script>

</head>
<body>
<div style='float: right;'><a href=".\homepage">home page</a></div></br>
<!-- <div class="container">
<form action="getdetails" method="GET">
    <div class="form-group">
        <label for="homeLoanId">Loan Id</label>
        <input type="text" style="width:25%" class="form-control" id="homeLoanId" placeholder="home loanid">
    </div>
    <div class="form-group">
        <label for="accountNumber">Account Number</label>
        <input type="text" style="width:25%" class="form-control" id="accountNumber" placeholder="Acc num">
    </div>
    <button type="button" class="btn btn-primary">Get Home Loan Details</button>
</form>
</div> -->
<form action="getdetails" method="post">
<tr>
<td>Home Load Id</td>
<td><input type="text" name="homeLoanId"/></td>
</tr>
<tr>
<td>Account Number</td>
<td><input type="number" name="accountNumber"/></td>
</tr>
<tr>
<td><input type="button" name="" onclick="ajaxcall();"/></td>
</tr>
</form>
</body>
</html>