package javaexp.z06_project;


// 화면에 넘겨줄 임시 모델 객체
public class Model {
	public void addAttribute(String key, Object ob) {
		System.out.println("# 모델 데이터 처리#");
		System.out.println("Key:"+key);
		System.out.println("객체:"+ob);
		// key 값으로 데이터 넘겨준다.
	}
}
