package koreait.day04;

import java.util.Scanner;

public class C18_Review2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int math,sci,eng;
		String best;
		System.out.print("���� ���� �Է� : ");
		math = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		sci = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();
	
		if(math>eng) {
			if(math>sci) {
				best = "����";
				System.out.printf("������ Ư�������  %s �Դϴ�.",best);
			}
			else if(sci>math) {
				best = "����";
		}
		if(math<eng) {
			if(eng>sci) {
				best = "����";
				System.out.printf("������ Ư�������  %s �Դϴ�.",best);
			}
			else if(eng<sci) {
				best = "����";
				System.out.printf("������ Ư�������  %s �Դϴ�.",best);
			}
			else if(math==sci) {
				best = "����,����";
				System.out.printf("������ Ư�������  %s �Դϴ�.",best);
			}
			else if(math==eng) {
				best = "����,����";
				System.out.printf("������ Ư�������  %s �Դϴ�.",best);
			}
			else if(eng==sci) {
				best = "����,����";
				System.out.printf("������ Ư�������  %s �Դϴ�.",best);
			}
			else if(sci==math && math == eng && eng == sci) {
				best = "����,����,����";
				System.out.printf("������ Ư�������  %s �Դϴ�.",best);
				
			}
		}
		
		}
		
	}

}
