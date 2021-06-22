package javaexp.a09_api;

public class A04_TypeTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
ex) 형변환 예제	수박 12000 3 바나나 4000 5
 	형변환하여 아래와 같이 출력하세요
 	물건명	가격		갯수		계
 	수박		12000	3		36000
 	바나나	 4000	5		20000
  
  	총계 56000
 * */
		String water = args[0];
		String wprice = args[1];
		String wcnt = args[2];
		String bana = args[3];
		String bprice = args[4];
		String bcnt = args[5];
		
		int wtot = Integer.parseInt(wcnt)*Integer.parseInt(wprice);
		int btot = Integer.parseInt(bcnt)*Integer.parseInt(bprice);
		
		// \t : 탭 간격 띄우기, \n : 줄 바꾸기
		System.out.println("물건명\t가격\t갯수\t계");
		System.out.println(water+"\t"+wprice+"\t"+wcnt+"\t"+wtot);
		System.out.println(bana+"\t"+bprice+"\t"+bcnt+"\t"+btot);
		System.out.println("\n총계\t"+(wtot+btot));
		
	}

}
