package javaexp.a05_object;

public class A09_Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setPrice(200);
		p1.setPrice(50);
		p1.setPrice(10);
		p1.setPrice(70); // int price = 70;
//		p1.setPrice("홍길동"); // int price = "홍길동"
		byte num01 = 24;
		p1.setPrice(num01); // int price = num01; (promote)
		char ch01 = 'A';
		p1.setPrice(ch01); // char ==> int (promote)일어나 가능하다.
		p1.calcu(200, 2); // 선언된 갯수와 type에 맞게 데이터를 넘겨주면 된다.
		p1.calcu(5000, 41); // 선언된 갯수와 type에 맞게 데이터를 넘겨주면 된다
		
		Calculator c1 = new Calculator();
		byte b1 = 22;
		char b3 = 22;
		float b2 = 22243.343F;
		c1.inAllDate(b1);
		c1.inAllDate(b2);
		c1.inAllDate(b3);
		
		c1.setNum(10);
		c1.plus(10, 5);
		c1.multi(10, 20);
		c1.setNum(50);
		c1.plus(11, 22);
		c1.multi(14, 27);
	}
	// ex) Calculator 클래스
	//		1) 기본 유형의 데이터를 받는 메서드 선언 출력 처리..
	//		2) plus() 두개의 값을 합산, multi() 두개의 값을 곱셈처리.
	//			모든 데이터가 다 입력이 가능하게 처리.. [3조]
}
class Calculator{
	void inAllDate(double b) {
		System.out.println("모든 데이터:"+b);
	}
	void plus(double num01, double num02) {
		System.out.println("합산:"+num01+num02);
	}
	void multi(double num01, double num02) {
		System.out.println("곱셈:"+num01*num02);
	}
	void inByte(byte b) {
		System.out.println("byte:"+b);
	}
	void inShort(short b) {
		System.out.println("short:"+b);
	}
	void inInt(int b) {
		System.out.println("int:"+b);
	}
	void inLong(long b) {
		System.out.println("long:"+b);
	}
	void inFloat(float b) {
		System.out.println("float:"+b);
	}
	void inDouble(double b) {
		System.out.println("double:"+b);
	}
	void inBoolean(boolean b) {
		System.out.println("boolean:"+b);
	}
	void setNum(int num) {
		System.out.println("입력된 값:"+num);
	}
	void plus(int num, int num1 ) {
		System.out.println("두 값의 합산:"+(num+num1));
	}
	void multi(int num, int num1) {
		System.out.println("두개의 곱셈:"+num*num1);
	}
}


class Product{
	// 매개변수는 해당 type을 할당하면 데이터를 받아서 처리한다.
	void setPrice(int price) { // 외부에 입력된 실제 데이터를 할당하는 변수.
		System.out.println("입력된 값:"+price);
		System.out.println("입력된 값 연산:"+price*0.1);
	}
	void calcu(int price, int cnt) {
		System.out.println("물건가격:"+price);
		System.out.println("물건갯수:"+cnt);
	}
	
}