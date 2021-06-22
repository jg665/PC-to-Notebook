package javaexp.a00_exp;

public class A04_0507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 전날 복습 진행했으므로, 아래 문제는 아는 개념인지 확인해서 정리 해주세요.
- 일단, 확인하시고 모르는 부분을 스스로 대답할 수 있을 정도로 암기 부탁드립니다.
~ 9:30까지 정리해주시고, 개념이해 %로 표기해서 개인톡으로 전달부탁드립니다.
1. 클래스와 객체의 차이점을 기술하세요.
	건축도면 / 건물
	프로그래밍을 처리 
		==> 컴퓨터의 메모리에 로딩 CPU프로세스를 통해서 처리
	클래스만들다는 것 : 사람이 코딩으로 text에 기록(사람이 인식할 수 있는 언어)
	컴파일을 거쳐서 기계(컴퓨터)가 인식할 수 있는 파일로 변환 .class
	main()가 있는 파일에서 해당 클래스의 생성자로 객체를 생성하면
	컴퓨터의 메모리에 로딩되고 CPU프로세스를 통해서 처리가 된다.
		클래스명  변수 = new 클래스명과 동일한 생성자();
		ex) Person p01 = new Person();

2. 클래스의 구성요소 3가지와 주요 기능을 실제 코드와 함께 설명 하세요.
	프로그래밍의 목적 : IT(infomation technology)
		데이터 ==> 원하는 정보를 추출
			 기능함수(입력,리턴)	
	클래스를 통해서 원하는 정보를 처리하기 위해서 구조화하여 만든다.
		1) 기능함수보다 upgrade버젼 여러가지 기능을 객체개념으로 처리할 수 
			있는 한 것이 클래스이다.
		2) 사람이 프로그래밍을 할 때, 가장 효과적인 방법을 아는 개념부터 시작
		 	하는 것이 효율적이다. 01001 기계어로 프로그램..
		3) 객체개념으로 프로그램을 할 수 있게 도입을 하기 시작했다.
		 	기억과 action
		 	필드   메서드
		4) OOP(Object Oriented Programming) 
	class 클래스명{
		1. 데이터를 저장하는 필드 선언
		private String name;
		
		2. 클래스의 데이터를 초기화하는 생성자
		public 클래스명(String name){
			this.name = name;
		}
		3. 클래스를 통해서 여러기능을 처리하는 기능메서드
		public String show(){
			return this.name+"!! 반갑습니다";
		}
	
	}		
3. 접근제어자의 종류와 범위에 대하여 기술하세요.
	TV/리모콘
	class에 있는 모든 구성요소들이 특정한 경우에 특정한 접근 방식으로만
	접근이 가능하게 하기 위하여 만들 것이 접근제어자이다.
	private : 클래스내에서만 사용될 수 있고, 외부에서 직접적인 접근을
		하지 못하게 하는 제어자.
	default(X) : 접근제어자를 선언하지 않으면, default접근제어자로
		클래스명 상단에 선언한 package 패키지명;이 같은 경우에만
		접근이 가능하게 하는 접근 제어자를 말한다.
	protected : 상속관계에 있는 경우에는 외부 패키지에 있는 클래스의
		구성요소에 대하여 접근이 가능하게 처리하는 접근제어자를 말한다.
	public : 구성요소가 어떠한 경우에도 접근이 가능하게 처리하는 접근
		제어자를 말한다. 
		


4. 상속의 기본 형식을 기술하세요.
	class 상위클래스{
	
	}
	class 하위클래스 extends 상위클래스{
	
	}
	접근제어자의 범위 안에서 상위에 있는 구성요소(필드,생성자,메서드)를 사용할
	수 있게 하는 것을 말한다. 


5. 오버라이딩이 무엇인지 기술하세요.
	상위에 있는 클래스의 메서드를 재정의하는 것을 말한다.
	재정의 : 선언한 내용을 다시 정의하는 것을 말한다.
		통일된 메서드명 하에서 상속의 하위 클래스에서 다양한 형태로
		선언할 수 있게 처리하는 것을 말한다. 
6. 폴리모피즘(Polymorphism)이 무엇인지 코드와 설명으로 기술하세요.
	상속관계에 있는 클래스가 다양한 형태로 만들어진다는 의미를 내포하고 있다.
	Starcraft
		Zerg(파충류 비슷 외계)
			Larba(상위)     abstract void attack();
		Dron Zergling Hydra ... 	
		
		Larba l1 = new Dron();   public void attack(){  공격력 5 }
		Larba l2 = new Zergling(); public void attack(){  공격력 7 }
		Larba l3 = new Hydra();	public void attack(){  공격력 15 }

7. 추상클래스와 일반클래스의 차이점을 기술하세요.
	추상클래스는 오버라이딩할 추상메서드가 한개 이상 있을 때, 추상클래스가 된다.
		추상클래스는 폴리모피즘을 위해 만들어졌기 때문에, 객체 생성을 하지 못 한다.
		공통구상메서드와 함께 효과적인 하위 클래스의 다양한 처리를 위하여
		사용된다.
		추상클래스에서 선언한 추상메서드는 반드시 재정의 하여야 한다.
		-> 하위 메서드의 통일성을 강제화 하였다.
	일반클래스는 객체 생성이 가능하고, 상속시에도 다른 메서드를 선언할 수 있다.
		

# 생각해봅시다.
1. 공통 모듈을 만들려며 추가 개발할 때, 소스가 영향을 미칠 수 밖에 없을까?
2. 응집성이라는 개념을 무엇일까요? 한번 찾아보세요
3. 프로그램의 안정성을 위해서는 어떤 작업들이 필요할까요?
4. 프로그램에서 데이터 변환은 어떤 때, 필요할까요?				
		*/		
	}

}
