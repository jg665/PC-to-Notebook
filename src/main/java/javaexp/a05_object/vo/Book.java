package javaexp.a05_object.vo;

public class Book {
	public String name;
	public String writer;
	public int price;
	
	public Book(String name, String writer, int price) {
		this.name = name;
		this.writer = writer;
		this.price = price;
	}
	
}


// ex2) Book 클래스 생성, 도서면, 저자, 가격 속성 설정 생성자를 
// 통해 초기화 처리하고 필드를 출력하세요.