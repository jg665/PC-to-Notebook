package javaexp.a00_exp;

public class A03_0506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* # 아래 내용을 풀어서 17:40까지 개인톡으로 올려주세요
	1. 클래스와 객체와의 관계를 Movie 클래스 선언과 참조변수 m01, m02를 통해서 
       메모리와 함께 설명하세요.
		Movie m01 = new Movie();
		m01.name = "라따뚜이";
		Movie m02 = new Movie();
		m02.name = "라라랜드";
		
		- 클래스는 도면이기 때문에 실행을 위해서는 객체를 생성해야한다.
		  (클래스에 선언되어 있는 것 = 코드 / 이를 메모리에 불러와서 수행하는 것 = 객체)
	      참조변수(m01, m02) 안에는 heap 영역의 주소값으로 stack에 할당되어있고
	      new 생성자() heap 영역에서 객체가 생성된다.
		- 각 참조변수별 클래스의 도면에 다른 데이터를 할당하고 사용할 수 있다.
		
	2. 클래스의 구성요소와 각 구성요소의 특징(생성자/메서드의 차이)에 대해서 기술하세요.		
		- 구성요소 : 필드/생성자/메서드
		- 메서드 = 필드 밖에서 코드 / 클래스 내의 기능을 처리하는 것
		- 생성자 = 클래스와 동일한 명칭을 가진 기능 함수 / 필드 안에서 객체를 생성할때 사용된다
	
	3. 클래스에서 this를 사용하는 경우에 대하여 기술하세요.
		- 생성자를 통해 들어오는 데이터를 전역변수에 할당하기 위해서 사용한다.
	
	4. Calculator 클래스를 선언하고, 필드값(두개의 숫자)을 할당하여 합산의 값을 출력하세요.
		Calculator c1 = new Calculator(1,2);
		c1.plus();
		
	5. Calulator 클래스를 선언하고, 생성자로 필드값을 할당하여 곱셈의 값을 출력하세요.
		Calculator c1 = new Calculator(1,2);
		c1.multi();
		
	6. Calulator 클래스를 선언하고, 생성자로 필드값을 할당하여 매서드 plus(),minus(),divide(),multi()를
	   통해서 덧셈, 뺄셈, 곱셈, 나눗셈을 출력하여 처리하세요.
		Calculator c1 = new Calculator(1,2);
		c1.plus();
		c1.minus();
		c1.multi();
		c1.divide();

	7. 자바의 접근제어자 범위에 대하여 기술하세요.
		1) private : 외부 클래스에서 직접적인 접근을 하지 못하게 하는 것 / 객체 내부에서만 사용하게 한다.
		2) (default) - 접근제어자가 붙지 않은 것 : 상단에 선언한 동일한 패키지 내에서만 접근하여 사용하게 한다.
		3) protected : 상속관계에 있다면(전제조건), 패키지가 다르더라도 접근이 가능하다.
		4) public : 패키지가 다르더라도 접근이 가능하다.
	
	8. 추상클래스와 일반클래스의 차이점을 기술하세요.
		추상클래스 - 메서드 중에 바디 부분을 안넣은 추상메서드가 1개라도 있는 클래스
		일반클래스 - 이외의 클래스
		
	9. Duck 추상클래스(quack() 꽉!!, flying() - 추상메서드)에 상속받은 RubberDuck(고무오리),
	   Mallard(청둥오리)를 선언하세요.
	 	Duck d1 = new RubberDuck();
	 	Duck d2 = new Mallard();
	 	d1.quack();
		d2.flying();
	
* */
	}

}
abstract class Duck {
	void quack() {
		System.out.println("꽉!!");
	}
	abstract void flying();
}

class RubberDuck extends Duck {
	@Override
	void flying() {
		System.out.println("고무오리");
	}
}
class Mallard extends Duck {
	@Override
	void flying() {
		System.out.println("청둥오리");
	}
}

class Calculator {
	int num1;
	int num2;
	
	Calculator (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	void plus() {
		System.out.println(num1+num2);
	}
	void multi() {
		System.out.println(num1*num2);
	}
	void minus() {
		System.out.println(num1-num2);
	}
	void divide() {
		System.out.println(num1/num2);
	}
}

class Movie {
	String name;
	
	Movie() {
		this.name = name;
	}
}

