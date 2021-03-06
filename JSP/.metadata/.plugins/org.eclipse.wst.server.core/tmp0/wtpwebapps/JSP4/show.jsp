<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Java Training Center</h1>
		<table>
			<tr>
				<td>Student Name :</td>
				<td>${param.sname }</td>
			</tr>
			<tr>
				<td>Primary Email :</td>
				<td>${param.email }</td>
			</tr>
			<tr>
				<td>Secondary Email :</td>
				<td>${paramValues.email[0] }</td>
			</tr>
			<tr>
				<td>Secondary Email</td>
				<td>${paramValues.email[1] }</td>
			</tr>
			<tr>
				<td>Host :</td>
				<td>${header.host }</td>
			</tr>
			<tr>
				<td>Referrer :</td>
				<td>${header.referrer }</td>
			</tr>
			<tr>
				<td>JSessionID :</td>
				<td>${cookie.JSESSIONID.value }</td>
			</tr>
			<tr>
				<td>Email Cookie :</td>
				<td>${cookie.email.value }</td>
			</tr>
			<tr>
				<td>Phone Cookie :</td>
				<td>${cookie.phone.value }</td>
			</tr>
			<tr>
				<td>CP-City :</td>
				<td>${initParam.city }</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><br>Using PageContext</td>
			</tr>
			<tr>
				<td>Session ID :</td>
				<td>${pageContext.session.id }</td>
			</tr>
			<tr>
				<td>Remote Address :</td>
				<td>${pageContext.request.remoteAddr }</td>
			</tr>
			<tr>
				<td>Method :</td>
				<td>${pageContext.request.method }</td>
			</tr>
			<tr>
				<td>RequestURI :</td>
				<td>${pageContext.request.requestURI }</td>
			</tr>
			<tr>
				<td>Content Type :</td>
				<td>${pageContext.request.contentType }</td>
			</tr>
		</table>
	</center>

</body>
</html>