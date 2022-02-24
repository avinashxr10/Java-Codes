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
		<form action="test.jtc" method="post">
			<table>
				<tr>
					<td>Student Name</td>
					<td><input type="text" name="sname" />
				</tr>
				<tr>
					<td>Primary Email</td>
					<td><input type="text" name="email" />
				</tr>
				<tr>
					<td>Secondary Email</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Submit" /></td>
				</tr>
			</table>

		</form>
	</center>
</body>
</html>