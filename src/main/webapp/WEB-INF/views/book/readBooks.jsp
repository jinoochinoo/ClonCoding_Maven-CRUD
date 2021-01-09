<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="ko">
<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Read Books</p>
	<p>${fn:length(list)}</p>

	<ol>
		<c:choose>
			<c:when test="${fn:length(list) > 0}">
				<c:forEach items="${list}" var="item">
					<li>
					[name] ${item.name}, [author] ${item.author}, [isbn] ${item.isbn}, [price]${item.price}
					<a href="/p06001/book/mod/?isbn=${item.isbn}">수정</a>    <a href="/p06001/book/del/?isbn=${item.isbn}">삭제</a>
					</li>
				</c:forEach>
			</c:when>
			<c:otherwise>
				book: 0
			</c:otherwise>
		</c:choose>
	</ol>

	</br>
	<a href="/p07001/book/reg">신규등록</a>

</body>
</html>