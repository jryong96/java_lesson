package koreait.day03;

import java.util.Scanner;

public class C10_KeyboardInput {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //Scanner�� ����������(Ŭ����Ÿ�� ����)
	System.out.print("������ �Է��ϼ��� : ");
	int data;
	data = sc.nextInt();
	System.out.println("�Էµ� ���� "+data+"�Դϴ�.");
	double point;
	System.out.print("�Ǽ��� �Է��ϼ��� : ");
	point = sc.nextDouble();
	System.out.println("�Էµ� ���� "+point+"�Դϴ�.");
	
	
}
}
