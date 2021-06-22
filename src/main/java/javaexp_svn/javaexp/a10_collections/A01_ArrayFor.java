package javaexp.a10_collections;


import javaexp.z01_vo.Book;
import javaexp.z01_vo.Food;

public class A01_ArrayFor {
/*
# 배열과 foreach 구문
1. 배열은 단위 데이터를 묶어서 모아 놓은 데이터이다.
	int nums[] = {10,15,20};
	
2. 객체가 모여서, 배열을 이룰 수 있다.
	Person[] parry = {new Person(), new Person(), new Person()};

3. 상위 객체를 배열하고, 상속받은 하위 객체를 폴리모피즘에 의해서 할당 할 수 있다. (다형성의 대표적인 예)
	Flyway[] f1 = {new CountryFly(), new WorldFly(), new SpaceFly()};
	상위				하위
	f1[0] == new CountryFly()
	메서드 호출법 - f1[0].fly()
	f1[1] == new WorldFly()
		f1[1].fly()
	f1[2] == new SpaceFly()
		f1[2].fly()
	아주 효과적이다!
4. 배열은 for문 = for(단위객체 : 배열객체) 의 반복문을 이용해서 효과적으로 처리할 수 있다.

5. index와 .length()를 이용하여 다양한 배열의 데이터를 가져와서 활용을 할 수 있다.
 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prices[] = {3000, 4000, 5000};
		String menus[] = {"사과", "바나나", "딸기"};
		// index는 0부터 시작하기 때문에 0을 초기값으로 설정
		// index는 배열의 길이(.length)보다 작기때문에 idx<prices.length로 반복 구문에서 활용하여 데이터를 처리할 수 있다.
		
		// 배열을 idx로 묶어서 처리
		for(int idx=0;idx<prices.length;idx++ ) {
			System.out.println(menus[idx]+"\t");
			System.out.println(prices[idx]+"\t");
		}
		
		// ex) 좋아하는 음식(foods)의 가격, 음식점의 위치를 설정해서 반복문을 통해 출력하세요
		int price[] = {9000, 10000, 7500};
		String foods[] = {"연어샐러드", "회덮밥", "쌀국수"};
		String loc[] = {"역삼동", "반포동", "잠원동"};
		System.out.println("메뉴\t가격\t위치");
		for(int idx=0;idx<prices.length;idx++) {
			System.out.println(foods[idx]+"\t"+price[idx]+"\t"+loc[idx]);
		}
		
		// shft+ctr+o : import
		// vo 패키지 안의 Food클래스 가져오기
		
		// 객체를 생성해서 처리
		Food[] foObjArry = {
				new Food("짜장면", 6000, "동대문"),
				new Food("광어회", 20000, "노량진"),
				new Food("소고기", 30000, "마장동")		
		};
		// forEach 구문 (단위객체:객체형배열)	{ 출력(단위객체.속성메서드())}
		for(Food f:foObjArry) {
			System.out.println(f.getName()+"\t");
			System.out.println(f.getPrice()+"\t");
			System.out.println(f.getLoc()+"\t");
		}
		// 폴리모피즘 하면 더 효과적으로 할 수 있다!
		
		// ex) Book : 도서명, 가격, 저자 VO 객체를 만들고, 배열로 선언한 후, forEach 구문을 이용해서 출력하세요
		Book[] boObjArry = {
				new Book("가", "방성원", 12000),
				new Book("나", "방성원", 20000),
				new Book("다", "방성원", 18000)
		};
		System.out.println("제목\t작가\t가격");
		for(Book b:boObjArry) {
			System.out.println(b.getName()+"\t"+b.getWriter()+"\t"+b.getPrice()+"\t");
		}
		
		FlyWay []flyways = {new CountryFly(), new WorldFly(), new SpaceFly()};
		for(FlyWay fl:flyways) {
			fl.fly();
		}
		int ranIdx = (int)(Math.random()*flyways.length);
		System.out.println("#임의의 객체 메서드 호출#");
		flyways[ranIdx].fly();
		
		Weapon []attacking = {new LaserBeam(), new Rocket(), new DoubleAttack()};
		for(Weapon a:attacking) {
			a.attack();
		}
		int random = (int)(Math.random()*attacking.length);
		attacking[random].attack();
	}

}
// ex1) 인터페이스 Weapon 선언 attack(); 추상메서드 선언
//		LaserBeam, Rocket, DoubleAttack
//		상속하여 다형성 배열 처리
interface Weapon {
	void attack();
}
class LaserBeam implements Weapon {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("레이저 발사");
	}
	
}
class Rocket implements Weapon {
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("로켓 발사");
	}
	
}
class DoubleAttack implements Weapon {
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("연속 공격");
	}
	
}

// # 다형성에 의한 배열 설정
// 상위 - 하위 재정의
// 상위배열 = {하위1, 하위2, 하위3...}
// 상위배열[0].재정의메서드() 로 효과적인 처리 가능
interface FlyWay{
	void fly();
}
class CountryFly implements FlyWay {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("우리 동네를 날다");
	}
}
class WorldFly implements FlyWay {
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("세계를 누비다");
	}
}
class SpaceFly implements FlyWay {
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("우주여행을 하다");
	}
}