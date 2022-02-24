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
		<table border="2" style="font-size: 26; color: red;">
			<tr>
				<td>1)String,Wrapper and Date :</td>
				<td><m:out value="${requestScope.EM}"></m:out><br>
					${sessionScope.PH }<br> ${applicationScope.DOB }<br></td>
			</tr>
			<tr>
				<td>2)Collection of String,Wrapper and Date :</td>
				<td><table bgcolor="#c3d559" style="font-size: 26;">
						<tr>
							<m:forEach var="x"items"${requestScope.AL }">
								<td>${x }</td>
							</m:forEach>
						</tr>
					</table>
					<table>
						<tr>
							<m:forEach var="i" items="${sessionScope.STR }">
								<td>${i }</td>
							</m:forEach>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td>3) Collection of Collections :</td>
				<td><table bgcolor="#c3d599" style="font-size: 26; color: red;">
						<m:forEach var="list" items="${requestScope.AL1}">
							<tr>
								<m:forEach var="x" items="${list}">
									<td>${x}</td>
								</m:forEach>
							</tr>
						</m:forEach>
					</table></td>
			</tr>
			<tr>
				<td>4) Customer or User Defined Class Object :</td>
				<td>Cid :${sessionScope.CUST.phone}<br> Email
					:${sessionScope.CUST.email}<br> Phone
					:${sessionScope.CUST.phone }<br> Accno
					:${sessionScope.CUST.account.accno }<br> AType
					:${sessionScope.CUST.account.atype }<br> Bal
					:${sessionScope.CUST.account.bal}<br> Street
					:${sessionScope.CUST.account.address.street}<br> City
					:${sessionScope.CUST.account.address.city}<br></td>
			</tr>

			<tr>
				<td>5) Collection or User Defined Class Object</td>
				<td><table bgcolor="#c3d599" style="font-size: 26; color: red;">
						<tr>
							<td>Cid</td>
							<td>CName</td>
							<td>Email</td>
							<td>Phone</td>
							<td>Accno</td>
							<td>AType</td>
							<td>Bal</td>
							<td>Street</td>
							<td>City</td>
						</tr>
						<m:forEach var="cust" items="${sessionScope.CS}">
							<tr>
								<td>${cust.cid}</td>
								<td>${cust.cname }</td>
								<td>${cust.email }</td>
								<td>${cust.phone }</td>
								<td>${cust.account.accno }</td>
								<td>${cust.account.atype }</td>
								<td>${cust.account.bal }</td>
								<td>${cust.account.address.street }</td>
								<td>${cust.account.address.city }</td>
							</tr>
						</m:forEach>
					</table></td>
			</tr>

			<tr>
				<td>6) Map Object</td>
				<td><table style="font-size: 26; color: red;">
						<tr>
							<td>Map Key</td>
							<td>Map value</td>
						</tr>
						<m:forEach var="entry" items="${requestScope.HM}">
							<tr>
								<td>${entry.key}</td>
								<td>${entry.value}</td>
							</tr>
						</m:forEach>
					</table></td>
			</tr>

			<tr>
				<td>7) Collection of Map Object</td>
				<td><table bgcolor="white" style="font-size: 26; color: red;">
						<m:forEach var="map" items="${requestScope.AL2}">
							<tr>
								<td><table bgcolor="#c3d599"
										style="font-size: 26; color: red">
										<tr>
											<td>Map Key</td>
											<td>Map value</td>
										</tr>
										<m:forEach var="entry" items="${map}">
											<tr>
												<td>${entry.key }</td>
												<td>${entry.value }</td>
											</tr>
										</m:forEach>
									</table></td>
							</tr>
						</m:forEach>
					</table></td>
			</tr>

		</table>
	</center>
</body>
</html>