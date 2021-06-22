package javaexp.a12_thread;

public class A02_Thread {

		/*
# Thread 프로그래밍
1. 하나의 프로세스(프로그래밍단위) 안에서 여러 개의
	쓰레드를 통해서 한번에 여러 작업을 할 수 있게 해주는
	프로그래밍 방식이다.
2.	기본 형식.
	1) Thread를 직접 상속 받아서 처리해주는 방식
		class 클래스명 extends Thread{
		void run(){
			쓰레드로 처리할 프로그래밍.
			}
		}			
		클래스명 참조변수 = new 생성자();
		참조변수.start(); ==> 정의된 run()메소드를 life cycle에 의해서
			호출하게 한다.
	2) Runnable 인터페이스를 implements 받아서 처리해주는 방식.
		class 클래스명 implements Runnable{
			void run(){}
			
		}
		클래스명 참조변수 = new 생성자();
		Thread t1 = new Thread(참조변수);
		t1.start();
			
	한명이 로그인이 끝나고(프로세스실행->종료) 다 써야 다음 사람이 쓸수 있다면 누가 쓸까?
3. 언제쓰레드 프로그래밍이 필요할까?
	1) 웹 서버 기준..(was도 동일)
		cpu를 분할해서 한번에 여러 프로그램을 처리해줌으로써 
		동일한 사람이 여러 쓰레드를 이용하여 효과적으로 프로그램을 
		동시에 처리해줄 수 있는 장점이 있다.
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 쓰레드 없이 샐행되면 각각의 프로그램의 수행되어, 
		// 하나의 프로그램이 다 끝난 후에, 다른 프로그램이 수행되어 진다.
		// 하나의 쓰레드로 나뉘어져서 수행된다.
		
//		3. 쓰레드 설정 기본 메서드
//		1) getName() : 쓰레드의 고유명을 가져온다.
//		2) getPriority() : 쓰레드의 우선 순위 설정된 내용을 가져온다.
//		- 쓰레드 우선 순위 설정 상수
//			Thread.MAX_PRIORITY  : 최우선 쓰레드 처리
//			Thread.NORM_PRIORITY : 중간 우선 쓰레드 처리
//			Thread.MIN_PRIORITY : 최하위 우선 쓰레드 처리
		
		
		GoThread g1 = new GoThread(); //객체생성
		ComeThread c1 = new ComeThread();
		g1.setName("첫번째스레드");
		c1.setName("두번째쓰레드");
		// 쓰레드의 우선 순위 설정.
		g1.setPriority(Thread.MAX_PRIORITY); //Thread.MAX_PRIORITY  : 최우선 쓰레드 처리
		c1.setPriority(Thread.MIN_PRIORITY); //Thread.MIN_PRIORITY : 최하위 우선 쓰레드 처리
		System.out.println("##"+g1.getName()+"##");
		g1.start();
		System.out.println("##"+c1.getName()+"##");
		c1.start();
		
		// 일반적으로 쓰레드 우선순위는 먼저 코딩된 내용이다.
		
	}
}
class GoThread extends Thread{
	public void run() {
		for(int cnt=1;cnt<=1000;cnt++)
		System.out.println(cnt+"]gogo!![쓰레드있는 프로그램]");
	}
}

class ComeThread extends Thread{
	public void run() {
		for(int cnt=1;cnt<=1000;cnt++)
		System.out.println(cnt+"]come!![쓰레드있는 프로그램]");
	}
}










