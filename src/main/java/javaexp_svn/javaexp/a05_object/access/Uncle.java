package javaexp.a05_object.access;

import javaexp.a05_object.access.woodcutterhome.WoodCutter;

public class Uncle {
	public void callData() {
		WoodCutter wc = new WoodCutter();
//		System.out.println(wc.hiddenCloth);
//		System.out.println(wc.savingMoney);
//		System.out.println(wc.inheritMoney);
		// 외부 패키지에 있는 클래스는 public만 접근 가능
		System.out.println(wc.weddingDaughterDate);
	}
}
