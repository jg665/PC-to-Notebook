package javaexp.a04_condition;

import java.util.Scanner;

public class A05_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# While
1. 조건에 따라 반복 여부를 결정할 때 사용되는 구문
2. 기본형식
	while(반복조건){
	
	
	}
3. 주로 반복 block에 있는 값의 입력으로 반복 여부를 결정할 때 사용된다.
				*/
		int cnt = 1;
		while(cnt<=10) {
			System.out.println("번호: "+cnt);
			cnt++;
		}
		System.out.println("반복문 종료!");
// ex) while문을 이용해서 과일가격이 3000원인 사과를 10개까지 구매한 비용을
//	   1~10까지 출력하세요
		
		int price = 3000;
		int count = 1;
		int sum = 0;
		while(count<=10) {
			System.out.println(price+"원인 사과를 "+count+"개 구매한 비용: "+price*count);
			count++;
		}
		
		/*
		cnt = 1;
		int frePrice = 3000;
		while(cnt<=10){
			sysout(cnt+"개 사과 구매 비용: "+fruPrice*cnt);
			cnt++;
		}
		 */
		// 데이터 받아서 누적 처리시켜주는 일에 특화
		Scanner sc = new Scanner(System.in);
	/*	String order=""; // 주문내역
		while(true) { // 무한반복
			System.out.print("주문을 받습니다: ");
			order+=sc.nextLine()+" "; // 입력받은 데이터를 누적 처리
			System.out.println("현재까지 주문한 내역");
			System.out.println(order);
			System.out.print("주문을 종료하시겠습니까?(Y/N): ");
			if(sc.nextLine().equals("Y")) {	// 종료할 수 있는 문자열을 지정하여 처리
				System.out.println("주문 완료!");
				break;	// break를 통해서 while문을 벗어나게 처리
			}
		}
		System.out.println("# 최종 주문 내역 #");
		System.out.println(order); */
		
		// ex) while문을 이용해서 구매한 금액을 입력하여
		//	   그만 구매하시겠습니까? 처리시 최종 금액을 출력하세요
		//	   sc.nextLine(), Integer.parseInt(sc.nextLine()) 이용 // int는 오류남

		int pay = 0;
		while(true) {
			System.out.print("구매할 금액: ");
			pay += Integer.parseInt(sc.nextLine());
			System.out.println("현재 비용: "+pay);
			System.out.print("그만 구매하시겠습니까?(Y/N): ");
			if(sc.nextLine().equals("Y")) {
				System.out.println("구매 종료!");
				break;
			}
		}
		System.out.println("현재까지 구매한 총 비용: "+pay);
		
		
		
	}

}
