package koreaitday11;

import koreaitday10.Person;

public class ClassAbTest {
public static void main(String[] args) {
	Person momo = new Person();
//	Class abs = new ClassAbs(); //���� : ClassAbs�� �߻�Ŭ���� new�Ұ���!
	 ClassAbs abs = new ClassX();	//�θ�Ÿ�� ����
	 ClassX cls = new ClassX();		// ����(�ڽ�) Ŭ���� Ÿ�� ���� 
	 System.out.println("ù��° ���� : test �޼ҵ�");
	 abs.test();
	 cls.test();
	 abs.name = "�����"; //name�� �θ�Ŭ���� �ʵ�
	 cls.name="���";	
	 abs.print(); 	//print()�� �θ�Ŭ���� �޼ҵ�
	 cls.print();
	 System.out.println("�ι�° ���� : �ڽ��ʵ� num");
	 cls.setNum(23);
	 cls.test();
	 ClassX x = (ClassX)abs; //�ٿ�ĳ����
	 x.setNum(100);
	 abs.test();
}

}
