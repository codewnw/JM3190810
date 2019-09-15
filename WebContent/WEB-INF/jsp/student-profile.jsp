<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Student Profile</title>
</head>
<body>
	<h1>Student Profile</h1>
	<table class="table table-striped">
		<tr>
			<td>First Name:</td>
			<td>${student.firstName}</td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td>${student.lastName}</td>
		</tr>
		<tr>
			<td>Student Code:</td>
			<td>${student.studentCode}</td>
		</tr>
		<tr>
			<td>Date of Birth:</td>
			<td>${student.dob}</td>
		</tr>
		<tr>
			<td>Date of Joining:</td>
			<td>${student.doj}</td>
		</tr>
		<tr>
			<td>Date of Joining:</td>
			<td>${student.batchCode}</td>
		</tr>
		<tr>
			<td>Age:</td>
			<td>${student.age}</td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td>${student.gender}</td>
		</tr>
		<tr>
			<td>Comment:</td>
			<td>${student.comment}</td>
		</tr>
		<tr>
			<td>Country:</td>
			<td>${student.country}</td>
		</tr>
		<tr>
			<td>Courses:</td>
			<td>${student.courses[0]}&nbsp;${student.courses[1]} &nbsp;
				${student.courses[2]}</td>
		</tr>
		<tr>
			<td>Experienced:</td>
			<td>${student.experienced}</td>
		</tr>
	</table>
</body>
</html>