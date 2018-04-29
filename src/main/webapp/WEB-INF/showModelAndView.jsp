<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Tid</th>
			<th>departure_add</th>
			<th>destination_add</th>
			<th>departure_time</th>
			<th>arrival_time</th>
			<th>price</th>
			<th>uname_code</th>
		</tr>
		<c:forEach items="${tickets }" var="ticket">
			<tr>
				<td>${ticket.tid }</td>
				<td>${ticket.departure_add }</td>
				<td>${ticket.destination_add }</td>
				<td>${ticket.departure_time }</td>
				<td>${ticket.arrival_time }</td>
				<td>${ticket.price }</td>
				<td>${ticket.uname_code }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>