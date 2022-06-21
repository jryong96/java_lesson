package koreait.day03;

import java.util.Scanner;

public class KeyInput_test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,square;
	final double pi = 3.14;
			
	System.out.println("[[사각형의 넓이 구하기]]");
	System.out.print("가로 길이를 정수로 입력해 주세요 : ");
	a = sc.nextInt();
	System.out.println("가로 : "+a+" cm");
	System.out.print("세로 길이를 정수로 입력해 주세요 : ");
	b = sc.nextInt();
	System.out.println("세로 : "+b+" cm");
	square = a*b;
	System.out.println("넓이를 구했습니다. -> "+square+"㎠");
	
	System.out.println();
	System.out.println("[[원의 넓이 구하기]]");
	System.out.print("반지름의 길이를 입력해 주세요 : ");
	double c = sc.nextDouble(); 
	System.out.println("반지름 : "+c+" cm");
	double circle = c*2*pi;
	System.out.printf("둘레를 구했습니다. -> %.3fcm\n",circle);
	double circle2 = c*c*pi;
	System.out.printf("넓이를 구했습니다. -> +%.3f㎠\n",circle2);
	sc.close(); // 메소드 닫을때 xx.close();
	
}
}
