package Koreait.daya;
import koreait.day08.My_Class1;
public class MyclassTest {
// My class1 객체 생성	 다른 클래스에 접근할 때import 패키지.클래스
	public static void main(String[] args) {
	My_Class1 my = new My_Class1();	 //public 클래스 이지만 import를 해줘야 함
	
	//패키지가 다른 My_Class1 클래스의 필드 중 사용할 수 있는 것은?
	my.name= "haha";
	my.point= 3.1414;
//	my.age = 23; // 오류 : private 한정자 필드
	my.setAge(23); //private 필드값 대입(변경)하는 메소드  : setter
	System.out.println("age = "+my.getAge()); //private 값을 읽어오는 메소드 : getter
	my.setAge(-1);
	System.out.println("age = "+ my.getAge());
	System.out.println("point = "+my.point);
	System.out.println("name = "+my.name);
	
	
	}

	
	
}
