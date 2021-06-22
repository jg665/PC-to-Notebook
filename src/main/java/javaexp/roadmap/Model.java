package javaexp.roadmap;

import java.util.ArrayList;

public class Model {

	public void addAttribute(String key, ArrayList<Roadmap> rm) {
		System.out.println("#모델 데이터 처리#");
		System.out.println("key : " + key);
		System.out.println("objecet : " + rm);
	}
	
	public void addAttribute(String key, String m) {
		System.out.println("#모델 데이터 처리#");
		System.out.println("key : " + key);
		System.out.println("objecet : " + m);
	}
}