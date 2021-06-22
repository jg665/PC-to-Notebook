package javaexp.a12_thread;

public class A05_Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LunchMenu m1 = new LunchMenu("짜장면");
		LunchMenu m2 = new LunchMenu("짬뽕");
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
		
			}
		}
class LunchMenu implements Runnable{
	private String menu;
	
	public LunchMenu(String menu) {
		super();
		this.menu = menu;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int cnt=1;cnt<=20;cnt++)
			System.out.println(menu+"를 " +cnt +"회 먹다");
	}
}
