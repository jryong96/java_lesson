package koreaitday13;

//InterfaceA의 구현체 (구현클래스,실체)
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
