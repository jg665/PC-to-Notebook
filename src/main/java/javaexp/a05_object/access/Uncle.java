package javaexp.a05_object.access;

import javaexp.a05_object.access.woodcutterhome.WoodCutter;

public class Uncle {
	public void callDate() {
		WoodCutter wc = new WoodCutter();
		//같은 패키지일지라도 접근제어자 private는 접근 불가
//		System.out.println(wc.hiddenCloth);
//		System.out.println(wc.savingMoney);
//		System.out.println(wc.inheritMoney);
		// 외부 패키지에 있는 클래스는 public 일때만 접근
		System.out.println(wc.weddingDaugherDate);

	}
}
