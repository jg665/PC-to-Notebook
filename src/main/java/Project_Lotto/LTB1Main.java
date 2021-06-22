package Project_Lotto;

import java.util.ArrayList;
import java.util.Scanner;

public class LTB1Main {

	public static String java;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("===============================================\n");
		System.out.println("# 로또 구매 #\n");
//		상품 구매를 위한 사용자가 입력한 정보를 불러온다.
		ArrayList<LTB1SelectDTO> llist = new ArrayList<LTB1SelectDTO>();
		Scanner sc2 = new Scanner(System.in);
		
//		로또 구매 최종 여부
		System.out.println("# 구매하시겠습니까? (Y/N) #\n");
		String payCheck = sc2.nextLine();
		if(payCheck.equals("Y")) {
//			로또 구매 확정 시 구매내역 확인서 표시
			System.out.println("# 구매내역 확인 #");
			System.out.println("제 000회"); //회차번호 
			System.out.println("발행일 : YYYY/MM/DD (D) HH:MN:SS");
			System.out.println("추첨일 : YYYY/MM/DD"); 
			System.out.println("지급기한 : YYYY/MM/DD"); //추첨일로부터 1년
			System.out.println("A 자동 6자리숫자");
			System.out.println("B 반자동 6자리숫자");
			System.out.println("C 수동 6자리숫자");
			System.out.println("금액 : 0000");
			
		} else {
//			로또 구매 취소 -> 구매창
			System.out.println("로또 구매를 취소했습니다.");
			System.out.println("메인으로 이동합니다.");
			System.out.println("\n===============================================\n");
		
}
}