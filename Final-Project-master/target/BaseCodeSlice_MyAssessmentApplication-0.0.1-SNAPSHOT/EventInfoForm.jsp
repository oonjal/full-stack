<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Schedule Event Page</title>
<script
	src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript">
	var app = angular.module('myapp', []);

	app.controller('eventInfo', function($scope, $http) {
		$scope.success = false;
		$scope.eventform = {

			eventId : "",
			eventName : "",
			eventType : "",
			eventDate : "",
			eventLocation : "",
			price : ""
		};

		$scope.buttonclick = function() {
			$scope.eventDate = $(".datepicker").val();
			$http(
					{
						method : 'POST',
						url : 'saveEventDetail?eventName=' + $scope.eventName
								+ '&eventType=' + $scope.eventType
								+ '&eventDate=' + $scope.eventDate
								+ '&eventLocation=' + $scope.eventLocation
								+ '&price=' + $scope.price

					}).then(function success(response) {
				$scope.data = JSON.stringify(response.data);
				if("Successful"==data)
				alert("Success" + data);
				else
				$scope.successful = response;
			}, function error(response) {
				$scope.data = JSON.stringify(response.data);
				alert("error" + data);
			});
		}

	});
</script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body ng-app="myapp" ng-controller="eventInfo">
	<h3>Schedule Event</h3>
	<div>
		<form>
			<div class="table-ressponsive">
				<table class="table table-bordered" style="width: 600px">
					<tr>
						<td>Event ID</td>
						<td><input type="text" ng-model="eventId" required="required"
							disabled="disabled" size="30" /></td>
					</tr>
					<tr>
						<td>Event Name</td>
						<td><input type="text" ng-model="eventName"
							required="required" size="30" /></td>
					</tr>
					<tr>
						<td>Event Location</td>
						<td><select ng-model="eventLocation">
								<option value="Theni" selected="selected">Theni
								<option value="Madurai">Madurai
								<option value="Chennai">Chennai
						</select></td>
					</tr>
					<tr>
						<td>Type</td>
						<td><select ng-model=eventType>
								<option value="Birthday" selected="selected">Birthday
								<option value="Party">Party
								<option value="Marriage">Marriage
						</select></td>
					</tr>
					<tr>
						<td>Event Date</td>
						<td><input type="text" ng-model="eventDate"
							class="datepicker" required="required" size="30" /></td>
					</tr>
					<tr>
						<td>Price</td>
						<td><select ng-model="price">
								<option value="2000" selected="selected">2000
								<option value="5000">5000
								<option value="10000">10000
						</select></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit"
							class="btn btn-primary btn-sm" ng-click="buttonclick()"
							value="Schedule Event Information" /></td>
					</tr>
				</table>
			</div>
			<div ng-show="data">
				<p>Event Added Successfully.</p>
			</div>
		</form>
	</div>
	<script>
		$(document).ready(function() {
			$(".datepicker").datepicker({
				dateFormat : "yy-mm-dd",
				minDate : 0,
				maxDate : 90
			});
		});
	</script>
</body>
</html>