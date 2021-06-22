package javaexp.a05_object;

public class A05_AccessModifier {

	public static void main(String[] args) {
		Z01_Person p01 = new Z01_Person();
//		System.out.println(p01.name);
//		접근제어자가 private는 외부 클래스에서 호출해서 사용할 수 없다.
		
//		상단에 선언한 패키지명과 다르기 때문에 접근이 불가하다.
//		System.out.println(p01.address);
//		상속관계가 없기 때문에 접근이 불가하다.
//		System.out.println(p01.inherit);
		// public이기 때문에 접근이 가능하다.
		System.out.println(p01.announce);
	}
}