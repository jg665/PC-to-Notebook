package javaexp.a05_object;

public class A11_Process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessExp p1 = new ProcessExp();
		p1.loop(5, 20);
		p1.loop(1, 20);
		p1.loop(3, 7);
		p1.loop(9, 25);
		p1.loop(8, 9);
		p1.countDown(10, 1);
		p1.bonusCal(0);
		
	}

}
// ex1) countDown(시작값 마지막) : 카운트 다운 처리하는 기능 메서드 / 감소처리
// ex2) bonusCal(입력값) : 입력값과 30%의 값을 합산한 결과 출력 처리 메서드.
//메서드1:물건명, 물건가격, 물건갯수를 통해 물건명과 총계를 출력하는 메서드
//메서드2:놀이공원에서 기본금액의 20%할인시 금액 출력 메서드 

class ProcessExp{
	void bonusCal(int pay) {
		System.out.println("입력값:"+pay);
		System.out.println("합산값:"+pay+(int)(pay*0.3));
	}
	void countDown(int start, int end) {
		System.out.println("#감소처리#");
		System.out.println("시작값:"+start);
		System.out.println("마지막:"+end);
		for(int cnt=start;cnt>=end;cnt--) {
			System.out.print(cnt+"\t");
		}
		System.out.println();
	}
	// 반복문의 시작값과 끝값을 매개변수로 넣고, 반복문을 처리한 후,
	void loop(int start, int end) {
		System.out.println("# 반복처리 #");
		System.out.println("시작값:"+start);
		System.out.println("마지막값:"+end);
		for(int cnt=start;cnt<=end;cnt++) {
			System.out.print(cnt+"\t");
		}
		System.out.println();
	}
}

