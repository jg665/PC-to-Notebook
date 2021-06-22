package javaexp.a09_api;

public class A01_String {
	/*
# String
1. 문자열을 처리하는 객체
2. 선언 방식
	String 변수명 = "문자열 데이터";
	String 변수명 = new String("문자열 데이터");
3. 객체이기 때문에 heap 메모리 주소에 할당
	1) 첫번째 방식은 문자열만 같으면 같은 주소에 할당이 된다.
		String name1 = "홍길동";	
		String name2 = "홍길동";	
		String name3 = "홍길동";	
		"홍길동"이라는 문자열은 heap영역에 동일한 주소를 참조하여 설정된다.
		직접 코딩을 해야만 할당이 되어 사용가능하다.
		name1 == name2는 동일한 주소값이기 때문에 동일한 true로 처리가 된다.
		
		일반적이지 않은 방식!!
		
	2) 두번째 방식은 문자열이 각각 다른 주소를 만들어 문자열의 데이터를 가지고 온다.
		String name4 = new String("홍길동");
		String name5 = new String("홍길동");
		String name6 = new String("홍길동");
		name4 == name5 이지만 다른 주소를 가지고 있기에 주소값이 다르므로 false 처리된다.
		
		일반적으로 DB에서 불러오거나, network를 통해서 가져오거나,
		파일을 통해서 가져오는 데이터는 모두 다 내부적으로 2번째 방식으로 가져온다.
		
	* */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "홍길동";	
		String name2 = "홍길동";	
		
		String name4 = new String("홍길동");
		String name5 = new String("홍길동");
		
		System.out.println(name1 == name2); // true
		System.out.println(name4 == name5); // false
		
		// 문자열만 비교해서 데이터를 처리할 때는 == 와 같은 stack영역의
		// 데이터 비교방식은 문제가 발생한다.
		// 자바에서 문자열의 데이터를 비교할 때는 stack영역의 주소값이 아닌
		// 문자열 자체를 비교해주는 .equals()메서드를 활용하여야 한다.
		
		System.out.println(name4.equals(name5)); // true
		
		// Run As >> Run configurations >> Program Argumaent
		// java A01_String 홍길동 홍길동
		String name6 = args[0];
		String name7 = args[1];
		System.out.println(name6 == name7); // flase
		System.out.println(name6.equals(name7)); // true
		
	}
}