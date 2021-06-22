package javaexp.a00_exp.a05;

import java.util.ArrayList;

public class A13_0520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int tot = 0;
		
		//생성자로 데이터 처리
		Record r1 = new Record();
		Record r2 = new Record();
		Record r3 = new Record();
		int tot = 0;
		tot+=r1.write("5/10", "이월금", true, 300000);
		tot+=r2.write("5/25", "차비", false, 5000);
		tot+=r3.write("5/25", "식비", false, 10000);
		System.out.println("현재 잔액:"+tot);
		System.out.println("# 하나의 객체로 기능 메서드 처리 #");
		tot=0;
		Record r4 = new Record();
		// 기능 메서드를 처리한 경우에 각각의 데이터를 변경할 수 있기 때문에
		//	하나의 객체로 사용이 가능하다.
		tot+=r4.write("5/26", "이월금", true, 100000);
		tot+=r4.write("5/27", "차비", false, 5000);
		tot+=r4.write("5/28", "식비", false, 10000);
		System.out.println("현재 잔액:"+tot);
		
	/* 3.	Visitor(방문객의 이름, 나이)이 Museum(박물관)에 방문한 내용을 
		 	1:1 관계로 처리하세요.*/
		Museum m01 = new Museum("유럽 고대 명화전");
		m01.showVisitor();
		m01.setVisitor(new Visitor("홍길동",25));
		m01.showVisitor();
		
	/*	4.	BookStore에 서점명 구매도서(Book)을 1:다관계로 구매와 구매내역을
		 처리하는 프로그램을 만드세요.
		(String title, int price, String writer, int cnt) {	 
		 */
		BookStore b1 = new BookStore("교보문고");
		b1.showBuyList();
		b1.buyBook(new Book01("자바기초",28000,"자바맨",2));
		b1.buyBook(new Book01("JSP",32000,"웹의신",3));
		b1.buyBook(new Book01("스프링완성",35000,"프레임맨",3));
//		교보문고 서점에 방문하여 구매한 도서리스트 구매 목록이 없습니다.
		b1.showBuyList();
//		교보문고 서점에 방문하여 구매한 도서리스트 
//		번호	도서명	저자	가격	갯수	권수	계
//		1	자바기초	자바맨	28000	2	56000
//		2	JSP	웹의신	32000	3	96000
//		3	스프링완성	프레임맨	35000	3	105000
//		총 구매 비용257000
		
	/* 5.	Computer(회사명, 기타 객체, add(부품), showInf())객체 안에,
		 	Cpu(제조사,사양), Ram(제조사,사양), Hdd(제조사, 사양)을 할당하여
		 	showInfo()로 해당 컴퓨터의 부품 내역을 출력하세요.
		 	
		 	*1단계) Computer 하위에 선언..
		 	2단계) ArrayList에 할당해서 처리.
		 	*3단계) 다형성설정 클래스 구성 ArrayList<PartComp>  */
		
		Computer c1 = new Computer("맥PC");
		// c1.showInfo();
		 c1.addCpu(new Cpu("MS","3.6GHZ"));
		 c1.addRam(new Ram("삼성","16G"));
		 c1.addHdd(new Hdd("삼성","500G"));
		 c1.showInfo();
		 System.out.println("## 3단계 다형성 부품 처리 ##");
		 Computer2 c2 = new Computer2("삼성PC");
		 c2.showPartList();
		 c2.addPartComp(new Cpu2("MS","i7 3.3GH"));
//		 c2.addPartComp(new Cpu2("MS","i7 3.3GH"));
		 c2.addPartComp(new Ram2("하이닉스","8G"));
		 c2.addPartComp(new Ram2("하이닉스","8G"));
		 c2.addPartComp(new Hdd2("삼성전자","SSD 250G"));
		 c2.addPartComp(new Hdd2("삼성전자","SSD 250G"));
		 c2.showPartList();
		}
	}

