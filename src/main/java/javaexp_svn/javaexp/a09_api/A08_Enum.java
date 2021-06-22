package javaexp.a09_api;

import java.util.Calendar;

public class A08_Enum {

	public enum Colors{RED, BLACK, TELLOW, BLUE};
	public enum Flowers{LILY, ROSE, KARA};
	// 실제 문자열 데이터가 아니라, 단일 상수(숫자)로 저장되어있는 데이터
	// 캘린더와 같이 메모리를 효율적으로 사용

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 상수를 효과적으로 열거형으로 사용할때 쓰이는 데이터 유형 enum(열거형 상수)
// 나열한 데이터를 효과적으로 사용!
1. 선언
	public enum enum변수명{사용할상수1, 상수2, 상수3..}
2. 열거형 상수의 속성/메서드
	.values() : 배열로 상수 전체를 가져온다
	.name() : 이름
	.ordinal() : enum의 포함되어 있는 순서 index값
				*/

		Colors color = Colors.BLACK;
		System.out.println(color);
		Colors[] cs = Colors.values();
		// for(단위 객체 : 배열형데이터) - foreach 구문
		for(Colors x:cs) {
			System.out.println(x.name()+"\t"+x.ordinal());
		}
		
		// ex) Flowers 상수로 꽃이름 영문으로 3가지 설정하고, 반복문을 통해서 출력 처리하세요
		
		Flowers[] fs = Flowers.values();
		for(Flowers y:fs) {
			System.out.println(y.ordinal()+1+"번째 꽃 "+y.name());
		}
		
	
	
	}

}
