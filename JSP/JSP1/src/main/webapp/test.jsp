<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test.jsp</title>
</head>
<body>
	<%
	String bn = request.getParameter("branch");
	if (bn.equals("GZA")) {
	%>
	<jsp:forward page="gza.jsp">
		<jsp:param value="GZA" name="bn" />
		<jsp:param value="gza@jtc.org" name="email" />
	</jsp:forward>
	<%
	} else if (bn.equals("GRNDA")) {
	%>

	<jsp:forward page="grnda.jsp">
		<jsp:param value="GRNDA" name="bn" />
		<jsp:param value="grnda@jtc.org" name="email" />
	</jsp:forward>

	<%
	} else {
	%>
	<jsp:forward page="noida.jsp">
		<jsp:param value="NDA" name="bn" />
		<jsp:param value="noida@jtc.org" name="email" />
	</jsp:forward>

	<%
	}
	%>

</body>
</html>