package koreait.day03;

import java.util.Scanner;

public class C10_KeyboardInput {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //Scanner는 참조형변수(클래스타입 변수)
	System.out.print("정수를 입력하세용 : ");
	int data;
	data = sc.nextInt();
	System.out.println("입력된 값은 "+data+"입니다.");
	double point;
	System.out.print("실수를 입력하세용 : ");
	point = sc.nextDouble();
	System.out.println("입력된 값은 "+point+"입니다.");
	
	
}
}
