package koreait.day03;

import java.util.Scanner;

public class KeyInput_test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,square;
	final double pi = 3.14;
			
	System.out.println("[[�簢���� ���� ���ϱ�]]");
	System.out.print("���� ���̸� ������ �Է��� �ּ��� : ");
	a = sc.nextInt();
	System.out.println("���� : "+a+" cm");
	System.out.print("���� ���̸� ������ �Է��� �ּ��� : ");
	b = sc.nextInt();
	System.out.println("���� : "+b+" cm");
	square = a*b;
	System.out.println("���̸� ���߽��ϴ�. -> "+square+"��");
	
	System.out.println();
	System.out.println("[[���� ���� ���ϱ�]]");
	System.out.print("�������� ���̸� �Է��� �ּ��� : ");
	double c = sc.nextDouble(); 
	System.out.println("������ : "+c+" cm");
	double circle = c*2*pi;
	System.out.printf("�ѷ��� ���߽��ϴ�. -> %.3fcm\n",circle);
	double circle2 = c*c*pi;
	System.out.printf("���̸� ���߽��ϴ�. -> +%.3f��\n",circle2);
	sc.close(); // �޼ҵ� ������ xx.close();
	
}
}
