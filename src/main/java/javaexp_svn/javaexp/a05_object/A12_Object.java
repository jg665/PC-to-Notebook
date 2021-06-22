package javaexp.a05_object;

public class A12_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
1. 클래스 구성요소 통합
		1) 필드 : 
		2) 생성자 :
		3) 메서드 :
			
		2. 연습예재
		1) 물건 클래스를 선언하되 사용되는 필드는 물건명 가격 갯수
생성자를 통해서 초기화(물건명 가격)처리
기능메서드1 : 매개변수로 갯수를 처리하여, 물건명 가격 갯수를 출력하고
총계를 리턴하게 처리!
		int tot = 0;
		Product01 p1 = new Product01("사과", 3000);
		tot+=p1.buy(5);
		Product01 p2 = new Product01("바나나", 4000);
		tot+=p2.buy(2);
		Product01 p3 = new Product01("딸기", 12000);
		tot+=p2.buy(3);
		
		System.out.println("총계: "+tot);
		
		

ex) Schedule 필드 : 계획내용, 계획된 시간
	생성자를 통해서 필드값 초기화
 	메서드 통헤서 실제실행시간 execute(시간) 리턴값으로 계획 실행의 차
 	일정계획 3개와 실행된 내용에 대하여 전체 계획대비 실행 차이를 툴력하세요
		 * */
		int diff = 0;
		Schedule s1 = new Schedule("요구사항정의서 취합", 4);
		diff+=s1.execute(3);
		Schedule s2 = new Schedule("java 모듈 코드짜기", 8);
		diff+=s2.execute(8);
		Schedule s3 = new Schedule("코드리뷰하기", 3);
		diff+=s3.execute(2);
		
		System.out.println("총 오차시간: "+diff);
		
		/*
2) 쇼핑몰 클래스를 선언하고
- 기능 내용 : 로그인(아이디, 패스워드)
-			물건구매(물건명, 갯수)
-			상품리스트보기() : 쇼핑몰에 상품리스트 보기 ArrayList<Product>
-			물건상세보기() : 상품중에 특정한 상품을 보기 Product
				*/

		
	}
}
class Schedule{
	private String plan;
	private int time;
	private int realtime;
	public Schedule(String plan, int time) {
		super();
		this.plan = plan;
		this.time = time;
	}
	public int execute(int realtime) {
		System.out.println("계획 내용: "+plan);
		System.out.println("계획 시간: "+time+"시간");
		System.out.println("실제 소요시간: "+realtime);
		this.realtime=realtime;
		return time-realtime;
	}
	
}

class Product01{
	private String name;
	private int price;
	private int cnt;
	public Product01(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public int buy(int cnt) {
		System.out.println("# 구매한 물건 #");
		System.out.println("물건명: "+name);
		System.out.println("가격: "+price);
		System.out.println("갯수: "+cnt);
		this.cnt=cnt;
		return price*cnt;
	}
}