package koreaitday15;
import java.util.Scanner;
public class C64_TryCatchEx1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	try {
		String message = null;
		int cnt  = message.length();
		System.out.print("정수입력 : ");
//		int a = sc.nextInt();
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("입력값 : "+a);
//	} catch(NullPointerException e) {
	} catch(NullPointerException | NumberFormatException e) {          // | 기호는 bit단위 or연산 : Exception은 비트값으로 설정
		//발생한 오류 정보를 Exception 객체로 관리하고 이에 대한 참조변수는 e 입니다.
		System.out.println("오류 발생 : "+ e.getMessage());
		System.out.println("사용자 기능에 문제가 발생하였습니다.");
	} 
	finally {
		sc.close();
	}
	System.out.println("end");
}
}
