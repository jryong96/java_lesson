package koreaitday09a;

public class Crow extends Animal {//까마귀
	protected int wings;
	public Crow() {
		System.out.println("새로운 가족은 Crow입니다.");
	}
	public void fly() {
		
		System.out.println("특징 : 날기");
		setName("까마귀");
		setColor("검정");
	}

}
