<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>

<body>
	<h1>File Upload</h1>

	<c:if test="${not empty message}">
		<h3>${message}</h3>
	</c:if>

	<form method="POST" action="upload" enctype="multipart/form-data">
		<input type="file" name="file" /><br /> <input type="submit"
			value="Submit" />
	</form>

</body>
</html>