package koreait.day05;

import java.util.Scanner;

public class C26_BankExam { //CLI ����� �޴������� while������ ����
//GUI : graphic user Interface
//CLI : Command Line Interface

public static void main(String[] args) {// ���������� ����/���/�ܰ���ȸ ����
	Scanner sc = new Scanner(System.in);
	boolean run = true; //(�ݺ��� ������ ����)
	int sel; //���� ���� ����
	int balance = 0; // �ܰ�
	
	while(run) { //�ʱⰪ�� true ��
		int money; // while�� ��������, �Աݾװ� ��ݾ� ����
		System.out.println("------------------------");
		System.out.println(" 1.�Ա�     2.���        3. �ܰ�Ȯ��          4.����");
		System.out.println("------------------------");
		System.out.println("�޴� ���� : ");
		sel = sc.nextInt();
		switch(sel) {
		case 1: //����ó�� (�Աݱݾ� �Է��ϰ� �ܾ׿� ���ϱ�)
			System.out.println("�Աݾ��� �Է��ϼ��� : ");
			money = sc.nextInt();
			balance = balance+money;  // balacne+=money
			System.out.println("���� �ܾ��� "+balance+"�� �Դϴ�.");
			break;
			
		
		case 2: //���ó�� (��ݱݾ� �Է� -> �ܾ׺��� ���� ������ ó��  (�ܾ�-��ݾ�)
			money = 0;
			if(money<balance) {
			System.out.println("����Ͻ� �ݾ��� �Է��� �ּ��� : ");
			money = sc.nextInt();
			balance-=money; // balance = balance - out_money
			System.out.println("���� �ܾ��� "+balance+"�� �Դϴ�.");
			break;
	
			}
			else {
				System.out.println("�ܾ��� �����մϴ�");
			}
		case 3: // �ܾ�Ȯ��
			System.out.println("���� �ܾ��� "+balance+"�� �Դϴ�.");
			System.out.println();
			break;
				
		case 4: // �ݺ�����
			run = false; //switch�� �ȿ��� break�� while�� Ż���� �Ұ���!
			break;
		default : //1~4 ��ȣ�� �ƴҶ�
			System.out.println("��ȣ�� �ٽ� Ȯ���� �ּ���!");
			
			}
				
			
				
			
			
			
	
	}
	sc.close();
	
	
}
}
