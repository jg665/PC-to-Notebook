package javaexp.a00_exp;

import javaexp.z05_project.Member;

public class A12_0519 {
/*
1. 클래스와 객체의 차이점을 예제 코드와 함께 기술하세요.
	클레스 : 개발자의 실제 코드로 선언한다. 앞으로 만들어질 객체를 위한 설계도 역할을 한다.
	객체 : main() 메서드가 있는 클래스에서 class명과 생성자를 통해서 실제 객체를 생성하고,
		  기능 메서드를 통해서 여러가지 프로세스를 처리한다.
	
	class Cat{
		int name;
		
		public show(){
			System.out.println("이름은: "+name)
		}
	}
	
	main() 안에
	
		Cat c1 = new Cat();
		c1.show();
	
2. default 생성자가 무엇인지 기술하고, Calcu 클래스를 선언하고, 생성자로 두개의 값을 받아서, 객체 4개를 생성하고
   사칙연산 처리하는 내용을 기술하세요.
   	- 생성자는 아무것도 선언하지 않으면 클래스명과 동일한 매개변수가 없는 생성자가 내부적으로 호출되어 사용할 수 있는데, 이걸 default 생성자라고 한다.
   	default 생성자란 class 선언시, 생성자를 선언하지 않더라도 jvm(java virtual machine)에 의해서 내부적으로 생성되는 생성자를 말한다.
   	사용자 정의 생성자를 선언하는 순간 사라진다.
   	
   		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcu c1 = new Calcu();
		// default 생성자 호출
		// 다른 생성자를 선언하더라도 사라지지 않게 하려면
		// 다시 생성자를 선언한다.
		Calcu c2 = new Calcu(25, 5);
		Calcu c3 = new Calcu(25, 5);
		Calcu c4 = new Calcu(30, 5);
		Calcu c5 = new Calcu(50, 5);
		sysout(c2.num01+" + "+c2.num02+" = "+(c2.num01+c2.num02));
		sysout(c3.num01+" - "+c3.num02+" = "+(c3.num01-c3.num02));
		sysout(c4.num01+" * "+c4.num02+" = "+(c4.num01*c4.num02));
		sysout(c5.num01+" / "+c5.num02+" = "+(c5.num01/c5.num02));

	}

}

class Calcu{
	int num01;
	int num02;
	public Calcu(){}
	public Calcu(int num01, int num02) {
		super();
		this.num01=num01;
		this.num02=num02;
	}
}
   
3. 생성자/메서드 overloading이란 무엇인가? 기본 예재와 함께 설명을 하세요.
	- 동일한 이름의 생성자나 메서드를 선언할 수 있는 규칙을 매개변수에 의해서 결정하는 것을 말한다.
	매개변수의 갯수, 데이터 유형, 유형이 다른 순서로 가능하다.
	class Person{
	Person(String name){}	// # 오버로딩 규칙
	Person(String name, int age){} // 1. 갯수가 다름
	Person(String name, String loc){} // 2. 타입이 다름
	Person(int age, String name){} // 3. 타입의 순서가 다름
	
4. 생성자 안에서 this()를 사용하는 목적을 기술하고, Product 클래스 안에서 물건명, 가격, 갯수를
   생성자의 매개변수 없을 때, 1개, 2개, 3개 있게 선언하고 this()를 활용하여 선언된 생성자를 사용하세요.
	- this()란 현재 선언된 클래스안에서 다른 매개변수로 있는 생성자를 호출할 때 사용된다.
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product();	
		Product p2 = new Product("사과");	
		Product p3 = new Product("바나나", 3000);	
		Product p4 = new Product("오렌지", 3000, 5);	
	}
}

class Product{
	private String name;
	private int price;
	private int cnt;
	Product(){
		System.out.println("# 구매한 물건 목록 #");
	}
	Product(String name){
		this();
		this.name=name;
		sysout("물건명 할당: "+name);
	}
	Product(String name, int price){
		this(name);
		this.price=price;
		sysout("가격 할당: "+price);
	}
	Product(String name, int price, int cnt){
		this(name,price);
		this.cnt=cnt;
		System.out.println("갯수 할당: "+cnt);
	}
}

5. 메서드의 기본형식을 선언하고, primitive 데이터유형, 배열, 객체를 리턴하는 것을 선언하고, main()메서드에서 해당 내용을 출력 처리하는 예제를 만드세요.
	- 기본형식: 
		접근제어자 리턴유형 메서드명(매개변수1, 2 ...){ 
			프로세스 처리
			return 리턴할 실제데이터; 
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExp e1 = new MethodExp();
		boolean return01 = e1.returnMethod7();
		System.out.println("리턴할데이터: "+return01);
		
		Calcu e1.returnMethod11();
		System.out.println("리턴한 객체: "+cal.num01);
		System.out.println("리턴한 객체: "+cal.num02);
		System.out.println(ob1.returnMethod2());
		System.out.println(ob1.returnMethod3());
		System.out.println(ob1.returnMethod4());
		double db1 = ob1.returnMethod5();
		System.out.println(db1);
		int[] arr = ob1.returnMethod6();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(ob1.returnMethod7());


		
	}

}
class MethodExp{
	byte returnMethod1(){
		byte num01 = 25;
		return num01;
	}
	short returnMethod2(){
		short num01 = 25;
		return num01;
	}
	char returnMethod3(){
		char num01 = 'A';
		return num01;
	}
	long returnMethod4(){
		long num01 = 25L;
		return num01;
	}
	float returnMethod5(){
		float num01 = 25.25F;
		return num01;
	}
	double returnMethod6() {
		double num01 = 25.5234;
		return num01;
	}
	boolean returnMethod7() {
		boolean isPass = 70>=80;
		return isPass;
	}
	int returnMethod8() {
		int num01 = 25;
		return num01;
	}
	String returnMethod9() {
		return "문자열 리턴";
	}

	int[] returnMethod10() {
		int []arry = {2,5,35};
		return arry;
	}
	Calcu returnMethod11(){
		return new Calcu(30, 25);
	}
}

class Calcu{
	int num01;
	int num02;
	public Calcu(){}
	public Calcu(int num01, int num02) {
		super();
		this.num01=num01;
		this.num02=num02;
	}
}


6. 메서드의 매개변수를 통해 기본유형의 변수 할당과 객체형의 할당의 차이점을 기술하세요.
	- 기본유형의 변수 할당은 Basic 클래스에 할당된 데이터와 메서드만 사용 가능하지만
		Basic b1 = new Basic();
		b1.inInt(4);
	}

}
class Basic{
	void inInt(int i) {
		System.out.println("할당된 데이터: "+i);
	}
}
	- 객체형 할당은 다른 클래스에 데이터를 할당하고 메서드를 추가로 사용 가능하다.
		Member m1 = new Member("himan");
		Basic b1 = new Basic();
		b1.basicLogin(m1);
	}
}
class Basic{
	void basicLogin(Member m) {
		System.out.println("로그인된 id: "+m.id);
	}
}
class Member{
	String id;
	public Member(String id) {
		this.id=id;
		System.out.println("아이디 입력되었습니다.");
	}
}		

		
		
		답))
			// 전체적으로 각각의 변수로 할당.
	void setInfo(String name, int age, String loc){
		
	}
	// main() e1.setInfo("홍길동",25,"서울신림동");
	// Person p01 = new Person("홍길동",25,"서울신림동");
	// main() e1.setInfo(p01);
	// 하나의 객체로 할당.
	void setInfo(Person p){
	
	}
}
class Person{
	String name;
	int age;
	String loc;
	Public Person(String name, int age, String loc){
		super();
		this.name=name;
		this.age=age;
		this.loc=loc;
	}
}
	
7. OnLineLibrary 클래스를 선언하고, 기능 메서드를 login(Member m), lent(Book b)을 처리하세요. login()메서드로는 입력된 id, pass가 goodMan/7777일때만
   로그인 성공, 그 외에는 로그인 실패 문자열 리턴 처리, lent() 메서드로는 반납기한 @@인 도서 @@@ 대출 처리로 출력하세요.
   
   답))
class OnLineLibrary{
	public String login(Member m){
		return m.id.equals("himan")&&m.pass.equals("7777")?
			   "로그인 성공":"로그인 실패";
	}
	public void lent(Book bk){
		sysout("반납기한 "+bk.getTerm()+"인 도서"+bk.getTitle()+"대출");
	}
}
class Book{
	private String title;
	private String term;
	public Book(String title, String term){
		super();
		this.title=title;
		this.term=term;
	}
	public String getTitle(){
		return title;
	}
}
class Member{
	String id;
	String pass;
	public Member(String id, String pass){
		super();
		this.id=id;
		this.pass=pass;
	}
}   
 
   =========================================
   
   	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member m1 = new Member("himan","7777");
		Book b1 = new Book("5/21","어젯밤");
		OnLineLibrary o1 = new OnLineLibrary();
		o1.login(m1);
		o1.lent(b1);
		
	}

}
class OnLineLibrary{
	public void login(Member m) {
		if(m.id.equals("himan")&&m.pass.equals("7777")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}
	public void lent(Book b) {
		System.out.println("반납기한 "+b.date+"인 도서 "+b.name+" 대출 처리");
	}
}
class Book{
	String name;
	String date;
	public Book(String name, String date) {
		this.name=name;
		this.date=date;
	}
}
class Member{
	String id;
	String pass;
	public Member(String id, String pass) {
		this.id=id;
		this.pass=pass;
	}
}
   
   
8. MathExp 클래스에 기능 메서드 gugu(구구단의 출력할 단수), totAll(1부터 합산할 마지막 수 입력), withComMavel(내가 입력한 주사위수)
   - 내가 입력한 주사위 수와 컴퓨터가 랜덤처리한 주사위 수로 승/무/패 출략
	답))
class MathExp {
	void gugu(){
		sysout("구구단의 출력할 단수를를 입력하세요!");
		Scanner s = new Scanner(System.in);
		int grade = s.nextInt();
			for(int gugu = a; gugu == a; a++){
			for(int b = 1; b <= 9; b++){
				sysout(grade+" X "+b+" = "+ (grade*b));
			}
		}
	}
	
	void totAll(){
		sysout("1부터 합산할 마지막 수를 입력하세요!");
		Scanner s = new Scanner(System.in);
		int lastno = s.nextInt();
		int tot=0;
		for(int startno=1;startno<=lastno;startno++){
			tot += startno;
			sysout(startno);
			if(startno == lastno){
				sysout(" = "+tot);
			}else{
				sysout(" + ");
			}
		}
	}
	
	void withComMavel() {
		sysoout("주사위 수를 입력하세요!");
		Scanner s = new Scanner(System.in);
		int me = s.nextInt();
		int robot = (int)(Math.random()*6+1)
		sysout("당신의 주사위: "+me);
		if(me <= 0 || me > 6 ){
			sysout("1부터 6까지의 숫자를 선택해주세요!");
		}else{
			sysout("로봇의 주사위: "+robot);
			if(me>robot){
				sysout("승");
			}else if(me<robot){
				sysout("패");
			}else{
				sysout("무승부");
			}
		}
	}
}

* */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathExp m1 = new MathExp();
		m1.gugu(3);
		m1.totAll(4);
		m1.withComMavel(6);
		
	}

}
class MathExp{
	void gugu(int num01) {
		System.out.println(num01+"단 구구단 시작!");
		for(int cnt=1;cnt<=9;cnt++) {
			System.out.println(num01+" x "+cnt+" = "+(num01*cnt));
		}
	}
	void totAll(int num02) {
		int sum = 0;
		System.out.println("# 1부터 입력값까지 합산계산 #");
		for(int cnt=1;cnt<=num02;cnt++) {
			sum += cnt;
		}
		System.out.println("1부터 "+num02+"까지의 합: "+sum);
	}
	void withComMavel(int num04) {
		int com = (int)(Math.random()*6+1);
		System.out.println("플레이어 주사위: "+num04);
		System.out.println("컴퓨터 주사위: "+com);
		if(num04==com) {
			System.out.println("무");
		}else if(num04>=com) {
			System.out.println("플레이어 승");
		}else {
			System.out.println("플레이어 패");
		}
	}
}