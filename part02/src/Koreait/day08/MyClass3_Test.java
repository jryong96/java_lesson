package Koreait.day08;

public class MyClass3_Test {
	public static void main(String[] args) {
		
		
//		MyClass3 my3 = new Myclass3(); //���� : �����ڰ� private �����̾
		 MyClass3 my3 =  MyClass3.getInstance();
		 my3.test();
		 MyClass3.staticTest(); //static �޼ҵ�
	}

}
