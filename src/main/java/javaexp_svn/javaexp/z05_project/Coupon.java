package javaexp.z05_project;

public class Coupon {
	private String name;
	private int cnt;
	private int discount;
	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coupon(String name, int discount) {
		super();
		this.name = name;
		this.discount = discount;
	}
	public String getName() {
		return name;
	}
	public int getCnt() {
		return cnt;
	}
	public int getDiscount() {
		return discount;
	}
	
	

}
