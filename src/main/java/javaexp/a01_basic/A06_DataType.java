package javaexp.a01_basic;

public class A06_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	
#기본 데이터 타입
1. 정수, 실수, 문자, 논리, 리터럴(할당되는 실제 상수 데이터)을 직접 저장하는 타입을 말한다.
	25, true, 39.7343 (리터럴상수)
2. 메모리의 최소 기억단위인 bit(0/1)가 8개모여 byte가 형성되어 범위를 설정한다.
3. 유형
	1) 정수형   **는 디폴트로 쓰임
	
		byte (1byte) -128~127	
		char (2byte) 0~65535 유니코드 문자
			char c1 = 'A'; 
			char c2 = (char)25;		정수형 25번째 코드값이 c2변수에 할당된다.
		short (2byte) -32768~32767
		**int(4byte) -2147483648 ~ 2147483647
		ex) int num01 = 25;
		long (8byte)
		ex) long num02 = 25L;
		
	2) 실수형
		float(4byte)
		ex) double num04 = 25.434F;
		**double(8byte)
		ex) double num0
		3 = 25.434;
		
	3) 논리형
		boolean(1byte) true/false
		ex) boolean is Pass = true;
			*/
		/*
		for(int code=0;code<=65535;code++) {
			System.out.println(code+":" +(char)code);
		}
		*/
// ex) 기본데이터 유형의 이름과 타입 맞게 데이터를 선언과 할당하여 출력하세요.
//		확인 : 연산자를 이용해서 데이터 할당은 어떤 타입부터 가능한지 확인하세요.
//		새로운 조기준 1조분들 실행할 결과 전달 부탁드립니다.
		byte num01 = 25;
		num01 = 127; // min/max데이터도 확인..  -128~127
		num01 = -128;
		System.out.println("byte 데이터 타입:"+num01);
		
		char num02 = 'A';
		num02 = 'Z'; //
		System.out.println("char 데이터 타입:"+num02);
		// 연산식은 int형부터 데이터가 할당된다.
		short num03 = -30;
		num03 = -32768;
		System.out.println("short 데이터 타입:"+num03);
		
		int num04 = 2147483647;
		num04 = -2147483648;
		System.out.println("int 데이터 타입:"+num04);
		
		float num05 = 25.434F;;
		num05 = -25.434F;;
		System.out.println("float 데이터 타입:"+num05);
		
		double num06 = 2147483647;
		num06 = -2147483648;
		System.out.println("double 데이터 타입:"+num04);
		
		byte num07 = 2;
		byte num08 = 127;
		int num09 = num07 + num08;
		System.out.println(num09);
		
		int num10 =  (int)num05 + num02;
		System.out.println(num10);
		
		
		
		
		
		
		
	}
}
