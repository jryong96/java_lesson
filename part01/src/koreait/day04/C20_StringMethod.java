package koreait.day04;

public class C20_StringMethod {
public static void main(String[] args) {
	String message = "hello";
	message.length(); //public int length() : ����
	message.charAt(0); //public char charAt(int index)
	boolean isState = message.equals("hello");
//	message.equals("hello");   //public boolean equals(object anObject), object�� ��� Ÿ������ �ؼ�
								//message �� stringŸ�� �̱⶧���� object �� string���� �ؼ�
	int len = message.length();
	char temp = message.charAt(3);
	System.out.println("length()=" +""+len);
	System.out.println("charAt(3) ="+""+temp);
	System.out.println("equals(\"hello\")="+isState);

	
	//���ϰ� ���� �˾ƺ���
	message.indexOf('e'); //int
	message.indexOf("lo"); //int
	
	message.substring(2); //String
	message.substring(2,4); // String
	message.replace("ll","*@"); //String
	//�޼ҵ� �����ε�  : �޼ҵ��� �̸��� ������ ����, ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��,
	System.out.println("indexOf('e')= "+""+message.indexOf('e')); //1����ġ
	System.out.println("message.indexOf(\"lo\")= "+""+message.indexOf("lo"));//3����ġ  ū����ǥ ��½� \ ���
	System.out.println("message.substring(2)= "+""+message.substring(2));//�κ����� : llo
	System.out.println("message.substring(2,4)= "+""+message.substring(2,4)); //ll, 2������ 2��(4-2)
	System.out.println("message.replace(\"ll\",\"*@\")= "+""+message.replace("ll","*@")); //ġȯ : he*@o
		
}
}
