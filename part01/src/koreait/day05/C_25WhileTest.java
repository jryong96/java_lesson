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
	System.out.println("�Է��� ������ ��� ���ϴ� ����(����-1)");
//	while(k!=-1) {
//		System.out.println("���� �Է� : ");
//		k = sc.nextInt();
//		sum = sum+k;  // sum+=k;
//		
//	}
//	System.out.println("sum ="+sum);
//	
//	System.out.println("�Է��� ������ ��� ���ϴ� ����(����-1) 2����");
//	do {
//		sum+=k;
//		System.out.println("���� �Է� : ");
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
//		System.out.println("���� �Է� : ");
//		k = sc.nextInt();
//		if(k==-1) state = false;
//		else sum+=k;
//	}
//	System.out.println("sum = "+sum);
	
	
	
	
	//continue ���� : �Էµ� ���� 10�� ����̸� sum�� ������ �ʰ� �ٽ� �Է¹ޱ�. continue ����ؼ� ¥����
	
	
	System.out.println("�Է��� ������ ��� ���ϴ� ����(����-1)");
	sum = 0;
	while(true) {
		System.out.println("���� �Է� : ");
		k = sc.nextInt();
		if(k==-1) break;
		if(k/10==0) continue; //�Ʒ������ �������� �ʰ� �ݺ��� ó������!
		sum+=k;
	}
	System.out.println("sum = "+sum);
 
	
	
	
	
}	
}

