package koreaitday09;

import java.util.Random;
import java.util.Scanner;
public class C42_RedpenExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;
		int[] x1 = new int[10]; //��繮���� �ǿ�����1 ������ �迭
		int[] x2 = new int[10]; // ��繮���� �ǿ�����2 ������ �迭
		int[] no = new int[10]; // Ʋ������ ��ȣ ����
		int n1,n2,ans;
		int cnt = 0;
		System.out.println("-------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� Ǯ��");
		System.out.println("---------------------------------");
		System.out.println("�����մϴ�.");
		for(int i=0; i<size; i++) {
			n1 = r.nextInt(89)+11;
			n2 = r.nextInt(89)+11;
			System.out.print("����"+(i+1)+". " +n1+"+"+n2 +"= ? ");
			ans = sc.nextInt();
			if(ans != n1+n2) { //3���迭�� Ʋ������ ���� �����ϱ�
				x1[cnt] = n1;
				x1[cnt] = n2;
				no[cnt] = i+1;
				cnt ++; //Ʋ�������� ī��Ʈ
			}
			
		}
		System.out.println("=======================================");
		System.out.println("ä���մϴ�. ���� ���� : "+(size-cnt)+"("+(size-cnt)*100/size+"��)");
		System.out.println(":::::::Ʋ������ ���� ����::::::::::::");
		for(int i=0; i<cnt; i++) {
			System.out.println("����"+no[i]+"." +x1[i]+"+"+x2[i] + "="+ (x1[i]+x2[i]) );
		}
			sc.close();
	}

}
