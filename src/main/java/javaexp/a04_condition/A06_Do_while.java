 package javaexp.a04_condition;

import java.util.Scanner;

public class A06_Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# do while
1. 초기에 출력/처리 내용을 먼저 진행하고,
	그 내용을 계속 반복적으로 수행할 때, 사용된다.
	어떠한 경우라도 한번은 수행 처리..
2.	형식
	do{
		// 최소 한번 수행할 구문
	}while(반복조건);
	
	
 */		
//		1~10까지 합산값
//		Scanner sc = new Scanner(System.in);
//		System.out.println("연산할 마지막 값을 입력하세요:");
//		int end = sc.nextInt(); //마지막값 입력
//		int cnt = 1; // 숫자
//		int tot = 0; // 합산값
//		do {
//			tot+=cnt; // 최소 한번 수행할 구문
//			System.out.println((cnt++)+"의 합산값:"+tot); //1,2,3,4,5... 의 합산값1,3,6,10,15
//		}while(cnt<end);	// 입력한 마지막값이 숫자보다 클때 종료
//		System.out.println("반복문 종료!!");
		
//	ex) 어서오세요.. 짜장면 전문점입니다.
//		짜장면(4000)입니다. 
//		수량을 입력하세요:@@
//		@@번째 방문 총 비용은 @@@원 입니다.
//		누적 비용은 @@@원입니다.
//		다음에 또 방문하시겠습니까?(Y/N) do while문 사용
		Scanner sc = new Scanner(System.in);
		int visitCnt=0;
		int tot =0;
		do {
		System.out.println("# 어서오세요 짜장면 전문점입니다.");
		System.out.println("짜장면은(4000)입니다");
		System.out.println("수량을 입력하세요:");
		int cnt = Integer.parseInt(sc.nextLine());
		tot+=cnt*4000;
		System.out.println((++visitCnt)+"번째 방문 총비용은 " 
				+(cnt*4000)+"원 입니다.");
			System.out.println("누적 비용은"+tot+"원입니다.");
			System.out.println("다음에 또 방문 하시겠습니까?(Y/N)");
			}while(sc.nextLine().equals("Y"));
			// 입력값이 Y일때는 계속 프로그래밍 반복 처리..
			System.out.println("프로그램 종료!!.");
		
		
	}

}
