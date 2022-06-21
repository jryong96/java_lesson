package koreaitday10;
import koreaitday09a.Animal;
import koreaitday09a.Crow;
import koreaitday09a.Dog;
public class AnimalTest2 {
public static void main(String[] args) {
	Animal ani1 = new Frog(); //업캐스팅 : 부모한테 참조시킴 >> 자동변환       업캐스팅 <-> 다운캐스팅 : 마찬가지로 강제변환
	Animal ani2 = new Cat();
	
	Dog puddle = new Dog();
	Crow crow = new Crow();
	//자식객체가 생성될 때 먼저 부모클래스 객체를 생성하면서 부모클래스 생성자 실행
	animal(ani1);
	animal(puddle);
	animal(crow);
	animal(new Frog()); // :새로운 객체 Frog 대입
}

// 다형성  (자바의 특징중 하나)
// 여기서는 메소드 인자 혹은 리턴 타입이 Animal : Animal, Dog , Crow , Frog , Cat 객체 모두 가능!
public static void animal(Animal animal) {
	animal.print(); 
	//인자로 전달받은 animal 객체가 참조하는 것의 진짜 타입 (인스턴스 타입) 을 검사 : instacneof 
	System.out.println("dog= ? "+(animal instanceof Dog)); //객체 참조변수 instacneof 클래스명
	System.out.println("cat= ? "+(animal instanceof Cat));
	System.out.println("crow= ? "+(animal instanceof Crow));
	System.out.println("Frog= ? "+(animal instanceof Frog));
//Animal 부 모타입 참조는 자식클래스 필드와 메소드 접근 못함.
	
	//	animal.jump(); //frog
//	animal.run();  //dog
//	animal.fly(); //Crow
//	animal.sound(); //Cat
	Cat cat;
	if(animal instanceof Cat)
	cat = (Cat)animal;
}
}
class Frog extends Animal {//개구리
	protected String mouth;
	public Frog() {
		System.out.println("새로운 가족은 Forg입니다.");
	}
	public void jump() {
		
		
		setName("개구리");
		setColor("초록");
		System.out.println("특징 : 점핑");
	}

}
class Cat extends Animal { //Animal 클래스를 상속받기
	
	protected String eyes;
	public Cat() {
		System.out.println("새로운 가족은 Cat입니다.");
	}
	public void sound() {
		
		setName("고양이");
		setColor("삼색");
		System.out.println("특징 : 야옹");
	}
}





		
	


	
	
	


