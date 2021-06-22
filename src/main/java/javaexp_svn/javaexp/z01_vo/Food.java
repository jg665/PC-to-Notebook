package javaexp.z01_vo;
// javaexp.z01_vo.Food
public class Food {
	private String name;
	private int price;
	private String loc;
	// Source 란에서 디폴드 생성자 데려온것
	public Food() {
		super(); // = 상위객체의 생성자(모든 객체의 상위객체인 Object의 생성자)
		// TODO Auto-generated constructor stub
	}
	public Food(String name, int price, String loc) {
		super();
		this.name = name;
		this.price = price;
		this.loc = loc;
	}
	// Source 란에서 generated constructor fiel로 눌러서 들어오면 이렇게 함께 생성됨
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
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	// getter, setter 메서드로 데려온 것
	// 필드에 대한 직접적인 접근은 못하지만, 간접적으로 입력하는 메서드/호출하는 메서드를 분리시켜 처리하게 해준다.
}
