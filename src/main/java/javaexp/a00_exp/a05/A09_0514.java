package javaexp.a00_exp.a05;

import java.util.Scanner;

public class A09_0514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		1) 실행명령어 위치기술, 컴파일 파일 위치기술
		C:\Program Files\Java\jdk-15.0.2\bin
			java.exe
			javac.exe
		javaexp/build/classes : 옵션으로 지정 처리..
			저장하는 순간 해당 클래스의 컴파일 파일이 @@@.class로 저장된다.
			C:\Javaexp\workspace\javaexp\build\classes
		2)
		 공통 : 컴파일 파일까지 만들어진다. A01_Start.calss
		 main() 있을때는 실행할 수 있다. java A01_Start 명령을 통해서 실행을 하고,
		 		실행 결과를 확인할 수 있다.
		 main() 없을때 실행 불가능. 외부에서 main()메서드가 있는 클래스에서만
		 		import하고 호출하여 객체 생성이 가능하다.
		 		ex) a05_vo
		 		
		3)	A01_Start.java를 통해서 text 작성,
		 	javac A01_Start.java 명령을 통해서 compile
		 		eclipse에서는 에러없이 저장시, compile된다.
		 		==> A01_Start.class 파일 특정위치에 생성
		 	해당 클래스내에 main()메서드를 포함시,
		 	java A01_Start 명령을 통해서 실행 처리되어 main()안에서
		 		선언되 내용이 처리된다.
		 */
		/*
		 
		 2. 변수의 계층적(중괄호 블럭)으로 처리된다는 의미를 지역변수/전역변수와 함께 간단하게 설명하시오
		 	중괄호 블럭{}단위로 계층적으로 종속되어 변수를 사용할 수 있다는 의미이다.
		 	클래스명{}, 생성자{}. 메서드{}, if(){}, for(){} 
		 	상위1변수
		 	{
		 	
		 		하위1변수
		 		{
		 			상위1변수 사용 가능
		 			하위1변수 사용 가능
		 		}
		 	}
		 	하위1변수사용못함.
		 */
//		3. 변수명의 선언 규칙을 클래스의 구성요소와 변수명을 나누어서 기술하세요.
//			(클래스명/생성자명/참조변수명/메서드명)
		
		class Person{ // 클래스명 생성자는 대문자로 시작 선언
			private String name; // 변수명은 소문자로 시작 
			Person(String name){
			// 매개변수 String name는 지역변수
			// this.name 는 필드명 변수
			// 지역변수를 전역변수에 할당 할 수 있다.
			this.name=name;
	}
			// 메서드명은 소문자로 시작하고, 합성어의 구분자는 대문자로 시작한다.
			// set + name ==> setName
			public void setName(String name) {
			this.name = name;
	}
}
// main()
// Person p01 = new Person();
// 클래스명 참조변수 = new 생성자명();
// 참조변수는 소문자로 시작하여 선언;
		
//		 4.자바의 기본데이터 유형과 크기(byte)를 변수 선언과 할당과 함께 주석문으로 설명하세요
		//정수형
		byte num01 = 127;
		//byte : 정수형, 1byte, -128~127 값을 가짐
		char num02 = '네';
		// char : 정수형, 2byte, 0~65535 값을 가짐, 유니코드 문자를 나타낸다
		short num03 = 32767;
		// short : 정수형, 2byte, -32768~32767
		int num04 =1234567;
		// int : 정수형, 4byte, 기본데이터 유형
		long num05 = 1234564654654L;
		// long : 정수형,8byte,long 유형인것을 알리는 대문자 L을 적어줘야 한다
		
		
		
		
		
		
		//		 long : 대소문자 L/l 적어줘야 적용
			
		
		
		/*
		6. 
		비교연산자 : 변수의 비교(!=,==,>=,<), equals() 기능 메서드를 
		통해 boolean값을 가져오는 것을 말한다.
		논리연산자 : 비교연산자와 함께 !(반대), &&, || 두 논리값을 not,
				and, or 로 연결하여 결과값을 처리하는 연산자.
		 */
//		 7.
		 
		 	Scanner sc = new Scanner(System.in);
		 	System.out.println("#놀이공원에 오신걸 환영합니다#");
		 	System.out.println("입장객 나이 입력");
		 	int age = sc.nextInt();
		 	int pay = 50000;
		 	if(age<5 || age>=65) {
		 		System.out.println("100% 무료입장");
		 		pay=0;
		 	}else if(age<=8) {
		 		System.out.println("50%");
		 		pay = pay -(int)(pay*0.5);
		 	
		 	
		 }
		 
		
	}
}	
