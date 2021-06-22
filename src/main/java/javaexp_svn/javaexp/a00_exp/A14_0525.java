package javaexp.a00_exp;

public class A14_0525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 정리문제
1. static, final, static final의 각각의 차이점을 기본예제를 통해서 기술하세요.
	static : 객체 공유메모리영역 즉, 클래스 단위 멤버를 사용할 때 활용된다.
	final : 필드에서는 상수선언으로 객체마다 하나의 상수를 초기 선언하면,  변경이 불가능하다.
	static final : 클래스 단위 멤버이면서 변경이 불가능하게 처리할 때 활용된다.
				   class에서 바로 할당하는 경우가 많다.
		Types t1 = new Types(3);
		t1.explain();
	}
}
class Types{
	static int NUM;
	final int num02;
	static final int NUM_CANT_CHANGE = 5;
	public Types(int num02) {
		super();
		this.num02 = num02;
	}
	public void explain() {
		System.out.println("final은 객체당 1번 할당가능: "+num02);
		System.out.println("static은 객체 공유 메모리: "+NUM);
		System.out.println("static final은 클래스당 1번 할당: "+NUM_CANT_CHANGE);

	}
}


2. Robot 클래스를 정의할 떄, "기계로봇", 로봇의 종류, 로봇공유전력남은량, 처리할기능을
   필드로 선언하여, 해당 내용을 활용하는 부분을 위 문제에 선언한 keyword의 기능에
   맞게 처리하세요. (생성자, 메서드, 필드 선언을 적절하게 하세요)
   
   		Robot r1 = new Robot("청소");
		Robot.restElectric=30;
		r1.use();
		r1.use();
		r1.use();
	}
}
class Robot{
	static final String KIND = "기계로봇";
	static int restElectric;
	int useElectric;
	final String use;
	public Robot(String use) {
		super();
		this.use = use;
	}
	public int getUseElectric() {
		return useElectric;
	}
	public void use() {
		useElectric++;
		restElectric--;
		System.out.println(use+"용도의 "+KIND+"이 전력을 "+useElectric+"w만큼 사용했다.");
		System.out.println("남은 전력: "+restElectric+"w");
	}
}


	답))
		Robot.REST_POWER=3000; // static 변수 객체 생성없이 바로 사용
		Robot r1 = new Robot("TV");
		r1.working(100);
		r1.attack(150);
		Robot r2 = new Robot("MZ");
		r2.working(300);
		r2.attack(30);
		System.out.println(r1.getKIND()+"의 현재 상태: "+r1.getCurrenFunction());
		System.out.println(r2.getKIND()+"의 현재 상태: "+r2.getCurrenFunction());
		System.out.println("현재 남은 전력량: "+Robot.REST_POWER);
	}
}
class Robot{
	public static int REST_POWER;
	private final String KIND; // 각각의 로봇의 종류
	private static final String ROBOT_CLASSES="기계로봇";
	// 클래스 단위 상수 설정
	private String currenFunction; // 각 로봇이 현재하고 있는 기능 표기
	Robot(String kind){
		this.KIND = kind;
	}
	public void working(int usingpower) {
		currenFunction = "일을 하고있다!";
		System.out.println(ROBOT_CLASSES+ "분류로 되어있는 "+KIND+"로봇이 일을 한다.");
		System.out.println("소모 전력: "+usingpower);
		System.out.println("남은 전력: "+REST_POWER);
	}
	public String getCurrenFunction() {
		return currenFunction;
	}
	public void attack(int usingpower) {
		currenFunction = "공격을 하고 있다";
		System.out.println(ROBOT_CLASSES+ "분류로 되어있는 "+KIND+"로봇이 공격을 한다!");
		System.out.println("소모 전력: "+usingpower);
		REST_POWER -=usingpower;
		System.out.println("남은 전력: "+REST_POWER);
	}
	public String getKIND() {
		return KIND;
	}
}
   
3. 접근제어자의 범위를 기술하고, 클래스명 앞에 붙는 접근제어자와 생성자 앞에 붙는
   접근제어자가 main()에서 어떻게 영향을 미치는지 예제를 통하여 기술하세요.	
   
	private : 클래스 내에서만 사용할 수 있는 범위로 지정
			  객체로 만들어질 떄, 외부 클래스나 main()에서 직접적인 접근을 하지 못하게 선언할 때 사용한다.
	 		  public getXXX(), public setXXX() 간접적으로 접근이 가능하다.
	X(default) : 기본적으로 접근제어자가 붙어있지 않는 멤버는 같은 패키지의 클래스들만 접근하여 사용할 수 있다.
	    		 ex) 클래스 선언 최상단의 package javaexp.a00_exp; 동일할때.
	protected : 상속관계에 있는 때, 외부 패키지의 있는 클래스가 접근하여 사용할 수 있게 선언한다.
	public : 외부패키지에서 어떠한 클래스라도 접근하여 호출가능하게 처리하는 것을 말한다.
	

	
				*/
		//	외부 패키지에서 선언할 클래스 호출
		// import 없이 특정한 패키지의 클래스 선언하거나
		// 현재패키지의 클래스와 같은 이름의 클래스를 호출할 때,
		// 패키지명과 함께 선언한다.
		// 1) 접근제어자 class Person{}
		javaexp.a00_exp.z01_vo.Person p1;
		// 2) 생성자 호출
		p1 = new javaexp.a00_exp.z01_vo.Person();

	}
}
