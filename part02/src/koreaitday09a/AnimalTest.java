package koreaitday09a;

public class AnimalTest {
public static void main(String[] args) {
	Animal animal = new Animal();
	animal.act();
	animal.print();
	System.out.println("----------------------");
	
	Dog dog = new Dog(); //dogŬ���� ��ü ����
	dog.run(); //dog Ŭ�������� run�޼ҵ� ����
	dog.print(); //��� �޼ҵ�
	System.out.println("--------------------------");
	
	Crow crow = new Crow(); //crow Ŭ���� ��ü ����
	crow.fly(); //crowŬ������ fly�޼ҵ� ����
	crow.print(); //��Ӹ޼ҵ�
	
	System.out.println(":::::::::::::::::::::::::::::::");

	Animal temp = dog; // �ڽ� ��ü�� �θ�Ŭ���� Ÿ������ ���� �� �� �ֽ��ϴ�. (�ڽ�Ŭ������ �θ�Ŭ����Ÿ������ �ڵ� ����ȯ)
	temp.print();
	temp = crow;
	temp.print();
//	temp.run(); //���� : �θ�Ÿ�� �����δ� �ڽ� �޼ҵ带 ���� �� �� �����ϴ�.
//	temp.fly();	//���� : �θ�Ÿ�� �����δ� �ڽ� �޼ҵ带 ���� �� �� �����ϴ�.
	System.out.println("-----------------------------");
	Animal puppy = new Dog(); //�ڽİ�ü�� �θ�Ŭ���� Ÿ������ ���� �� �� �����ϴ�.
	puppy.print();
//	puppy.run(); //���� : �θ�Ÿ�� �����δ� �ڽ� �޼ҵ带 ���� �� �� �����ϴ�.
	Dog puddle = (Dog)puppy; //AnimalŸ���� DogŸ������ casting(����ȯ),(�ڽ�Ŭ���� dog��ü �̹Ƿ� ����)
	puddle.run(); //	puppy������ �����ϴ� ��ü�� Dog Ÿ���϶��� ����
	puddle.print();
}
}
