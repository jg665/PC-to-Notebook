package javaexp.a03_calcu;

import java.util.Scanner;

public class A01_BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 연산이란?
1. 데이터를 처리하여 결과를 산출하는 것을 말한다.
	연산자 : 연산에 사용되는 표시나 기호 (+,-,*,%,/,...)
	피연산자 : 연산 대상이 되는 데이터(리터럴, 변수)
	연산식 : 연산자와 피연산자를 이용하여 연산의 과정을 기술하는 것
	


# 자바의 활용연산자들

1. 산술연산자(사칙연산자와 나머지연산자): int형 이상만 사용 가능
	+, -, *, /, %
	* : 곱셈
	% : 나눈 나머지값
 * */
		int num01 = 25;
		int num02 = 5;
		System.out.println(num01 + " + " + num02 + " = " + (num01+num02));
		System.out.println(num01 + " - " + num02 + " = " + (num01-num02));
		System.out.println(num01 + " * " + num02 + " = " + (num01*num02));
		System.out.println(num01 + " / " + num02 + " = " + (num01/num02));
		System.out.println(num01 + " % " + num02 + " = " + (num01%num02));
		// ex) 위 사칙연산자 중 하나를 이용하여 과일의 가격 price 에 3000
		//	   구매할 갯수 cnt에 5로 선언하여 총비용을 출력하세요
		int price = 3000;
		int cnt = 5;
		int tot = price * cnt;
		System.out.println("과일의 가격: "+price);
		System.out.println("구매할 갯수: "+cnt);
		System.out.println("총비용: "+tot);
