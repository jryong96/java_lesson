package koreaitday13a;

import koreait.day13.InterfaceA;
import koreait.day13.InterfaceB;

public class C56_Anonoymous {
//�������̽� ����ü�� �͸� ���� Ŭ������ ���� : 1ȸ��Ŭ����(�͸� Ŭ������ ���� ���Ͽ����� ��� ����)
	public static void main(String[] args) {
		InterfaceA ia = new InterfaceA() {
			public int methodB(int num) {
				System.out.println("i am anonymous");
				return 1234;
			}

			public void methodA() {
				System.out.println("�͸� InterfaceA methodA");
				// TODO Auto-generated method stub

			}
		};

		InterfaceB ib = new InterfaceB() {

			public String name(String name) {
				return "���� �͸�Ŭ����" + name;
			}

		};
		ia.methodA();
		System.out.println(ib.name("�׽�Ʈ"));
		InterfaceA.methodC();
		System.out.println("��� : " + InterfaceA.SIZE);

		System.out.println(ib.name("�׽�Ʈ"));
	}
}
