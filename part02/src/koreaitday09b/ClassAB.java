package koreaitday09b;

import koreaitday09a.ClassA;

public class ClassAB extends ClassA {
	//���� �� Ŭ������ �ʵ�,�޼ҵ� ��ӹ޾ҳ� Ȯ��, -- ClassA�� private ,default ���������� ��Ҵ� ����� ���� �� ����.
	public void test() {
//		System.out.println("name = "+name); // ���� )name ���� �����ڴ� *����Ʈ*! --> �ٸ���Ű������ ��� �Ұ���
	title = "���";
	System.out.println("title = "+title); //��ӹ��� title �ʵ� : �ٸ�����Ű ������ protected ���������ڷ� �ڽ�Ŭ������ ���
	setName("�ȳ�");
	System.out.println("name = "+ getName());
	}
}
