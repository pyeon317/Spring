<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>파라미터값 받기</h3>
	
	<form action="param1" method="post" >
		name: <input type="text" name="name">
		age: <input type="text" name="age">
		
		<input type="checkbox" name="inter" value="java" >자바
		<input type="checkbox" name="inter" value="spring">spring
		<input type="checkbox" name="inter" value="db">database
		
		<button>서브밋(버튼 타입이 없으면 서브밋)</button>
	</form>
</body>
</html>