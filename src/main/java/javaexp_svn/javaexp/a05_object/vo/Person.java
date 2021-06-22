package javaexp.a05_object.vo;

// 하나의 클래스, 객체를 위한 도면과 같은 역할
public class Person {
	// 클래스에서 사용되는 것 = 필드 (구성요소1)
	// 클래스의 특징, 속성을 나타낸다.
	// 전역변수 : 클래스 내부에 모두가 사용될 수 있는 변수 = 필드
	public String name;
	public int age;
	public String loc;
	
	// 클래스에서는 클래스와 동일한 명칭을 가진 기능 함수 = 생성자 (구성요소2)
	// 생성자는 일반적으로 속성(필드)를 초기화한다.
	// 그래서 리턴값이 없다.
	// Person p01 = new Person(); // Person() 부분을 지칭한다.
	public Person(){
		System.out.println("생성자 호출!!");
	}
	
	// 매개변수가 3개인 생성자 선언
	// main()메서드에서 객체 생성시,
	// 선언된 type과 순서가 동일한 생성자로 생성해야 한다.
	// new Person("홍길동", 25, "서울 신림동") (O)
	// new Person(25, "홍길동", "서울 신림동") (X)
	public Person(String name, int age, String loc) {
		// 입력 매개변수와 this.필드의 속성으로 구분하여 데이터를
		// 초기화(초기값 할당)을 처리한다.
		// 매개변수로 들어오는 데이터는 생성자에서만 사용할 수 있는 변수 = 지역변수이다.
		// 지역변수에 대한 기준이나 타입이 있는 () 괄호부분 = 파라미터
		// 이것을 =(대입연산)와 this.필드명으로 구분된 전역변수(name)
		this.name = name;		
		this.age = age;
		this.loc = loc;
	}
	// p01.name에는 "홍길동"이라는 문자열이 들어가게 된다.
	// this.name ==> new Person에서 할당한 데이터를
	// = name; 공식을 통해 Person 클래스 안의 public String name; 부분에
	// 홍길동 문자열 데이터가 들어감
	// 동일하게 p01.age 에는 25 / p01.loc 에는 서울 신림동이 들어가게 됨
	
	// 클래스 내에서 기능을 처리하는 것 = 메서드 (구성요소3)
	public String call() {
		System.out.println("기능 메서드 호출");
		return "문자열 리턴";
	}
	
	// 앞에 public 붙이면 실제 객체로 처리된다.
	/*
	매서드 기본 형식
	**접근제어자 리턴타입 메서드명(매개변수1, 매개변수2...){
		프로세스 처리
		return 리턴할 데이터;
	}
	
	리턴타입 : 리턴할 데이터객체의 type에 맞게 처리한다.
		만일 리턴할 데이터가 없으면 void(비어있다)로 선언할 수 있다.
	 
	# main()에서 호출
	Person p01 = new Person(@@@,@@); 생성자는 한번만 호출
	매서드는 여러번 호출 가능
	형식 : 객체명, 메서드명();
	p01.show(): 
	p01.show(): 
	p01.show(): 
		 
	 
	 * */
	
	public void show() {
		// 현재 객체의 field(전역속성)를 호출
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("사는 곳: "+loc);
	}
	
	
	
}
