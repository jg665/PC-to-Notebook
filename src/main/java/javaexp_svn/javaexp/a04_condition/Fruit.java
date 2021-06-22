package javaexp.a04_condition;

public class Fruit {
	private String name;
	private String color;
	public Fruit(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	public String showFru() {
		return name+"("+color+")";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
