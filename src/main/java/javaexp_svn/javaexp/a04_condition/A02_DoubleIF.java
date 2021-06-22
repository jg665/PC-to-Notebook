package javaexp.a04_condition;

import java.util.Scanner;

public class A02_DoubleIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		

 # 중첩조건문/반복문의 혼합 처리
	for(){
		if(){}
	}
	if(){
		while(){}
	}
	while(){
		if(){}
	}
	for(){
		for(){}
	}

1. 이중 반복문/중첩 반복문을 통해
	1) 최대값
	2) 최소값
	3) 정렬처리
==> 알고리즘 연습
	
		
*/		
		// ex1) id//pass을 Scanner를 입력받되,
		//		id 체크를 먼저하고 pass 체크하여 himan//7777
		//		4가지 경우에 대하여 출력하세요
		//		1. 인증완료
		//		2. 패스워드를 확인하세요
		//		3. 아이디를 확인하세요
		//		4. 아이디, 패스워드 둘다 틀렸습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력하세요: ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력하세요: ");
		int pass = sc.nextInt();
		if(id.equals("himan")) {
			if(pass==7777) {
				System.out.println("인증완료");
			}else {
				System.out.println("패스워드를 확인하세요");
			}
		}else {
			if(pass==7777) {
				System.out.println("아이디를 확인하세요.");
			}
			else {
				System.out.println("아이디, 패스워드 둘다 틀렸습니다.");
			}
		}

		
		
	}

}
