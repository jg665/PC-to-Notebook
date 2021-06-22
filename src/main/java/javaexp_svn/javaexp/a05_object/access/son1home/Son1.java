package javaexp.a05_object.access.son1home;

import javaexp.a05_object.access.woodcutterhome.WoodCutter;

public class Son1 extends WoodCutter {
	public void callData() {
		WoodCutter wc = new WoodCutter();
		// 상속관계(public class Son1 extends WoodCutter)
		// 에 있는 외부 패키지에 위치한 클래스
		// 1. private는 접근 불가
//		System.out.println(hiddenCloth);
		// 2. dafault 같은 패키지에 있어야지 접근 가능
//		System.out.println(savingMoney);
		// 3. protected 외부 패키지더라도 상속관계에 있으면 접근 가능
		System.out.println(inheritMoney);
		// 4. public 어떤 패키지에 있더라도 접근 가능
		System.out.println(weddingDaughterDate);
	}
}
