<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!--  태그 라이브브러리 추가-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>list</title>


	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.4/jquery.min.js" 
	integrity="sha512-jGsMH83oKe9asCpkOVkBnUrDDTp8wl+adkB2D+//JtlxO4SrLoJdhbOysIFQJloQFD+C4Fl1rMsQZF76JjV0eQ==" 
	crossorigin="anonymous" referrerpolicy="no-referrer">
	</script>


	<script>
	/*
	$(function() {
	$("#title>td").css("color","red");
	});  
	
	$(function() {
	$("#title>title1").css("color","red");
	}); 
	
	$(function() {
	$("#title").children().css("color","red");
	}); 
	
	$(function() {
	$("#title1").prev().css("color","red");
	}); 
	
	$(function() {
	$("#title1").next().css("color","red");
	}); 
	*/
	
	$(function() {
		
		//열
		//$("td:first-of-type").css("color","red");
		//$("td:last-of-type").css("color","yellow");
		//$("tbody td:first-of-type").css("color","red");
		//$("tbody td:last-of-type").css("color","yellow");
		
		//행
		$("tbody tr:first-of-type").css("color","red");
		$("tbody tr:last-of-type").css("color","yellow");
		
	
	}); 
	
	</script>
	
</head>

<body>
	<table border=1>
		<thead>
			<tr>
				<th>교수번호</th>
				<th>교수</th>
				<th>학과</th>
				<th>교수직위</th>
				<th>연봉</th>
				<th>임용일</th>
				<th>전공</th>
				<th>캠퍼스</th>
			</tr>
		</thead>
		<tbody id=titlebody>
			<c:forEach var="item" items="${list}">
				<tr id=title>
					<td id=title1>${item.pid}</td>
					<td>${item.pname}</td>
					<td id=title2>${item.dept}</td>
					<td>${item.post}</td>
					<td>${item.pay}</td>
					<td><fmt:formatDate value="${item.hire}" pattern="yyyy-MM-dd"/></td>
					<td>${item.major}</td>
					<td id=title3>${item.campus}</td>
				</tr>
			</c:forEach>
		</tbody>	
	</table>
</body>

</html>