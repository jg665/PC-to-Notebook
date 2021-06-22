package javaexp.a02_var_type;

import javaexp.a05_object.vo.Person;

public class A01_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		javaexp.a05_object.vo.Person
//		Person p = new Person();
		
		
		/*
 자바의 변수선언 
 0. 변수 : 하나의 값을 저장하기 위한 공간 (변경O) 
 1) 상수 : 한번만 값을 저장 가능한 변수 (변경X) 
 2) 리터럴 : 그 자체로 값을 의미 하는것 
 	ex) int score(변수) = 100(리터럴); 
 	score = 200; 
 	final MAX(상수) = 100; //MAX 는 상수 final MAX = 200; // 에러
 
1. 데이터유형 변수명; int(변수타입) num01(변수이름); 
//정수(int)타입의 변수 num01를 선언 정수형으로 num01을
선언한다.
2. 데이터할당. num01 = 25; 25라는 실제 데이터를 할당. 
3. 호출과 활용 System.out.println(num01); int num02 = num01 + 30;
		 */
		int num01;
		num01 = 25;
		System.out.println(num01);
		// num01에 있는 데이터 출력..

		// ex) num02 숫자 1000을 할당하고, 출력하세요..
		int num02;
		num02 = 1000;
		System.out.println(num02);
		// 위에 저장된 데이터 num01과 num02를 합산해서 num03에 할당 처리.
		int num03 = num01 + num02;
		// # 출력 유형
		// 1)"문자열 " + 변수
		// 2)변수 + "문자열"
		// 3)"문자열" + 변수 + "문자열"
		System.out.println("num01 + num02 = " + num03);
		// sysout + ctrl + space ==> System.out.println("");
		System.out.println(num01 + " + " + num02 + " = " + num03);

		// ex) 사과의 갯수 5, 바나나의 갯수 3, 총계 8을 변수를 이용해서
		// 출력하세요 .. ~ 14:20
		int appleCnt = 5;
		int banaCnt = 3;
		int tot = appleCnt + banaCnt;
		System.out.println("사과의 갯수" + appleCnt + ", 바나나의 갯수" + banaCnt + ", 총계 " + tot);

		/*
		 * # 문자열 데이터 처리 문자열은 객체형이기 때문에 type의 선언을 대문자로 시작한다. String 변수; 변수 = " 할당데이터";
		 */

		String name1 = "홍길동";
		String location = "서울 신림동";
		System.out.println("이름:" + name1);
		System.out.println("사는곳:" + location);

		// ex) 좋아하는 영화제목 movie, movie2, movie3를 선언하고,
		// 영화 Rank1 : @@@;
		// 영화 Rank2 : @@@;
		// 영화 Rank3 : @@@; 형식으로 출력하세요..

		String movie1 = "신세계";
		String movie2 = "로건";
		String movie3 = "쿵푸팬더";
		// ctrl+alt+화살표아래 : 줄복사
		System.out.println("영화 Rank1 : " + movie2);
		System.out.println("영화 Rank2 : " + movie1);
		System.out.println("영화 Rank3 : " + movie3);
		/*
		 * 기타 데이터 유형 : byte, short, int, long (정수형) float, double (실수형) boolean (논리형)
		 * 형변환 : 데이터 유형의 변환 처리..
		 * 
		 * 
		 */

	}

}
