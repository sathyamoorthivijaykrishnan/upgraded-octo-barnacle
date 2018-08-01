<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<title>Stock Manager</title>
</head>
<body>
	<h2>STOCK DETAILS</h2>

	<c:if test="${not empty allStocks}">
		<ul>
			<c:forEach var="stockItem" items="${allStocks}">
				<li>${stockItem.stockId}------ ${stockItem.stockDesc}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>