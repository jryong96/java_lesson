package koreait.day07;

public class C36_C35_test {
	//c35 Ŭ������ 1)��ü�� ���� 2) static(����)�� �͵��� �׽�Ʈ�մϴ�.
	// (���� : main�޼ҵ带 ���� Ŭ������ ��ü�� ������ �ʴ°��� �Ϲ���) 
public static void main(String[] args) {
	
	C35_GlobalVar test1 = new C35_GlobalVar (); //c35 Ŭ���� Ÿ���� ��ü����
	C35_GlobalVar test2 = new C35_GlobalVar(); //c35 Ŭ���� Ÿ���� ��ü����
	
	//c35Ŭ�������� static�� �ƴ� �ν��Ͻ� �������� ��ü���� �ٸ����� ����.>> �� ��ü���� �ٸ�Ư���� ��Ÿ��
	test1.count = 10;
	test2.count =20;
	
	test1.msg="hi test1";
	test2.msg ="hello test2";
	
	test1.methodA(); //�ν��ϵ� �޼ҵ� (���纻 ����)
	
	test1.methodA(); 
	
	test1.methodC(124); // this.count���� this�� �׽�Ʈ1
	test2.methodC(999); // "" �׽�Ʈ 2
	System.out.println("test1.count = "+test1.count );
	System.out.println("test2.count = "+test2.count );
	
	//static ��� �׽�Ʈ : static ���� �Ǵ� �޼ҵ� �� Ŭ�������� ���.
	C35_GlobalVar.num=135;
	System.out.println("static num = "+C35_GlobalVar.num);
	System.out.println("static num = "+ test1.num);
	System.out.println("static num = "+test2.num);
	//static�� ����Ǵ� �޸� ����(�޼ҵ� ����)�� ��ü�� ����Ǵ� �޸� ����(������) �� �ٸ��ϴ�.
	
	//����׽�Ʈ
	System.out.println("Test = "+C35_GlobalVar.Test);
//	C35_GlobalVar.Test = 100; �������� : ���� �Ұ��� (final�� ����� �����߱⋚����)
	
	C35_GlobalVar test3 = new C35_GlobalVar();
	System.out.println("test3.count = "+ test3.count);
	System.out.println("test3.msg = "+test3.msg);
	System.out.println("C35_GlobalVar.num = "+C35_GlobalVar.num);
	System.out.println("C35_GlobalVar.point ="+C35_GlobalVar.point);
}
}
