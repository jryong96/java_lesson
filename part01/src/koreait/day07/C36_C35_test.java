package koreait.day07;

public class C36_C35_test {
	//c35 클래스를 1)객체로 만들어서 2) static(정적)인 것들을 테스트합니다.
	// (참고 : main메소드를 갖는 클래스를 객체로 만들지 않는것이 일반적) 
public static void main(String[] args) {
	
	C35_GlobalVar test1 = new C35_GlobalVar (); //c35 클래스 타입의 객체생성
	C35_GlobalVar test2 = new C35_GlobalVar(); //c35 클래스 타입의 객체생성
	
	//c35클래스에서 static이 아닌 인스턴스 변수에는 객체마다 다른값을 저장.>> 각 객체마다 다른특성을 나타냄
	test1.count = 10;
	test2.count =20;
	
	test1.msg="hi test1";
	test2.msg ="hello test2";
	
	test1.methodA(); //인스턴드 메소드 (복사본 느낌)
	
	test1.methodA(); 
	
	test1.methodC(124); // this.count에서 this는 테스트1
	test2.methodC(999); // "" 테스트 2
	System.out.println("test1.count = "+test1.count );
	System.out.println("test2.count = "+test2.count );
	
	//static 요소 테스트 : static 변수 또는 메소드 는 클래스명을 사용.
	C35_GlobalVar.num=135;
	System.out.println("static num = "+C35_GlobalVar.num);
	System.out.println("static num = "+ test1.num);
	System.out.println("static num = "+test2.num);
	//static이 저장되는 메모리 영역(메소드 영역)과 객체가 저장되는 메모리 영역(힙영역) 은 다릅니다.
	
	//상수테스트
	System.out.println("Test = "+C35_GlobalVar.Test);
//	C35_GlobalVar.Test = 100; 오류내용 : 변경 불가능 (final로 상수로 고정했기떄문에)
	
	C35_GlobalVar test3 = new C35_GlobalVar();
	System.out.println("test3.count = "+ test3.count);
	System.out.println("test3.msg = "+test3.msg);
	System.out.println("C35_GlobalVar.num = "+C35_GlobalVar.num);
	System.out.println("C35_GlobalVar.point ="+C35_GlobalVar.point);
}
}
