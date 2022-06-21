package Koreait.day08;

public class MyClass3_Test {
	public static void main(String[] args) {
		
		
//		MyClass3 my3 = new Myclass3(); //오류 : 생성자가 private 한정이어서
		 MyClass3 my3 =  MyClass3.getInstance();
		 my3.test();
		 MyClass3.staticTest(); //static 메소드
	}

}
