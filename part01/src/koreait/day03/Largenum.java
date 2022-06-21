package koreait.day03;

import java.util.Scanner;

public class Largenum { //작성자 이용학
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("세 개의 정수를  입력해 주세요  ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b && a>c) 
			System.out.println("가장 큰 수는 "+ a +"입니다.");
	
		if(b>a && b>c)
			System.out.println("가장 큰 수는 "+b+"입니다.");
		if(c>a && c>b)
			System.out.println("가장 큰 수는 "+c+"입니다.");
		sc.close();

}
	
	
}