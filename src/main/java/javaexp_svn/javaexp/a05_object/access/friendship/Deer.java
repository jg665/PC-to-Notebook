package javaexp.a05_object.access.friendship;

public class Deer {
	void callData() {
		WoodCutter wc = new WoodCutter();
// 		접근 제어자가 private는 외부에서 접근을 하지 못한다.
//		System.out.println(wc.hiddenCloth);
		// 같은 패키지 클래스에서는 접근이 가능 (default) 제어자
		System.out.println(wc.hiddenDeer);
	}
}
