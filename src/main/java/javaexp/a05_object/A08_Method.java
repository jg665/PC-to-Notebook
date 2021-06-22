package javaexp.a05_object;

public class A08_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object01 ob1 = new Object01();
		String st1 = ob1.retrunExp();
		String st2 = ob1.retrunExp();
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(ob1.retrunExp1());
		System.out.println(ob1.retrunExp2());
		System.out.println(ob1.retrunExp3());
		System.out.println(ob1.retrunExp4());
		System.out.println(ob1.retrunExp5());
//		double dbl01 = ob1.returnExp5();
//		System.out.println("실수를 리턴 받아서 실수변수에 할당:"+dbl01);
		System.out.println(ob1.retrunExp6());
		// 배열이 리턴되니 배열에 해당 하는 데이터 type으로 할당하여 사용.
		int [] arr6 = ob1.retrunExp6();
		System.out.println(arr6[0]);
		System.out.println(arr6[1]);
		System.out.println(arr6[2]);
		
		System.out.println(ob1.retrunExp7());

	}

}
class Object01{
	// 리턴할 유형선언 메서드명() { return 리턴할 실제 데이터;}
	String retrunExp() {
		return "안녕하세요";
	}
	String retrunExp1() {
		return "반갑습니다";
	}
	char retrunExp2() {
		return 'A';
	}
	int retrunExp3() {
//		int num01 = 3000;
//		return num01;
		return 3000;
	}
	double retrunExp4() {
//		double num01 = 25.2;
//		double num02 = 30.7;
//		double tot = num01+num02;
//		return tot;
		return (25.2+30.7);
	}
	boolean retrunExp5() {
		return 1==0;
	}
	// double num01 = num01+num02;
	int[] retrunExp6() {
		int[] arr = {2,3,6};
		return arr;
	}
	// int[] ret = {2,3,4};
	int[] retrunExp7() {
		return new int[] {2,3,4,};
	}
	Person retrunExp8() {
		// Person p01 = new Person("홍길동");
		return new Person("홍길동");
	}
		
	//	ex) 아래와 같이 리턴할 데이터를 처리하게끔 기능 메서드를 선언하세요.[]
	//	retrunExp1()	"반갑습니다"
	//	retrunExp2()	'A'
	//	retrunExp3()	3000
	//	retrunExp4()	25.2 + 30.7
	//	retrunExp5()	false
	//	retrunExp6()	{2,3,4}
	
	}
	
