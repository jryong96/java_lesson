package koreait.day06;

import java.util.Scanner;

public class C34_StringArray2_without_index {
public static void main(String[] args) {
	String message = "hi java!"; //message�� ������ ����
	
	String[] engkey = {"continue","break","public","static","dynamic"};
	
	//int double char �迭���� ��Ҹ� ��Ÿ���� nums[2], carr1[2], point[2]
	//									���⺻�� ������ Ÿ��
	//engkey �Ӹ��ƴ϶� engkey[2] �� String ������ Ÿ��
	
	for(int i=0; i<engkey.length;i++)
		System.out.println(engkey[1]); 	//engkey[1]�� string������
	
	String[]koreans = new String[5];   //�迭 ����� ���� �⺻�������� ����x, ������ ����
										//�⺻ �ʱⰪ�� ? null (�ƹ��͵� ������������ ����)
	
	for(int i=0; i<koreans.length;i++)
		System.out.println(koreans[1]);
	System.out.println("1. engkey �迭��Ұ��� �����ϴ� ���ڿ��� ����");
	for(int i=0; i<engkey.length;i++)
		System.out.println(engkey[i]+":"+engkey[1].length());
	
	koreans[0]="����ϴ�";
	koreans[1]="���ߴ�";
	koreans[2]="������";
	
	System.out.println("2. koreans �迭��Ұ��� �����ϴ� ���ڿ��� ����");
	for(int i=0;i<koreans.length;i++ )
		if(koreans[i] != null) //*�ſ� �߿�!!!!*
		System.out.println(koreans[i]+":"+koreans[i].length());
			//�����ϰ� �ִ� ��ü�� ���� ��(null) ,�޼ҵ�/�ʵ� �����ϸ� ���� : koreans[3],koreans[4]�� null����
	Scanner sc = new Scanner(System.in);
	System.out.print("static ��? >>> ");
	koreans[3] = sc.nextLine();
	System.out.print("dynamic ��? >>> ");
	koreans[4] = sc.nextLine();
	
	System.out.println("��� �Էµ� koreans �迭Ȯ�� : ");
	for(int i=0;i<koreans.length; i++)
		System.out.println(koreans[i]);
		
		
			//����ڰ� �Է��� ����ܾ engkey �迭 �ε��� ������� �˾Ƴ���
		System.out.println("4.���ڿ� �迭���� ���ϱ�");
	System.out.print("ã�� �ܾ �Է��� �ּ��� : ");
		String find = sc.nextLine();
		int i;
		for(i=0; i<engkey.length; i++) {
		
			if(find.equals(engkey)) {
			
			System.out.println("�ش� �ܾ�� "+ engkey[i]+"�� ��ġ�� �ֽ��ϴ�.");
			break;
			}
			
			 if(i==engkey.length)
					System.out.println("��ġ�ϴ� �ܾ �����ϴ�.");
			}
			
			
	
}
}

