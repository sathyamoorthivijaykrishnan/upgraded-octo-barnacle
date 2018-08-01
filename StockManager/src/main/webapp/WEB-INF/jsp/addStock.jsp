<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form id="regForm" modelAttribute="stock" action="addStock"
		method="post">
		<table align="center">
			<tr>
				<td><form:label path="stockDesc">Item Description</form:label></td>
				<td><form:input path="stockDesc" name="stockDesc" id="stockDesc" /></td>
			</tr>
			<tr>
				<td><form:label path="stockId">Item Code</form:label></td>
				<td><form:password path="stockId" name="stockId" id="stockId" /></td>
			</tr>			
			<tr>
				<td></td>
				<td><form:button id="add" name="add">Add</form:button></td>
			</tr>
			<tr></tr>

		</table>
	</form:form>	
</body>
</html>