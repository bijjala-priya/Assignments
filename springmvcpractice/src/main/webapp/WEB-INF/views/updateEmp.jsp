<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
<fieldset>
	<legend>Update Employee</legend>
	<form action="./updateEmployee">
	Employee Id :<input type = "number" name="empId" required>
	Employee Name : <input type ="text" name="name" required>
	&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="submit" value="Update">
	</form>
	</fieldset>
</body>
</html>