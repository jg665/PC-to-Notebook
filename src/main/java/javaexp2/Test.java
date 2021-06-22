package javaexp2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		음료 비용과 갯수를 받아서 누적처리하여 총비용을 
//		출력하는 프로그램 하실수 있겠죠??
		Scanner sc = new Scanner(System.in);
		int drinkcnt = 0;
		int tot = 0; //누적금액
		do {
			System.out.println("마트입니다");
			System.out.println("콜라는(1500)입니다.");
			System.out.println("수량을 입력하세요:");
			int cnt = Integer.parseInt(sc.nextLine());
			tot+=cnt*1500;
			System.out.println("음료 개수는:"+(++drinkcnt)+" 비용은"+(cnt*1500));
			System.out.println("총 비용은 :"+tot);
			System.out.println("더 구매 하시겠습니까?(Y/N)");
		}while(sc.nextLine().equals("Y"));
		System.out.println("즐거운 하루 되세요!!");
	}

}
