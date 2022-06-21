package koreaitday15;
import java.util.InputMismatchException;
public class C63_TryCatchTest {
public static void main(String[] args) {
	//try 형식
	try {
		//Exception 가능성이 있는 명령을 작성합니다.-> 오류가 생기면 catch로 갑니다.
		
		
	} catch (NullPointerException e) { // 오류 원인에 따른 Exception 종류를 검사합니다.
	//NullpointerExceptipn 오류일때만 아래명령을 처리
		e.printStackTrace(); // == > 오류 추적을 위해 원인을 출력
	} 
	catch (InputMismatchException e) {
		//cath는 여러번 작동합니다.
	}
	finally { //마지막으로 : 오류발생 상관없이 실행되는 부분입니다.
		//주로 자원을 해제하는 코드를 작성합니다.
//	try 블럭의 명령 또는 catch 블럭의 명령이 끝나면 실행이 계속 됩니다.
	
	
}
	
}
}
