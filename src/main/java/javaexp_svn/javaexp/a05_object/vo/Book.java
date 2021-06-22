package javaexp.a05_object.vo;

public class Book {
	public String name;
	public String author;
	public int price;
	
	public Book() {
		System.out.println("생성자 호출!");
	}
	
	public Book(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
}
