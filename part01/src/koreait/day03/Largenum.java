package koreait.day03;

import java.util.Scanner;

public class Largenum { //�ۼ��� �̿���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("�� ���� ������  �Է��� �ּ���  ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b && a>c) 
			System.out.println("���� ū ���� "+ a +"�Դϴ�.");
	
		if(b>a && b>c)
			System.out.println("���� ū ���� "+b+"�Դϴ�.");
		if(c>a && c>b)
			System.out.println("���� ū ���� "+c+"�Դϴ�.");
		sc.close();

}
	
	
}