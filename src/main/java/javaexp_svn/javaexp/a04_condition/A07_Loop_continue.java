package javaexp.a04_condition;

public class A07_Loop_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 반복문의 제어
1. 반복문의 제어를 위해서는 break와 continue가 사용된다.
2. break문은 if()와 함께 해당 반복을 중단처리해준다.
3. continue는 if와 함께 해당 단위 반복 내용을 중단하고, 다음 반복을 수행 처리해준다.				
				*/
		System.out.println("# break를 만났을 때 #");
		for(int cnt=1;cnt<=10;cnt++) {
			if(cnt==5) {
				System.out.println("곰돌이 단식 투쟁!");
				break;
			}
			System.out.println("곰돌이가 먹은 "+cnt+"번째 호떡!");
		}
		System.out.println("# continue를 만났을 때 #");
		for(int cnt=1;cnt<=10;cnt++) {
			if(cnt==5) {
				System.out.println(cnt+"번째 호떡은 맛이 없어보이네요!");
				continue;
			}
			System.out.println("곰돌이가 먹은 "+cnt+"번째 호떡!");
		}
		/* ex) 한달에 1~30일 개발자가 근무하되, 1일부터 시작하는 월요일이 있는
			   달이어서 토/일에 해당하는 날은 근무를 하지 않는다. continue문 활용하여
			   아래와 같이 출력하세요.
			   1일	개발자 열심히 개발을 하다.
			   ..
			   6일	토요일은 취미생활	%연산자 활용
			   7일	일요일은 가족과 함께
		**/
		System.out.println("# 개발자 시간표 #");
		for(int cnt=1;cnt<=30;cnt++) {
			if(cnt%7==6) {
				System.out.println(cnt+"일\t토요일은 취미생활");
				continue; // 그 다음 프로세스 실행하지 않음
			}
			if(cnt%7==0) {
				System.out.println(cnt+"일\t일요일은 가족과 함께");
				continue;
			}
			System.out.println(cnt+"일\t개발자 열심히 개발을 하다.");
		}
		
	
	
	}

}
