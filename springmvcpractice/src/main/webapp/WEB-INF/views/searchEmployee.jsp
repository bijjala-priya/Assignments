<%@page import="com.capgemini.springmvcpractice.dto.EmployeeInfoBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean)request.getAttribute("employeeInfo"); 
    String errMsg= (String) request.getAttribute("errMsg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Search Employee</legend>
<form action="./getEmployee" method="get">
<label>Employee ID : </label>
<input type="number" name="empId" required><br>
<br><input type="submit" value="Search">
</form>

</fieldset>
<%if (errMsg !=null && !errMsg.isEmpty()){ %>
<h3 style="color:red;"><%=errMsg %></h3>
<%} %>
<% if (employeeInfoBean!=null) { %>
<div align="center">
<table border="1" style="width:60%">
<tr style="background:navy; color:white">
<th>Emp Id</th>
<th>Name</th>
<th>Age</th>
<th>Salary</th>
<th>Designation</th>
<th>Password</th>
<tr>
<td><%=employeeInfoBean.getEmpId()%></td>
<td><%=employeeInfoBean.getName() %></td>
<td><%=employeeInfoBean.getAge() %></td>
<td><%=employeeInfoBean.getSalary() %></td>
<td><%=employeeInfoBean.getDesignation() %></td>
<td><%=employeeInfoBean.getPassword() %></td>
<tr>
</table>

</div>
<%} %>

</body>
</html>