package koreait.day07;

public class C35_GlobalVar {
	/*
	 * ��������(local variable) : �޼ҵ�,if,while ��� { } ���� ����� ���� �������� ǥ��
	 * ��������(global variable) : Ŭ����{} ���� ����� ����
	 * 
	 * ���������� static  ���η� ����
	 * ���� ���������� ��� , Ŭ�����̸�.������
	 * ��ü�� ���� ����ϴ� this.������ (�̶� ������ �ν��Ͻ� ����)

	 */
	int count;//��������
	static int num; 
	String msg;
	static final int Test = 9999; //static final�� ���, ������ �� �ʱ�ȭ ���� ������ ����.
	static double  point;
	
	public static void main(String[] args) { //static�� static������ ����
		int num = 10; //���� �޼ҵ忡���� ���
		System.out.println("num = "+num);//10
//		System.out.println("msg = "+msg); //���� : static�� �ƴ� ������ ��� ����
	}
	public void methodA() {
		int num = 99; //methodA������ ���
		System.out.println("num = "+num); //99
		System.out.println("msg = "+msg); //���������� ����� msg
	}
	public static void methodB() {
		int num = 99; //methodA������ ���
		//���������� �������� �̸��� �������, ���������� ������
		System.out.println("num = "+ num);
		System.out.println("num = "+ C35_GlobalVar.num); //integer.Bytes�� ���� ����
		//���������� ����� num, static �϶��� Ŭ���� �̸�.������ , �ƴҶ��� this.������
	}// ***�߿�
	public void methodC(int count) {
		this.count = count; //this�� new �������� ������� ��ü
		
	}
	
	
}
