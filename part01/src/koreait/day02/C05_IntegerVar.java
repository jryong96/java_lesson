package koreait.day02;

public class C05_IntegerVar {
	public static void main(String[] args) {
		/* 1. main �޼ҵ� �ȿ����� ����ϴ� ���������� �����մϴ�.
		 * 2. �⺻�� (primitive) ������ Ÿ�� : ��������
 		 * 		byte, short, int, long Ű����(������ ������ �ܾ�)
		 */
		
		
		byte n1;
		short n2;
		int n3;
		long n4;
		
		byte m1 = 100;
		short m2 = 100;
		int m3 =  100;
		long m4 = 100;
	
		n1=123;
		n1=124; //���� : 127���� ū���̾
		n2=29999;  
//		n2=-40000;
		n3=123456789;
		n4=1234567891230L;
		System.out.println("����n1 = " + n1);
		System.out.println("����n2 = " +n2);
		System.out.printf("����%s = %d\n","n3",n3);
		System.out.printf("����%s = %d\n","n4",n4);
	}

}



/*���� : �޸𸮿� ����� �� �߿��� ������ �� �ִ� �����͸� ���մϴ�.
 *    ������ ���α׷��� ����Ǵ� ���ȿ� �ӽ÷� ����ϴ� �޸� �����Դϴ�.
 *	    �����Ͱ� ����� �޸𸮿� �����ϱ� ���ؼ� ������(�ĺ���)�� �ο��մϴ�.
 *    ���� �����Ѵ� -> ������� ������ ������ �����ϴ� ��.-> �޸𸮿� ���� �Ҵ� �˴ϴ�.
 */
