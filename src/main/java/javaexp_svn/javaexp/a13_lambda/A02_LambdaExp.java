package javaexp.a13_lambda;

public class A02_LambdaExp {
	// A02_LambdaExp.flyFunction
	static void flyFunction(Flyway f1) {
		f1.fly();
	} //람다식을 위해서 넣은 함수
	
	static void SwimFunction(SwimmingWay sw) {
		sw.swim();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 인터페이스 통해서 실제 클래스(=객체) 바로 생성
		Flyway f1 = new Flyway() {
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("우리 동네를 날다");
			}
		};
		// static void flyFunction에서 함수 입력한거 재정의 후 출력 진행
		f1.fly();
		
		// 선언된 메서드에 인터페이스를 상속받은 익명 실체 객체를 바로 넘기면서 재정의된 내용을 수행하게 해주는 것
		flyFunction(new Flyway() {
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("세계의 창공을 누비다!(함수)");
			}
		});
		// 람다식 표현 1단계
		// 오버라이딩된 메서드를 바로 ( 재정의() -> {처리내용;} );
		flyFunction(()->{System.out.println("우주를 누비다(람다식1)");});
		
		// 람다식 표현 2단계
		// ( 재정의() -> 처리내용 );
		flyFunction(()->System.out.println("넓은 바다 위 창공을 날다(람다식2)"));
		
		// ex) SwimmingWay 인터페이스를 만들고, main() 익명의 실제클래스를 구현하여
		// 호수에서 수영을 하다라고 출력하세요
		SwimmingWay s1 = new SwimmingWay() {
			@Override
			public void swim() {
				// TODO Auto-generated method stub
				System.out.println("호수에서 수영을 하다");
			}	
		};
		s1.swim();
		
		// ex2) static void swimFunction()을 선언하고, 
		//		매개변수로 SwimmingWay를 받아서 처리 후
		//		1) 객체 생성
		//		2) 람다식1
		//		3) 람다식2
		SwimFunction(new SwimmingWay() {

			@Override
			public void swim() {
				// TODO Auto-generated method stub
				System.out.println("강을 가로질러 헤엄치다(익명 클래스)");
			}
			
		});
		SwimFunction(()->{System.out.println("바다 위를 열심히 헤엄치다(람다식1)");});
		SwimFunction(()->System.out.println("파도를 가로지르며 헤엄치다(람다식2)"));
		
		
	}
}
interface SwimmingWay{
	void swim();
}
// 1. 인터페이스 선언
interface Flyway {
	void fly();
}