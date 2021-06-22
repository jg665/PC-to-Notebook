package javaexp.a00_exp.a05;

public class A02_0506 {
	public static void main(String[]args) {
		

/*
1. 개발환경을 설정할 수 있습니까? java 프로그램 설정하는 순서를 기술해보세요.
	
	필요한 JDK 다운로드.
		- c드라이브에 javaexp 폴더 생성, 내부에 workspace, eclipse 폴더 생성
		- jdk 다운로드 검색 후 15버전으로 다운로드 후 설치 / cmd에서 java -version 확인
		- eclipse 설치 후 파일을 javaexp 폴더에 넣고 eclipse 폴더에 설치
		- 2번째 항목인 web developer로 wrospace에 설치

2. 지난 시간에 언급한 주요 단축키와 기능을 기술해 보세요.
	
	- sysout = 컨트롤+스페이스 단축키 : System.out.println("");
	- 전체주석 단축키 : 컨트롤+시프트+/, ctrl+/ (단일라인)
	- 실행시켜보기 단축키 :
 			컨트롤+시프트+F11 (실행)
 			ctrl+F11 (디버깅모드 실행)
 	- ctrl+space+화살표아래키 : 줄복사처리
 	
3. 주석문의 종류와 역할을 기술하세요
	
	- 1줄 주석문은 // 로 표기, 다중 주석문은 /*로 표기
	- 실행되는 코딩에 포함되지 않는 메모 용도
	  실무:작석장, 생성일, 변경일, 입력값/리턴값, 핵심 로직으로 언급될 부분

4. 데이터 선언과 할당 형식을 대표적인 숫자형과 문자열을 나누어서 간단한 예제로
	출력까지 하는 예제를 만드세요
	
	데이터유형 변수명 = 할당데이터;
		int num01 =25;
		int num02 = 5;
		String name = "홍길동";
		System.out.println(num02+"월 "+num01+"일생 "
			+num01+ "살 "+name+"입니다.");

5. 사칙연산자의 종류와 나머지 연산자를 위에 선언한 변수 기준으로 기능을 기술하세요.
	
	-종류 : +. -, *, /, % -
	int로 데이터 할당이 되었을 경우, num01+num02와 같이 단순 사칙연산이 가능하다.
	% : 두 수를 나눈 후, 나머지값을 처리할 때, 필요하다.
		15%7 ==> 1
		
	- 이외에는 삼항, 대입, 증감, 논리연산자(비교연산자+비교연산자)가 있다.

6. 비교연산자란 무엇인지? 종류와 내용을 기술하세요.

	- 종류 : >=, <=, ==, !=, >, <
	  != : 다를 때, true값을 반환
	- 순서대로 A가 B 이상, 이하, 동일, 일치하지 않음, 초과, 미만을 뜻한다.

7. 조건문의 기본형식을 기술하고, 변수 age와 비교연산자를 이용하여 20이상에 따라
	성인/미성년을 구분하는 코드를 만드세요.
	
	- 조건문 기본형식 : if(조건1){} / if(조건1){}else{}
	/ if(조건1){}else if(조건2){}else{}
	  switch{ case: break; default:}
	  
	  int age = 20;
	  System.out.println("나이:" +age);
	  if(age>=20){
	  	
	  	System.out.println("성인입니다");
	  }else{
	  	System.out.println("미성년입니다");
	  }

8. 반복문 중, for문의 기본형식을 기술하고, 홀수로 20까지 출력하세요..

	for(초기값1;반복조건2;증감연산자4){반복할 구문3}
	
	1 2 3 4 2 3 4 2 3 4
	
	for(int cnt=1;cnt<=20;cnt+=2){
		System.out.println(cnt);}
		
		for(초기값1;반복조건2;증감연산자4){반복할 구문3}
		
		1 2 3 4 2 3 4 2 3 4
		
		cnt+=2 : 2씩 증가 처리..cnt = cnt + 2; 의 약식표현.
		for(int cnt=1;cnt<=20;cnt+=2){
			System.out.println(cnt);}
			

9. 자바에서 기본변수와 객체의 메모리 사용이 차이가 있다. stack/heap영역을 기준으로
	기술하세요.
	
	- 객체는 heap영역에 객체를 생성하고 stack영역에 객체의 주소값을 저장한다.
	primitive 데이터는 stack영역에 바로 데이터를 할당한다.
	heap의 객체는 대문자 시작하여 선언한다. ,
		ex) Person p01 = new Person();
			Person : 객체는 대문자로 시작하여 선언한다.
			참조변수는 소문자로 시작한다.
	stack은 소문자로 선언하고 할당하여 처리한다.
		ex) int num0 = 25;
			int : 기본데이터유형 소문자로 선언..
			변수명도 소문자로 시작한다.
	객체지향 프로그램에서는 가독성(효과적으로 읽고 해석하는 성격)을 위하여
	위와 같이 선언한다. 에러 발생은 되지 않음..
	
	
10. 자바의 메서드 기본 형식을 기술하고, 매개변수로 금액을 입금시,
	리턴값으로 2배가 되는 메서드를 만들어서 코드를 기술하세요.
	
	리턴데이터유형 메서드명(매개변수,....){
		프로세스 처리
		return 리턴할실제데이터;
	}
	static int multi(int num01){
		int tot = num01*2
		return tot;
	}

11. 배열의 기본형식을 기술하고, 좋아하는 음식배열을 선언하고, 출력하세요.
	
	- 배열명[index]={데이터1,2,3,};
	- 데이터유형 [] 참조변수 = new 데이터유형[크기];
	String [] fruits = {"수박", "참외", "배"};
	System.out.println(fruits[0]);
	System.out.println(fruits[1]);
	System.out.println(fruits[2]);



	 */

	}
}
	
