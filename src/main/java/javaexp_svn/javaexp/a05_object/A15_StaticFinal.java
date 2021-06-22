package javaexp.a05_object;

public class A15_StaticFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# final
1. 클래스의 일반 필드명 앞에 붙으면, 초기데이터를
   할당한 이후에 변경이 불가능하게 한다.
2. final만 붙으면 객체마다 변경할 수 없는 필드를 가지고 있게 한다.

# static final
1. 객체 공유메모리, 고정된 클래스의 상수를 설정한다.

				*/
		Person02 p1 = new Person02("홍길동");
		Person02 p2 = new Person02("김길동");
		p1.getAge();
		p1.getAge();
		p2.getAge();
		p2.getAge();
		p1.age=25; // age는 private 푸니까 데이터 변경 가능
//		p1.name="마길동"; // final이 붙어있어서 객체 단위로 한번 할당된 것은
						// 변경이 불가능하다.
//		Person02.KIND="동물"; // 클래스단위로 한번 할당된 것은 변경 불가능하다.
/*
ex) Animal클래스에	 final상수로 동물의 종류, static final로 동물 설정
	일반변수로 먹이의 종류, 
	생성자를 통해서 동물의 종류,
	setFood(먹이의 종류)
	eatFood()먹이를 먹다.
	(동물)인 [사자]가 @@@을 먹다.
* */
		Animal a1 = new Animal("사자");
		a1.setFood("파프리카");
		a1.eatFood();
		a1.setFood("감자");
		a1.eatFood();
		Animal a2 = new Animal("토끼");
		a2.setFood("클로버");
		a2.eatFood();
				
	}
}
class Animal{
	String feed;
	final String KIND;
	static final String ALIAS = "동물";
	public Animal(String kind) {
		super();
		this.KIND = kind;
	}
	public void setFood(String feed) {
		this.feed=feed;
	}
	public void eatFood() {
		System.out.println("("+ALIAS+")"+"인 ["+KIND+"]가 먹이 "+feed+"를 먹다.");
	}
}
class Person02{
	int age;
	final String name; // 객체 단위로 변경 불가
	static int EARCH_RESOURCE; // 객체 공유 메모리
	static final String KIND = "사람"; // 클래스당 1번만 할당
	public Person02(String name) {
		this.name = name; // 객체 단위로 1번만 할당이 가능
//		kind = "사람";  ==> 생성자로도 할당이 안된다. 객체 생성이 안되기 떄문.
	}
	public void getAge() {
		age++;
		System.out.println(KIND+"인 "+name+"이 나이를 먹다! 현재 나이: "+age);
	}
	
	
}