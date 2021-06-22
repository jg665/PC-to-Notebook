package javaexp.a04_condition;

public class Fruit {
	private String color;
	private String name;
	public Fruit(String color, String name) {
		super();
		this.color = color;
		this.name = name;
	}
	public String show() {
		return name+"("+color+")";
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String name) {
		this.color = color;
	}
	public String getFruit() {
		return name;
	}
	public void setFruit(String name) {
		this.name = name;
	}
	

}
