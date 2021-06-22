package javaexp.a00_exp;

import java.util.Scanner;

public class A10_0517 {
	/*
1. 중첩조건문의 형식을 정리하고, 영어/수학 점수를 입력받아 합격기준이 영어/수학 점수 모두가 80점 이상인 경우와
   수학점수만 100점인 경우를 기준으로 하였다고 가정하면, 중첩조건에 의해 합격/불합격여부와 합격기준을 표시하세요.
	- 기본형식:
	if(조건1){
		if(조건2){
			조건1과 조건2 모두 true
		}else{
			조건1만 true
		}
	}else{
		조건1이 아닐때 처리할 구문
		if(조건2){
			조건2만 true
		}else{
			조건1과 조건2 모두 false
		}
	}
	
	
	- 문제:
		Scanner sc = new Scanner(System.in);
		System.out.print("영어점수를 입력하세요: ");
		int eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요: ");
		int math = sc.nextInt();
		if(eng>=80) {
			if(math>=80) {
				System.out.println("합격입니다.");
			}else if(eng>100||math>100) {
				System.out.println("0~100점 까지만 입력해주세요.");
			}else {
				System.out.println("불합격입니다.");
			}
		}else {
			if(math==100) {
				System.out.println("합격입니다.");
			}else if(eng>100||math>100) {
				System.out.println("0~100점 까지만 입력해주세요.");
			}else {
				System.out.println("불합격입니다.");
			}
		}
		
		
		=>
		if(eng>=80&&math>=80){
			sysout("둘다 80점 합격!");
		} else if (math == 100){
			sysout("수학점수 100점 합격!");
		} else {
			sysout("불합격");
		}
	
2. switch case문의 기본형식을 기술하고 경마를 해서 8마리의 말 중에 1~3등까지 600%, 400%, 200%의 당첨금을 받기로 했다.
   티켓 금액을 입력하고, 랜덤에 의해 1~8말을 선택하고 당첨금 총액을 출력처리하세요.
	- 기본형식:
		switch(변수){
		case 변수유형1:
			처리할 내용
			break;
		case 변수유형2:
			처리할 내용
			break;
		
		쭉 나열되다가
		
		default :
			위에 정의한 변수유형이 아닐 때 처리할 내용
	}
	
	- 문제:
		Scanner sc = new Scanner(System.in);
		System.out.print("티켓 금액 입력하세요: ");
		int ticket = sc.nextInt();
		int horse = (int)(Math.random()*8+1);
		switch(horse) {
			case 1:
				System.out.print("1등 당첨! 당첨금액: "+(ticket*6)+"원");
				break;
			case 2:
				System.out.print("2등 당첨! 당첨금액: "+(ticket*4)+"원");
				break;
			case 3:
				System.out.print("3등 당첨! 당첨금액: "+(ticket*2)+"원");
				break;
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				System.out.println("꽝!");
		}
		
		=>
		switch(horse){
		case 2: ticket=ticket*2;
		case 3: ticket=ticket*2;
			break;		// case 2에서 break 안되었기 때문에 누적으로 3등은 *4 처리됨
		case 1: ticket=ticket*6;
			break;
		default: pay=0;
		}
		sysout("총 금액: "+ticket);
		// 이렇게 간단하게 처리 가능하다!
	
3. [1단계] for문을 활용하여, 단가 2200원의 김밥 1~30개의 가격을 출력하세요.
		int price = 2200;
		System.out.println("순서\t가격\t총합");
		for(int cnt=1;cnt<=30;cnt++) {
			System.out.println(cnt+"\t"+price+"\t"+price*cnt);
		}
		
   [2단계] 김밥 주문에 따른 총비용을 누적하세요.
   		  종류 2가지만 입력받아 3000원 3개, 3500원 2개
   		  
   		  1 3000	3000
   		  2 3000	6000
   		  3 3000	9000
   		  4 3500	12500
   		  5 2500	15000
   		  
   		Scanner sc = new Scanner(System.in);
		System.out.print("주문하려는 김밥1 가격: ");
		int kimB1 = sc.nextInt();
		System.out.print("김밥1 갯수: ");
		int cnt1 = sc.nextInt();
		System.out.print("주문하려는 김밥 가격2: ");
		int kimB2 = sc.nextInt();
		System.out.print("김밥2 갯수: ");
		int cnt2 = sc.nextInt();
		int tot = cnt1*kimB1;
		for(int idx=1;idx<=(cnt1+cnt2);idx++) {
			System.out.print(idx+"\t");
			if(idx<=cnt1) {
				System.out.println(kimB1+"\t"+(kimB1*idx));
			}else {
				System.out.println(kimB2+"\t"+(tot+kimB2*(idx-cnt1)));
			}
				
		}
		
		=>
		int price1 = 3000;
		int cnt1 = 3;
		int price2 = 3500;
		int cnt2 = 2;
		int cnt = 1; // 전체 카운트
		// 1번째 주문의 처리 현황
		for(int count=1;count<=cnt1;count++){
			sysout(count+"\t"+price1+"\t"+count*price1);
		}
		// 2번째 주문의 처리 현황
		// count의 시작은 첫번째 주문갯수+1
		for(int count=cnt1+1;count<=(cnt1+cnt2);count++){
			sysout(count+"\t"+price2+"\t"+count*price2);
		}
		
   		  
 
4. for문을 활용하여 아래의 형식(1~20)으로 출력하세요
	1단계 짝수만 %연산자를 이용해서 출력
		for(int cnt=1;cnt<=20;cnt++) {
			if(cnt%2==0) {
				System.out.print(cnt+"\t");
			}
		}
		
	2단계 5개 단위로 줄바꿈 처리
	
		for(int cnt=1;cnt<=20;cnt++) {
			System.out.print(cnt);
			if(cnt%5==0) {
				System.out.println();
			}else {
				System.out.print("\t");
			}
		}
	
5. for문을 이용하여 3/6/9게임으로 출력하세요
	1단계 (1~10까지)
	1	2	짝	4	5	짝	7	8	짝	10
	
		for(int cnt=1;cnt<=10;cnt++) {
			if(cnt%3==0) {
				System.out.print("짝 ");
			}else {
				System.out.print(cnt);
				System.out.print(" ");
			}
		}
	
	2단계 (11~20까지)
	11	12	짝	14	15	짝	17	18	짝	20
		
		for(int cnt=11;cnt<=20;cnt++) {
			if((cnt-10)%3==0) {
				System.out.print("짝 ");
			}else {
				System.out.print(cnt);
				System.out.print(" ");
			}
		}	
		
		=>
		for(int cnt=1;cnt<=20;cnt++){
			// 10단위 내용을 삭제해서 나머지값이 3으로 나누었을 때 0
			// cnt%10%3
			if(cnt%10 != 0 && cnt%10%3 == 0){
				sysout("짝\t");
			} else {
				sysout(cnt+"\t");
			}
			
		}
		
		
		3단계) 6은 짝 2번, 9는 짝 3번
		=>
		
		String str="";
		for(int cnt1;cnt<=1000;cnt++){
			str = "";
			// 문자열로 변환처리
			String numS = ""+cnt;
			// numS.toCharArray()로 문자열의 구성요소를 char 배열로 변환
			// "30" ==> ['3','0']
			//"331" ==> ['3','3','1']
			// for(단위데이터 : 배열)
		for(char c:numS.toCharArray()){
			//포함된 문자가 3/6/9일때,
			//출력할 문자 "짝"을 누적처리
			if(c == '3'||c == '6'||c == '9'){
				str += "짝";
			}
		}

		if(str.equals("")){	//짝이 없는 경우
			sysout(cnt+"\t");
		}else{
			sysout(str+"\t"); //짝이 설정된 경우
		}
			
		if(cnt%10==0){ // 줄바꾸기
			sysout();
		}
		
		
		*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		
		
		
		
		
	}

}
