package Koreait.day08;
//MY class 2 객체 생성
//1.new 연산 활용
//2.기본생성자 활용
//3. 커스텀 생성자 활용
public class MyClass2_Test {
public static void main(String[] args) {
	MyClass2 my = new MyClass2(); //기본생성자 
	//오류 : 커스텀 생성자를 정의하면 기본으로 쓸 수 있는 기본생성자가 사라짐.>> 사용 x >> 직접 정의 
	MyClass2 my2 = new MyClass2("haha");
	
	System.out.println("my2 name = " +my2.getName() );
	System.out.println("my22 name = "+my22.getName());
	
	
}
}