class Computer{
	private String company;
	private Cpu cpu;
	private Ram ram;
	private Hdd hdd;
	public Computer(String company) {
		super();
		this.company = company;
	}
	public void showInfo() {
		System.out.println("# 컴퓨터 #");
		System.out.println("제조사:"+company);
		if(cpu!=null) {
			cpu.showInfo();
		}else {
				System.out.println("cpu장착이 안되었습니다.");
		}
		if(ram!=null) {
			ram.showInfo();
		}else {
				System.out.println("ram장착이 안되었습니다.");
		}
		if(hdd!=null) {
			hdd.showInfo();
		}else {
				System.out.println("hdd장착이 안되었습니다.");
		}
	}
	// 기능 메서드를 통해 부품 장착
	public void addCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	public void addRam(Ram ram) {
		this.ram = ram;
	}
	public void addHdd(Hdd hdd) {
		this.hdd = hdd;
	}
	
}
	
class Computer2{
		private String company;
		private ArrayList<PartComp> plist;
		public Computer2(String company) {
			super();
			this.company = company;
			plist = new ArrayList<PartComp>();
		}
		// 상위		   = 하위(); 다형성이 일어났기 때문에 가능하다.
		// PartComp pc = new Cpu2("MS", "3.6GHz 6core");
		// com2.addPartComp(new Cpu2("MS", "3.6GHz 6core"));
		public void addPartComp(PartComp pc) {
			plist.add(pc);
			System.out.println("# 부품 장착 #");
			System.out.println(pc.getKind()+"추가 장착");
		}
		public void showPartList() {
			System.out.println("# 컴퓨터의 부품 현황 #");
			System.out.println("컴퓨터 제조사:"+company);
			if(plist.size()==0) {
				System.out.println("부품은 없습니다.");
				}else {
					System.out.println("종류\t제조사\t사양");
					for(PartComp c:plist) {
						// 재정의한 메서드 호출, 각 부품별로 
						// 다르게 정의한 내용이 출력된다. *****
						c.show();
					}
				}
			}
			
		}
	
abstract class PartComp{
	private String kind;
	private String company;
	private String spec;
	public PartComp(String kind, String company, String spec) {
		super();
		this.kind = kind;
		this.company = company;
		this.spec = spec;
	}
	// 개별적으로 하위 클래스에서 재정의할 부분
	abstract void show();
	// 공통적인 처리 부분..
	public void showCom() {
		System.out.print(kind+"\t");
		System.out.print(company+"\t");
		System.out.print(spec+"\n");
	}
	public String getKind() {
		return kind;
	}
	
}
class Cpu2 extends PartComp{
	public Cpu2(String company, String spec) {
		super("CPU",company,spec);
		// TODO Auto-generated constructor stub
	}
	@Override
	void show() {
		// TODO Auto-generated method stub
		// 하위 객체마다 추가적으로 처리할 내용.
		System.out.println("# CPU 부품 정보 #");
		//공통정보 사용할 수 있게 처리
		showCom();
	}
}
class Ram2 extends PartComp{
	public Ram2(String company, String spec) {
		super("RAM", company, spec);
	}
	@Override
	void show() {
		System.out.println("* Ram 부품 정보 *");
		showCom();
		}
	}
class Hdd2 extends PartComp{
	
	public Hdd2(String company, String spec) {
		super("HDD", company, spec);
	}
	@Override
	void show() {
		System.out.println("@ Ram 부품 정보 @");
		showCom();
	}
	
}
class Cpu{
	private String company;
	private String spec;
	public Cpu(String company, String spec) {
		super();
		this.company = company;
		this.spec = spec;
	}
	public void showInfo() {
		System.out.print("# CPU 정보 #");
		System.out.print(company+"\t");
		System.out.print(spec+"\n");
	}
}
class Ram{
	private String company;
	private String spec;
	public Ram(String company, String spec) {
		super();
		this.company = company;
		this.spec = spec;
	}
	public void showInfo() {
		System.out.print("# Ram 정보 #");
		System.out.print(company+"\t");
		System.out.print(spec+"\n");
	}
}
class Hdd{
	private String company;
	private String spec;
	public Hdd(String company, String spec) {
		super();
		this.company = company;
		this.spec = spec;
	}
	public void showInfo() {
		System.out.print("# Hdd 정보 #");
		System.out.print(company+"\t");
		System.out.print(spec+"\n");
	}
}


