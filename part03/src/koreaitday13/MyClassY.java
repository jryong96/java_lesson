package koreaitday13;

public class MyClassY implements InterfaceB {

		public String name(String name) {
			return "MyClassY :"+name; 
		}
}
//���߱��� (�������̽� a,b�� ����ü)
class MyClassZ implements InterfaceA,InterfaceB {
	@Override
	public void methodA() {
		System.out.println("MyClassZ methodA");
		
	}
	@Override
	public int methodB(int num) {
		System.out.println("MyClassZ methodA");
		return 3333;
	}
	@Override
	public String name(String name) {

		return "MyClassZ :"+name;
	}
}