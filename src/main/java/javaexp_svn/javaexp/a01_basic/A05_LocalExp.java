package javaexp.a01_basic;

public class A05_LocalExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product("가위");
		p1.setPrice(3000);
		p1.setCount(2);
		int returnData = p1.tot();
		System.out.println("리턴된 데이터: "+returnData);
	}

}
/*
ex) Product 클래스 선언하여 생성자로 물건명,
	기능메서드로 가격, 갯수를 입력받아서 총계를 처리한 내용을 계층 구조 변수에 의해 처리하세요
*/
class Product {
	private String name;
	private int price;
	private int count;
	// 객체 생성시 name의 필드값을 할당
	
	Product(String name){
		this.name = name;
	}
	// 생성 후 기능메서드로 필드값 price, cnt 할당
	public void setPrice(int price) {
		// int price는 입력받은 지역변수
		// this.price는 지역변수와 필드값을 구분하지 위하여 this 사용한 전역변수
		this.price = price;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public int tot() {
		System.out.println("구매한 물건: "+name+"\n가격: "+price+"\n갯수: "+count);
		System.out.println("총계: "+(count*price));
		return price*count;
	}
	
}
