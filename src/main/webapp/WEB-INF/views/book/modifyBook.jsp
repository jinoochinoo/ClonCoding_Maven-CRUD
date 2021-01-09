<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-type" content="text/html; charset=UTF-8">	
<title>Insert title here</title>
</head>
<body>

	<p>Modify Book</p>

	<form action="/p06001/book/modCon" method="get">
		name : <input type="text" name="name" value="${b.name}"></br>
		author : <input type="text" name="author" value="${b.author}"></br>
		isbn : ${b.isbn}</br>
		<input type="hidden" name="isbn" value="${b.isbn}"></br>
		price : <input type="text" name="price" value="${b.price}"></br>
		<input type="submit" value="Modify">
	</form>

</body>
</html>