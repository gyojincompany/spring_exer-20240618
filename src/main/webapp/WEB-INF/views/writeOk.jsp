<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 보기</title>
</head>
<body>
	<h2>게시글</h2>
	<hr>
	글쓴이 : ${boardDto.userName }<br><br>
	글제목 : ${boardDto.title }<br><br>
	글내용 : ${boardDto.content }
</body>
</html>