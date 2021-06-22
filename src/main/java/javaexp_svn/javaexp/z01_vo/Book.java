package javaexp.z01_vo;

public class Book {
	private String name;
	private String writer;
	private int price;
	public Book(String name, String writer, int price) {
		super();
		this.name = name;
		this.writer = writer;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
	
}
