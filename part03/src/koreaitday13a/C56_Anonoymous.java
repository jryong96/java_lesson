package koreaitday13a;

import koreait.day13.InterfaceA;
import koreait.day13.InterfaceB;

public class C56_Anonoymous {
//인터페이스 구현체를 익명 내부 클래스로 생성 : 1회용클래스(익명 클래스는 현재 파일에서만 사용 가능)
	public static void main(String[] args) {
		InterfaceA ia = new InterfaceA() {
			public int methodB(int num) {
				System.out.println("i am anonymous");
				return 1234;
			}

			public void methodA() {
				System.out.println("익명 InterfaceA methodA");
				// TODO Auto-generated method stub

			}
		};

		InterfaceB ib = new InterfaceB() {

			public String name(String name) {
				return "내부 익명클래스" + name;
			}

		};
		ia.methodA();
		System.out.println(ib.name("테스트"));
		InterfaceA.methodC();
		System.out.println("상수 : " + InterfaceA.SIZE);

		System.out.println(ib.name("테스트"));
	}
}
