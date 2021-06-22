// ex) javaexp.a05_object.vo.패키지 안에
		// 필드(속성) 물건명(name) 가격(price) 갯수(cnt)
		// 	생성자 선언 물건호출 출력!!
		// 	메서드 물건의 메서드 출력!!
		// 클래스를 객체로 생성하세요..
package javaexp.a05_object.vo;

public class Product {
	public String name;
	public int price;
	public int cnt;
	public Product() {
		System.out.println("물건 객체 생성자 호출!!");
	}
	public Product(String name, int price, int cnt) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	
	public String call() {
		System.out.println("물건의 기능 메서드 호출");
		
		return "물건 정보 리턴";
	}
	
	public void buy() {
		System.out.println("구매한 물품 "+name+", 단가 " +price
				+"원, 구매갯수 "+cnt+", 총비용 "+(price*cnt)+"원");
		
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