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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>

</head>
<body ng-app="myApp" ng-controller="customersCtrl">



	<div class="container" style="margin-top: 2%">
		<div style="font-weight: bold" class="col-sm-6">
			<label>Education Loan id:</label> 
		</div>
		<div class="col-sm-6">
			<input type="text" ng-model="educationLoanId" 
					placeholder="Enter the Education Loan Id" onfocus="this.placeholder = ''"
					onblur="this.placeholder = 'Enter the Education Loan Id'" 			
					style="width: 35%">
		</div>
		<br><br>
		<div style="font-weight: bold" class="col-sm-6">
			<label>Education Loan Account number:</label> 
		</div>
		<div class="col-sm-6">
			<input type="textbox" ng-model="eduLoanAccountNumber" 
					placeholder="Enter the Loan Account Number" onfocus="this.placeholder = ''"
					onblur="this.placeholder = 'Enter the Loan Account Number'" 			
					style="width: 40%" maxlength="16">
		</div>
		<br><br>
		<div style="font-weight: bold" class="col-sm-6">
				<button ng-click="clicked()" class="btn btn-primary">submit</button>
		</div>
		<!-- <button ng-click="clicked()">submit</button> -->
			</br> </br> </br> </br>
			<div style='float: top-right;'>
				<div "font-weight: bold" class="col-sm-6">
					<a href=".\index"><font color="blue">
					<spring:message	code="label.HomePage" /></font></a>
				</div>
			</div> 
			</br> </br>
		<!-- <div class="col-sm-6">	
			<br> <br> 
			<label>Education Loan Account number:</label> 
			<input type="textbox" ng-model="eduLoanAccountNumber">
			<br> <br>
			<button ng-click="clicked()">submit</button>
		</div> -->
		<br>
		
			<div class="row">
				<table ng-show="educationDetails">
					<tr>
						<th>LOAN ACC NUMBER</th>
						<th>EDUCATION LOAN ID</th>
						<th>LOAN AMOUNT</th>	
						<th>COURSE NAME</th>
						<th>COURSE FEE</th>
						<th>ACCOUNT HOLDER NAME</th>
					</tr>
					<tr ng-repeat="education in educationDetails">
						<td>{{ education.eduLoanAccountNumber }}</td>
						<td>{{ education.educationLoanId }}</td>
						<td>{{ education.eduLoanAmount}}</td>
						<td>{{ education.courseName}}</td>
						<td>{{ education.courseFee}}</td>
						<td>{{ education.userDetails.accountHolderName}}</td>
					</tr>
				</table>
			</div>

	</div>
	
	
<script type="text/javascript">
	var app = angular.module("myApp", []);
	app.controller("customersCtrl",function($scope, $http) {

						var parameters = {
							eduLoanAccountNumber : $scope.eduLoanAccountNumber,
							educationLoanId : $scope.educationLoanId
						};
						
						$scope.clicked = function() {
							$http(
									{
										method : 'GET',
										url : '/BankManagementSystem/fetch?eduLoanAccountNumber='
												+ $scope.eduLoanAccountNumber
												+ '&educationLoanId='
												+ $scope.educationLoanId,
									}).then(function successCallback(response) {
								$scope.educationDetails = response.data;
							}, function errorCallback(response) {
								console.log(response.data);
							});
						}

					});
</script>
	
	
<!-- 
	<script>
		var app = angular.module('myApp', []);
		app.controller('customersCtrl', function($scope, $http) {
			$scope.clicked = function() {
				$scope.url = "/BankManagementSystem/fetch?loanid="+ $scope.educationLoanId + "&loanaccount=" + $scope.eduLoanAccountNumber;";
				$http.get($scope.url).then(function mysuccess(response) {
					/*  console.log(JSON.stringify(response.data.records));
					   console.log("success"); */

					alert("Successfully reached");

					$scope.names = response.data.records;
					//console.log( $scope.names);

				}, function error(response) {
					console.log("failed");
				});
			}

		}); -->

<style>
table, th , td {
  border: 1px solid grey;
  border-collapse: collapse;
  padding: 5px;
}
table tr:nth-child(odd) {
  background-color: #f1f1f1;
}
table tr:nth-child(even) {
  background-color: #ffffff;
}
</style>
</body>
</html>
