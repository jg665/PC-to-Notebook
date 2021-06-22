// ex1) A02_ExceptionExp.java
//	String s=null; s.toString(); 코드가 예외가 발생하더라도
//	수행될 수 있게 처리하세요
package javaexp.a07_exception;

public class A02_ExceptionExp {

	public static void main(String[] args) {
		
/*
# 예외 처리 순서
1. 예외 가능성 있는 코드를 실행
2. 예외 발생 및 발생 예외 클래스 복사
3. try{}catch(복사한예외클래스){}
4. 예외 내용 확인 및 테스트.
 */
		
		
		try {
			System.out.println(args[0]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 내용:" +e.getMessage());
		}
		System.out.println("프로그램 수행");
		
		
		
		// TODO Auto-generated method stub
		try {
			System.out.println("실행1");
			System.out.println("실행2");
		String s=null; s.toString();
		}catch(NullPointerException e) {
		System.out.println("예외 내용:" +e.getMessage());
	}
		System.out.println("프로그램 종료!!");
	}	
	
}
