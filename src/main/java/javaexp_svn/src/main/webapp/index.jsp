<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    import="javaexp.z01_vo.Food"
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%
	// java + html ==> 최종적으로 html 파일을
	// 만들어 client(브라우저) Stream을 이용하여
	// 전달한다.
	Food f = new Food("사과",2000,"청과물가게");
%>
<%--
화면단(front end)
html/css
javascript ==> jquery

===> ajax(비동기 프로그래밍) : front end와 back end연결

내부처리프로그램(back end)
java
데이터베이스
jsp
springframework



 --%>
<body>
	<h2>웹 프로그램 시작!!</h2>
	<h3>물건명:<%=f.getName()%></h3>
	<h3>가격:<%=f.getPrice()%></h3>
	<h3>파는 곳:<%=f.getLoc()%></h3>
</body>
</html>