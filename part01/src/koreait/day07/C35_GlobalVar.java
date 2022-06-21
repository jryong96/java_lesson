package koreait.day07;

public class C35_GlobalVar {
	/*
	 * 지역변수(local variable) : 메소드,if,while 등등 { } 에서 선언된 변수 갈색으로 표시
	 * 전역변수(global variable) : 클래스{} 에서 선언된 변수
	 * 
	 * 전역변수를 static  여부로 구분
	 * ㄴㄴ 전역변수일 경우 , 클래스이름.변수명
	 * 객체를 만들어서 사용하는 this.변수명 (이때 변수는 인스턴스 변수)

	 */
	int count;//전역변수
	static int num; 
	String msg;
	static final int Test = 9999; //static final이 상수, 선언할 때 초기화 하지 않으면 오류.
	static double  point;
	
	public static void main(String[] args) { //static은 static끼리만 접근
		int num = 10; //메인 메소드에서만 사용
		System.out.println("num = "+num);//10
//		System.out.println("msg = "+msg); //에러 : static이 아닌 변수는 사용 못함
	}
	public void methodA() {
		int num = 99; //methodA에서만 사용
		System.out.println("num = "+num); //99
		System.out.println("msg = "+msg); //전역변수로 선언된 msg
	}
	public static void methodB() {
		int num = 99; //methodA에서만 사용
		//지역변수와 전역변수 이름이 같은경우, 지역변수를 가져옴
		System.out.println("num = "+ num);
		System.out.println("num = "+ C35_GlobalVar.num); //integer.Bytes와 같은 형태
		//전역변수로 선언된 num, static 일때는 클래스 이름.변수명 , 아닐때는 this.변수명
	}// ***중요
	public void methodC(int count) {
		this.count = count; //this는 new 연산으로 만들어진 객체
		
	}
	
	
}
