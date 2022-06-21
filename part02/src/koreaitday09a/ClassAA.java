package koreaitday09a;

public class ClassAA extends ClassA { //super(부모) 클래스는 ClassA
	
//ClassA의 인스턴스 메소드
	void test() {
		//name 필드를 상속받았기 때문에 오류 x : 여기서 변수 선언 안함!
		setName("haha");
		
		System.out.println("name ="+ name);
	}
 



////파일을 별도로 만들어서 테스트 할 수도 있음. ****단 public 클래스에는 1개만****  
//class Test {
//	public static void main(String[] args) {
//		ClassAA test1 = new ClassAA(); //ClassAA 라는 객체 생성
//		test1.ab = 123; // test1이 참조하는 객체가 상속받은 필드
//		test1.name = "hello"; // 상속받은 필드
//		
//		//상속받은 메소드
//		test1.print();
	
}