/*
2. 비교 연산자
	1) 두개의 값을 비교하여 결과로 boolean(true/false)값을 처리하는 연산자를
		말한다. 주로 조건 if(비교연산자)
		for(초기;비교연산자;증감)
		while(비교연산자)
	2) 종류
		==	: 동일할 때, true
		!=	: 같지 않을 때, true
		>=	: 크거나 같을 때, true
		<=	: 작거나 같을 때, true
		>	: 클 때, true
		<	: 작을 때,true

		System.out.println(num01+" == "+num02+" ==> "+(num01==num02));
		System.out.println(num01+" != "+num02+" ==> "+(num01!=num02));
		System.out.println(num01+" >= "+num02+" ==> "+(num01>=num02));
		System.out.println(num01+" <= "+num02+" ==> "+(num01<=num02));
		System.out.println(num01+" > "+num02+" ==> "+(num01>num02));
		System.out.println(num01+" < "+num02+" ==> "+(num01<num02));
		boolean isTrue = num01>=num02; //boolean으로 할당처리
		// ex) boolean으로 isPass 변수 선언, point 점수 80을 두고, 70이상일 떄,
		//     합격 여부를 출력 처리하세요
		//	   점수 : @@@
		//	   합격여부 : @@@
		int point = 80;
		boolean isPass = point>=70;
		System.out.println("점수: "+point);
		System.out.println("합격여부: "+isPass);

3. 부호 연산자
	+,=	음수와 양수의 부호
	int num01 = 25;
	-num01 ==> -25;
4. 문자열의 이어주는 concat연산 : +
	"문자열1" + "문자열2" ==> "문자열1문자열2"
5. 증감 연산자
	++, --	(1씩 증가 및 감소 처리)
6. 대입 연산자
	ex) int num02 = 30; num02에 30을 대입 처리
	+=	대입 증감 : 기존 데이터에 증가범위로 누적 처리
		num02 += 2; : num02 = num02 + 2;
	+-, *=, /=, %=, &=... >>>=...
	
// ex1) 임의의 값 1~10을 나오게 하여 부호 연산자로 음수를 처리하여 출력하세요.
 		for(int i=0;i<=10;i++){	
 			int random01 = (int)(Math.random()*10+1);
			System.out.println(-random01);
		}
		
// ex2) 문자열 이어주는 +를 이용하여 임의의 10자리 범위 두개의 값을 이어서 코드를 만들어보세요 10/20 ==> 1020  24/42 ==> 2442
		String n1 = ""+(int)(Math.random()*90+10);
		String n2 = ""+(int)(Math.random()*90+10);
		System.out.println("문자열 더하기: "+(n1+n2));
		
// ex3) 대입 증감 및 감소 연산자를 이용해서 1~10 누적된 총합을 출력하고 100~90까지 2씩 감소 누적된 값을 출력하세요.
		int sum = 0;
		int sum2 = 0;
		for(int c=1;c<=10;c++) {
			sum += c;
		}
		System.out.println("1~10 누적총합: "+sum);
		for(int d=100;d>=90;d-=2) {
			sum2 += d;
		}
		System.out.println("100~90 누적총합: "+sum2);


7. 논리연산자
	1) !	(not)	비교연산자의 반대값 처리. true ==> false, false ==> true
		ex) boolean isPass = true;
			if(!isPass){ // true가 아닐때 = false 일때 라는 뜻
				System.out.println("통과하지 못했다");
			}else{
				System.out.println("시험 통과!");
			}

	2) 논리연산자(비교연산자 + 비교연산자) : &&, ||
	비교연산자 && 비교연산자 ==> 모두 true일때, true
	비교연산자 || 비교연산자 ==> 둘 중 하나라도 true일때, true / 모두 false일때, false
	비교&비교 비교&&비교 차이 ==> &&는 프로세스를 축약(앞에가 false 뒤의 비교연산자 수행하지 않음)
	비교|비교 비교||비교 차이 ==> 위와 동일
	ex) if(id.equals("himan")&&pass.equals("7777")){
			id/pass가 himan/7777일때 처리할 내용
			두 조건을 다 만족할때까지 처리할 내용
		}
		if(id.equals("goodman")||id.equals("goodlady")){
			둘 중에 하나만 만족하면 처리할 내용 기술
		}


삼항연산자
대입연산자
증감연산자

# 논리연산자 연습
ex1) Scanner로 입력받아, himan 아닐때(not연산자 활용)를 먼저 체크해서, 등록된 사원이 아닙니다 출력,
	 그 외는 등록된 사원입니다. 조건 처리
	 	Scanner sc = new Scanner(System.in);
		System.out.print("사원 id를 입력하세요: ");
		String id = sc.nextLine();
		if(!id.equals("himan")) {
			System.out.println("등록된 사원이 아닙니다.");
		}else {
			System.out.println("등록된 사원입니다.");
		}
		
ex2) 점수를 입력받아, 90이상 A등급, 80~90미만은 B등급 && 연산자 활용
		Scanner sc = new Scanner(System.in);
		System.out.print("점수: ");
		int score = sc.nextInt();
		if(score>=90) {
			System.out.println("A등급");
		}
		if(score>=80&&score<=90) {
			System.out.println("B등급");
		}
		if(score<80){
			System.out.println("등급 지정 없음!");
		}
		
ex3) 놀이공원 나이를 입력받아 5세 미만이거나 65세 이상이면 무료(|| 연산자 활용). 그 외는 50000원 입장료입니다. 표기
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		if(age<5||age>=65) {
			System.out.println("입장료 무료입니다.");
		} else {
			System.out.println("입장료 50000원입니다.");
		}
		
# 논리연산자 연습
ex1) 1~4번 중, 정답을 입력하세요. not(!) 활용해서  처리
	3번이 아닐 때, 오답입니다. 출력, 그 외는(3인 경우) 정답입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정답을 입력하세요: ");	
		int answer = sc.nextInt();
		if(answer!=3) {
			System.out.println("오답입니다.");
		}else {
			System.out.println("정답입니다.");
		}
		
ex2) 구매금액을 입력해서 10000~30000 VIP 고객입니다. 출력(&&활용)
		Scanner sc = new Scanner(System.in);
		System.out.print("구매금액을 입력하세요: ");	
		int buy = sc.nextInt();
		if(buy>=10000&&buy<=30000) {
			System.out.println("구매금액: "+buy+"원");
			System.out.println("VIP 고객입니다.");
		}
		
ex3) 점수를 입력하세요. 0미만, 100초과일 경우 (||) 정상범위 @@점
	그 외는 입력은 0~100해주세요(범위를 벗어났습니다.)
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");			
		int score = sc.nextInt();
		if(score<0||score>100) {
			System.out.println("범위를 벗어났습니다.");
			System.out.println("입력은 0~100 사이로 해주세요.");
		} else {
			System.out.println("정상범위입니다.");
			System.out.println("점수: "+score);
		}
* */
		
	}

}
