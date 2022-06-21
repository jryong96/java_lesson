package koreaitday11_Test;

public class Animal {
	//추상 클래스
	private String name;
	private String color;
	
	public Animal() {
		System.out.println("새로운 가족이 생겼습니다.");
	
	}
	
	//추상메소드 변경
	public abstract void act() {
		System.out.println("Animal 행동 : 아직모름(unknown)");
	}
	//또 다른 추상메소드 
	public abstract String eat(object object);
	
	public void print() {
		System.out.println("name = "+name + "color = "+color);
	}
	//getter setter
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
