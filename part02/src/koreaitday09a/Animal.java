package koreaitday09a;

public class Animal {
	
	
	private String name;
	private String color;
	
	public Animal() {
		System.out.println("���ο� ������ ������ϴ�.");
	
	}
	
	
	public void act() {
		System.out.println("Animal �ൿ : ������(unknown)");
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
	public void print() {
	System.out.println("name : "+name+ ", color : "+color);
	}
}
