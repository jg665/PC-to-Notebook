<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    import="javaexp.z01_vo.Food "
    
    
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
	// 전달한다. 자바 코드안에 리스폰스 객체가 있다.
	Food f = new Food("사과",2000,"청과물가게");
%>
<%-- jspl 주석문
검색창에 자동완성 기능=자바스크립트사용 =연관검색어= 백엔드 DB = 쓰레드 사용= 
화면단(front end)
html/css
javascript ==> jquery

===> ajax(비동기 프로그래밍) : front end와 back end 연결

내부처리프로그램(back end)
jsp
java
데이터베이스
jsp
springframework


 --%>
<body>
	<h2> 웹 프로그램 시작!!(192.168.25.5)</h2>
	<h3>http://211.63.89.68</h3>
	<h3>물건명:<%=f.getName() %></h3>
	<h3>가격:<%=f.getPrice() %></h3>
	<h3>파는 곳:<%=f.getLoc() %></h3>
</body>
</html>

