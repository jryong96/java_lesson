package koreaitday09a;

public class ClassAA extends ClassA { //super(�θ�) Ŭ������ ClassA
	
//ClassA�� �ν��Ͻ� �޼ҵ�
	void test() {
		//name �ʵ带 ��ӹ޾ұ� ������ ���� x : ���⼭ ���� ���� ����!
		setName("haha");
		
		System.out.println("name ="+ name);
	}
 



////������ ������ ���� �׽�Ʈ �� ���� ����. ****�� public Ŭ�������� 1����****  
//class Test {
//	public static void main(String[] args) {
//		ClassAA test1 = new ClassAA(); //ClassAA ��� ��ü ����
//		test1.ab = 123; // test1�� �����ϴ� ��ü�� ��ӹ��� �ʵ�
//		test1.name = "hello"; // ��ӹ��� �ʵ�
//		
//		//��ӹ��� �޼ҵ�
//		test1.print();
	
}
