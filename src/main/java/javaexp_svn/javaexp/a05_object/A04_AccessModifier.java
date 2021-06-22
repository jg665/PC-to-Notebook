package javaexp.a05_object;

import javaexp.a05_object.Z01_Person;

public class A04_AccessModifier {
/*
# 접근제어자
1. 자바의 모든 구성요소는 적절한 접근 제어자에 의해서 데이터를 할당할 수 있어야
   객체가 정상적인 작동이 가능하다. 
2. 객체간에 비정상적인 데이터 할당으로 메모리나 동작에 오류가 발생할 수 있다.
3. 자바에서의 접근제어자의 종류와 범위
	1) private : 외부 클래스에서 직접적인 접근을 하지 못하게 하는 것 / 객체 내부에서만 사용하게 한다.
	2) (default) - 접근제어자가 붙지 않은 것 : 상단에 선언한 동일한 패키지 내에서만 접근하여 사용하게 한다.
				ex) package javaexp.a05_object;
	3) protected : 상속관계에 있다면(전제조건), 패키지가 다르더라도 접근이 가능하다.
	4) public : 패키지가 다르더라도 접근이 가능하다.
	- 선녀와 나무꾼 예시를 생각하며 정리 가능
 * */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z01_Person p01 = new Z01_Person();
//		System.out.println(p01.name);
//		접근제어자가 private는 외부 클래스에서 호출해서 사용할 수 없다.
		
		// 상단에 선언한 패키지명이 같기 때문에 접근이 가능하다.
		System.out.println(p01.address);
		// 상속관계가 없지만 같은 패키지이기에 접근이 가능하다.
		System.out.println(p01.inherit);
		// public이기 때문에 접근이 가능하다.
		System.out.println(p01.announce);
	}
	
		

}
