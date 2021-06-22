package javaexp.a00_exp.a05;

public class A14_0521 {

	// 외부 패키지에서 선언할 클래스 호출
	// import 없이 특정한 패키지의 클래스 선언
	// 현재 패키지의 클래스와 같은 이름의 클래스를 호출할 때,
	// 패키지명과 함께 선언한다.
	// 1) 접근제어자 class Person{}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Shop sh1 = new Shop("지나가던");
//		sh1.getClean("휴지");
//		sh1.getClean("쓰레기");
//		Shop sh2 = new Shop("착한");
//		sh2.getClean("담배꽁초");
//		sh1.getTrash();
//		sh1.getTrash();
//		sh1.getTrash();
//		sh1.getTrash();
//		sh2.getTrash();
//		sh2.getTrash();
//		sh1.trash=2;
		
	//  클래스명. 변수명 static final 변수는 일반적으로 대문자 사용
		Robot.REST_POWER=3000; // static 변수 객체 생성 없이 사용가능
		Robot r1 = new Robot("A");
		r1.working(1000);
		r1.attack(100);
		Robot r2 = new Robot("B");
		r2.attack(200);
		r2.working(100);
		System.out.println(r1.getKIND()+"의 현재상태:"
		+r1.getCurrenFunction());
		System.out.println(r2.getKIND()+"의 현재상태:"
		+r2.getCurrenFunction());
		System.out.println("현재 남은 전력량:" +Robot.REST_POWER);
		
//		Robot r1 = new Robot("이족보행");
//		r1.charging(70);
//		Robot r2 = new Robot("사족보행");
//		r2.charging(20);
		
		// 외부 패키지에서 선언할 클래스 호출
		// import 없이 특정한 패키지의 클래스 선언
		// 현재 패키지의 클래스와 같은 이름의 클래스를 호출할 때,
		// 패키지명과 함께 선언한다.
		// 1) 접근제어자 class Person{}
		javaexp.a00_exp.z01_vo.Person p1;
		
		// 2) 생성자 호출
		p1 = new javaexp.a00_exp.z01_vo.Person();
	}	
}
/*	
#정리문제 
1.static, final, static final의 각각의 차이점을 기본예제를 통해서 기술하세요.
static : 선언된 멤버는 하나의 클래스에서 만들어진 모든 객체들의 데이터나 기능 공유.
final : 객체 단위로 한번 할당하면 변경이 불가능
static final : 클래스 단위로 변경되지 않는 상수 

	static: 객체 공유메모리영역 즉, 클래스 단위 멤버를 사용할 때,
	 활용된다.
	 final : 필드에서는 상수선언으로 객체마다 하나의 상수를 초기 선언하면,
	  		변경이 불가능하다.
	 static final : 클래스 단위 멤버이면서 변경이 불가능하게 처리할 때, 활용된다.
	 		class에서 바로 할당하는 경우가 많다.
	 main()
	 Bear.TOT_BREAD_CNT=30; //초기값 선언
	 class Bear{
	 	private int eat_cnt;
	 	public static int TOT_BREAD_CNT;
	 	// 이 클래스로부터 생성되는 모든 Bear 객체가 공유 메모리 영역 남은 빵의 갯수
	 	final String NAME;
	 	static final String KIND = "곰돌이클래스"; // 해당클래스에서 변경되지 않아야할때 KIND선언
	 	Bear(String name){
	 		this.NAME = name; 
	 		// 객체마다 초기로 선언하여 변경이 불가능하게 할때 사용
	 	}
	 	public void eat(){
	 		eat_cnt++; // 각 객체마다 해당 변수를 변경처리
	 		TOT_BREAD_CNT--; // 객체의 공유 데이터 변경 처리.
	 	}
	 }
*/
//
//class Shop{
//	static final String PEOPLE="사람";
//	static int THROW_TRASH; 
//	int trash;
//	String clean;
//	final String KIND;
//	public Shop(String kIND) {
//		super();
//		KIND = kIND;
//	}
//	public void getTrash() {
//		trash++;
//		System.out.println(KIND+PEOPLE+"이 "+clean+"를"+trash+"개 "+ "주워서 쓰레기통에 버린다");
//	}
//	public void getClean(String clean) {
//		this.clean = clean;
//	}
//}

