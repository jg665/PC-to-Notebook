package javaexp.a09_api;

import java.util.Calendar;

public class A07_Calendar {
	// 백업한 파일 불러오기
	// workspace 속 javaexp 폴더 복사 후 새롭게 넣고싶은 javaexp 폴더에다가 붙여넣기
	// import ==> Excisting 어쩌구 ==> 백업해둔 javaexp 폴더 ==> 카피 ==> finish (이후 정렬방식과 언어도 변경 진행해야함)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 날짜데이터 처리 클래스 Calendar (시간 + 날짜 + 위치)
1. 기본적으로 데이터의 처리방식이 (시간 ==> 일 ==> 주 ==> 월 ==> 년) 단위로 처리되는 객체를 생성하고 활용할 수 있게 처리해준다.

2. Calendar 객체의 생성 .getInstance()
			*	*/
		//1. 캘린더 객체 생성
		//	 클래스명.필드 : static 필드
		//	 Calendar.SECOND
		//	 클래스명.대문자 : final이라는 필드에 붙으면 상수(변경되지 않는 수, 고정값)
		//	 클래스명.메서드 : static 메서드
		//	 static 객체변수가 아닌 객체 공유 메모리 영역(클래스에 소속된 변수/메서드)
		Calendar cal = Calendar.getInstance(); // 객체의 static 변수로, new 어쩌고 안씀
		System.out.println("생성된 객체: "+cal);
		// 1) 캘린더 객체는 위치(경도)에 따르고 여러가지 날짜처리 규칙을 가지고 있다.
		// 2) 캘린더는 고유의 상수값으로 년/월/일을 구할 수 있다.
		//	  Calendar.상수 : 객체생성없이 사용하는 static이고 상수인 대문자를 가지고 있다.
		//	  Calendar.YEAR : static final 클래스 상수
		
		System.out.println("연도의 상수 "+Calendar.YEAR); // static 필드
		System.out.println("월의 상수 "+Calendar.MONTH);	
		System.out.println("일의 상수 "+Calendar.DAY_OF_MONTH);
		System.out.println("요일의 상수 "+Calendar.SECOND);
		System.out.println("시의 상수 "+Calendar.HOUR_OF_DAY);	
		System.out.println("분의 상수 "+Calendar.MINUTE);	
		System.out.println("초의 상수 "+Calendar.SECOND);	 // 여기서는 출력시 고유 상수값이 나오지만, 아래의 get을 통하면 날짜/시간이 출력된다.
	
		// 3) 위에 선언된 고유의 상수값을 기준으로 현재 시간 구하기
		int year = cal.get(Calendar.YEAR);
		// 외국애들은 월별 고유명사가 있기 때문에 우리나라와 체계가 다르다. 0~11까지 index로 맵핑되어있다.
		// 그래서 월 캘린더는 +1로 우리나라의 1~12월과 연결 처리 필요하다.
		int month = cal.get(Calendar.MONTH)+1; 
		int date = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"년 "+month+"월 "+date+"일");
		
		// 요일도 0~6으로 index 맵핑되어있다. 일요일부터 문자열 맵핑 후 -1로 진행해야한다.
		int weekidx = cal.get(Calendar.DAY_OF_WEEK)-1;
		String[] days = {"일","월","화","수","목","금","토"};
		System.out.println("현재 요일: "+days[weekidx]);

		
		// Calendar.
		// 하면 여러가지 캘린더의 옵션을 확인 가능하다. (바로 안나오면 컨트롤+스페이스 = 자동 코드 generator)
		
		// ex) 위에서 처리하는 상수와 처리되는 기준으로 현재 int hour, minute, second를 할당하여 출력하세요.
		//	   @@시@@분@@초
		int hour = cal.get(Calendar.HOUR_OF_DAY); // 0~23
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(hour+"시 "+minute+"분 "+second+"초 ");
		
		// 특정 날짜/시간 설정
		Calendar cal2 = Calendar.getInstance();
		// 월은 0~11의 index범위로 설정하여 저장되어있다.
		cal2.set(2021, 9, 5); // 2021.10.5	
		int year2 = cal2.get(Calendar.YEAR);
		// cal2.get("년도"); : 문자열 통해 조건을 처리하면 메모리 비효율!
		// cal2.get(Calendar.YEAR); : 상수(1~3)을 통해서 조건
		// 최소 단위로 원하는 데이터를 처리, 메모리 효율적으로 사용
		int month2 = cal2.get(Calendar.MONTH)+1; 
		int date2 = cal2.get(Calendar.DAY_OF_MONTH);
		System.out.println(year2+"년 "+month2+"월 "+date2+"일"); // 2021년
		
		// ex3) cal3를 만들고 자신의 생년월일을 설정하고, 다시 출력하세요.
		Calendar cal3 = Calendar.getInstance();
		cal3.set(1997, 4, 25); // 1997. 5. 25
		// cals.set(매개변수의 갯수와 유형) : 매개변수의 갯수와 유형에 따라 여러가지 데이터를 저장할 수 있다.
		int year3 = cal3.get(Calendar.YEAR);
		int month3 = cal3.get(Calendar.MONTH)+1;
		int date3 = cal3.get(Calendar.DAY_OF_MONTH);
		System.out.println(year3+"년 "+month3+"월 "+date3+"일"); // 2021년
	
	}

}
