package koreait.day04;

public class C20_StringMethod {
public static void main(String[] args) {
	String message = "hello";
	message.length(); //public int length() : 길이
	message.charAt(0); //public char charAt(int index)
	boolean isState = message.equals("hello");
//	message.equals("hello");   //public boolean equals(object anObject), object는 모든 타입으로 해석
								//message 가 string타입 이기때문에 object 는 string으로 해석
	int len = message.length();
	char temp = message.charAt(3);
	System.out.println("length()=" +""+len);
	System.out.println("charAt(3) ="+""+temp);
	System.out.println("equals(\"hello\")="+isState);

	
	//리턴값 형식 알아보기
	message.indexOf('e'); //int
	message.indexOf("lo"); //int
	
	message.substring(2); //String
	message.substring(2,4); // String
	message.replace("ll","*@"); //String
	//메소드 오버로딩  : 메소드의 이름과 형식은 같되, 인자값의 갯수와 형식이 다르게 정의된 것,
	System.out.println("indexOf('e')= "+""+message.indexOf('e')); //1번위치
	System.out.println("message.indexOf(\"lo\")= "+""+message.indexOf("lo"));//3번위치  큰따옴표 출력시 \ 사용
	System.out.println("message.substring(2)= "+""+message.substring(2));//부분추출 : llo
	System.out.println("message.substring(2,4)= "+""+message.substring(2,4)); //ll, 2번부터 2개(4-2)
	System.out.println("message.replace(\"ll\",\"*@\")= "+""+message.replace("ll","*@")); //치환 : he*@o
		
}
}
