package koreaitday13;

//InterfaceA�� ����ü (����Ŭ����,��ü)
public class MyClassX implements InterfaceA {

	@Override
	public void methodA() {
		System.out.println("MyClassx methodA");
		
	}

	@Override
	public int methodB(int num) {
		System.out.println("MyClassx methodB");
		return 999;
	}

}
