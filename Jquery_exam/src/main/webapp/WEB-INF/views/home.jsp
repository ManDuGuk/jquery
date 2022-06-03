<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
	
	<!-- 1.url 추가를 통한 jquery 라이브러리 추가 -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.4/jquery.min.js" 
	integrity="sha512-jGsMH83oKe9asCpkOVkBnUrDDTp8wl+adkB2D+//JtlxO4SrLoJdhbOysIFQJloQFD+C4Fl1rMsQZF76JjV0eQ==" 
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	
	<!-- 2.파일 추가를 통한 jquery 라이브러리 추가 -->
	<!-- <script src="./resources/jquery.js"></script> -->
	
	<!-- 가까운 상위 요소 선택자 -->
	<script>
	$(function() {
		
		$("li:first-of-type").css("color","red");
		$("li:last-of-type").css("color","blue");
		
	}); 
	
	</script>

	</head>
<body>

<h1>
	Hello JQUERY!  
</h1>



	<h3 id="title">JQuery 이해</h3>
	<ol id="index">
		<li id="title1">선택자1</li>
		<li id="title2">선택자2</li>
		<li id="title3">전체선택자</li>
		<li id="title4">아이디선택자</li>
		<li calss="title5">클래스 선택자</li>
	</ol>



</body> 

</html>




