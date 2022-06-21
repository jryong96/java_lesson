package koreaitday14;

import java.util.Random;

public class C61_FunctionTest {
public static void main(String[] args) {
	//1) �͸�Ŭ����
	FunctionA fa = new FunctionA() {@Override
	public int methodA(int a, int b) {
		System.out.print("a*b = ");
		return a*b;
		}
	};
	System.out.println(fa.methodA(23,11));
	//2) ���ٽ� : �߻�޼ҵ尡 1���϶��� ����, �Լ��� �������̽������� ����
	//���� �޼ҵ��̸��� ������ ����
	fa = (int a , int b) -> {
		System.out.print("a+b = ");
		return a+b;
	};
	
	System.out.println(fa.methodA(23,11));
	//min~max ������ ������ ���� ����
	fa = (int min, int max) -> {	
		Random r = new Random();
		System.out.print("�������� ���� ���� : ");
		return r.nextInt(max-min+1)+min;
	};	
	System.out.println(fa.methodA(10,65));
}
}
