<%@page import="com.ay.entity.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
				<th>Author</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${books }" var="book">
				<tr>
					<td>${book.name }</td>
					<td>${book.price }</td>
					<td>${book.author }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>