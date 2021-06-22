package javaexp.a00_exp;

import javaexp.z01_vo.Student;

public class A06_0510 {

	/*
#오늘 정리문제
1. Math.random()을 이용하여 다양한 임의의 경우를 추출하고자 한다. 기본형식을 정리하고, 사원번호 1000~1020번까지 임의로 청팀/홍팀을 배정하여
   아래와 같이 출력하세요. for문 활용
   1000		청팀
   1001		청팀
   1002		홍팀
   1) 1단계		1000	0
   				1001	0
   				1002	1
	
	- 기본 형식 : (int)(Math.random()*경우의 수+시작수)
	 
	 	String teams[] = {"청팀", "홍팀"};
		for(int cnt=0;cnt<=2;cnt++) {
			System.out.println((int)(Math.random()*21+1000)+"\t"+teams[(int)(Math.random()*2)]);
		}
		
	답) String[] tname = {"청팀", "홍팀"};
		System.out.println("사원번호\t팀");
		for(int empno=1000;empno<=1020;empno++) {
			//tname.length : 배열의 갯수를 경우의 수로 사용하면 배열에 있는 index를 임의로 가져와서 처리된다.
			int tIdx = (int)(Math.random()*tname.length);
			System.out.println(empno+"\t");
			System.out.println(tname[tIdx]);
			}
	
	// 순서대로 나와야하는 번호인지, 랜덤인지 정확하게 파악하고 문제 풀기!
	// 이 문제는 사원번호는 순서대로, 팀이름은 랜덤
	
	
	
2. 반학생 1~30번의 점수를 0~100까지 임의로 나오게 하고, 평균점수를 정수로 출력하세요
	
		int score[] = new int [101];
		
		System.out.println("번호\t점수");
		for(int cnt=0;cnt<=100;cnt++) {
			score [cnt] = (int)(Math.random()*101+1);
			System.out.println((int)(Math.random()*30)+"\t"+score[cnt]);
		}
		int sum = 0;
		for(int cnt=0;cnt<=30;cnt++) {
			sum += score[cnt];
		}
		
		System.out.println("평균점수: "+(sum/30));
		
	답)
		System.out.println("번호\t점수");
		int tot=0;
		for(int no=1;no<=30;no++) {
		// 0~100까지의 경우의 수 = 101가지
			int point = (int)(Math.random()*101);
			System.out.println(no+"\t"+point);
			tot = tot+point; // 누적 처리
		//	tot += point; 같은 연산, 더 간단한 처리
		}
		System.out.println("총계:"+tot);
		System.out.println("평균:"+(tot/30));
		
	// 알고리즘 ) 최고 / 최저 / 평균
	 * hint int max = 0; int min = 0;
	 		if(max<point) max = point;
	 		if(min>point) min = point;
		

3. Calendar 객체의 생성의 기본 형식과 주요 상수를 정리하고, 오늘과 이번달 임의의 날짜와의 차이를 출력하세요.
		
	- 기본형식 : Calendar cal = Calendar.getInstance(); // 객체 생성
	- 주요 상수 :
		연도의 상수 = Calendar.YEAR
		월의 상수 = Calendar.MONTH
		일의 상수 = Calendar.DAY_OF_MONTH
		요일의 상수 = Calendar.DAY_OF_WEEK
		시의 상수 = Calendar.HOUR_OF_DAY	
		분의 상수 = Calendar.MINUTE
		초의 상수 = Calendar.SECOND
		
	- 각 데이터는 cal.get(상수); 로 가져온다
		
		Calendar cal = Calendar.getInstance();
		cal.set(5, 31);
		int month1 = cal.get(Calendar.MONTH)+1; 
		int date1 = cal.get(Calendar.DAY_OF_MONTH);
		Calendar cal2 = Calendar.getInstance();
		int month2 = cal2.get(Calendar.MONTH)+1; 
		int date2 = cal2.get(Calendar.DAY_OF_MONTH);
		System.out.println("임의의 날짜 "+month1+"월 "+date1+"일과 "+"오늘 "+month2+"월 "+date2+"일의 차이 :"+(date1-date2)%31);
		
	답)  // 오늘 날짜
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; 
		int date = today.get(Calendar.DAY_OF_MONTH);
		System.out.println("#오늘 정보#");
		System.out.println(year+"/"+month+"/"+date);
		
		// 설정할 날짜
		Calendar ranCal = Calendar.getInstance();
		int year1 = ranCal.get(Calendar.YEAR);
		int month1 = ranCal.get(Calendar.MONTH)+1; 
		// 임의의 날짜 설정
		 
		int randate = (int)(Math.random()*31+1);
		// 캘린더참조변수.set(변경할상수, 변경할데이터);
		ranCal.set(Calendar.DAY_OF_MONTH, ranDate);
		int date = ranCal.get(Calendar.MONTH)+1; 
		System.out.println(year1+"/"+month1+"/"+date1);
		System.out.println("오늘과 차이:"+(date1-date)+"일");
		
		
4. enum 상수의 주요 속성을 기술하고, cards의 종류 4가지(하트, 스페이스, 클로버, 다이아몬드)를 설정하여, 4가지 카드 중 임의로 선택, 출력하세요.

	- 상수를 효과적으로 열거형으로 사용할때 쓰이는 데이터 유형으로, public enum 변수명{사용할상수1, 상수2, 상수3..}으로 선언하고 아래의 메서드/속성으로 처리한다.
	
	.values() : 배열로 상수 전체를 가져온다
	.name() : 저장된 enum의 값
	.ordinal() : 저장된 enum의 index값(0~)
	
	
	public enum Cards {하트, 스페이드, 클로버, 다이아몬드};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int card = (int)(Math.random()*4);
		Cards[] cd = Cards.values();
		System.out.println("#임의의 카드#");
		System.out.println(cd[card]);

		
	}
	

5. 객체형 배열의 생성 기본 형식을 기술하고, Student객체에 이름 국어 영어 수학 속성을 설정하여 3명의 총점과 평균을 forEach 구문을 통해서 출력하세요.
	
	- 기본 형식 : Student [] aObject = {new Student(), 데이터2, 데이터3...}
		
		Student[] stObject = {
				new Student("김김김", 80, 90, 70),
				new Student("이이이", 20, 50, 30),
				new Student("박박박", 60, 100, 90),
		};
		int sum = 0;
		System.out.println("이름\t국어\t영어\t수학");
		for(Student s:stObject) {
			System.out.println(s.getName()+"\t"+s.getKor()+"\t"+s.getEng()+"\t"+s.getMath());
			sum += (s.getKor()+s.getEng()+s.getMath());
		}
		System.out.println("총점: "+sum);
		System.out.println("평균: "+(sum/9));
	
	답)
		Student[] studs = Student[3]; // 빈껍데기
		String names[] = {"홍길동", "김길동", "신길동"}; // 객체 생성중
		System.out.println("이름\t국어\t영어\t수학\t총점\평균");
		
		for(int idx=0;idx<studs.length;idx++) { // 객체 생성 중
			int kor = (int)(Math.random()*101);
			int eng = (int)(Math.random()*101);
			int math = (int)(Math.random()*101);
			// 배열의 데이터에 객체를 생성하고, 데이터를 입력하면서 처리
			studs[idx] = new Student(names[idx],kor,eng,math); // 이거 이해해보자,,
			System.out.print(studs[idx].getName()+"\t");
			System.out.print(studs[idx].getKor()+"\t");
			System.out.print(studs[idx].getEng()+"\t");
			System.out.print(studs[idx].getMath()+"\t");
			int sum = studs[idx].getKor()+studs[idx].getEng()+studs[idx].getMath();
			System.out.print(sum+"\t");
			System.out.print(sum/3.0+"\n"); // 
		}
	
	 * */

	
	public enum Cards {하트, 스페이드, 클로버, 다이아몬드}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		Student[] studs = new Student[3]; // 빈껍데기
		String names[] = {"홍길동", "김길동", "신길동"}; // 객체 생성중
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		for(int idx=0;idx<studs.length;idx++) { // 객체 생성 중
			int kor = (int)(Math.random()*101);
			int eng = (int)(Math.random()*101);
			int math = (int)(Math.random()*101);
			// 배열의 데이터에 객체를 생성하고, 데이터를 입력하면서 처리
/			studs[idx] = new Student(names[idx],kor,eng,math);
			System.out.print(studs[idx].getName()+"\t");
			System.out.print(studs[idx].getKor()+"\t");
			System.out.print(studs[idx].getEng()+"\t");
			System.out.print(studs[idx].getMath()+"\t");
			int sum = studs[idx].getKor()+studs[idx].getEng()+studs[idx].getMath();
			System.out.print(sum+"\t");
			System.out.print(sum/3.0+"\n");
		}*/
	}

}
