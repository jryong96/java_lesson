package koreait.day05;

import java.util.Scanner;

public class C_25WhileTest {
public static void main(String[] args) {
	for(int i= 0; i<5; i++)
		System.out.println("hello!("+(i+1)+")");
	
	
	
	
	
	int j = 0;
	while (j<5) {
		System.out.println("hello!("+(j+1)+")");
		j++;
	}
	
	int k =0, sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("입력한 정수를 모두 더하는 계산기(종료-1)");
//	while(k!=-1) {
//		System.out.println("정수 입력 : ");
//		k = sc.nextInt();
//		sum = sum+k;  // sum+=k;
//		
//	}
//	System.out.println("sum ="+sum);
//	
//	System.out.println("입력한 정수를 모두 더하는 계산기(종료-1) 2번쨰");
//	do {
//		sum+=k;
//		System.out.println("정수 입력 : ");
//		k=sc.nextInt();
//	}while(k!=-1);
//	System.out.println("sum ="+ sum);
//	while(true) {
//		
//		if(k==1) {
//			break;
//		}
//			
//	}
//	boolean state = true;
//	while(state) {
//		System.out.println("정수 입력 : ");
//		k = sc.nextInt();
//		if(k==-1) state = false;
//		else sum+=k;
//	}
//	System.out.println("sum = "+sum);
	
	
	
	
	//continue 연습 : 입력된 값이 10의 배수이면 sum을 더하지 않고 다시 입력받기. continue 사용해서 짜보기
	
	
	System.out.println("입력한 정수를 모두 더하는 계산기(종료-1)");
	sum = 0;
	while(true) {
		System.out.println("정수 입력 : ");
		k = sc.nextInt();
		if(k==-1) break;
		if(k/10==0) continue; //아래명령을 실행하지 않고 반복문 처음으로!
		sum+=k;
	}
	System.out.println("sum = "+sum);
 
	
	
	
	
}	
}

