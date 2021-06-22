package javaexp.team02;

public class Product {
	private String name; // 상품명
	private int price; // 정가
	private double discPercent; // 할인율
	private double rating; // 평점
	private int reviewCount; // 리뷰 갯수
	
	// 변수에 저장된 데이터를 모두 출력
	public Product(String name, int price, double discPercent, double rating, int reviewCount) {
		super();
		this.name = name;
		this.price = price;
		this.discPercent = discPercent;
		this.rating = rating;
		this.reviewCount = reviewCount;
	}
	public void ProductData() {
		/*
		* 할인율: 10%
		* 상품명: 상품 이름 예시
		* 정가: 10,000원
		* 할인가: 9,000원
		* 평점: 4.5
		* 리뷰수: (10)
		* ==================================
		*/
		System.out.print(String.format("할인율: %s%%\n", discPercent*100));
		System.out.print(String.format("상품명: %s\n", name));
		System.out.print(String.format("정가: %s원\n", price));
		System.out.print(String.format("할인가: %s원\n", (price - (price * discPercent))));
		System.out.print(String.format("평점: %s\n", rating));
		System.out.print(String.format("리뷰수: (%s)\n", reviewCount));
		System.out.println("==================================");
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
	
	public double getDiscPercent() {
		return discPercent;
	}

	public void setDiscPercent(double discPercent) {
		this.discPercent = discPercent;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}
}

	
