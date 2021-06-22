package javaexp.z01_vo;
// javaexp.z01_vo Product
public class Product {
	private String name;
	private int price;
	private int cnt;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int price, int cnt) {
		super();
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	// 출력하고, 총계 리턴 메서드 선언.
	public int totShow() {
		System.out.println(name+"\t"+price
				+"\t"+cnt+"\t"+(price*cnt)); // 이걸 넣야지 전체 총계를 가져올 수 있다.
		return price*cnt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	

}
