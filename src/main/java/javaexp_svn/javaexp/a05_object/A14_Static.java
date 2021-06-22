package javaexp.a05_object;

public class A14_Static {
	/*
# 정적멤버 static 활용하기
1. 클래스에 의해서 만들어진 객체는 각각의 멤버들의
   기능적인 처리(메서드)와 데이터를 가지고 있다.
2. static을 선언된 멤버는 하나의 클래스에서 만들어진
   모든 객체들의 데이터나 기능을 공유할 수 있다.

	*	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ex) Bear name 일반변수: 먹은 빵의 갯수  static 변수로 전체 남은 빵의 갯수
//	   1) 초기 전체 빵의 갯수를 할당.
//	   2) 각자가 빵을 먹을 때, 각자 먹은 갯수 증가, 전체 static 변수의 빵의 갯수 감소
//	   3) 최종 각 곰돌이가 먹은 빵의 갯수와 남은 빵의 갯수를 출력
/*
 		Bear.tot = 30;
		Bear.eattot1 = 0;
		Bear.eattot2 = 0;
		Bear.eattot3 = 0;
		Bear b1 = new Bear("홍홍");
		Bear.eattot1+=b1.eat(3);
		Bear b2 = new Bear("신신");
		Bear.eattot2+=b2.eat(5);
		Bear b3 = new Bear("박박");
		Bear.eattot3+=b3.eat(2);		
		Bear.eattot3+=b3.eat(7);
		Bear.tot-=b1.left1();
		Bear.tot-=b2.left2();
		Bear.tot-=b3.left3();
		
		System.out.println("남은 총 빵 갯수: "+Bear.tot);
		
	}

}
class Bear{
	String name;
	int cnt;
	static int eattot1;
	static int eattot2;
	static int eattot3;
	static int tot;
	public Bear(String name) {
		super();
		this.name = name;
	}
	public int eat(int cnt) {
		this.cnt=cnt;
		System.out.println(name+" 곰돌이가 "+cnt+"개의 빵을 먹었습니다.");
		return cnt;
	}
	public int left1() {
		System.out.println(name+" 곰돌이가 먹은 빵의 총 갯수: "+eattot1);
		return eattot1;
	}
	public int left2() {
		System.out.println(name+" 곰돌이가 먹은 빵의 총 갯수: "+eattot2);
		return eattot2;
	}
	public int left3() {
		System.out.println(name+" 곰돌이가 먹은 빵의 총 갯수: "+eattot3);
		return eattot3;
	}
}
	답))
	[1단계]
			Bear.REST_BREAD=20;
		Bear b1 = new Bear("곰돌이1");
		b1.eatBread++;
		b1.eatBread++;
		b1.eatBread++;
		b1.eatBread++;
		b1.eatBread++;
		b1.REST_BREAD-=5;
		Bear b2 = new Bear("곰돌이2");
		b2.eatBread++;
		b2.eatBread++;
		b2.eatBread++;
		b2.REST_BREAD-=3;
		Bear b3 = new Bear("곰돌이3");
		b3.eatBread=2;
		b3.REST_BREAD-=3;
		System.out.println("각 곰돌이들이 먹은 빵의 갯수");
		System.out.println(b1.eatBread+" : "+b1.REST_BREAD);
		System.out.println(b2.eatBread+" : "+b2.REST_BREAD);
		System.out.println(b3.eatBread+" : "+b3.REST_BREAD);
		
	}
	
	
	
}
class Bear{
	String name;
	int eatBread;
	static int REST_BREAD;
	public Bear(String name) {
		super();
		this.name = name;
	}

	[객체지향으로 변경]
		Bear.REST_BREAD=20;
		Bear b1 = new Bear("곰돌이1");
		Bear b2 = new Bear("곰돌이2");
		Bear b3 = new Bear("곰돌이3");
		b1.eat();
		b1.eat();
		b1.eat();
		b2.eat();
		b2.eat();
		b3.eat();
		b3.eat();
		b3.eat();
		b3.eat();
		System.out.println("현 남은 빵의 갯수: "+Bear.REST_BREAD);
	}
}
class Bear{
	private String name;
	private int eatBread;
	static int REST_BREAD;
	public Bear(String name) {
		super();
		this.name = name;
	}
	public void eat() {
		eatBread++;
		REST_BREAD--;
		System.out.println(name+"의 빵 정보");
		System.out.println("먹은 빵의 갯수: "+eatBread);
		System.out.println("남은 빵의 갯수: "+REST_BREAD);
	}
	
	
}

ex) FruitBuyer 이름, 구매한 과일의 갯수, 남은 과일의 갯수
	buy()를 통해서 일반변수와 static의 변수를 출력
	buyInfo() @@가 구매한 과일의 갯수 @@@, 현재남은 과일갯수는 @@
	1) 초기에 FruitBuyer.REST_FRUIT_CNT=20;
	2) 구매자 3명, buy()를 통해 구매처리
	3) 마지막에 buyInfo()를 통해서 남은 구매 정보 출력



class Account{
	int money;
	static int money2;
	public Account(int money) {
		super();
		this.money = money;
	}
	public void add() {
		money+=10;
	}
	public void show() {
		System.out.println("현 계좌의 금액: "+money);
	}
}		
* */
		// 객체 생성 없이도 사용이 가능하다.
		Account.money2 = 5000;
		
		
		Account c1 = new Account(1000);
//		c1.money2 = 1000; // c1에 할당했는데도 확인하면 다 같은 값 나옴
		Account c2 = new Account(2000);
		c2.money2 +=100; // c1에서 할당한 데이터에 추가적으로 할당되고,
						// 공유되는 메모리이기 때문에 c1,c3도 동일하게 다 할당된다.
		Account c3 = new Account(3000);
		// static 변수나 메서드는 공유하는 영역이기 때문에 굳이 객체의 참조변수로
		// 쓰지 않고 클래스명.static맴버로 사용한다.
		System.out.println("Account.money2: "+Account.money2);
		c1.show();
		c1.add();
		c1.add();
		c1.show();
		c2.add();
		c2.show();
		c3.show();
		
