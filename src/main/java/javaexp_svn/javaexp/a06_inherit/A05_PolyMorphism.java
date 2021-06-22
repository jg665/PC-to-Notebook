package javaexp.a06_inherit;

import java.util.ArrayList;

public class A05_PolyMorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 다형성
1. 같은 부모로 여러가지 다양한 형태의 하위 클래스를 선언하는 것을 말한다.
2. 부모 타입에는 모든 자식 객체가 대입 가능하다.
3. 자동 타입 변환(promote)
	부모클래스 변수 = 자식 객체 생성자;

# 추상클래스
1. 상위에 다양하게 처리될 기능메서드가 하위에서 재정의를 강제하여야 하고
2. 상위에서는 따로 객체 생성을 할 필요가 없을 때,
3. 추상메서드를 포함한 추상클래스를 선언한다.
				*/
		Animal01 an1 = new Cat();
		Animal01 an2 = new Lion();
		an1.eat();
		an1.move();
		ArrayList<Animal01> list = new ArrayList<Animal01>();
		list.add(new Cat());
		list.add(new Lion());
		list.add(new Lion());
		for(Animal01 an:list) {
			an.eat();
			an.move();
		}
			// ex) 상위로 Robot 하위 Mz, Tv, Dagan
			//	   attack() 재정의하여
			//	   1) 단일 다형성 처리
			//     2) ArrayList형 다형성 처리 후, for구문을 통한 기능 처리
		Robot r1 = new Mz01();
		r1.attack();
		r1.defend();
		r1.fly();
		Robot r2 = new Tv();
		Robot r3 = new Dagan();
		ArrayList<Robot> rlist = new ArrayList<Robot>();
		rlist.add(new Mz01());
		rlist.add(new Tv());
		rlist.add(new Dagan());
		for(Robot r:rlist) {
			r.attack();
			r.defend();
			r.fly();	
		}
		// ex) Robot 추상메서드 defend(), attack(), 실제메서드 flt() 추가하여 처리결과를 확인
			
	}
}
abstract class Robot{
	abstract void attack();
	abstract void defend();
	void fly() {
		System.out.println("하늘을 날다!");
	}
}

class Mz01 extends Robot{
	void attack() {
		System.out.println("미사일로 때리다");
	}

	@Override
	void defend() {
		// TODO Auto-generated method stub
		System.out.println("마징가 제트가 쉴드로 방어!");
	}
}
class Tv extends Robot{
	void attack() {
		System.out.println("티비로 때리다");
	}

	@Override
	void defend() {
		// TODO Auto-generated method stub
		System.out.println("태권 브이가 손날 막기 방어!");
	}
}
class Dagan extends Robot{
	void attack() {
		System.out.println("검으로 때리다");
	}

	@Override
	void defend() {
		// TODO Auto-generated method stub
		System.out.println("다간이 자이언트 방패로 방어!");
	}
}

abstract class Animal01{
	abstract void eat(); // body{}가 없는 기능 메서드는 추상메서드
	// 추상메서드가 하나만 있더라도 추상 클래스가 된다.
	// 하위에서 다양하게 처리할 기능메서드
	void move() { // 공통되는 기능 메서드
		System.out.println("이동을 한다.");
	}
}
class Cat extends Animal01{
	void eat() {System.out.println("고양이가 우유를 먹다");}
}
class Lion extends Animal01{
	void eat() {System.out.println("사자가 사냥감을 먹다");}
	
}
