package javaexp.a00_exp.a06;

public class A21_0615 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
1. html의 body에 있는 h2에 시작합니다! 라는 문자열을
	js로 처리하고자 한다. 코드를 기술하세요.
		<h2>시작!!</h2>
2. js의 5가지 데이터 유형을 간단한 기본 예제와 함께 기술하세요.
	숫자형, 문자열형, boolean형, 함수형, 객체형
	1. 숫자형 데이터(정수/실수)
	var num01 = 25;
	typeof() : 해당 데이터가 어떤 유형인지를 나타내는 내장 함수.
	console.log(typeof(num01)+":"+num01);
	document.write(typeof(num01)+":"+num01);
	
	2. 문자열 데이터
	var str = "홍길동";
	var str2 = '홍길동';
	console.log(typeof(str)+":"+str);
	document.write(typeof(str2)+":"+str2);
	
	
3. js의 객체 생성방법 2가지를 기술하세요.
	DOM, BOM 
	
4. [1단계]h3로 red라고 되어있는 문자를 클릭시, 배경색상이 red로 변경이
	되게 하세요.
	
	<body>
	<h2 onclick="changeH3(this)">red</h2>
</body>
<script type="text/javascript">
	
	var colors = ['red','orange','black','pink','yello','green'];
	h3Obj.onmouseout=change2;
	
	var h3Obj = document.querySelector("h3");
	function changeH3(obj1){
		obj1.style.backgroundColor="red";
	}
	function chnage2(){
		this.style.backgroundColor='red';
	}
	
	
	[2단계] 해당 내용을 클릭시마다 무지개 색상 7가지로 글자와 배경색상이
	변경되게 하세요.
	hint var colors = ['red', 'orange'....];
		obj.style.backgroundColor='red';
		
		
5. BOM과 DOM의 차이점을 기술하세요.

6. js에서 이벤트 처리의 3가지 구성요소와 코드를 통한 처리방법을 기술하세요.
	1. 대상 객체 지정
	var h2Obj =  document.querySelector("h2");
	2. 이벤트 속성 지정
	이벤트 속성에 정의된 이벤트 함수를 지정 처리.
	발생하는 이벤트, 객체.이벤트명 = 선언된 이벤트 핸들러함수;
	
	h2Obj.onmouseover=change1; //마우스가 글을 가리킬떄 색 변경
	h2Obj.onmouseout=change2; // 마우스가 글에서 벗어났을때 
	3. 함수 선언 : 해당 이벤트가 발생하면 수행할 함수를 정의
	
	function change1(){
		this.style.backgroundColor="pink";		
	}
	function change2(){
		this.style.backgroundColor="yellow";		
	}
~9:40
 */
	}

}
