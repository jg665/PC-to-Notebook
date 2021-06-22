package javaexp.a05_object;

import java.util.ArrayList;

public class A13_ObjVSObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		Person03 p1 = new Person03("홍길동");
		p1.drivingCar(); // 차 없다 ㅠㅠ 출력됨
		p1.buyCar(new Car("소렌토",200)); // 차 객체를 넣었음
		p1.drivingCar();
		
		Man m1 = new Man("신길동");
		m1.dating();
		m1.matchingCouple(new Woman("마길동", 40));
		m1.dating();
		


# 1:1 관계 클래스 구성하기
1. 클래스 안에서 외부에 있는 객체 메모리 설정하여 할당하여 활용하는 것을 말한다.
2. 구성 형태

class Car{
	private String kind;
	private int maxSpeed;
	
	public Car(String kind, int maxSpeed) {
		super();
		this.kind = kind;
		this.maxSpeed = maxSpeed;
	}

	public void speedUp(){
		System.out.println(kind+" 차의 속도를 높이다");
	}
}
class Person03{
	private Car ownerCar; // 한번에 여러가지 속성 포함 객체
	private String name; // 한가지 속성만 포함
	
	public Person03(String name) {
		super();
		this.name = name;
	}
	
	public void buyCar(Car c){
		this.ownerCar = c;
	}
	public void drivingCar(){
		// name은 하나의 데이터만 사용
		System.out.println(name+" 차를 몰려고 하다");
		if(ownerCar!=null){
			// 객체는 가지고 있는 여러가지 속성과 기능메서드를 사용할 수 있다.
			ownerCar.speedUp();
		}else{
			System.out.println("차가 없습니다 ㅠㅠ");
		}
	}
}

/*
ex) Woman 이름 나이
	Man
		필드: Woman, 이름
		메서드: matchingCouple(Woman w)
			  dating()
			  @@@ 가 만나는 사람이 없구요.
			  		@@ @@인 사람과 데이트를 합니다.

class Woman{
	private String name;
	private int age;
	
	public Woman(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void info() {
		System.out.println("이름은 "+name+", "+age+"살인 사람과 즐거운 데이트를 합니다.");
	}
}
class Man{
	private String name;
	private Woman date;
	
	public Man(String name) {
		super();
		this.name = name;
	}
	public void matchingCouple(Woman w) {
		this.date = w;
		System.out.println("#커플이 되다!");
	}
	
	public void dating() {
		System.out.println(name+"은 데이트를 하러 갔습니다.");
		if(date!=null) {
			date.info();
		}else {
			System.out.println(name+"은 만나는 사람이 없습니다. ㅠㅠ");
		}
	}
}

/*
# 1:다 관계 클래스 구성하기
1. 한 클래스 안에서 여러개의 구성요소들을 처리하는 경우를 말한다.

2. 내용
	1) 종류가 동일한 내용
	2) 다른 종류의 내용
ex) 마트에서 여러개의 물건 구매.
*/
		Mart m01 = new Mart("행복한 마트");
		m01.buy(new Product04("사과", 3000, 2));
		m01.buy(new Product04("바나나", 4000, 3));
		m01.buy(new Product04("딸기", 12000, 3));
		int tot = m01.calcu();
		System.out.println("총액: "+tot);
		
	}
	
}
class Mart{
	private String name;
	private ArrayList<Product04> list;
	public Mart(String name) {
		super();
		System.out.println("# 어서오세요 "+name+" 입니다!! #");
		//마트명과 물건 구매 리스트를 처리할 수 있게 초기화
		this.name=name;
		list = new ArrayList<Product04>();
	}
	public void buy(Product04 p) {
		list.add(p);
		System.out.println(p.getName()+"를 "+p.getCnt()+"개를 카트에 담았습니다.");
	}
	public int calcu() {
		System.out.println(name+" 마트에서 구매한 물건들 ");
		int tot=0;
		for(Product04 pro:list) {
			tot+=pro.info();
		}
		
		
		return tot;
	}
}		
		
		
class Product04{
	private String name;
	private int price;
	private int cnt;
	public Product04(String name, int price, int cnt) {
		super();
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	public int info() {
		System.out.print(name+"\t");
		System.out.print(price+"\t");
		System.out.print(cnt+"\t");
		System.out.print(price*cnt+"\n");
		return price*cnt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
}
