<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PHONE BOOK WEBAPPLICATION</title>
</head>
<body>
	<table>
		<tr>
			<th>contactId</th>
			<th>contactName</th>
			<th>contactEmail</th>
			<th>contactNumber</th>
			<th>activeSwitch</th>
			<th>CREATED_DATE</th>
			<th>UPDATED_DATE</th>
		</tr>
		<c:forEach items="${msg}" var="contact">
		<tr>
		<td>${contact.contactId}</td>
		<td>${contact.contactName}</td>
		<td>${contact.contactEmail}</td>
		<td>${contact.contactNumber}</td>
		<td>${contact.activeSwitch}</td>
		<td>${contact.CREATED_DATE}</td>
		<td>${contact.UPDATED_DATE}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>