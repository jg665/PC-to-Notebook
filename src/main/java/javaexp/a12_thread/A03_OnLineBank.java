package javaexp.a12_thread;

public class A03_OnLineBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 효과적으로 나눠서 실행된다.
		BankUser u1 = new BankUser("홍길동");
		BankUser u2 = new BankUser("김길동");
		BankUser u3 = new BankUser("신길동");
		BankUser u4 = new BankUser("오길동");
		BankUser u5 = new BankUser("마길동");
		u5.setPriority(Thread.MAX_PRIORITY);  //	Thread.MAX_PRIORITY  : 최우선 쓰레드 처리
		u1.setPriority(Thread.MIN_PRIORITY); //		Thread.MIN_PRIORITY : 최하위 우선 쓰레드 처리
		
		u1.start();
		u2.start();
		u3.start();
		u4.start();
		u5.start();
		
// ex1) GameUser로 쓰레드로 생성(사용자이름) 하고, 기본 예제와 같이 
//			게임사이트접속, 대화하기, 게임실행하기, 게임로그아웃 배열로
//		쓰레드를 5개 만들어 처리하세요. (
		
		for(int cnt=1;cnt<=5;cnt++) {
		GameUser user = new GameUser(cnt+"번째 사용자");
		user.start();
		}
	}
}
		
class BankUser extends Thread{
	private String name;
	public BankUser(String name) {
		super();
		this.name = name;
	}

	public void run() {
		String[] proc = {"로그인하다","계좌를 확인하다!",
			"입급/출금을 하다","로그아웃하다"};
		for(int idx=0;idx<proc.length;idx++) {
			System.out.println(idx+1+"]"+name+"" +proc[idx]);
		}
	}
}

class GameUser extends Thread{
	private String name;
	public GameUser(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		String[] proc = {"게임사이트접속","대화하기",
				"게임실행하기","게임로그아웃",};
		for(int idx = 0; idx< proc.length; idx++) {
			System.out.println( "["+ (idx +1) 
					+"]" +name+ " " +proc[idx]);
		
		
				
			}
		}
	
	}
	
	
	