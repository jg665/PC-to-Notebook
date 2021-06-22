package javaexp.a00_exp;

public class A05_0508 {
	public static void main(String[] args) {
	/* 
# 오늘의 정리
1. 인터페이스의 기본형식을 기술하세요.
	interface 인터페이스명 {
	void call(); // = 리턴값 메서드명(); 
	}
	class 하위클래스명 implements 인터페이스명 { 
	void call() 
	{ 인터페이스의 추상메서드 재정의 } 
	}
	
2. SwimmingWay 인터페이스를 선언하고, 하위에 상속받은 PoolSwimming, LakeSwimming,
   SeaSwimming 생성하고 다형성으로 처리하세요.
   interface SwimmingWay {
	void swimming();
}
class PoolSwimming implements SwimmingWay {

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("풀장에서 헤엄친다!");
	}
	
}
class LakeSwimming implements SwimmingWay {
	
	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("호수에서 헤엄친다!");
	}
	
}
class SeaSwimming implements SwimmingWay {
	
	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("바다에서 헤엄친다!");
	}
	
}
   
3. Duck 클래스를 만들고, 위에 선언한 SwimmingWay 필드와 할당하는 기능메서드를 선언하여
   swimming() 메서드에 따라서 해당 기능이 다르게 처리되는 것을 구현하세요.		
public class A05_0508 {
	public static void main(String[] args) {   
   		Duck d1 = new Duck("청둥");
		d1.setSwim(new PoolSwimming());
		d1.swimming();
		d1.setSwim(new LakeSwimming());
		d1.swimming();
		d1.setSwim(new SeaSwimming());
		d1.swimming();
	}
}  
   class Duck {
    private String kind;
	private SwimmingWay swimmingway;
	public Duck(String kind) {
		this.kind = kind;
	}
	
	public void setSwim(SwimmingWay swimmingway) {
		this.swimmingway = swimmingway;
	}
	public void swimming() {
		System.out.println(kind+"오리가");
		if(swimmingway!=null) {
			swimmingway.swimming();
		}else {
			System.out.println("할당된 데이터가 없습니다.");
		}
	}
}

4. 예외 처리를 하는 목적과 기본형식을 기술하세요.
	- 프로그래밍에 있어서 에러가 예상되고, 해당 에러가 발생하더라도 정상적으로 프로세스를 진행하기 위해서 예외처리를 한다.
	- 1. 프로그램의 안정성 확보 / 2. 에러가 나와도 프로세스의 정상적인 진행이 가능하도록 하기 위해서
	- 기본 형식 : try {에러 발생 가능성 있는 코드}catch(예외하위클래스 e){}catch(Exception e){에러가 발생했을 때 코드}finally{예외 상관없이 처리할 코드}

5. 아무 설정 없이 args[0]을 호출하면 에러가 발생하는데, 오늘 배운 예외 처리 순서를 기술하고,
   이러한 에러가 발생하더라도 정상적으로 프로그램이 수행되도록 예외 처리를 하세요.
		try {
			System.out.println(args[0]); // 먼저 이 라인만 실행시켜보면 에러 부분이 나옴
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("예외가 발생했습니다 "+e.getMessage());
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
		System.out.println("프로그램을 종료합니다");
		}
		
6. String에 데이터를 바로 대입하는 경우와 new String()을 통한 데이터할당의 차이점을 기술하세요.
	- String은 문자열이 같으면 주소값이 동일하지만 new String()은 각기 다른 주소값에 할당한다.
	  때문에 String은 System.out.println(); 에서 == 으로 문자열이 같은 데이터를 확인할 경우
	  stack 영역의 주소값을 가져오기 때문에 주소값이 같아 true로 나오지만,
	  new String()은 heap 영역의 주소값에서 각각 다른 값을 부여하므로 false로 나온다. 
	  때문에 문자열 데이터는 .equals()로 대조해야한다 
	  
	  ex) strl1.equals(strl2)
	  
7. 실수형과 정수형 문자열을 실수와 정수로 변환 처리하는 Wrapper 클래스의 기능 메서드를 예제를 통해 기술하세요.
	- 정수형: 
	int num1 = Integer.parseInt("25");
	- 실수형:
	double num2 = Double.parseDouble("14.9");
	
8. promote와 typecasting이란 무엇인가? 기본 예제를 통해서 설명하세요.
	- promote : 작은 단위에서 큰 단위로 변환하는 것
		byte num3 = 2;
		int num4 = num3;
	- typecasting : 큰 단위에서 작은 단위로 변환하는 것 / 데이터 유실해도 괜찮다고 명시적으로 입력해야 한다
		double num5 = 25.7;
		int num6 = (int)num5;
		
		System.out.println("소숫점 이하의 처리 연산"+(24/(double)5)); // 소수점 이하까지 출력하려면 (double) 붙여줘야 한다
		
9. args를 통해 학생의 성적(국어/영어/수학)을 입력 받았다. 학생의 성적을 출력하세요.
	홍길동 70 80 90 신길동 97 80 95
	평균은 실수로 소숫점 이하까지 출력하세요
	이름 국어 영어 수학 총점 평균
	@@  @@  @@  @@  @@  @@
	@@  @@  @@  @@  @@  @@
	1) 1단계 : 한명만 이름과 점수만 출력
	2) 2단계 : 한명의 총점과 평균 출력
	3) 3단계 : 두명의 총점과 평균 출력

	println() : 줄바꿈 포함한 출력메서드 ("\n" 생략됨)
	print() : 줄바꿈 미포함 출력메서드 (줄 바꾸려면 끝에 "\n" 붙여야함)
	"\t" : 탭간격을 처리하는 문자열
	
		String stu1 = args[0];
		String sco1 = args[1];
		String sco2 = args[2];
		String sco3 = args[3];
		String stu2 = args[4];
		String sco4 = args[5];
		String sco5 = args[6];
		String sco6 = args[7];
		
		int tot1 = Integer.parseInt(sco1)+Integer.parseInt(sco2)+Integer.parseInt(sco3);
		int tot2 = Integer.parseInt(sco4)+Integer.parseInt(sco5)+Integer.parseInt(sco6);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(stu1+"\t"+sco1+"\t"+sco2+"\t"+sco3+"\t"+tot1+"\t"+(tot1/(double)3));
		System.out.println(stu2+"\t"+sco4+"\t"+sco5+"\t"+sco6+"\t"+tot2+"\t"+(tot2/3.0));  // 이것도 가능하다!
		System.out.println("홍길동과 신길동의 점수 총점\t"+(tot1+tot2)+"\n홍길동과 신길동의 점수 평균\t"+((tot1+tot2)/6.0));

10. Math.random()과 조건문을 이용하여, 두 개의 팀이 가위/바위/보 게임을 헤서 승리여부를 출력하세요
	1) 1단계 : 0, 1, 2 임의로 출력
	2) 2단계 : 해당 0, 1, 2가 가위/바위/보로 표현되게 조건문 처리
	3) 3단계 : 두 개의 팀의 결과에 따라 조건문으로 승리여부 표현
	
		int team1 = (int)(Math.random()*3);
		int team2 = (int)(Math.random()*3);

		if(team1==1) {System.out.println("1팀: 가위");}
		if(team1==2) {System.out.println("1팀: 바위");}
		if(team1==3) {System.out.println("1팀: 보");}
		if(team2==1) {System.out.println("2팀: 가위");}
		if(team2==2) {System.out.println("2팀: 바위");}
		if(team2==3) {System.out.println("2팀: 보");}
		
		if(team1==team2) {
			System.out.println("무승부입니다");
		} else if(team1==1&&team2==1) {
			System.out.println("2팀 승리");
		} else if(team1==1&&team2==2) {
			System.out.println("1팀 승리");
		} else if(team1==2&&team2==0) {
			System.out.println("1팀 승리");
		} else if(team1==2&&team2==2) {
			System.out.println("2팀 승리");
		} else if(team1==3&&team2==0) {
			System.out.println("2팀 승리");
		} else {
			System.out.println("1팀 승리");
		}	
		
		
		답))		
		int team1 = (int)(Math.random()*3);
		int team2 = (int)(Math.random()*3);
		
		
		
		System.out.println("팀1\t팀2");
		System.out.println(game(team1)+"\t"+game(team2));
		System.out.println("결과\t"+isVic(team01,team02));
		
		// 함수 사용해서 간략하게 해결 가능하다.
	
		static String game(int idx) {
			String result="";
			if(idx==0) result="가위";
			if(idx==1) result="바위";
			if(idx==2) result="보";
			return result;
		}
		
		0	1	2
		가위	바위	보
		
		%3은 각변수 0 1 2 안에 있게 한다. (0%3 = 0, 1%3 = 1, 2%3 = 2)
		
		
		
		static String isVic(int idx1, int idx2) {
			String result="";
			if(idx1==idx2) {
			result="무승부";
			}if((idx1+1)%3==idx2) {
			result="팀2 승리";
			}else{
			result="팀1 승리";
			}
			return result;
		}
	 ** 더 짧게하는 팁
		
		String []game = {"가위","바위","보"};
		game 함수 대신 위와 같이 인덱스를 기준으로 배열을 접근시키면 문자열고 연결하여 임의로 출력할 수 있다.
		System.out.println(game(team1)+"\t"+game(team2)); 이것을 위해 만들어둔 game 함수를 지워도
		System.out.println(game[team1]+"\t"+game[team2]); 이걸로 바로 출력 가능
		
		
	 */	
		System.out.println(args[0]);
		try {
			System.out.println(args[0]); // 먼저 이 라인만 실행시켜보면 에러 부분이 나옴
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("예외가 발생했습니다 "+ae.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
		System.out.println("프로그램을 종료합니다");
		}
		
		
		
		Duckk d1 = new Duckk("청둥");
		d1.setSwim(new PoolSwimming());
		d1.swimming();
		Duckk d2 = new Duckk("귀여운");
		d2.setSwim(new LakeSwimming());
		d2.swimming();
		d1.setSwim(new SeaSwimming());
		d1.swimming();
		
		
		
		
	}
}
interface SwimmingWay {
	void swimming();
}
class PoolSwimming implements SwimmingWay {

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("풀장에서 헤엄친다!");
	}
	
}
class LakeSwimming implements SwimmingWay {
	
	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("호수에서 헤엄친다!");
	}
	
}
class SeaSwimming implements SwimmingWay {
	
	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("바다에서 헤엄친다!");
	}
	
}
class Duckk {
	private SwimmingWay swimmingway;
	private String kind;
	public void setSwim(SwimmingWay swimmingway) {
		this.swimmingway = swimmingway;
	}
	public Duckk(String kind) {
		this.kind = kind;
	}
	public void swimming() {
		System.out.println(kind+"오리가");
		if(swimmingway!=null) {
			swimmingway.swimming();
		}else {
			System.out.println("할당된 데이터가 없습니다.");
		}
	}
}
