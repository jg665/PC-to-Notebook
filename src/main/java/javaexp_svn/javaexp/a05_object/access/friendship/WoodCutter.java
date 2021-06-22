package javaexp.a05_object.access.friendship;

public class WoodCutter {
	private String hiddenCloth = "뒷동산 바위 밑에";
	String hiddenDeer = "덤불속에 숨김";
	
	void callData() {
		System.out.println(hiddenDeer);
		System.out.println(hiddenCloth);
	}
}
