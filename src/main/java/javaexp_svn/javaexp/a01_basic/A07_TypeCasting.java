package javaexp.a01_basic;

import java.util.ArrayList;

public class A07_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 데이터 유형의 변환
1. 기본데이터 유형
	작은 데이터 유형 ==> 큰 데이터 - 자동형변환(promote)
	큰 데이터 유형 ==> 작은 데이터 (casting)
2. 상속관계에서 하위 ==> 상위 - 다형성(promote)
			 상위 ==> 하위객체로 사용될 때. (casting) ==> generic
			 
# generic
1. 상위 객체로 할당할 떄, 상위 객체에서 하위 특정한 유형지정하며 다시 하위에서 사용할때,
   casting 없이 처리하는 것을 말한다.
2. ArrayList list = new ArrayList();
   Object 타입으로 객체를 할당하는 것
   ArrayList<Object> list = new ArrayList()<Object>; 이라는 뜻
   list.add(new Product());
   list.add(new Product());
   list.add(new Product());
	// 객체들은 Objct의 하위 객체이기에 할당이 가능
	 * 그런데 가져와서 사용할 때는 Object이기에 casting을 해야한다.
   Product p = (Product)list.get(0);
   
   선언시, 사용하게 될 객체유형으로 generic형식을 선언하면,
   해당 객체 type만 들어오기에 casting이 필요없다.
   ArrayList<Product> plist = new ArrayList<Product>();
   plist.add(new Product());
   plist.add(new Product());
   plist.add(new Product());

   Product p2 = plist.get(0);
   Product p2 = plist.get(1);
   Product p2 = plist.get(2);

		*/	
	/*	
		int num01 = 25;
		double num02 = num01; // promote 일어남!
		System.out.println(num02);
		double num03 = 243.42;
		int num04 = (int)num03; // casting 일어남! .42 잘라짐
		System.out.println(num04);
		
		Father f = new Son(); // promote : 하위 객체가 상위로 할당
		// f.name (속성 접근이 불가능)
		Son s01 = (Son)f; // 상위 객체에 할당된 객체가 다시 하위 객체의 속성을 사용할때는
						// casting을 해야 속성값을 접근할 수 있다.
		System.out.println(s01.name); // 위의 캐스팅을 진행해야 사용 가능
		Object ob = f; // 최상위 객체에 Son 할당
		
		Son s02 = (Son)ob;
		System.out.println(s02.name);
		
		
// ex) int 형에서 byte 유형으로 typecasting했을때의 데이터 유실 확인
//	   상속관계 Mother, Daughter을 설정하고 Daughter에 기능메서드 show()를
//	   딸입니다 출력 처리, promote와 typecasting을 통해서
//	   메서드를 확인할 수 있도록 처리.
		
		int n01 = 253323;
		System.out.println(n01);
		byte n02 = (byte)n01;
		System.out.println(n02);
		
		Mother m1 = new Daughter();
		Daughter d1 = (Daughter) m1;
//		d1.show1();
		
		Object o1 = m1;
		Daughter d2 = (Daughter) o1;
//		d2.show1();
		
		
		// ArrayList 타입을 정해서 처리
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add(new Object());
		
		Object o = new Product1();
		
		ArrayList<Product1> list = new ArrayList<Product1>();
		list.add(new Product1());
		list.add(new Product1());
		list.add(new Product1());
		
		
		Product1 p1 = list.get(0); // casting 없이도 진행 가능 = generic
		
		
		ArrayList list3 = new ArrayList();
		list3.add(new Student1("홍길동"));
		list3.add(new Student1("마길동"));
		list3.add(new Student1("신길동"));
		
		Student1 std = (Student1)list3.get(3); // 타입캐스팅 없이도 할당처리 완료
		// ex) Student1 클래스 선언으로 generic을 통한 할당처리와
		// ArrayList 중에서 2번째 단일 객체를 가져오는 처리를 하세요.
		
		
	}
}
class Student1{
	String name;
	public Student1(String name) {
		this.name=name;
	}
}
class Product1{}
class Mother{}
class Daughter extends Mother{
//	void show1() {
//		System.out.println("딸입니다");
//	}
}

class Father{}
class Son extends Father{
	String name = "아들";
}
*/
	}
}
