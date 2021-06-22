package javaexp.a05_object.access;

import javaexp.a05_object.access.friendship.WoodCutter;

public class Hunter {
	void callData() {
		WoodCutter wc = new WoodCutter();
		// 같은 패키지 클래스에서는 접근이 가능
		// 접근 제어자가 default일 때,
		// 접근이 불가능 하다.
//		System.out.println(wc.hiddenDeer);
		// 접근 제어자가 private일 때도,
		// 접근이 불가능 하다.
//		System.out.println(wc.hiddenCloth);
		
	}
}
