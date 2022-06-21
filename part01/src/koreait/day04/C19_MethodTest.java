package koreait.day04;

public class C19_MethodTest {
		//메인 메소드는 실행을 하기위한 시작점.프로그램 실행을 위해 꼭 있어야 할 메소드. static	
	public static void main(String[] args) {
		
		System.out.println("메소드를 직접 정의해서 사용해 봅니다.");
		System.out.println("프로그램은 main메소드의 명령문을 순서대로 실행하고 중간에 호출된 메소드를 만나면 메소드가 정의된 실행을 위해");
		System.out.println("제어를 이동합니다. 메소드 실행이 종료되면 다시 main메소드로 돌아갑니다.");
		methodA(); //메소드 호출 (실행)
		System.out.println("2.");
		
		methodB(11,33);
		methodB(111,4243);
		System.out.println("3.");
		methodC(929,121);
		methodC(911,223.41);
		methodD();
		System.out.println(methodD()); //리턴값을 받아서 출력하는 예시
		int a = methodD(); //리턴값을 받아서 a변수에 저장하는 예시
		System.out.println("return =" + a);
		System.out.println("5.");
		double k = methodE(13,3.14);
		System.out.println("return =" + k);
	
		char letter = methodF('a',5);
		System.out.println("return = "+ letter);
		
		
	}
	public static void methodA() {
		System.out.println("##첫번째 메소드 정의 연습입니다.##");
		
}
	public static void methodB(int a,int b) {
		System.out.println("$$두번째 메소드 정의 연습입니다.$$");
		System.out.println("전달받은 값 a ="+a+ ",b=" +b);
	}
	public static void methodC(int a,double b) {
		System.out.println("@@세번째 메소드 정의 연습입니다.@@");
		System.out.println("전달받은 값 a ="+a+ ",b=" +b);
}
	public static int methodD() { //반환값이 있는 형식 : 반환값은 int 데이터, return이 반드시 필요
		System.out.println("**4번째 메소드 정의 연습**"); 
		return 6;
		
		
	}
	public static double methodE(int a , double b) {
		System.out.println("###다섯번째 메소드 정의 연습 ###");
		return a+b; //인자로 전달받은 값으로 실행하고 처리결과 리턴
	}
	public static char methodF(char a, int b) {
		System.out.println("여섯번째 메소드 정의연습");
		return (char)(a+b);
		
		
	}
}