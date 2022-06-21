package koreait.day05;

import java.util.Scanner;

public class C24_StartPrint {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("[[영화감상 후기]]");
	System.out.println("평점을 몇 점 주시겠습니까?(1~5)");
	int score = sc.nextInt();
	
	System.out.println("방법 1) ");
		for(int i =0; i<score; i++ ) 
			System.out.print("★");
		
		System.out.println();
//		System.out.println("방법 2)");
//		for(int i =0; i<score; i++) {
//			System.out.print("★");
//			for(int i = 0; i<5-score; i++)  {
//				System.out.print("☆");
			
		
			
		
		
		System.out.println("방법2__");
		int k;
		for(k=0;k<score;k++) 
			System.out.println("★");
		for(;k<5;k++)
			System.out.println("☆");

			
		}
}


			



