package koreaitday13;

public class C53_InterfaceTest {
public static void main(String[] args) {
	MyClassX x1 = new MyClassX();
	MyClassY y1 = new MyClassY();
	MyClassZ z1 = new MyClassZ();
	
	InterfaceA x2 = new MyClassX();	//  MyClassX : interfaceA�� ����ü
	InterfaceB y2 = new MyClassY();
	InterfaceA z2 = new MyClassZ(); 
	InterfaceB z3 = new MyClassZ();
	
	//����Ÿ�Կ� ���� �޼ҵ� ���� 		: z1,z2,z3�� ��޼ҵ尡 ���� �����ұ�?
			//������ : z1 x z2 :iAmethod z3:iBmtehod  
	z1.methodA();
	z1.methodB(23);
	z1.name("����");
	
	z2.methodA();
	z2.methodB(23);
//	z2.name("����");	// ���� : interfaceB�� �߻�޼ҵ�� ������ �Ұ���
	
	
//	z3.methodA();	// ���� : interfaceA�� �߻�޼ҵ�� ���� �Ұ���
//	z3.methodB(23);
	z3.name("����");
	
	//ĳ���� : ���߱���ü�� �������̽� Ÿ�� ĳ����
	InterfaceB ib = (InterfaceB)z2;
	ib.name("����");
	InterfaceA ia = (InterfaceA)z3;
	ia.methodA();
//�������� ���� ����	
	iAmethod(x2);
//	iAmethod(y2); // ����  : interfaceA  ����ü�� �ƴ�
	iAmethod(z2);
	iAmethod(x1);
	iAmethod(z1);
	iAmethod(z2); //iB������ �ȵ����� iA������ �� �Ǵ¸�� : ��������Ÿ�� -> interfaceA
	
	
	
	iBmethod(y1);
	iBmethod(y2);
	iBmethod(z1);
//	iBmethod(z2);	//���� ����Ÿ���� interfaceA �̶� ����
	iBmethod(z3);
}
	//�������� ���� �� : �޼ҵ� ����Ÿ���� InterfaceA
		//interfaceA ����ü�� ��� ���ڷ� ������ �����ϴ�.
	public static void iAmethod(InterfaceA ia) {
		ia.methodA();
	}
	
	public static void iBmethod(InterfaceB ib) {
		System.out.println(ib.name("�ȳ�"));
	}
}
