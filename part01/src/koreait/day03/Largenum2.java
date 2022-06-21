package koreait.day03;

import java.util.Scanner;

public class Largenum2 { //작성자 이용학
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int max,min;
		System.out.println("세 개의 정수를  입력해 주세요");
		System.out.print("정수 1 입력: ");
		a = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		b = sc.nextInt();
		System.out.print("정수3 입력 : ");
		c = sc.nextInt();
		if(a>b && a>c) 
			System.out.println("가장 큰 수는 "+ a +"입니다.");
	
		if(b>a && b>c)
			System.out.println("가장 큰 수는 "+b+"입니다.");
		if(c>a && c>b)
			System.out.println("가장 큰 수는 "+c+"입니다.");
		
		
		if(a>b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
		}
		if(max<c)
			max = c;
		if(min>c) {
			min=c;
			
		}

System.out.println("가장 큰 수는"+ max +"입니다.");
System.out.println("가장 작은 수는"+ min +"입니다.");
sc.close();
}
}
	