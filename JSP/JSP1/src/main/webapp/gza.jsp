<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GZA.jsp</title>
</head>
<body>
	<jsp:include page="header.jsp">
		<jsp:param value="Java Training Center" name="cname" />
	</jsp:include>
	This is gza.jsp Home Page
	<br>Which shows ${param.bn } branch detail contact
	email:${param.email }
	<jsp:include page="footer.jsp">
		<jsp:param value="Java Training Center" name="cname" />
	</jsp:include>

</body>
</html>