/*		
1. 클래스의 구성요소의 특징과 활용에 대하여 기술하세요.
	class Product(클래스명){
		private String(데이터유형) name; // 필드
		private int cnt; // 필드
		Product(클래스명)(String name){ //생성자로 주로 필드를 초기화 할때, 업무에따라 유동적으로 //객체로 만들어지는 부분
			this.num01 = num01;
			// 객체가 생성될 때, 바로 초기화가 필요한 필드인지?
			// 메서드를 통해서 변경하는 부분인지 판단..
			// cf) 물건 구매하는 경우에는 cnt를 기능메서드로 처리
			// 	입고하는 경우 물건명과 입고의 갯수를 같이 
			 //	담아서 처리해야 한다.
		}
		// 기능 메서드 처리 : 어떤 입력값이 들어올지? 
		//	처리할 내용(저장, 누적, 조건/반복처리)
		//	리턴할 데이터 여부 판단.
		 	public void buy(int cnt){
		 		this.cnt = cnt;
-----------------------------------------------------------------
	필드 : 클래스의 모든 구성요소에 영향을 미치는 변수/상수/객체
	생성자 : main()에서 객체가 생성할 때, 쓰이는 함수 new Person(); 
	메서드 : 리턴값, 매개변수, 프로세스 처리
	class Person{
		private String name; // 필드 
		
		// main()
		// Person P = new Person("홍길동");
		Person(String name){ // 생성자는 필드를 초기화 할때
			this.name = name;
		}
		// p.getName(); 저장된 name 가져온다.
		public String getName(){
			return name;
		}
		// p.setName("마길동"); field의 속성 name을 변경한다.
		// 리턴할 데이터가 없을때는 void 사용
		public void setName(String name){
			this.name = name;
		---------------------------------------------
//1대 다관계
2. 가계부의 입출입 내역을 클래스로 만들고, 입출입 내역과 잔액을 출력하세요
 	Record (날짜, 내용, 구분, 금액)
 		메서드 : write(구분,금액) 구분으로 수입이면 금액을 + 값으로
 			지출이면 금액을 -리턴하여 처리하세요.
 	위 입출입내역 Record를 3개 정도 만들고 현 잔액을 출력하세요.


# this
	1. 현재 클래스 안에 있는 구성요소(필드/생성자/메서드)
	2.생성자나 메서드안에서
		this.필드 : 동일한 이름의 지역변수와 구분.. cf) js 반드시 써야 된다.
	3. this() : 현재클래스에 다른 매개변수로 있는 생성자를 호출할 때..
		cf)상속관계에서는 super() : 상위 클래스의 구성요소(생성자)
	4. this.메서드명() : 상속관계에서 오버라이딩시에 현재 클래스의 메서드와
		상위 클래스의 메서드(super.메서드명)를 구분할 때, 사용된다.

Record (날짜, 내용, 구분, 금액)    */ 
class Record {
	private String date; // 날짜
	//private 는 자주 쓰이기에 쓰임
	private String content; //내용
	private boolean isIconme; // 구분(수입,지출)
	private int money; // 금액
	public  int write(String date, String content, //기능메서드 void->int변경 최종 리턴값은 int변수라...
			boolean isIncome, int money) {
		this.date = date;
		this.content = content;
		this.isIconme = isIncome;
		this.money = money;
		System.out.println("# 입출금 내역 등록#");
		System.out.println("날짜:"+date);
		System.out.println("내용"+content);
		System.out.println("구분:"+(isIncome?"수입":"지출")); //삼항연산자
		System.out.println("금액:"+money);
		return isIncome?money:-money;
		
	}
}
//--------------------------------------------------------------------	
//	public Record(String section, int price) {
//		super();
//		this.section = section;
//		this.price = price;
//	}
//	public String write(String section, int price) {
//		System.out.println("#입력 내역#");
//		System.out.println("구분"+ section);
//		System.out.println("금액"+price);
//		this.section = section;
//		this.price = price;
//		return section;
//	}
//	---------------------------------------------------------
//}
/*	
 3.	Visitor(방문객의 이름, 나이)이 Museum(박물관)에 방문한 내용을 
 	1:1 관계로 처리하세요.
	*/ //super class, field , setter는 기본 vo로 클래스 생성시 기본으로 생성한다.
