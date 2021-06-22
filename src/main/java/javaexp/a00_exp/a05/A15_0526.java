package javaexp.a00_exp.a05;

public class A15_0526 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car("자동차");
		c.go();
		
		Taxi t = new Taxi();
		t.go();
		t.escort();
		System.out.println();
//		Worker w1 = new Worker();
//		w1.work();
//		w1.gohome();
//		Worker w2 = new FireMan();
//		w2.work();
//		w2.gohome();
//		Worker w3 = new PoliceMan();
//		w3.work();
//		w3.gohome();
//		Worker w4 = new Programmer();
//		w4.work();
//		w4.gohome();
		
		PoliceMan p1 = new PoliceMan();
		p1.work();
		
		/*
		1. 클래스 선언에서 toString()의 역할을 기술하고. 
			super.toString()을 선언하였을 때, 어떤 기능이 처리 되는지 설명하세요.

toString() : 객체를 생성해서 참조변수만 호출 하였을 때
			 default로 나타날 리턴값을 선언한다.
			 ex) Student st1 = new Student();
			 	 System.out.println(st1);
		
		2.	상속관계에서 super키워드를 사용하는 경우를 예제와 함께 기술하세요.

		부모 객체 생성시, 부모 생성자 하위에 선택하여 호출.
		1) super(매개값...)
			- 매개값과 동일한 타입, 갯수, 순서 맞는 부모생성자 호출
		2) 부모 생성자 없으면 컴파일 오류 발생
		3) 반드시 자식 생성자의 첫줄에 위치
			생성자(){
				super();//첫줄에위치
					}

		3.	Worker 추상 클래스를 상속받은 FireMan, PoliceMan, Programmer를
			다형성을 처리하되, 생성자에 super("경찰과") 활용,
			공통메서드 : 출근/퇴근하다, 재정의 메서드 일하다를 처리하세요.
			1:1, 1:다 관계를 설정하여 처리하세요.
			
		4.	오라클 설치과정과 설치에 필요한 내용을 기술하세요.
		오라클 설치)
		oracle xe11g 다운로드 - setup.exe - system, 관리자비밀번호 : 1111 지정 
		- 설치 완료 후 C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql
		파일을 user에 붙혀넣고 메모장으로 열기 - 내부의 TIGER - tiger 소문자로 변경 후 저장 
		- 윈도우 cmd창에 들어간 후 sqlplus 입력 - 아이디 : system, 비밀번호 : 1111 입력
		- SQL 접속 후 @scott.sql - conn scott/tiger; 입력
		
		플러그인 설치) eclipse - help - eclipse marketplace - dbeaver 21.0.5버전 설치
			*/
		}
	}

/*		

	Worker 출,퇴근 
	
		
1. 클래스안에서 외부에 있는 객체 메모리 설정하여
	할당하여 활용하는 것을 말한다.
		
 */
class PoliceMan{
	public void work() {
		System.out.println("출근하다");
	}
}
class Worker extends PoliceMan {
	public PoliceMan policeman;
	public void work() {
		super.work();
		System.out.println("치안을 유지하다.");
	}
}
//class Worker{
//	public void work() {
//		System.out.println("출근하다");
//	}
//	public void gohome() {
//		System.out.println("퇴근하다.");
//	}
//}
//class FireMan extends Worker{
//	public void work() {
//		super.work();
//		System.out.println("소방관이 불을 끄다");
//	}
//}
//class PoliceMan extends Worker{
//	public void work() {
//		super.work();
//		System.out.println("경찰관이 치안을 유지하다");
//	}
//}
//class Programmer extends Worker{
//	public void work() {
//		super.work();
//		System.out.println("프로그래머가 프로그래밍을 한다.");
//	}
//	
//}



class Car{
	String name;
	public Car(String name) {
		this.name = name;
	}
	public void go() {
		System.out.println(name+" 출발한다.");
	}
}
class Taxi extends Car{
	Taxi() {
		super("택시");
	}
	void escort() {
		System.out.println(name+" 손님을 태운다.");
	}
}


		
