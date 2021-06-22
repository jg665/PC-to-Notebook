package javaexp.a12_thread;

public class A04_Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		FoodEater fe1 = new FoodEater("딸기");
		Thread t1 = new Thread(fe1);
		t1.start();
		FoodEater fe2 = new FoodEater("오렌지");
		Thread t2 = new Thread(fe2);
		t2.start();
		FoodEater fe3 = new FoodEater("수박");
		Thread t3 = new Thread(fe3);
		t3.start(); // 출력시 섞어서 막 먹고있음 */
// ex1) LuchMenu 를 통해서 점심 메뉴로 먹은 횟수를 1~20회까지 출력하여
//		Runnable인테페이스를 통해 처리된 것을 수행하세요. 메뉴종류는 3가지
		LunchEater le1 = new LunchEater("샐러드");
		Thread t1 = new Thread(le1);
		t1.start();
		LunchEater le2 = new LunchEater("새우감바스");
		Thread t2 = new Thread(le2);
		t2.start();
		LunchEater le3 = new LunchEater("파프리카볶음");
		Thread t3 = new Thread(le3);
		t3.start();
	//	LunchEater le1 = new LunchEater("샐러드"); 이거를
	//	Thread t1 = new Thread(new LunchEater("샐러드")); 이렇게 간단하게 할 수도 있고
	//  new Thread(new LunchEater("새우감바스")).start(); 이거를
	//**	new Thread(인터페이스상속한객체).strat(); 로 간단하게 할 수도 있다.	**
		
	}

}
class LunchEater implements Runnable{
	private String menu;
	
	public LunchEater(String menu) {
		super();
		this.menu = menu;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int cnt=1;cnt<=20;cnt++) {
			System.out.println(menu+"를 "+cnt+"번 먹다!");
		}
	}
}
class FoodEater implements Runnable{
	private String kind; // 종류 만들고
	public FoodEater(String kind) { // 생성자 생성할 수 있게 넣기
		super();
		this.kind = kind;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int cnt=1;cnt<=10;cnt++) {
			System.out.println(kind+"를 "+cnt+"개 먹다");
		}
	}
}