package javaexp.a00_exp.a05;
//2. 아래 내용을 Thread 상속한 프로그램을 만들어 보세요.
//[1단계] ShoppingBuyer : 구매자를 통해 물건 10개를 구매 처리하는
//		처리를 하세요
//[2단계] ShoppingBuyer : 생성자로 구매자/물건/가격/갯수를 받아서
//해당 갯수만큼 반복문을 처리하는 프로그램을 구현하세요.

public class A08_0512 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ShoppingBuyer sb1 = new ShoppingBuyer("홍길동");
		ShoppingBuyer sb2 = new ShoppingBuyer("신길동");
		ShoppingBuyer sb3 = new ShoppingBuyer("마길동");
		sb1.start();
		sb2.start();
		sb3.start();
		*/
//		ShoppingBuyer02 sb4= new ShoppingBuyer02("홍길동","사과",3000,2);
//		ShoppingBuyer02 sb5= new ShoppingBuyer02("신길동");
//		sb5.setProduct("오렌지", 3000, 5);
//		sb4.start();
//		sb5.setProduct("수박", 12000, 3);
//		sb5.start();
		
	Thread t1 = new Thread(new SeeingMovie("김청아"));
	Thread t2 = new Thread(new SeeingMovie("홍신영"));
	Thread t3 = new Thread(new SeeingMovie("김철수"));
	t1.start();
	t2.start();
	t3.start();
	
	
		}
	}
//class ShoppingBuyer extends Thread{
//	private String name;
//	public ShoppingBuyer(String name) {
//		super();
//		this.name = name;
//	}
//	public void run(){
//		for(int cnt=1; cnt<=10; cnt++) {
//			System.out.println(name+" 물건을 "+cnt+  "개 구매했습니다.");
//		
//		}
//	}
//class ShoppingBuyer02 extends Thread{
//	private String name;
//	private String thing;
//	private int price;
//	private int count;
//	
//	public ShoppingBuyer02(String name, String thing, int price, int count) {
//		super();
//		this.name = name;
//		this.thing = thing;
//		this.price = price;
//		this.count = count;
//		
//	}
//	public void run()
//		for(int cnt=1;cnt<=count;cnt++){
//		System.out.println(name +"가" + thing + "을 "
//				+ cnt + "개 구매해서 총" + (price * cnt)
//				+	"원 입니다.")
//}

//	public ShoppingBuyer02(String name) {
//		super();
//		this.name = name;
//	}
//	public void setProduct() {
//		this.thing = thing;
//		this.price = price;
//		this.count = count;
//	}
//		}
class SeeingMovie implements Runnable {
	private String name;
	public SeeingMovie(String name) {
		super();
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		String [] list = {"영화A","영화B","영화C","영화D","영화E"};
		for(int idx=0; idx<list.length; idx++) {
			System.out.println(name+"이"+(idx+1)+
					"번째에 영화"+ list[idx]+"를 보다.");
	}
}
	
}


//ShoppingBuyer sb1 = new ShoppingBuyer();
//sb1.setName("홍길동");
//System.out.println("구매자:"+sb1.getName());
//sb1.start();
//	}
//}
//class ShoppingBuyer extends Thread{
//	public void run() {
//		for(int cnt=1;cnt<=10;cnt++)
//	System.out.println(cnt+")"+"물건을 구매하다");


