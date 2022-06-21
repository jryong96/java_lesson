package koreaitday16;

import java.util.Scanner;

public class C69_MyExceptionTest {
public static void main(String[] args) {
	System.out.println("나이를 입력 하세요 : ");
	Scanner sc = new Scanner(System.in);
	
	try {
		int age = Integer.parseInt(sc.nextLine());
		if(age < 0 || age>100) throw new AgeException("나이의 범위는 0~100입니다."); //클래스에서추가적인 동작이 있을 때 
		//throw 는 지정된 Exception을 발생 시킵니다.=> 메시지만 바꿀때
		if(age ==0 ) throw new NullPointerException();
		
		System.out.println("나이가 "+age+"살 맞나요?");
	} catch(NumberFormatException e) {
		System.out.println("숫자로만 입력하숑  ");
	
	}catch(Exception e) {
		System.out.println("사용자 실행 오류 : "+e.getMessage());
	}
	
	
}
} //class End
// 사용자 Exceptuion을 만들 수 있다.
class AgeException extends Exception {

	//Serializeable 인터페이스와 관련된 값.
private static final long serialVersionUID = 1L; //Ageexception을 Exception에 상속 
//사용자가 임의로 오류메시지 지정
	public AgeException(String message) {
		super(message);	//Exception의 메시지 필드를 설정 
	}
	
}