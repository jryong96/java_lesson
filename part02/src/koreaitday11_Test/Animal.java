package koreaitday11_Test;

public class Animal {
	//�߻� Ŭ����
	private String name;
	private String color;
	
	public Animal() {
		System.out.println("���ο� ������ ������ϴ�.");
	
	}
	
	//�߻�޼ҵ� ����
	public abstract void act() {
		System.out.println("Animal �ൿ : ������(unknown)");
	}
	//�� �ٸ� �߻�޼ҵ� 
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