		System.out.println("c1.money2: "+c1.money2);
		System.out.println("c2.money2: "+c2.money2);
		System.out.println("c3.money2: "+c3.money2); // 
		
		
		
		// static 변수는 public으로 객체 생성전에 클래스명.변수 형식으로
		// 사용한다.
		FruitBuyer.REST_FRUIT_CNT=20;
		FruitBuyer fb1 = new FruitBuyer("홍길동");
		FruitBuyer fb2 = new FruitBuyer("방성원");
		FruitBuyer fb3 = new FruitBuyer("방재원");
		fb1.buy(3);
		fb1.buy(5);
		fb2.buy(1);
		fb2.buy(2);
		fb3.buy(6);
		
	}
}
class FruitBuyer{
	private String name;
	private int buyCnt;
	static int REST_FRUIT_CNT;
	public FruitBuyer(String name) {
		super();
		this.name = name;
	}
	public void buy(int count) {
		buyCnt+=count;
		REST_FRUIT_CNT-=count;
		System.out.println("과일 "+count+"개 구매!");
		buyInfo(); // 같이 출력하려면 내부에 넣어주면 된다.
	}
	public void buyInfo() {
		System.out.println(name+" 구매 정보");
		System.out.println("구매한 과일의 갯수: "+buyCnt);
		System.out.println("남은 갯수: "+REST_FRUIT_CNT);
	}
}
	
	

class Account{
	int money;
	static int money2;
	public Account(int money) {
		super();
		this.money = money;
	}
	public void add() {
		money+=10;
	}
	public void show() {
		System.out.println("현 계좌의 금액: "+money);
	}
}