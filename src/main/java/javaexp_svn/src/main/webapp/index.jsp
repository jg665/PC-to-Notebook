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
	// java + html ==> ���������� html ������
	// ����� client(������) Stream�� �̿��Ͽ�
	// �����Ѵ�.
	Food f = new Food("���",2000,"û��������");
%>
<%--
ȭ���(front end)
html/css
javascript ==> jquery

===> ajax(�񵿱� ���α׷���) : front end�� back end����

����ó�����α׷�(back end)
java
�����ͺ��̽�
jsp
springframework



 --%>
<body>
	<h2>�� ���α׷� ����!!</h2>
	<h3>���Ǹ�:<%=f.getName()%></h3>
	<h3>����:<%=f.getPrice()%></h3>
	<h3>�Ĵ� ��:<%=f.getLoc()%></h3>
</body>
</html>