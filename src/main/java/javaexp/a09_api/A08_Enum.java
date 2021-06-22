package javaexp.a09_api;

public class A08_Enum {
/* 나열된 데이터를 반복,조건,등등 사용가능
# 상수를 효과적으로 열거형으로 사용할 때,
쓰이는 데이터 유형 enum이라는 열거형 상수 이다.
1. 선언
 	public enum enum의이름명{사용할상수1,상수2,상수3..}
2. 열거형 상수의 속성/메서드
	.values() : 배열로 상수전체를 가져온다.
	.name() : 이름
	.ordinal() : enum의 포함되어 있는 순서 index값.
 */
	public enum Colors{RED, BLACK, YELLOW, BLUE}; //실제론 문자열이 아니고 숫자가 들어감
	public enum Flowers{ROSE, LILY, TULIP}; // 메모리 효율을 위해 사용.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 호출 및 활용..
		Colors color = Colors.BLACK;
		System.out.println(color);
		Colors[] cs = Colors.values();
		// for(단위 객체 : 배열형데이터)
		for(Colors x:cs) {		//속성값		//인덱스값
			System.out.println(x.name()+"\t"+x.ordinal());
		} // ordinal 단순한 변수형 데이터 들어가가 됨. heap영역 쓸때 메모리 커서 
		
		Flowers []flos = Flowers.values();
		for(Flowers f1:flos) {
			System.out.println(f1.ordinal()+1+"번재 꽃"+f1.name());
		

	}
}
}
// ex) Flowers 상수로 꽃이름 영문으로 3가지 설정하고, 
//		반복문을 통해서 출력 처리하세요..
