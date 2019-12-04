<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>Employee home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/getAllEmployees" class="navbar-brand">Show All Users</a>
		</div>
	</div>
	<div class="container" id="homediv">
		<div class="jumbotron text-center">
			<h1>Welcome to Employee Portal</h1>
		</div>
	</div>
	<div class="container text-center">
		<h3>Add New Employee</h3>
		<hr>
		<form:form class="form-horizontal" method="POST" action="saveEmployee"
			modelAttribute="employee">
			<div class="form-group">
				<label class="control-label col-md-3">Username</label>
				<div class="col-md-4" style="display: inline-block">
					<form:input path="username" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">First Name</label>
				<div class="col-md-4" style="display: inline-block">
					<form:input path="firstname" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Last Name</label>
				<div class="col-md-4" style="display: inline-block">
					<form:input path="lastname" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Age</label>
				<div class="col-md-4" style="display: inline-block">
					<form:input path="age" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Salary</label>
				<div class="col-md-4" style="display: inline-block">
					<form:input path="salary" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Password</label>
				<div class="col-md-4" style="display: inline-block">
					<form:password path="password" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group ">
				<input type="submit" class="btn btn-primary" value="Save Employee" />
			</div>
		</form:form>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>