<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<title>Menu</title>
</head>
<body>
	<c:if test="${not empty t_menu}">
		<h2>MENU FOR THE DAY</h2>

		<table align="center" border="1">
			<tr>
				<th>BreakFast</th>
				<th>Lunch</th>
				<th>Dinner</th>
			</tr>
			<tr>
				<td>${t_menu.brk_fst}</td>
				<td>${t_menu.lunch}</td>
				<td>${t_menu.dinner}</td>
			</tr>
		</table>
	</c:if>



	<c:if test="${not empty menuLst}">
		<h2>MENU FOR THE WEEK</h2>

		<table align="center" border="1">
			<tr>
				<th>BreakFast</th>
				<th>Lunch</th>
				<th>Dinner</th>
			</tr>
			<c:forEach var="menu" items="${menuLst}">
				<tr>
					<td>${menu.brk_fst}</td>
					<td>${menu.lunch}</td>
					<td>${menu.dinner}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<a href="/">Back to home</a>
	
</body>
</html>