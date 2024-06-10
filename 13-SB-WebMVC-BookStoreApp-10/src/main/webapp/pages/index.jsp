<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<font color="green">${success }</font>
	<font color="red">${fail }</font>
	<form:form action="saveBook" modelAttribute="book" method="POST">

		<table>
			<tr>
				<td>Book Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Book Price :</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Book Author :</td>
				<td><form:input path="author" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="save"></td>
			</tr>
		</table>
	</form:form>
	<a href="viewBooks"> View All Books</a>
</body>
</html>