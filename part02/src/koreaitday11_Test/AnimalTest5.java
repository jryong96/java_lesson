package koreaitday11_Test;
import koreaitday09a.Animal;
import koreaitday09a.Crow;
import koreaitday09a.Dog;
public class AnimalTest5 {
public static void main(String[] args) {
	
}

// ������  (�ڹ��� Ư¡�� �ϳ�)
// ���⼭�� �޼ҵ� ���� Ȥ�� ���� Ÿ���� Animal : Animal, Dog , Crow , Frog , Cat ��ü ��� ����!
public static void animal(Animal animal) {
	animal.print(); 
	//���ڷ� ���޹��� animal ��ü�� �����ϴ� ���� ��¥ Ÿ�� (�ν��Ͻ� Ÿ��) �� �˻� : instacneof 
	System.out.println("dog= ? "+(animal instanceof Dog)); //��ü �������� instacneof Ŭ������
	System.out.println("cat= ? "+(animal instanceof Cat));
	System.out.println("crow= ? "+(animal instanceof Crow));
	System.out.println("Frog= ? "+(animal instanceof Frog));
//Animal �� ��Ÿ�� ������ �ڽ�Ŭ���� �ʵ�� �޼ҵ� ���� ����.
	
	//	animal.jump(); //frog
//	animal.run();  //dog
//	animal.fly(); //Crow
//	animal.sound(); //Cat
	Cat cat;
	if(animal instanceof Cat)
	cat = (Cat)animal;
}
}
class Frog extends Animal {//������
	protected String mouth;
	public Frog() {
		System.out.println("���ο� ������ Forg�Դϴ�.");
	}
	public void jump() {
		
		
		setName("������");
		setColor("�ʷ�");
		System.out.println("Ư¡ : ����");
	}

}
class Cat extends Animal { //Animal Ŭ������ ��ӹޱ�
	
	protected String eyes;
	public Cat() {
		System.out.println("���ο� ������ Cat�Դϴ�.");
	}
	public void sound() {
		
		setName("�����");
		setColor("���");
		System.out.println("Ư¡ : �߿�");
	}
}





		
	


	
	
	


