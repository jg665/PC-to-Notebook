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
	// java + html ==> ���������� html ������
	// ����� client(������) Stream�� �̿��Ͽ�
	// �����Ѵ�. �ڹ� �ڵ�ȿ� �������� ��ü�� �ִ�.
	Food f = new Food("���",2000,"û��������");
%>
<%-- jspl �ּ���
�˻�â�� �ڵ��ϼ� ���=�ڹٽ�ũ��Ʈ��� =�����˻���= �鿣�� DB = ������ ���= 
ȭ���(front end)
html/css
javascript ==> jquery

===> ajax(�񵿱� ���α׷���) : front end�� back end ����

����ó�����α׷�(back end)
jsp
java
�����ͺ��̽�
jsp
springframework


 --%>
<body>
	<h2> �� ���α׷� ����!!(192.168.25.5)</h2>
	<h3>http://211.63.89.68</h3>
	<h3>���Ǹ�:<%=f.getName() %></h3>
	<h3>����:<%=f.getPrice() %></h3>
	<h3>�Ĵ� ��:<%=f.getLoc() %></h3>
</body>
</html>

