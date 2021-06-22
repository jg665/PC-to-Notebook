package javaexp.z01_vo;

public class Product {
	public String name;
	public int price;
	public int cnt;
	public Product(String name, int price, int cnt) {
		super();
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	// 출력하고, 총계 리턴 메서드 선언
	public int totShow() {
		System.out.println(name+"\t"+price+"\t"+cnt+"\t"+(price*cnt));
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
