package javaexp.a01_basic;

public class A05_LocalVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 모든 변수는 주괄호 블럭의 계층 구조에 맞게 
사용할 수 있다..(지역변수)
1. 상위 중괄로 블럭에 선언한 변수는 하위에서 사용이 가능하지만
2. 하위에 선언한 변수는 상위에서 사용을 할 수 없다.
3. 지역변수이지만, 전역변수에 할당해서 활용을 할 수는 있다.
		 */

	}

}
//지역변수 전역변수 개념. 줄괄호 계층구조
//말그대로 전체에서 어디서든 호출하면 사용할수 있는 변수는 전역변수

//특정한 구역({ })안에 생성되어 그 지역에만 사용할수 있는 변수는 지역변수라고 생각하면 된다.

 


class Person{ // 전역변수 : 제일 상위 계층 이라 하위 사용 가능
	String name;   // 전역변수(객체변수) : 같은클래스에서 호출이 가능
	Person(){
		System.out.println(name);
		String name01="안녕";
		System.out.println(name01);
//		System.out.println(kind);(X)
	}
	void call(String kind) { //지역변수
		 //지역변수 { }안에 생성되며 { }를 벗어나면
		//method() 라는 메소드가 끝나는 시점에 바로 삭제
		
		// 매개변수도 해당 {}의 지역변수로 포함되어
		// 계층구조에서만 사용할 수 있다. 
		
		//  하위에 선언한 변수는 상위에서 사용을 할 수 없다.
		//		System.out.println(name01); (X)
		name = kind; // 지역변수를 전역변수에 할당하여 전역변수에
		// 지역변수에 데이터를 사용할 수 있다.
		if(true) {
			int age =25;
			for(;;){
				age=30;
				if(true) {
					// 계층 구조상 상위에 선언한 데이터는 
					// 하위에서 활용할 수 있다.
					System.out.println(age);
					System.out.println(name);
				}
			}
		}
//		System.out.println(age); 
		// if 중괄호 안에 지역변수를 다른 블럭에서 사용하지 못한다.
		
	}
}