package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOP {
	//���ǽ��� ����� ���� �����ϴ� ���� ������ : ���ǽ� T? ��/���� T : ��/����F (���׿�����)
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int korean,math;
	System.out.print("���������� �Է��� �ּ��� : ");
	korean = sc.nextInt();
	System.out.print("���� ������ �Է��� �ּ��� : ");
	math = sc.nextInt();
// ���׿��� :	System.out.println("����л�?"+( (korean>=80 && math>=80)? " �½��ϴ�" : " �ƴմϴ� "));
	if(korean>=90 && math>=90) {
		System.out.println("�½��ϴ�");
	}
	else {
		System.out.println("�ƴմϴ�");
	}
	
	sc.close();
}
}
