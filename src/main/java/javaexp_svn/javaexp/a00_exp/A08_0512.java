package javaexp.a00_exp;

public class A08_0512 {
	/*
1. Thread 프로그램 실행 형식 2가지를 코드로 기술하세요.
	- class Classname extends Thread {
			void run(){
				쓰레드를 처리할 프로그래밍
			}
	  }
	  Classname cn = new Classname();
	  cn.start();
	- class Classname implements Runnable {
			void run(){
				쓰레드를 처리할 프로그래밍
			}
	  }
	  Classname cn = new Classname();
	  Thread t1 = new Thread(cn);
	  t1.start();
	  
2. 아래 내용을 Thread 상속한 프로그램으로 만들어 보세요.
	[1단계] ShoppingBuyer : 구매자를 통해 물건 10개를 구매 처리해보세요.
	
		for(int cnt=1;cnt<=2;cnt++) {
			ShoppingBuyer sb = new ShoppingBuyer("구매자");
			sb.start();
		}
		
		
	}
}
class ShoppingBuyer extends Thread {
	private String name;
	public ShoppingBuyer(String name) {
		super();
		this.name = name;
	}
	public void run() {
		String[] prod = {"가위","가방","텀블러","마우스","땅콩버터"};
		for(int idx=0;idx<prod.length;idx++) {
			System.out.println(name+"가 "+prod[idx]+"를 구매했다.");
		}
	}
}	
	
	답)
	ShoppingBuyer sb1 = new ShoppingBuyer("홍길동");
	ShoppingBuyer sb2 = new ShoppingBuyer("마길동");
	ShoppingBuyer sb3 = new ShoppingBuyer("신길동");
	sb1.start();
	sb2.start();
	sb3.start();
	
	Class ShoppingBuyer extends Thread {
		private String name;
		public ShoppingBuyer(String name){
			super();
			this.name = name;
		}
		public void run(){
			for(int cnt; cnt<=10; cnt++) {
				System.out.println(name+"이 물건을 "+cnt+"개 구매했습니다.");
			}
		}
	}
	
	
	[2단계] ShoppingBuyer : 생성자로 구매자/물건/가격/갯수를 받아서 해당 갯수만큼 반복문을 처리하는 프로그램을 구현하세요.
	
		ShoppingBuyer sb = new ShoppingBuyer("방성원","가위",2000,2);
		sb.start();

			}
		}
		class ShoppingBuyer extends Thread {
			private String name;
			private String pro;
			private int price;
			private int cnt;

			public ShoppingBuyer(String name, String pro, int price, int cnt) {
				super();
				this.name = name;
				this.pro = pro;
				this.price = price;
				this.cnt = cnt;
			}

			public void run() {
				System.out.println("## 구매내역 ##");
				for(int idx=1;idx<=cnt;idx++) {
					System.out.println(name+"가 "+pro+"를 "+cnt+"개 구매해서 총 "+cnt*price+"원 입니다.");
				}
			}
		}
		
		답)
		
		ShoppingBuyer sb = new ShoppingBuyer("방성원","가위",2000,2);
		sb.start();
		
		ShoppingBuyer sb2 = new ShoppingBuyer("신성원");
		sb2.setProduct("수박", 12000, 3)
		sb2.start();

			}
		}
		class ShoppingBuyer extends Thread {
			private String name;
			private String pro;
			private int price;
			private int count;

			// 이름만 있는 생성자 따로 생성
			public ShoppingBuyer(String name) {
				super();
				this.name = name;
			}
			
			public ShoppingBuyer(String name, String pro, int price, int count) {
				super();
				this.name = name;
				this.pro = pro;
				this.price = price;
				this.count = count;
			}
			
			public void setProduct(String pro, int price, int count){
				this.pro = pro;
				this.price = price;
				this.count = count;
			}

			public void run() {
				for(int cnt=1;cnt<=count;cnt++){
					System.out.println(name+"가 "+pro+"를 "+cnt+"개 구매해서 총 "+cnt*price+"원 입니다.");
				}
			}
		}
	
3. Thread의 이름과 우선순위 기능 메서드를 기술하세요.
	- .setName("") : 고유명 등록 / .getName("") : 고유명 가져온다
	- .setPriority() : 우선순위 등록
					  .setPriority(Thread.MAX_PRIORITY) : 최우선
					  .setPriority(Thread.NORM_PRIORITY): 중간우선
					  .setPriority(Thread.MIN_PRIORITY) : 최하위우선
					  
4. 아래 내용을 Runnable 인터페이스를 처리한 프로그램을 만들어 보세요.
	[1단계] Seeing Movie : 배열로된 영화 목록(5개)을 보는 처리하는 프로그램
	
		SeeingMovie mo = new SeeingMovie("방성원");
		Thread t1 = new Thread(mo);
		t1.start();
		
		// 혹은 간략하게
		Thread t1 = new Thread(new SeeingMovie("방성원"));
		
	}
}
class SeeingMovie implements Runnable {
	private String name;
	public SeeingMovie(String name){
		super();
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] movies = {"쏘우","킬빌","인간지네","13일의 금요일","미드소마"};
		for(int idx=0;idx<movies.length;idx++) {
			System.out.println(name+"이 "+idx+1+"번째 영화 "+movies[idx]+"를 본다.");
		}	
	}	
}
	
5. Weapon 인터페이스 하위의 익명객체를 선언하고, 처리하는 방식을 수업 중 진행하는 4단계를 선언하여 각종 무기에 공격방법을 선언 처리하세요.
	1) 익명객체 생성
	2) 함수선언 할당
	3) 람다식1 선언 호출
	4) 람다식2 선언 호출
	
		static void AttackFunction(Weapon w1) {
		w1.method();
	}
	public static void main(String[] args) {
	//1)
	Weapon wp = new Weapon() {
		@Override
		public void method() {
			// TODO Auto-generated method stub
			System.out.println("미사일 공격");
		}
	};
	wp.method();
	//2)
	AttackFunction(new Weapon() {
		@Override
		public void method() {
			// TODO Auto-generated method stub
			System.out.println("마구잡이 공격");
		}
	});
	
	//3)
	AttackFunction(()->{System.out.println("레이저 공격");});
	
	//4)
	AttackFunction(()->System.out.println("발차기 공격"));
	
	
	}
}
interface Weapon {
	void method();
}

		*/
	static void AttackFunction(Weapon w1) {
		w1.method();
	}
	public static void main(String[] args) {
	//1)
	Weapon wp = new Weapon() {
		@Override
		public void method() {
			// TODO Auto-generated method stub
			System.out.println("미사일 공격");
		}
	};
	wp.method();
	//2)
	AttackFunction(new Weapon() {
		@Override
		public void method() {
			// TODO Auto-generated method stub
			System.out.println("마구잡이 공격");
		}
	});
	
	//3)
	AttackFunction(()->{System.out.println("레이저 공격");});
	
	//4)
	AttackFunction(()->System.out.println("발차기 공격"));
	
	
	}
}
interface Weapon {
	void method();
}