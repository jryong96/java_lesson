package koreait.day03;

import java.util.Scanner;

public class Largenum2 { //�ۼ��� �̿���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int max,min;
		System.out.println("�� ���� ������  �Է��� �ּ���");
		System.out.print("���� 1 �Է�: ");
		a = sc.nextInt();
		System.out.print("���� 2 �Է� : ");
		b = sc.nextInt();
		System.out.print("����3 �Է� : ");
		c = sc.nextInt();
		if(a>b && a>c) 
			System.out.println("���� ū ���� "+ a +"�Դϴ�.");
	
		if(b>a && b>c)
			System.out.println("���� ū ���� "+b+"�Դϴ�.");
		if(c>a && c>b)
			System.out.println("���� ū ���� "+c+"�Դϴ�.");
		
		
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

System.out.println("���� ū ����"+ max +"�Դϴ�.");
System.out.println("���� ���� ����"+ min +"�Դϴ�.");
sc.close();
}
}
	