class Visitor{
	private String name;
	private int age;
	public Visitor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Visitor(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Museum{
		private String name; // 한가지 속성
		private Visitor visitor; // 여러가지 속성(방문객)
		public Museum() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Museum(String name) {
			super();
			this.name = name;
		}//1. 
		public void setVisitor(Visitor visitor) {
			this.visitor = visitor;
			System.out.println(name+" 박물관에 ");
			System.out.println(visitor.getName()+ "방문했습니다.");
		}//2. 기능메서드 사용.
		public void showVisitor() {
			System.out.println(name+"박물관에 방문객 정보");
			if(visitor != null) {
				System.out.println("이름:"+visitor.getName());
				System.out.println("나이:"+visitor.getAge());
			}else {
				System.out.println("방문이 없습니다!!");
			}
		}

}
/*
 4.	BookStore에 서점명 구매도서(Book)을 1:다관계로 구매와 구매내역을
 처리하는 프로그램을 만드세요.
 */
class BookStore{
	private String name;
	private ArrayList<Book01> blist;
	public BookStore(String name) {
		super();
		this.name = name; 
		// 동적 물건 처리 객체 초기화
		blist = new ArrayList<Book01>(); //생성자 초기화
	}
	// 구매할 물건을 전체 저장..
	public void setBlist(ArrayList<Book01> blist) {
		this.blist = blist;
	}
	// 하나하나 구매 목록을 추가 처리..
	public void buyBook(Book01 b) {
		blist.add(b);
	}
	public void showBuyList() {
		System.out.println(name+" 서점에 방문하여 구매한 도서리스트 ");
		//if ( 객체 != null)
		// 생성자에서 동적인 배열 객체인 ArrayList를 생성했기 때문에
		//	메모리 확인보다는 크기를 기준으로 처리하여야 한다.
		if(blist.size()==0) {
			System.out.println("구매 목록이 없습니다.");
		}else {
			System.out.println("번호\t도서명\t저자\t가격\t갯수\t권수\t계");
			int tot=0;
			for(int idx=0;idx<blist.size();idx++) {
				Book01 b1 = blist.get(idx);
				tot+=b1.showBuyInfo(idx);
			}
			System.out.println("총 구매 비용"+tot);
		}
	}
}

class Book01{
	private String title;
	private int price;
	private String writer;
	private int cnt;
	public Book01() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book01(String title, int price, String writer, int cnt) {
		super();
		this.title = title;
		this.price = price;
		this.writer = writer;
		this.cnt = cnt;
	}
	public int showBuyInfo(int idx) {
		System.out.print(idx+1+"\t");
		System.out.print(title+"\t");
		System.out.print(writer+"\t");
		System.out.print(price+"\t");
		System.out.print(cnt+"\t");
		System.out.print(price*cnt+"\n");
		return price*cnt;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getwriter() {
		return writer;
	}
	public void setwriter(String writer) {
		this.writer = writer;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}

/*
 
 5.	Computer(회사명, 기타 객체, add(부품), showInf())객체 안에,
 	Cpu(제조사,사양), Ram(제조사,사양), Hdd(제조사, 사양)을 할당하여
 	showInfo()로 해당 컴퓨터의 부품 내역을 출력하세요.
 	
 	*1단계) Computer 하위에 선언..
 	2단계) ArrayList에 할당해서 처리.
 	*3단계) 다형성설정 클래스 구성 ArrayList<PartComp>
 */


/*
 	
 	
 	
 	
 	
 	
 	
 ------------------------------------------------------------------------	
//메서드1:물건명, 물건가격, 물건갯수를 통해 물건명과 총계를 출력하는 메서드
//메서드2:놀이공원에서 기본금액의 20%할인시 금액 출력 메서드
class Product01{ 
	void seoulLand(int pay) {
		System.out.println("기본금액"+pay);
		System.out.println("20%할인금액:"+(int)(pay-(pay*0.2)));
	}
	private String name;  
	private int price;
	private int cnt;
	public Product01(String name, int price) { // 필드사용 물건명 가격 갯수 ,생성자를 통한 물건의 이름 가격   
		super();
		this.name = name;
		this.price = price;
	}
	public int buy(int cnt) { // 기능메서드 사용 //기능메서드1 : 매개변수로 갯수를 처리
		System.out.println("# 구매한 물건 정보 #");
		System.out.println("물건명:"+name); // 물건명 가격 갯수를 출력
		System.out.println("가격:"+price);
		System.out.println("갯수:"+cnt);
		this.cnt = cnt;
		return price*cnt; // 총계를 리턴하게 처리
		
	}
	
}


*/


