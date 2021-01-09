<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>Register Book</p>
	
	<form action="/p06001/book/regCon" method="get">
		name : <input type="text" name="name"></br>
		author : <input type="text" name="author"></br>
		isbn : <input type="text" name="isbn"></br>
		price : <input type="text" name="price"></br>
		<input type="submit" value="Register">
	</form>

</body>
</html>