package koreaitday11;

public class ClassX extends ClassAbs {
	private int num;

	@Override
	public void test() {
		System.out.println("ClassX ÀÇ test()");
		System.out.println("num ="+num);
		
		
		
	}

	
	public void setNum(int num) {
		this.num = num;
	}

}
