package koreaitday09a;

public class AnimalTest {
public static void main(String[] args) {
	Animal animal = new Animal();
	animal.act();
	animal.print();
	System.out.println("----------------------");
	
	Dog dog = new Dog(); //dog클래스 객체 생성
	dog.run(); //dog 클래스에서 run메소드 실행
	dog.print(); //상속 메소드
	System.out.println("--------------------------");
	
	Crow crow = new Crow(); //crow 클래스 객체 생성
	crow.fly(); //crow클래스의 fly메소드 실행
	crow.print(); //상속메소드
	
	System.out.println(":::::::::::::::::::::::::::::::");

	Animal temp = dog; // 자식 객체는 부모클래스 타입으로 참조 할 수 있습니다. (자식클래스는 부모클래스타입으로 자동 형변환)
	temp.print();
	temp = crow;
	temp.print();
//	temp.run(); //오류 : 부모타입 변수로는 자식 메소드를 실행 할 수 없습니다.
//	temp.fly();	//오류 : 부모타입 변수로는 자식 메소드를 실행 할 수 없습니다.
	System.out.println("-----------------------------");
	Animal puppy = new Dog(); //자식객체는 부모클래스 타입으로 참조 할 수 없습니다.
	puppy.print();
//	puppy.run(); //오류 : 부모타입 변수로는 자식 메소드를 실행 할 수 없습니다.
	Dog puddle = (Dog)puppy; //Animal타입을 Dog타입으로 casting(형변환),(자식클래스 dog객체 이므로 가능)
	puddle.run(); //	puppy변수가 참조하는 객체가 Dog 타입일때만 가능
	puddle.print();
}
}
