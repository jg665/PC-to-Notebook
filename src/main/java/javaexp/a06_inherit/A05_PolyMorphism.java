package javaexp.a06_inherit;

import java.util.ArrayList;

public class A05_PolyMorphism {
/*
# 다형성
1.	같은 부모로 여러가지 다양한 형태의 하위 클래스를 선언하는 것을 말한다.
2.	부모 타임에는 모든 자식 객체가 대입 가능하다.
3.	자동 타입 변환(promote)
	부모클래스 변수 = 자식 객체 생성자;
	
# 추상클래스
1.	상위에 다양하게 처리될 기능메서드가 하위에서 재정의를 강제하여야 하고,
2.	상위에는 따로 객체 생성을 할 필요가 없을 때, 
3.	추상메서드를 포함한 추상클래스를 선언한다.
	
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동타입으로 상위클래스에서 하위 클래스로 할당.
		Animal01 an1 = new Cat();
		an1.eat();
		an1.move();
		Animal01 an2 = new Lion();
		ArrayList<Animal01> list = new ArrayList<Animal01>();
		list.add(new Cat());
		list.add(new Lion());
		list.add(new Lion());
		for(Animal01 an:list) {
			an.eat();
			an.move();
		}
	
		Robot rb1 = new Mz1();
		rb1.attack(); // 재정의
		rb1.defend(); // 재정의
		rb1.fly(); 		// 재정의
		Robot rb2 = new Tv();
		Robot rb3 = new Dagan();
		ArrayList<Robot> list1 = new ArrayList<Robot>();
		list1.add(new Mz1());
		list1.add(new Tv());
		list1.add(new Dagan());
		for(Robot rb:list1) {
			rb.attack();
			rb.defend();
			rb.fly();
		}
	}
}
	// ex) 상위로 Robot 하위 Mz, Tv, Dagan..
//			attack() 재정의 하여,
//		1) 단일 다형성 처리
//		2) ArrayList형 다형성 처리 후, for 구문을 통한 기능 처리.
//		2	Robot 추상메서드 defend(), attack(), 실제메서드 fly() 추가하여
//			처리결과를 확인하세요.
abstract class Robot{
	// 하위 클래스 재정의 : 추상클래스는 추상메서드를
	// 상속받는 하위 클래스에서 반드시(**) 재정의 하여야 한다.
	abstract void attack();
	abstract void defend();
	void fly() {
		System.out.println("하늘을 날다.");
	}
}
class Mz1 extends Robot{
	void attack() {
		System.out.println("MZ가 공격하다");
	}
	@Override
	void defend() {
		// TODO Auto-generated method stub
		System.out.println("MZ가 방어한다");
	}
}
class Tv extends Robot{
	void attack() {
//		super.attack();
		System.out.println("TV를 본다");
	}
	@Override
	void defend() {
		// TODO Auto-generated method stub
		System.out.println("Tv이 방어한다");
	}
}
class Dagan extends Robot{
	void attack() {
		System.out.println("Dagan이 때린다.");
		}
	@Override
	void defend() {
		// TODO Auto-generated method stub
		System.out.println("Dagan이 방어한다.");
	}
}

abstract class Animal01{
	abstract void eat(); // body({})가 없는 기능 메서드는 추상메서드
	// 추상메서드가 하나만 있더라도 추상 클래스가 된다.
	// 하위에서 다양하게 처리할 기능메서드.
	void move() { //공통되는 기능 메서드..
		System.out.println("이동을 한다.");
	}
}
class Cat extends Animal01{
	void eat() {
		System.out.println("고양이가 우유를 먹다");}
}
class Lion extends Animal01{
	void eat() {
		System.out.println("사자가 사냥감을 먹다!");	
	}
}