/*	
2. Robot 클래스를 정의할 때, "기계로봇", 로봇의 종류, 로봇공유전력남은량, 처리할기능을
	필드로 선언하여, 해당 내용을 활용하는 부분을 위 문제에 선언한 keyword의 기능에
	맞게 처리하세요. (생성자, 메서드, 필드 선언을 적절하게 사용)
*/
class Robot{
	//객체 공유메모리영역 즉, 클래스 단위 멤버를 사용할 때,
	public static int REST_POWER; // 로봇공유전력남은량 
	//필드에서는 상수선언으로 객체마다 하나의 상수를 초기 선언하면,변경 불가
	private final String KIND; // 각각의 로봇의 종류 초기에 선언, 변경되지 않게 처리
	private static final String ROBOT_CLASSES="기계로봇";
	// 클래스 단위 상수 설정..
	private String currenFunction; // 각 로봇이 현재하고 있는 기능 표시
	Robot(String kind){
		this.KIND = kind;
	}
	public void working(int usingpower) {
		currenFunction = "일을 하고 있다!";
		System.out.println(ROBOT_CLASSES+"분류로 되어있는"+
		KIND+ "로봇이 일을 한다");
		System.out.println("소모 전력:"+usingpower);
		REST_POWER-= usingpower;
		System.out.println("남은 전력:"+REST_POWER);
	}
	public void attack(int usingpower) {
		currenFunction = "공격을 하고 있다!";
		System.out.println(ROBOT_CLASSES+"분류로 되어있는"+
		KIND+ "로봇이 공격을 한다");
		System.out.println("소모 전력:"+usingpower);
		REST_POWER-= usingpower;
		System.out.println("남은 전력:"+REST_POWER);
	}
	
	public String getKIND() {
		return KIND; // 상수는 setter에서 setkind 안나타남
	}
	public String getCurrenFunction() {
		return currenFunction; 
		// 기능 메서드마다 어떠한 일을 하고 있는지 get메서드 통해 접근
		
	}
}
/*
class Robot{
	private String type;
	private int energyLeft;
	private static final String ROBOT="기계로봇";
	public Robot(String type) {
		super();
		this.type = type;
	}
	public void charging(int energyLeft) {
		System.out.println(ROBOT+"의 종류는 "+type+"이며 충전량은"+energyLeft+"이다");
	}
}
*/


/*	
3. 접근제어자의 범위를 기술하고, 클래스명 앞에 붙는 접근 제어자의 생성자 앞에 붙는
	접근제어자가 main()에서 어떻게 영향을 미치는지 예제를 통하여 기술하세요.
	private : 외부 객체에서 직접적으로 접근을 못한다. 클래스 내부에서만 사용
	default : 상단에 선언한 동일한 패키지내에서만 접근하여 사용한다.
	protected : 상속관계에 있고, 패키지가 다르더라도 접근이 가능하다.
	public : 패키지가 다르더라도 해당 구성요소에 접근이 가능하다.
	
	접근제어자 :
		private : 클래스 내에서만 사용할 수 있는 범위로 지정
			객체로 만들어질 때, 외부 클래스나 main()에서 직접적인 접근을 하지
			못하게 선언할 때 사용. 
			public getXXX(), public setXXX() 간접적으로 접근은 가능하다. 
			
		X(default) : 기본적으로 접근제어자가 붙어 있지 않는 멤버는 같은 패키지의 클래스들만
				접근하여 사용할 수 있다. 
				ex) 클래스 선언 최상단의 package javaexp.a00_exp; 동일할때.
		protected : 상속관계에 있을 떄, 외부 패키지의 있는 클래스가 접근하여
		 	사용할 수 있게 선언한다.
		public : 외부패키지에서 어떠한 클래스라도 접근하여 호출가능하게 처리하는
			것을 말한다.
			
			
	//		public : 패키지가 다르더라도 해당 구성요소에 접근이 가능하다.
		// 1.선언
		A00_Product p1 = null; 
		// 2. 객체 생성..
		
		//private : 생성자가 private이면 외부 package 접근 불가. 클래스 내부에서만 사용
//		p1 =new A00_Product();
	
	
*/
	





