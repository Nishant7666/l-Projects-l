<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import='java.util.*'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<style> 
.body
 {
	background-color: rgba(0, 0, 139, 0.752);
}

.form1 
{
	width: 50%;
	position: fixed;
	transform: translate(50%, 50%);
	padding: 4px;
	border-radius: 7px;
	background-color: rgba(0, 0, 0, 0.542);
	color: aliceblue;
	padding-top: 20px;
	padding-right: 10px;
}

.row
 {
	padding-left: 50px;
}

button 
{
	float: right;
}

.form-check-label 
{
	margin-top: 4px;
}

#inputEmail34 
{
	width: 30%;
}
</style>
<body class="body">


	<%@ include file="menu.jsp"%>
	<%
	String code = request.getParameter("c");
	String color = "";
	String msg = "";

	if (code != null) 
	{
		switch (code) 
		{
		case "1":
			color = "green";
			msg = " Task created successufully";
			break;

		case "0":
			color = "red";
			msg = " failed to create task try again";
			break;
		}
	}

	ArrayList<String> error = (ArrayList<String>) request.getAttribute("error");
	if (error != null) 
	{
		for (String err : error)
		{
	%>
	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<div class="alert alert-danger"><%=err%></div>
			<br>
		</div>
	</div>
	<%
	}
	}
	%>


	<form class="form1 bg-black" action="create_task">

		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Title</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputEmail3"
					name="title">
			</div>
		</div>

		<fieldset class="row mb-3" name="status">
			<legend class="col-form-label col-sm-2 pt-0">Status</legend>
			<div class="col-sm-10">
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gridRadios"
						id="gridRadios1" value="option1" checked> <label
						class="form-check-label" for="gridRadios1"> complete </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gridRadios"
						id="gridRadios2" value="options2"> <label
						class="form-check-label" for="gridRadios2"> In progress </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gridRadios"
						id="gridRadios2" value="compeleted"> <label
						class="form-check-label" for="gridRadios2"> Completed </label>
				</div>


			</div>
		</fieldset>
		<div class="row mb-3">
			<div class="col-sm-10 offset-sm-2">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" id="gridCheck1">
					<label class="form-check-label" for="gridCheck1"> Data
						entered is correct? </label>
				</div>
			</div>
		</div>

		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Schedule</label>
			<div class="col-sm-10">
				<input type="date" class="form-control" id="inputEmail34" name="schedule">
			</div>
		</div>
		<button type="submit" class="btn btn-primary">Next</button>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous"></script>

</body>
</html>