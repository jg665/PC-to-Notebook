package javaexp.a00_exp.a05;

import java.util.Calendar;

public class A06_0510 {
	public enum Cards{HEART,SPACE,CLOVER,DIAMOND};

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
/*
# 오늘 정리문제 : 내일 오전 풀이

1. Math.random()을 이용하여 다양한 임의의 경우를 추출하고자 한다. (40%)
	기본형식을 정리하고, 사원번호 1000~1020번까지 임의로 청팀/홍팀을
	배정하여 아래와 같이 출력하세요. for문 활용
	1000 청팈
	1001 청팀
	1002 홍팀
	1) 1단계 1000 0
			1001 0
			1002 1
	
	0.0 <= Math.random() <1.0
	1000 <= Math.random() <1021
	*/
		//(int)(Math.random()*경우의수+시작);
		//(int)(Math.random()*경우의수) : 배열의 데이터와 연결된 내용을;
		//	호출하는 경우, 배열의 갯수를 경우의 수로 설정한다.
		String [] tname = {"청팀","홍팀"};
		System.out.println("사원번호\t팀");
	for(int empno=1000;empno<=1020;empno++) {
			//tname.length : 배열의 갯수를 경우수로 사용하면
			// 배열에 있는 index를 임의로 가져와서 처리된다.
		int tidx = (int)(Math.random()*tname.length);//경우의수
		System.out.print(empno+"\t");
		System.out.println(tname[tidx]);//""실행 후 tidx입력
	}
		
		
	/*
//		for(int cnt=1000;cnt<1021;cnt++) {
//		}
//		System.out.println("1~10 임의의 수 :"+
//				(int)(Math.random()*1020+1));
//	int team01 = (int)(Math.random()*1021);	
//	int team02 = (int)(Math.random()*1021);	
//	String []games= {"청팀,홍팀"};
//	System.out.println("팀1\t팀2");
//	System.out.println(game(team01)+"\t"+game(team02));
//	}
//	static String game(int idx) {
//		String result="";
//		if(idx==0) result="청팀";
//		if(idx==1) result="홍팀";
//		return result;
		
		
		/*
			
			
2. 반학생 1~30번의 점수를 0~100까지 임의로 나오게 하고, 평균점수를
	정수로 출력하세요
	알고리즘) 최고/최저/평균
	hint int max=0; int min=0;
		if(max<point) max = point;
		if(min>point) min = point;
	*/
	System.out.println("번호\t점수");
	int tot=0;
	for(int no=1;no<=30;no++) {
		// 0~100까지는 경우의 수가 101까지
		int point = (int)(Math.random()*101);
		System.out.println(no+"\t"+point);
//		tot = tot+point; // 누적처리
		tot += point; // 누적처리
	}
	System.out.println("총계:"+tot);
	System.out.println("평균:"+(tot/30)); //
	
	
	
	
	
//		for(int cnt=0;cnt<2;cnt++);{
//			System.out.println("0~100 임의의 수 :"+
//					(int)(Math.random()*1+1));
//		}
		
		/*
	
3. Calendar 객체의 생성의 기본 형식과 주요 상수를 정리하고,(70%)
	오늘과 이번달 임의의 날짜와의 차이를 출력하세요
	Calendar.getInstance()
	
	*/
	// 객체 생성 : Calendar.getInstance
	// 연도 : Calendar.YEAR
	// 월 : Calendar.MONTH
	// 일 : Calendar.DAY_OF_MONTH
	// 요일 :  Calendar.DAY_OF_WEEK
	// 시 : Calendar.HOUR_OF_DAY
	// 분 : Calendar.MINUTE
	// 초 : Calendar.SECOND
	//각 데이터는 cal.get(상수);
		Calendar today = Calendar.getInstance();//객체생성
		int year = today.get(Calendar.YEAR); // 연도
		int month = today.get(Calendar.MONTH)+1; // 월
		int date = today.get(Calendar.DAY_OF_MONTH);
		System.out.println("# 오늘 정보 #");
		System.out.println(year+"년"+month+"월"+date+"일");
		Calendar ranCal = Calendar.getInstance();
		int year1 = ranCal.get(Calendar.YEAR); // 연도
		int month1 = ranCal.get(Calendar.MONTH)+1; // 월
		//임의의 날짜 설정
		int ranDate = (int)(Math.random()*31+1);
		// 캘린더참조.set(변경할상수,변경할데이터)
		ranCal.set(Calendar.DAY_OF_MONTH, ranDate);
		int date1 = ranCal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year1+"/"+month1+"/"+date1);
		System.out.println("오늘과 차이:"+(date1-date)+"일");
	/*
	
	
4. enum 상수의 주요 속성을 기술하고, cards의 종류4가지 (50%)
(하트,스페이스,크로바,다이아몬드)를 설정하여, 4가지 카드중 임의로 선택하여, 출력하세요.
	.values() : 배열로 enum의 상수를 가져온다.
	.name() : 저장된 enum의 값
	.ordinal() : 저장된 enum의 index(0~~)순서
# 상수를 효과적을 열거형으로 사용
.	
public enum 변수명{사용할상수1,상수2,상수3..}
*/	
		int cIdx = (int)(Math.random()*4); //4가지 카드
		Cards[] cards = Cards.values();
		System.out.println("#임의의 카드#");
		System.out.println(cards[cIdx]);
				
	}
}
		
		/*



5. 객체형 배열의 생성 기본 형식을 기술하고, Student객체에 (20%)
이름 국어 영어 수학 속성을 설정하여 3명의 총점과 평균을 forEach구문을 통해서 출력하세요.
forEach구문 (단위객체:객체형배열) 단위객체.속성메서드()

1. 배열은 단위 데이터를 묶어서 모아 놓은 데이터 이다.
	int nums[] = {10,15,20};
2. 객체가 모여서, 배열을 이룰 수 있다.
	Person[] parry = {new Person(), 
					  new Person(),
					  new Person() };
					  
					  
 * 
 */
//	Student[] studs = new Student[3];
//	String names[] = {"홍길동", "김길동","신길동"};
//	System.out.println("이름\t국어\t영어\t수학\t총점\t평균")
//	for(int idx=0;idx<studs.length;idx++) {
//		int kor = (int)(Math.random()*101);
//		int eng = (int)(Math.random()*101);
//		int math = (int)(Math.random()*101);
//		// 배열의 데이터에 객체를 생성하고, 데이터를 입력하면서 처리.
//		studs[idx] = new Student(names[idx],kor,eng,math);
//		System.out.print(studs[idx].getName()+"\t");
//		System.out.print(studs[idx].getKor()+"\t");
//		System.out.print(studs[idx].getEng()+"\t");
//		System.out.print(studs[idx].getMath()+"\t");
//		int sum = studs[idx].getKor()+studs[idx].getEng()
//				+studs[idx].getMath()
//		System.out.print(sum+"\t");
//		System.out.print(sum/3.0+"\t");
//	
//	}
//			
//	
//}	
//}
//	class Student{
//		private Srting name;
//		private int kor;
//		private int math;
//		private int eng;
//		public Student() {
//			super();
//			// TODO Auto-generated constructor stub
//		}
//		public Student(Srting name, int kor, int math, int eng) {
//			super();
//			this.name = name;
//			this.kor = kor;
//			this.math = math;
//			this.eng = eng;
//		}
//		public Srting getName() {
//			return name;
//		}
//		public void setName(Srting name) {
//			this.name = name;
//		}
//			
//	}

