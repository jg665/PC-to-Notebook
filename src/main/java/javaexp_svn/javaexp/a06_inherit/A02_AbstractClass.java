package javaexp.a06_inherit;

public class A02_AbstractClass {
	public static void main(String[] args) {
//	1. 추상 클래스는 단독으로 객체 생성해서 사용하지 못한다.
//	Vehicle v1 = new Vehicle();
//	2. 하위클래스만 객체 생성 가능하다.
	Car c1 = new Car();
	c1.driving();
	c1.speedUp();
//	3. 다형성(상위클래스를 참조로 하위 클래스 생성이 가능하다.)
	Vehicle v2 = new Trucker();
	v2.driving();
	v2.speedUp();

// ex) Worker라는 추상클래스에
//	   실체메서드 goHome() goWork() 퇴근/출근
//	   추상메서드 working()
//	   PoliceMan 상속받은 실제 클래스 working() 치안을 유지하다.
//	   FireMan 상속받은 실제 클래스 working() 불을 끄다.
/*	PoliceMan p1 = new PoliceMan();
	p1.goWork();
	p1.working();
	p1.goHome();
// 다형성/폴리몰피즘
/*	Worker w1 = new FireMan();
	w1.goWork();
	w1.working();
	w1.goHome();*/
		
		
	}
}
abstract class Worker {
	// 1. 공통적으로 하위에서 사용할 기능 메서드 선언
	public void goHome() {
		System.out.println("퇴근");
	}
	public void goWork() {
		System.out.println("출근");
	}
	// 2. 하위 클래스에서 개별적으로 사용할 기능 메서드 선언
	public abstract void working();
}

class PoliceMan extends Worker {
	@Override
	public void working() {
		System.out.println("치안을 유지하다.");
	}
}
class FireMan extends Worker {
	@Override
	public void working() {
		System.out.println("불을 끄다.");
	}
}
class Programmer extends Worker {
	@Override
	public void working() {
		System.out.println("불을 끄다.");
	}
}


// 1. 추상 메서드가 하나라도 있으면 추상 클래스가 된다.
// 2. 추상 클래스는 단독으로 객체 생성을 하지 못한다. ==> 상속클래스 통해서만 객체 생성 가능
abstract class Vehicle{
	void driving() {
		System.out.println("운행 하다!");
	}
	// 추상 메서드로 변신! ==> class 앞에도 abstract 생성
	abstract void speedUp();
}
// 3. 추상 클래스를 상속받은 하위 클래스는 반드시!! 추상 메서드를 재정의해서 사용해야한다.
class Car extends Vehicle{
	void speedUp() {
		System.out.println("자동차는 속도가 20km/h씩 증가한다.");
	}
}
class Trucker extends Vehicle{
	void speedUp() {
		System.out.println("트럭은 속도가 10km/h씩 증가한다.");
	}
}

