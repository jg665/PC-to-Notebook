package javaexp.a05_object.access.woodcutterhome;

public class Angel {
	public void callData() {
		WoodCutter wc = new WoodCutter();
		// 같은 패키지일지라도 접근제어자 private는 접근 불가
//		System.out.println(wc.hiddenCloth);
		System.out.println(wc.savingMoney);
		// package범위로 접근하는 멤버는 그 이상의
		// protected나 public도 접근이 가능하다.
		System.out.println(wc.inheritMoney);
		System.out.println(wc.weddingDaughterDate);
	}
}
