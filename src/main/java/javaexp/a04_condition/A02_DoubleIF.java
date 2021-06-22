package javaexp.a04_condition;

import java.util.Scanner;

public class A02_DoubleIF {
/*
# 계층적 조건문의 처리
1. 조건문은 해당 조건을 기준으로 다신 조건문을 
	사용할 수 있다. ==> 중첩 if문이라고 한다.
2. 기본 형식
	if(조건1){}
		
		if(조건2){
			조건1이고 조건2일 때, 처리할 구문
		}else{
			조건1이고 조건2가 아닐 때, 처리할 구문..
		}
	}else{
	
	}
# 중첩 조건문/반복문의 혼합 처리..
for(){
	if()
}
if(){
	while(){}
}
while(true){
	if(){}
}
for(){
	for(){
	
	}
}
1. 이중 반복문/중첩반복문의 통해
	1) 최대값
	2) 최소값
	3) 정렬처리
	==> 알고리즘 처리
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ckMale = "Y";
		boolean isMale = ckMale.equals("Y"); // 남자인지 여부
		int age = 17;
		if(isMale) {
			if(age>=20) {
				System.out.println("신사 입니다.");
			}else {
				System.out.println("소년 입니다.");
			}
		}else {
			if(age>=20) {
				System.out.println("숙녀 입니다.");
			}else {
				System.out.println("소녀 입니다.");
			}
		}

		// ex1) id//pass을 Scanner를 입력받되,
		//	id check를 먼저하고 pass체크하여 himan//7777
		//	4가지 경우에 대하여 출력
		//	1. 인증완료
		//	2.	패스워드를 확인하세요.
		//	3.	아이디를 확인하세요
		//	4. 아이디 패스워드를 둘다 틀렸습니다 . (1조)
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력하세요:");
		String id = sc.nextLine();
		System.out.println("패스워드를 입력하세요:");
		int pass = sc.nextInt();
			if( id.equals("himan")) {
				if(pass==7777){
				System.out.println("인증완료!!");
			}else { 
				System.out.println("패스워드를 확인하세요.");
				}
			
		}else {
			if(pass==7777){
			System.out.println("아이디를 확인하세요");
		}else { 
			System.out.println("아이디 패스워드 둘다 틀렸습니다.");
			}
			
		}
		
			
			
	}
	

}		

//Scanner sc = new Scanner(System.in);
//System.out.println("국어 점수를 입력하세요:");
//int kor = sc.nextInt();
//System.out.println("영어 점수를 입력하세요:");
//int eng = sc.nextInt();
//if(kor>=80 && eng>=80) {
//	System.out.println("A");
//}if(kor<80 && eng<80) {
//	System.out.println("D");
//}else {
//	System.out.println("B");
////}else {
////	System.out.println("C");
		

