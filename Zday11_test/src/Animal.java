

public class Animal {
	
	
	private String name;
	private String color;
	
	public Animal() {
		System.out.println("새로운 가족이 생겼습니다.");
	
	}
	
	
	public void act() {
		System.out.println("Animal 행동 : 아직모름(unknown)");
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
