package koreaitday13;

public class C53_InterfaceTest {
public static void main(String[] args) {
	MyClassX x1 = new MyClassX();
	MyClassY y1 = new MyClassY();
	MyClassZ z1 = new MyClassZ();
	
	InterfaceA x2 = new MyClassX();	//  MyClassX : interfaceA의 구현체
	InterfaceB y2 = new MyClassY();
	InterfaceA z2 = new MyClassZ(); 
	InterfaceB z3 = new MyClassZ();
	
	//참조타입에 따른 메소드 실행 		: z1,z2,z3이 어떤메소드가 실행 가능할까?
			//내생각 : z1 x z2 :iAmethod z3:iBmtehod  
	z1.methodA();
	z1.methodB(23);
	z1.name("쯔위");
	
	z2.methodA();
	z2.methodB(23);
//	z2.name("쯔위");	// 오류 : interfaceB의 추상메소드로 실행이 불가능
	
	
//	z3.methodA();	// 오류 : interfaceA의 추상메소드로 실행 불가능
//	z3.methodB(23);
	z3.name("쯔위");
	
	//캐스팅 : 다중구현체의 인터페이스 타입 캐스팅
	InterfaceB ib = (InterfaceB)z2;
	ib.name("하하");
	InterfaceA ia = (InterfaceA)z3;
	ia.methodA();
//다형성의 구현 예시	
	iAmethod(x2);
//	iAmethod(y2); // 오류  : interfaceA  구현체가 아님
	iAmethod(z2);
	iAmethod(x1);
	iAmethod(z1);
	iAmethod(z2); //iB에서는 안되지만 iA에서는 잘 되는모습 : 변수참조타입 -> interfaceA
	
	
	
	iBmethod(y1);
	iBmethod(y2);
	iBmethod(z1);
//	iBmethod(z2);	//변수 참조타입이 interfaceA 이라 오류
	iBmethod(z3);
}
	//다형성의 구현 예 : 메소드 인자타입인 InterfaceA
		//interfaceA 구현체는 모두 인자로 전달이 가능하다.
	public static void iAmethod(InterfaceA ia) {
		ia.methodA();
	}
	
	public static void iBmethod(InterfaceB ib) {
		System.out.println(ib.name("안녕"));
	}
}
