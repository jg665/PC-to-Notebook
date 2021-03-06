package javaexp.a09_api;

import java.util.ArrayList;

public class A13_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
# Wrapper 객체란?
1.	기본타입(byte, char, short, int, long, float
		double, boolean)값을 내부에 두고 포장하는 객체를 말한다.
		객체로 전환되는 순간, 여러가지 기능메서드가 지원되기에
		데이터 변환이나 기능처리를 할 수 있기때문이다.
*/
		int num01 = 25;
		// 기본 유형의 데이터를 Wrapper 객체로 변환 처리..
		Integer num01Obj = new Integer(num01);
		// 객체의 속성(필드/메서드)를 통해서 여러가지 기능을 처리
		// 할 수 있다.
		
/*
2.	포장	클래스
	대부분 대문자로 시작하여 처리하는 객체를 말한다.
	byte ==> Byte, short ==> Short
	# char ==> Character, int ==> Integer
3.	박싱(Boxing)과 언박싱(Unboxing)
	 기본 데이터 <===> Wrapper 객체
	 autoboxing : 위에 있는 정상적인 처리방법 외에 간편하게 
	 	처리하는 것을 말한다.
	 
	1) 박싱 : 기본 타입의 값을 포장 객체로 만드는 과정
	2) 언박싱 : 포장 객체에서 기본 타입의 값을 얻어내는 과정
 */
//		생성자를 통해 박싱 처리
//		1) 기본 타입을 생성자에 할당.
//		2) 문자열형 기본타입을 생성자에 할당.
//		deplicated : 사용자제, 나중에 사용을 변경내지 삭제 계획
		// Boxing 처리
		Byte obj01 = new Byte("10");
		Integer obj02 = new Integer(1000);
		Double obj03 = new Double("35.27");
		System.out.println("박싱된 객체들:"+obj01);
		System.out.println("박싱된 객체들:"+obj02);
		System.out.println("박싱된 객체들:"+obj03);
		// # autoboxing
		// 기본데이터유형을 바로 할당할 때, autoboxing이 일어나서
		// 객체로 Wrapper 된다.
		Integer obj04 = 1000;
		Double obj05 = 35.24;
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(new Integer(25));
		ilist.add(new Integer("30"));
		// autoboxing 처리
		ilist.add(35);
		ilist.add(25);
		ilist.add(70);
		for(Integer i:ilist) {
			System.out.println("데이터:"+i);
		}
		// ex1) char, boolean, float 데이터를 boxing 처리하여
		// 		wrapper 클래스에 할당하고, 출력하세요.
		//		boxing 처리시 형식 new 래퍼클래스(문자열형)
		// 		new	래퍼클래스(해당타입)
		Character ob1 = new Character('A');
		 Boolean ob2 = new Boolean("true");
		 // autoboxing 처리
		 Float ob3 = 3.14F;
		 System.out.println("박싱된 객체:"+ob1);
		 System.out.println("박싱된 객체:"+ob2);
		 System.out.println("박싱된 객체:"+ob3);
		
		// ex2) main(String[] args) 의 args[]안에 문자열
		 //		입력한 10 20 25.7
		//		String args[] = {"10,"20","25.7"};
		//		args[0] : "10", args[1] : "20",
		//		args[2] : "25.7"
		//		데이터를 정수형, 실수형 3개 입력하고 wrapper(생성자)로
		//		데이터를 출력하여 처리하세요.
		 	Integer ob4 = new Integer(args[0]);
		 	// Integer.parseInt("정수형문자열") : 정수형
		 	// 문자열을 정수(기본유형)으로 변경 처리한다.
		 	// Integer ob5 = Integer.parseInt(args[1]); 
		 	// ==> autoboxing 처리..
		 	Integer ob5 = Integer.parseInt(args[1]); 
		 	Double ob6 = new Double(args[2]); 
		 	System.out.println("ob4:"+ob4);
		 	System.out.println("ob4:"+ob5);
		 	System.out.println("ob4:"+ob6);
		 	
		// ex3) ArrayList로 임의의 수학점수(0~100) 정수형데이터
		// 	5개를 할당하고 출력하세요.
		//	1. 리스트 선언..
		 	ArrayList<Integer> ilist2 = new ArrayList<Integer>();
		 	System.out.println("# 할당 및 출력 #");
		 	for(int idx=0; idx<5;idx++) {
		 		// (int)(Math.random()*101) : 임의의 정수값
		 		// 0~100 범위로 발생
		 		//	ArrayList<Integer> 에 할당.
		 		//	Integer 형태로 list되어 있는 데이터를
		 		//	기본 정수로 할당하여 autoboxing 처리
		 		
		 		ilist2.add((int)(Math.random()*101));
		 		// 저장된 데이터를 get(index)로 확인 처리.
		 		System.out.println(ilist2.get(idx));
		 	}
		 	
		// Unboxing 처리
		byte value01 = obj01.byteValue();
		int value02 = obj02.intValue();
		double value03 = obj03.doubleValue();
		System.out.println("언박싱된 데이터:"+value01);
		System.out.println("언박싱된 데이터:"+value02);
		System.out.println("언박싱된 데이터:"+value03);
	
		
	}
	

}
