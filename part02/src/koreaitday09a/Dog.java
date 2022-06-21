package koreaitday09a;


public class Dog extends Animal { //Animal 클래스를 상속받기
	
	protected int legs;
	public Dog() {
		System.out.println("새로운 가족은 Dog입니다.");
	}
	public void run() {
		System.out.println("특징 : 달리기");
		setName("강아지");
		setColor("브라운");
		
	}
}

