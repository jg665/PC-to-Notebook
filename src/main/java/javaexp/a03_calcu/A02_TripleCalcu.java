package javaexp.a03_calcu;

import java.util.Scanner;

public class A02_TripleCalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
/*
# 삼항연산자
1.	세 개의 피연산자를 필요로 하는 연산자를 말한다
2.	앞의 조건식 결과에 따라 콜론(:) 앞 뒤에 피연산자 선택 ==> 조건 연산식
	 조건식 ? 결과값1 : 결과값2;
	 조건식이 true이면 결과값1로 할당처리 조건식이 false이면 결과값2 할당 
 */
		int point = 70;
		String result = point>=70?"합격":"불합격";
		System.out.println("결과내용:"+result);
		// ex) 3항연산자를 이용해서 나이를 받아서 무료(65이상과 5세미만)
		//		와 유료를 처리하세요.
		//	age<5 || age<=65
//		System.out.println("나이를 입력하세요:");
//		int age = sc.nextInt();
//		System.out.println(age+"세의 입장료는"+(age>=65||age<5?"무료":"유료")+" 입니다.");
//		
//	
		
		System.out.println("나이 입력");
		int age1 = sc.nextInt();
		System.out.println(age1+"입장료"+(age1>=65||age1<5?"무료":"유료")+"이다");
		}
		
	}

