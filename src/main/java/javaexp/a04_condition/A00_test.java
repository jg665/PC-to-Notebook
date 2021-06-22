package javaexp.a04_condition;

import java.util.Scanner;

public class A00_test {

	/*
if(조건1){
	조건 1의 연산 결과가 ture 일때 수행될 문장을 적는다.
		if(조건2){
			조건1 조건2이 모두 true, 수행될 문장
		}else{
			조건1이 true 조건2가 false 일때, 수행될 문장..
		}
	}else{
		조건1이 false일때 수행되는 문장...
		}
		 */
	
//	중첩 조건문 예제
//	1. 국어/영어 점수를 입력받아서 둘다 80점이상인 경우 A,
//    국어만 80점 이상인경우 B, 영어만 80점 이상인 경우 C
//    둘다 80점 미만인 경우 D 등급으로 표시하세요
	
//	4개 조건이 되게 조건문을 만들어 보세요..
// ex) 영어 80 이상 되고 수학 80이상이면 그 안에서 수학점수 100점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요:");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		int eng = sc.nextInt();
		if(kor>=80) { //국어 점수가 80 이상이면 true일때 수행됨
			if(eng>=80) { //국어 점수가 80이고 영어 점수가 80일때 = A
				System.out.println("국어와 영어점수가 80점 이상일때:"+"A");
			}else { // 국어가 80점이고 영어가 80점이 아닐때 = B
				System.out.println("국어만 80점 이상일경우 :" +"B");
			}
		}else { // 국어점수가 80이 아닐때 수행되는 문장
			if(eng>=80) {
				System.out.println("영어만 80점 이상일경우:"+"C");
			}else {
				System.out.println("국어점수와 영어점수 둘다 80미만:"+"D");
				
			}
		}
		
//		int kor = 80;
}
}
