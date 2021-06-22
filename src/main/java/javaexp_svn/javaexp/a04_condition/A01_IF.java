package javaexp.a04_condition;

public class A01_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
ctrl + shift + / : 다중 주석문 처리
# 조건문
1. if(boolean-true/false){
	  조건이 true일 때, 수행하는 구문
	}
	형식으로 특정한 조건에 해당할 때, 처리할 구문을 불럭으로
	설정하는 문장을 말한다.
	# 형식1
	if(조건1){
	 조건1이 true일 때, 처리할 코드
	}
	# 형식2
	if(조건1){
	 조건1이 true일 떄, 처리할 코드
	}else{
	 조건1이 false일 때, 처리할 코드
	}
	# 형식3
	if(조건1){
	 조건1이 true일 떄, 처리할 코드
	}else if(조건2){
	 조건1이 false, 조건2가 true일 때, 처리할 코드
	}else{
	 조건1, 조건2가 false일 때, 처리할 코드
	}
	switch(데이터){
		case 1: break;
		case 2: break;
		default:
	}
	이중조건문

# 반복문
	1) for(초기값;반복조건;증감연산자){
			반복할 구문
		}
	
		 */
		int point = 80;
		System.out.println("획득한 점수: "+point);
		if(point>=70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		// ex) 선택한 번호를 chNum으로 1~4번으로 임의로 넣고,
		// 	   번호가 3일때, 정답입니다. 그 외에는 오답입니다. 출력
		// hint) chNum == 3
		
		int chNum = 3;
		if(chNum==3) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		for(int cnt=1;cnt<=10;cnt++) {
			System.out.println("카운트: "+cnt);
		}
		// ex1) 5~15까지 반복
		// ex2) 100~90까지 카운트 다운
		// hint) 증감연산자 cnt--, 시작값이 100부터 반복조건이 90 이상
		for(int cnt=5;cnt<=15;cnt++) {
			System.out.println("5부터 15까지: "+cnt);
		}
		for(int cnt=100;cnt>=90;cnt--) {
			System.out.println("카운트 다운: "+cnt);
		}
		// 2씩 증가 처리
		for(int cnt=1;cnt<=20;cnt+=2) {
			System.out.println(cnt);
		}
/*
이 외에 반복
while(반복조건) {
	if(조건)
		break; // 특정 조건일때, 반복의 중지
}
do{

	적어도 1번은 실행 후 반복 처리 ex) 식당 방문시, 초기 "안녕하세요" 항상 1회 반복한다.

}while(반복조건);


# 반복문과 break와 continue
반복문 안에 if()을 활용하여 break는 완전 반복을 중단 처리,
continue(이후 구문은 수행하지 않는다)는 해당 step반 반복 내용을 다음 step으로 넘긴다.

* */
	
	}
}
