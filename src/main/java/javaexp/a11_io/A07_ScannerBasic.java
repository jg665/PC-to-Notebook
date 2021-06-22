package javaexp.a11_io;

import java.util.Scanner;

public class A07_ScannerBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ex) 구매할 물건 등록
//		물건명 :
//		가격 :
//		갯수 :
//		구매내역 : @@@ @@@ 총비용 @@@
		Scanner sc = new Scanner(System.in);
		System.out.println("물건명");
		String name = sc.nextLine();
		System.out.println("가격");
		int price = sc.nextInt();
		System.out.println("갯수");
		int cnt = sc.nextInt();
		System.out.println("구매내역"+name+","
				+price+"원에 "+cnt+"개");
		System.out.println("총비용"+price*cnt);
		
	}

}
