package javaexp.a11_io;

import java.io.IOException;
import java.io.InputStream;

public class A02_InputStreamExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
	System.out.println("데이터를 입력하세요(문자 한자)!!");
	//console창에서 입력받을 수 있는 객체는 System.in
	is = System.in;
	try {
		int num = is.read();
		System.out.println("입력된 코드 번호:"+num);
		System.out.println("입력된 문자:"+(char)num);
		

ex1) 정답을 입력하세요 :
	 1단계) 입력받은 번호는 @@ 번입니다 -> 출력
	 2단계) 조건문을 이용해서 임의의 번호가 맞을때 정답/오답
	 3단계) 임의의 번호를 랜덤으로 1~4사이 발생하게 처리
	 	char 문자열이아니고, 문자이기 때문에 stack영역에 데이터가 할당된다.
	 	랜덤숫자는 숫자형식, 입력한데이터는 문자라서 1 == '1' (x) 전환이 필요하다
				*/

		/*
		 * try { int num = is.read(); System.out.println("입력받은 번호는 "+num+"입니다."); if(num
		 * == 65) { System.out.println("정답"); }else { System.out.println("오답"); } }
		 * catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } finally { try { is.close(); } catch (IOException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); } }
		 */
		//  답)	

		//1, '1'
		//println():다음라인에서 입력
		//print():현재라인마지막에 입력
	System.out.println("정답을 입력하세요(1-4):");
		InputStream is = System.in;
		
		try {
			
			char inDate = (char)is.read();
			System.out.println("입력 받은 번호는:"+inDate+"번입니다");
			char corNum = '3'; //정답번호 설정..
			if(inDate ==  corNum) {
				System.out.println("정답");
				
			}else {
				System.out.println("오답");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//	String num= "";
//	System.out.println("입력받은 번호는"+num+"번 입니다.");
//	for(int cnt=1;cnt<=3;cnt++) {
//		int code = (int)(Math.random()*+1);
//		num+=code;
		
		
		
		
	}
	

	}

