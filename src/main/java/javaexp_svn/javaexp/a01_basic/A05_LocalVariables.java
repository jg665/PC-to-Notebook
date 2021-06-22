package javaexp_svn.javaexp.a01_basic;

public class A05_LocalVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 모든 변수는 중괄호 블럭의 계층 구조에 맞게 사용할 수 있다. (지역변수)
1. 상위 중괄호 블럭에 선언한 변수는 하위에서 사용이 가능하지만
2. 하위 중괄호 블럭에 선언한 변수는 상위에서 사용이 불가능하다.
3. 지역변수이지만 전역변수에 할당해서 활용을 할 수는 있다.
				
				*/
	}

}
class Person{
	String name; // 선언
	Person(){
		System.out.println(name); // 사용가능
		String num01 = "안녕"; // 선언
		System.out.println(num01); // 사용가능
	}
				//매개변수
	void call(String kind) {
	// 매개변수도 해당 {}에서 지역변수로 포함되어
	// 계층구조에서만 사용할 수 있다.
	//	System.out.println(num01); // 사용불가 - Person 블럭에 생성된 지역변수이기 때문.
		name = kind; // 지역변수를 전역변수에 할당하여 전역변수로 지역변수 데이터를 사용할 수 있다.
		if(true) {
			int age = 25; // 선언
			
			for(;;) {
				age=30;
				if(true) {
					// 계층 구조상 상위에 선언된 데이터는 하위에서 사용이 가능하다.
					System.out.println(age); // 사용가능
					System.out.println(name); // 사용가능 
				}
			}
		}
	}
	
	
}