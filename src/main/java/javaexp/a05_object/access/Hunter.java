package javaexp.a05_object.access;

import javaexp.a05_object.access.friendship.WoodCutter;

public class Hunter {
	void callData() {
		WoodCutter wc = new WoodCutter();
		// private 외부 클래스 접근 불가..
//		System.out.println(wc.hiddenCloth);
		
		//다른 패키지 클래스에서는 접근 이가능..
		//접근 제어자가 default일때,
		// 접근이 불가능 하다.
		
//		System.out.println(wc.hiddenDeer);

	}

}
