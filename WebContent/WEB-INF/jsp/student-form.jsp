<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<style type="text/css">
.error{
color: red
}
</style>
<title>Student Form</title>
</head>
<body>
	<div class="container">
		<form:form modelAttribute="student" action="process-form"
			method="post">
			<div class="form-group">
				<label for="fn">First Name</label>
				<form:input path="firstName" id="fn" />
				<form:errors path="firstName" cssClass="error" />

			</div>
			<div class="form-group">
				<label for="fn">Last Name</label>
				<form:input path="lastName" id="ln" />
				<form:errors path="lastName" cssClass="error" />
			</div>
			<div class="form-group">
				<label for="sc">Student Code</label>
				<form:input path="studentCode" id="sc" />
				<form:errors path="studentCode" cssClass="error" />
			</div>
				<div class="form-group">
				<label for="bc">Batch Code</label>
				<form:input path="batchCode" id="bc" />
				<form:errors path="batchCode" cssClass="error" />
			</div>
			<div class="form-group">
				<label for="dob">Date Of Birth</label>
				<form:input path="dob" id="dob" placeholder="yyyy-mm-dd" />
				<form:errors path="dob" cssClass="error" />
			</div>
			<div class="form-group">
				<label for="doj">Date Of Joining</label>
				<form:input path="doj" id="doj" placeholder="yyyy-mm-dd" />
				<form:errors path="doj" cssClass="error" />
			</div>
			<div class="form-group">
				<label for="age">Age</label>
				<form:input path="age" id="age" />
				<form:errors path="age" cssClass="error" />
			</div>
			<div class="form-group">
				<label>Gender</label> Male:
				<form:radiobutton path="gender" value="Male" />
				Female:
				<form:radiobutton path="gender" value="Female" />
			</div>
			<div class="form-group">
				<label>Country</label> <form:select path="country">
				<form:option value="">--Select---</form:option>
				<form:option value="IND">India</form:option>
				<form:option value="AUS">Australia</form:option>
				<form:option value="GB">Great Britain</form:option>
				</form:select>
			</div>
			
			<div class="form-group">
				<label>Courses</label> 
				Core Java:
				<form:checkbox path="courses" value="M1" />
				Advance Java:
				<form:checkbox path="courses" value="M2" />
				Java Frameworks:
				<form:checkbox path="courses" value="M3" />
				
			</div>
			<div class="form-group">
				<label>Experienced</label> 

				<form:checkbox path="experienced" />
				
			</div>
			<div class="form-group">
				<label for="c">Comment</label>
				<form:textarea path="comment" id="c" />

			</div>
			<div class="form-group">
				<input type="submit" value="Register">
			</div>
		</form:form>
	</div>
</body>
</html>