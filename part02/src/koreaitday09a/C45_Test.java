package koreaitday09a;

import koreaitday09b.ClassAB;

public class C45_Test {

	public static void main(String[] args) {
		ClassAA test1 = new ClassAA(); //ClassAA ��� ��ü ����
		test1.ab = 123; // test1�� �����ϴ� ��ü�� ��ӹ��� �ʵ�
		test1.name = "hello"; // ��ӹ��� �ʵ�
		//��ӹ��� �޼ҵ�
		test1.print();
		// ClassAA���� ���ǵ� �޼ҵ�
		test1.test();
		
		ClassAB test2 = new ClassAB();
		test2.test();
	}

}
