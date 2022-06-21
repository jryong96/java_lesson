package koreait.day02;

public class C08_Test {
public static void main(String[] args) {
	int a,b,square;
	a = 23;
	b = 19;
	square = a*b;
	final double pi = 3.14;
	double c = 23.230; 
	double circle = c*2*pi; 
	double circle2 = c*c*pi;
	
	System.out.println("[[사각형의 넓이 구하기]]");
	System.out.println("가로 : "+a+" cm");
	System.out.println("세로 : "+b+" cm");
	System.out.println("넓이를 구했습니다. -> "+square+"㎠");
	System.out.println();
	System.out.println("[[원의 넓이 구하기]]");
	System.out.println("반지름 : "+c+" cm");
	System.out.println("둘레를 구했습니다. -> "+circle+"㎠");
	System.out.println("넓이를 구했습니다. -> "+circle2+"㎠");
	
}
}
