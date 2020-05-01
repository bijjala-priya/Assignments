<%@page import="java.util.List"%>
<%@page import="com.capgemini.springmvcpractice.dto.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	List<EmployeeInfoBean> info=(List<EmployeeInfoBean>)request.getAttribute("list");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		if (info != null) {
	%>
	<div align="center">
	
		<table border="1" style="width: 70%">
			<tr style="background: black; color: white;">
			
				<th>ID</th>
				<th>Name</th>
				<th>Password</th>
				<th>Salary</th>
				<th>Designation</th>
				<th>Age</th>
			</tr>
			<%for(EmployeeInfoBean employeeInfoBean : info)  {%>
			<tr>
				<td><%=employeeInfoBean.getEmpId()%></td>
				<td><%=employeeInfoBean.getName()%></td>
				<td><%=employeeInfoBean.getPassword()%></td>
				<td><%=employeeInfoBean.getSalary()%></td>
				<td><%=employeeInfoBean.getDesignation()%></td>
				<td><%=employeeInfoBean.getAge()%></td>

			</tr>
			<% } %>
		</table>
	</div>
	<% } %>

</body>
</html>