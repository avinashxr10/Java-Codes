<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.jtcindia.jsp.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="ST1" class="com.jtcindia.jsp.Student">
		<jsp:setProperty property="sid" name="ST1" />
	</jsp:useBean>

	<hr>
	<h2>Test1</h2>
	<h1>
		Sid :<jsp:getProperty property="sid" name="ST1" />
		Name :<jsp:getProperty property="name" name="ST1" />
		Phone :<jsp:getProperty property="phone" name="ST1" />
	</h1>

	<br>
	<jsp:useBean id="ST2" class="com.jtcindia.jsp.Student"></jsp:useBean>
	<jsp:setProperty property="*" name="ST2" />

	<hr>
	<h2>Test2</h2>
	<h1>
		Sid :<jsp:getProperty property="sid" name="ST2" />
		Name :<jsp:getProperty property="name" name="ST2" />
		Phone :<jsp:getProperty property="phone" name="ST2" />
	</h1>

	<br>
	<jsp:useBean id="ST3" class="com.jtcindia.jsp.Student"></jsp:useBean>
	<jsp:setProperty property="sid" name="ST3" />
	<jsp:setProperty property="phone" name="ST3" param="mobile" />
	<hr>
	<h1>
		Sid :<jsp:getProperty property="sid" name="ST3" />
		Name :<jsp:getProperty property="name" name="ST3" />
		Phone :<jsp:getProperty property="phone" name="ST3" />
	</h1>

</body>
</html>