/*
1. Thread 프로그램 실행 형식 2가지를 코드로 기술하세요.
	1)Thread를 직접 상속받아서 처리해주는 방식
		class를 클래스명 extends Thread{
		void run(){
			쓰레드로 처리할 프로그래밍.
			}
		}
	클래스명 참조변수 = new 생성자();
	참조변수.start(); --> 정의된 run()메소드를 life cycle에 의해 호출.
	
	2) Runnable 인터페이스를 implements 를 받아서 처리해주는 방식.
		class 클래스명 implements Runnalbe{
			void run(){
		}
		클래스명 참조변수 = new 생성자();
		Thread t1 = new Thread(참조변수);
		t1.start();

2. 아래 내용을 Thread 상속한 프로그램을 만들어 보세요.
	[1단계] ShoppingBuyer : 구매자를 통해 물건 10개를 구매 처리하는
			처리를 하세요
		ShoppingBuyer sb1 = new ShoppingBuyer();
		sb1.setName("홍길동");
		System.out.println("구매자:"+sb1.getName());
		sb1.start();
			}
		}
		class ShoppingBuyer extends Thread{
			public void run() {
				for(int cnt=1;cnt<=10;cnt++)
			System.out.println(cnt+")"+"물건을 구매하다");
			}
		}
	
			
	[2단계] ShoppingBuyer : 생성자로 구매자/물건/가격/갯수를 받아서
		해당 갯수만큼 반복문을 처리하는 프로그램을 구현하세요.
				ShoppingBuyer sb1 = new ShoppingBuyer("김길동");
		ShoppingBuyer sb2 = new ShoppingBuyer("홍길동");
		ShoppingBuyer sb3 = new ShoppingBuyer("신길동");
		sb1.setName("김길동");
		sb2.setName("홍길동");
		sb3.setName("신길동");
		System.out.println("구매자:"+sb1.getName()+","+sb2.getName()+","+sb3.getName());
		
		sb1.start();
		sb2.start();
		sb3.start();
				}
			}
class ShoppingBuyer extends Thread{
	private String name;
	public ShoppingBuyer(String name) {
		super();
		this.name = name;
	}
	public void run(){
		String[] proc = {"구매자","물건","가격","갯수"};
		for(int idx=0; idx<proc.length; idx++) {
			System.out.println("["+ (idx +1) +"]" +name+ " " +proc[idx]);
		}
	}
}
		
		
		
		
3. Thread의 이름과 우선순위 기능 메서드를 기술하세요
	1) setName("쓰레드 이름"; getName("") : 쓰레드의 고유명을 가져온다.
		Thread.MAX_PRIORITY  : 최우선 쓰레드 처리
		Thread.NORM_PRIORITY : 중간 우선 쓰레드 처리
		Thread.MIN_PRIORITY : 최하위 우선 쓰레드 처리
	2) getPriority() : 쓰레드의 우선 순위 설정된 내용을 가져온다.
						- 쓰레드 우선순위 기능
		setPriority(Thread.NORM_PRIORITY),
		getPriority();

4. 아래 내용을 Runnable 인터페이스를 처리한 프로그램을 만들어 보세요.
	[1단계] SeeingMoive : 배열로된 영화 목록(5개)을 보고 처리하는 프로그램
	
	SeeingMoive sm1 = new SeeingMoive("신세계");
		Thread t1 = new Thread(sm1);
		t1.start();
		SeeingMoive sm2 = new SeeingMoive("람보");
		Thread t2 = new Thread(sm2);
		t2.start();
		SeeingMoive sm3 = new SeeingMoive("쿵푸팬더");
		Thread t3 = new Thread(sm3);
		t3.start();
		SeeingMoive sm4 = new SeeingMoive("록키");
		Thread t4 = new Thread(sm4);
		t4.start();
		SeeingMoive sm5 = new SeeingMoive("영웅본색");
		Thread t5 = new Thread(sm5);
		t5.start();
	
	}
}
		
	class SeeingMoive implements Runnable{
		private String movie;
		public SeeingMoive(String movie) {
			super();
			this.movie = movie;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int cnt=1;cnt<=5;cnt++) {
				System.out.println(movie+"를"+cnt+"본다");
			}
		}
		
	}
	
	
5. Weapon 인터페이스 하위의 익명객체를 선언하고, 처리하는 방식을 
	수업 중 진행하는 4단계를 선언하여 각종 무기에 공격방법을 선언 처리하세요.
 	1) 익명객체 생성
 	2) 함수선언 할당
 	3) 람다식1 선언 호출
 	4) 람다식2 선언 호출
 	
 		static void WeaponFunction(Weapon w1) {
		w1.attack();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon w1 = new Weapon() { //1) 익명객체 생성
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("주먹으로 때리다");
			}
		};
		w1.attack();
		WeaponFunction(new Weapon() { //	2) 함수선언 할당
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("망치로 내려찍다");
			}
		});
		WeaponFunction(() -> {System.out.println("검을 휘두른다.");});//	3) 람다식1 선언 호출
		WeaponFunction(() -> System.out.println("총을 쏜다."));//	4) 람다식2 선언 호출
				}
			}
interface Weapon{
	void attack();
}
 
 */


