package javaexp.a00_exp;

import java.util.Scanner;

public class A09_0514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 정리 문제
1. java프로그램을 작성한 후, 컴파일 과정과 실행과정을 main()와의 관계 속에서 기술하세요.
	1) 실행명령어 위치 기술, 컴파일 파일 위치 기술
		- 실행명령어 위치 : C:\Program Filed\Java\jdk-15.0.1\bin
		- 컴파일 파일 위치 : C:\Program Files\Java\jdk-15.0.2
			java.exe
			javac.exe
		javaexp/build/classes : 옵션으로 지정 처리
			저장하는 순간 해당 클래스의 파일이 @@@.class로 저장된다.
	2) A01_Start.java 기준을 main()가 있을때와 없을때의 차이점
		- main()가 포함된 클래스만 실행 명령어를 통해 메모리 로딩, cpu처리를 통해 결과 확인 가능하다. 컴파일 파일까지 만들어진다.
		- main() 없을 때 : 실행이 불가능하다. 외부에서 해당 클래스를 main()이 있는 클래스에만 import하고 호출하여 객체 생성이 가능하다.
	3) 컴파일 실행 파일 만들어지는 과정
		- .java로 프로그래밍된 소스 파일을 컴파일러가 java 바이트 코드로 번역해서 java 클래스 파일로 저장한다.
		- 이 파일을 JVM이 실행하게 된다.
		
		A01_Start.jave를 통해서 text 생성
		javac A01_Start.java 명령을 통해서 compile
		eclipse에서는 에러없이 저장 시, compile 진행된다.
		==> A01.start.class 파일 특정위치에 생성
		해당 클래스내 main()메서드를 포함시,
		java A01_start 명령을 통해서 
		
2. 변수의 계층적(중괄호 블럭)으로 처리된다는 의미를 지역변수/전역변수와 함께 간단한 예제로 기술하세요.
	- 전역변수는 클래스의 블록 안의 모든 멤버가 활용 가능한 변수이다.
	- 지역변수는 중괄호 블럭의 계층 구조에 조건에 맞아야 사용할 수 있다.
	1- 상위 중괄호 블럭에 선언한 변수는 하위에서 사용 가능하지만
	2- 하위 중괄호 블럭에 선언한 변수는 상위에서 사용이 불가능하다.
	3- 지역변수이지만 전역변수에 할당해서 활용할 수는 있다.
	
	예시)
	class Person {
		String name; // 전역변수
		void call(String dog){
			System.out.println(dog); // dog는 지역변수로, 이 블럭 안에서만 사용 가능하다.
			this.name = dog; // 지역변수를 전역변수에 할당, 활용 가능하게 된다.
		}
	}
	
3. 변수명의 선언 규칙을 클래스의 구성요소와 변수명을 나누어서 기술하세요.
	1. 변수명 첫번째 글자는 문자여야하며 특수문자는 $, _만 허용
	2. 변수명의 첫번째 글자는 숫자 사용불가
	3. 변수명은 대/소문자가 구별된다.
	4. 변수명은 일반적으로 영어 소문자로 시작하되, 다른 단어와의 합성어로는 첫자를 대문자로 사용한다.
		- 단, 클래스명과 생성자명은 첫번째 글자를 대문자로 시작한다.(관례)
	5. 문자 수 길이 제한이 없기때문에 너무 간단하게 해서 나중에 이해하지 못할 정도면 안된다.
	6. 자바 예약성(명령어로 내장된 것)은 변수로 사용할 수 없다.
		- 변수 뒤에 번호를 붙이면 허용된다.
	
4. 자바의 기본데이터 유형과 크기(byte)를 변수 선언과 할당과 함께 주석문으로 설명하세요.
		int num01 = 4; // 정수형 데이터 타입, 4byte
		double num02 = 8; // 실수형 데이터 타입, 8byte

5. 자바에서 형변환 유형을 기본유형과 상속에 의한 유형을 나누어서 예제를 통해 기술하세요.
		// 기본유형
		int num03 = 24;
		double num04 = num03; // promote
		
		double num05 = 24.24;
		int num06 = (int)num05; // typecasting
		
		// 상속유형
		Mother m1 = new Daughter();
		Object o1 = m1; // promote
		Daughter d1 = (Daughter)o1; // typecasting
		d1.show();

6. 연산자의 종류 중에서 비교연산자와 논리연산자의 차이점에 대하여 기술하세요.
- 비교연산자 : 두개의 값을 비교해서 처리 (!=, ==, >=, <) - .equals() 메서드를 통해 boolean 값을 가져오는 것을 말한다.
	- 논리연산자 : 두개의 값의 조건을 비교해서 처리 / !(not), &&, || 두 논리값을 연결하여 결과값 처리하는 것을 말한다.
	
7. 아래와 같은 데이터를 처리하려고 한다. 비교/논리 연산자를 활용하자.
	놀이공원에서 기본 요금 50000
	나이에 따른 할인율 처리 후, 요금 출력
	5미만 65이상 할인율 100%
	5~8 할인율 50%
	9~18 할인율 30%
	19~64 할인율 0%
	1단계) 할인율만 표시
	2단계) 할인율을 계산해서 총비용을 typecasting하여 출력하세요
		int price = 50000;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		if(age<5||age>=65) {
			System.out.println("할인율 100%입니다.");
			System.out.println("총 입장료: "+price*0+"원");
		} else if (age>=5&&age<=8) {
			System.out.println("할인율 50%입니다.");
			System.out.println("총 입장료: "+(int)(price*0.5)+"원");
		} else if (age>=9&&age<=18){
			System.out.println("할인율 30%입니다.");
			System.out.println("총 입장료: "+(int)(price*0.7)+"원");
		} else {
			System.out.println("할인율 0%입니다.");
			System.out.println("총 입장료: "+price+"원");
		}
	
			
				*/
			
	}

}



