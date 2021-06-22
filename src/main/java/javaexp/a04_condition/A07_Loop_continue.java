package javaexp.a04_condition;

public class A07_Loop_continue {
/*
# 반복문의 제어
1. 반복문의 제어를 위해서는 break와 continue 가 사용된다.
2. break문은 if()와 함께 해당 반복을 중단처리 해준다.
3. continue는 if와 함께 해당 단위 반복 내용을 중단하고,
	다음 반복을 수행 처리해준다.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("# break을 만났을 때 # ");
		for(int cnt=1;cnt<=10;cnt++) {
				if(cnt ==5) {
					System.out.println("곰돌이 단식투쟁!!");
					break;
				}
				System.out.println("곰돌이가 먹은 " +cnt+"번째 호떡!!");
		}
		System.out.println("# continue를 만났을 때 #");
		for(int cnt=1;cnt<=10;cnt++) {
			if(cnt ==5) {
				System.out.println(cnt+"번째는 호떡은 맛이 없어 보이네요.!!");
				continue;
				}
				System.out.println("곰돌이가 먹은 " +cnt+"번째 호떡!!");
		}
		//ex) 한달에 1~30의 개발자가 근무하되, 1일부터 시작하는 월요일이 있는 
		//	달이어서 토/일에 해당하는 날은 근무를 하지 않는다. continue문 활용
		//	아래와 같이 출력하세요..
		//	1일째 개발자 열심히 개발을 하다.
		//	2일째 개발자 열심히 개발을 하다.
		//	..
		//	6일째는 토요일은 취미생활 %연산자 활용
		//	7일째는 일요일은 가족과 함께..
		
		for(int cnt=1;cnt<=30;cnt++) {
			if(cnt%7==6) { // 나머지값이 6일때가 토요일..
				System.out.println(cnt+"일째 토요일은 취미생활");
				continue; // 그 다음 프로세스 실행하지 않음..
				
			}
			if(cnt%7==0) { // 나머지값이 없을 때, 일요일.. // 그 다음 프로세스 시작
				System.out.println(cnt+"일요일은 가족과 함께");
				continue; // 조건식이 참이되면 continue문 수행되면 블럭 끝 이동. break문과 달리 반복문 벗어나지 않음.
			}
			System.out.println(cnt+"일째 개발자 열심히 개발을 하다.");
			
			}
		
	}

}
