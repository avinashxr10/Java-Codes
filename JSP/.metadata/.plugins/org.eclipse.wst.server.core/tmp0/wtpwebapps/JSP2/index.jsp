<%@ page import="com.jtcindia.jsp.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP-2</title>
</head>
<body>

	<%
	Student st = new Student();
	st.setSid(99);
	st.setName("Avinash");
	st.setPhone(96480);
	session.setAttribute("STUD", st);
	%>
	<hr>

	<%
	Student std = (Student) session.getAttribute("STUD");
	%>

	<h1 bgcolor="lightblue">
		<center>
			<font color="red">Sid:<%=std.getSid()%><br>Name:<%=std.getName()%><br>
				Phone:<%=std.getPhone()%>
			</font>
		</center>

	</h1>
	<hr>
	<h1>
		Using use Bean and other tags
		<jsp:useBean id="STUD" class="com.jtcindia.jsp.Student"
			scope="session"></jsp:useBean>

		<%-- <jsp:setProperty property="sid" name="STUD" value="88" />
		<jsp:setProperty property="name" name="STUD" value="som rai" />
		<jsp:setProperty property="phone" name="STUD" value="9990699111" /> --%>
		<hr>
		<center>
			Sid:<jsp:getProperty property="sid" name="STUD" /><br>Name:<jsp:getProperty
				property="name" name="STUD" /><br>Phone:<jsp:getProperty
				property="phone" name="STUD" />
		</center>

	</h1>

</body>
</html>