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
		<table border="5">
			<tr>
				<td>1)String,Wrapper and Date :</td>
				<td>${requestScope.EM }<br>${sessionScope.PH } <br>
					${applicationScope.DOB } <br></td>
			</tr>

			<tr>
				<td>2) Collection of String,Wrappers and Date :</td>
				<td>${requestScope.AL[0] }<br>${requestScope.AL[1] } <br>
					${requestScope.AL[2] } <br>${requestScope.AL[3] } <br>
					${requestScope.AL[4] } <br>${requestScope.STR[0] } <br>
					${requestScope.STR[1] } <br>${requestScope.STR[2] } <br>${requestScope.STR[3] }</td>
			</tr>

			<tr>
				<td>3) Collection of Collection(*JSTL) :</td>
				<td>Comming Soon</td>
			</tr>

			<tr>
				<td>4) Custom or User Defined class object :</td>
				<td>Cid :${CUST.cid } <br> Cname
					:${sessionScope.CUST.cname }<br> Email
					:${sessionScope.CUST.email }<br> Phone
					:${sessionScope.CUST.phone }<br> Accno
					:${sessionScope.CUST.account.accno }<br> Atype
					:${sessionScope.CUST.account.atype }<br> Bal
					:${sessionScope.CUST.account.bal }<br> Street
					:${sessionScope.CUST.account.address.street }<br> City
					:${sessionScope.CUST.account.address.city }<br>
				</td>
			</tr>

			<tr>
				<td>5)Collection of User Defined class object</td>
				<td>Cid :${CS[0].cid }<br> Cname
					:${sessionScope.CS[0].cname }<br> Email
					:${sessionScope.CS[0].email }<br> Phone
					:${sessionScope.CS[0].phone }<br> Accno
					:${sessionScope.CS[0].account.accno }<br> AType
					:${sessionScope.CS[0].account.atype }<br> Bal
					:${sessionScope.CS[0].account.bal }<br> Street
					:${sessionScope.CS[0].account.address.street }<br> City
					:${sessionScope.CS[0].account.address.city }<br>
				</td>
			</tr>

			<tr>
				<td>6) Map Object</td>
				<td>Sid :${sessionScope.HM["sid"] }<br> Sname
					:${sessionScope.HM["sname"] }<br> Email
					:${sessionScope.HM["email"] }<br>
				</td>
			</tr>

			<tr>
				<td>Collection of Map Object (*JSTL)</td>
				<td>Comming Soon</td>
			</tr>
		</table>
	</center>
</body>
</html>