package javaexp.a00_exp;

import java.io.IOException;
import java.io.InputStream;

/*
<java>
1. 예외의 종류 2가지는 기본예제를 통해서 기술하세요.

		1) 일반 예외
		InputStream io = System.in;
		try { // DB처리 등 io가 발생하는 경우 컴파일을 위해 필수적으로 진행하는 예외 처리
			io.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("예외 상관없이 처리될 구문");
		}
		
		2) 실행 예외
		try { // 실행한 코드에서 에러가 발생할 경우 진행하는 예외 처리
			System.out.println(args[0]);
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("예외 상관없이 처리될 구문");
		}

2. 예외 위임이란 무엇인가 기술하고,
   int[] iarr = null;
   iarr[0]; 코드가 포함되어있는
   arrexp1(), arrexp2(), arrexp3() 예외 위임을 처리하세요.
   
   - 예외 위임이란 메서드 단위로 예외를 처리할때, 동일한 예외를 가진 다른 메서드들을 동시에 처리할 수 있는 것이다.
   main()
   	try {
			arrexp1();
			arrexp2();
			arrexp3();
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("예외 상관없이 처리될 구문");
		}

	}
	static void arrexp1() throws NullPointerException{
		System.out.println("arrexp1() 메서드");
		int[] iarr = null;
		System.out.println(iarr[0]);
	}
	static void arrexp2() throws NullPointerException{
		System.out.println("arrexp2() 메서드");
		int[] iarr = null;
		System.out.println(iarr[0]);
	}
	static void arrexp3() throws NullPointerException{
		System.out.println("arrexp3() 메서드");
		int[] iarr = null;
		System.out.println(iarr[0]);
	}
   
*/
public class A16_0527 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
	}

}
