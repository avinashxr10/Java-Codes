<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<jsp:include page="header.jsp">
		<jsp:param value="JTC India" name="cname" />
	</jsp:include>

	<form action="test.jsp">
		<h1>Select The Branch</h1>
		<select name="branch">
			<option value="GZA">GHAZ</option>
			<option value="GRNDA">GRNDA</option>
			<option value="NDA">NOIDA</option>
		</select><input type="submit" value="Submit">
	</form>
	<br>


	<jsp:include page="footer.jsp">
		<jsp:param value="JTC India" name="cname" />
	</jsp:include>

</body>
</html>