package koreaitday14;

import java.util.Random;

public class C61_FunctionTest {
public static void main(String[] args) {
	//1) 익명클래스
	FunctionA fa = new FunctionA() {@Override
	public int methodA(int a, int b) {
		System.out.print("a*b = ");
		return a*b;
		}
	};
	System.out.println(fa.methodA(23,11));
	//2) 람다식 : 추상메소드가 1개일때만 가능, 함수형 인터페이스에서만 가능
	//ㄴㄴ 메소드이름만 생략한 형식
	fa = (int a , int b) -> {
		System.out.print("a+b = ");
		return a+b;
	};
	
	System.out.println(fa.methodA(23,11));
	//min~max 범위의 난수를 만들어서 리턴
	fa = (int min, int max) -> {	
		Random r = new Random();
		System.out.print("범위안의 난수 생성 : ");
		return r.nextInt(max-min+1)+min;
	};	
	System.out.println(fa.methodA(10,65));
}
}
