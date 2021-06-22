package javaexp.a14_generic;

import javaexp.z01_vo.Product;

public class A05_MultiGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# generic을 활용하여
가변적인 여러 객체의 속성 설정하여 처리하기
1. 형식
	class 클래스명<K,V>{
		private K key;
		private V value;
	}
	위와 같이 두가지 이상의 속성을 가변적으로 객체로 사용해서 
	활용할 수 있다.
	호출시,
	클래스명<사용할타입1, 사용할타입2> 참조;
	ex) Pair<Integer, String> 
			p01
 */
		Pair<Integer, String> 
			p01 = new Pair<Integer,String>(1,"사과");
		Pair<Integer, String> 
			p02 = new Pair<Integer,String>(2,"바나나");
		System.out.println(p01.getKey()+":"+p01.getValue());
		System.out.println(p02.getKey()+":"+p02.getValue());
		Pair<Integer, Product>
			p03 = new Pair<Integer, Product>(
					3, new Product("오렌지",4000,2));
		System.out.println(p03.getKey());
		// value로 객체가 할당 되어있기에 객체를 가져올 수 있다.
		Product pro = p03.getValue();
		System.out.println(pro.getName());
//		ex) OracleInfo<String,String>으로 처리할 수 있께
//			generic 객체를 선언하여, 아래 유형의 값을 할당하고 출력할
//			수 있게 하세요..
/*
		driver=oracle.jdbc.OracleDriver
		url=jdbc:oracle:thin:@localhost:1521:orcl
		username=scott
		password=tiger
 */
		OracleInfo<String, String>
			o01 = new OracleInfo<String, String>("driver","oracle.jdbc.OracleDriver");
		OracleInfo<String, String>
			o02 = new OracleInfo<String, String>("url","jdbc:oracle:thin:@localhost:1521:orcl");
		OracleInfo<String, String>
			o03 = new OracleInfo<String, String>("username","scott");
		OracleInfo<String, String>
			o04 = new OracleInfo<String, String>("password","tiger");
		System.out.println(o01.getKey()+":"+o01.getValue());
		System.out.println(o02.getKey()+":"+o02.getValue());
		System.out.println(o03.getKey()+":"+o03.getValue());
		System.out.println(o04.getKey()+":"+o04.getValue());
	
		
		
		baseball<String, String, String>
			bb01 = new baseball<String, String, String>("두산베어스","홍길동","1승");
		baseball<String, String, Double>
			bb02 = new baseball<String, String, Double>("SK","나영도",0.301);
		baseball<String, String, Integer>
			bb03 = new baseball<String, String, Integer>("NC","김영수",30);
		System.out.println("팀명:"+bb01.getT()+" 선수:"+bb01.getP()+" 기록:"+bb01.getR());
		System.out.println("팀명:"+bb02.getT()+" 선수:"+bb02.getP()+" 기록:"+bb02.getR());
		System.out.println("팀명:"+bb03.getT()+" 선수:"+bb03.getP()+" 기록:"+bb03.getR());
		
	/*
ex)팀명,선수,기록들 할당할 수 있게 처리
class BaseBall<T,P,R>{

}
	 */
	}
}

class baseball<T,P,R>{
	private T t;
	private P p;
	private R r;
	public baseball(T t, P p, R r) {
		super();
		this.t = t;
		this.p = p;
		this.r = r;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public P getP() {
		return p;
	}
	public void setP(P p) {
		this.p = p;
	}
	public R getR() {
		return r;
	}
	public void setR(R r) {
		this.r = r;
	}
	
}

class OracleInfo<K,V>{
	private K key;
	private V value;
	public OracleInfo(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

class Pair<K,V>{
	private K key;
	private V value;
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}