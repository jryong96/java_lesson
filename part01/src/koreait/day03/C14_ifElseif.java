package koreait.day03;

import java.util.Scanner;

public class C14_ifElseif {
	public static void main(String[] args) {
		//if(���ǽ�){..}else if(���ǽ�){..}
		Scanner sc = new Scanner(System.in);
		int money,pay; //money ������ , pay : ���ݾ�
		double rate; //��������
		System.out.print("����Ͻ� �ݾ��� �Է��� �ּ��� : ");
		pay=sc.nextInt();
		if(pay>=100000) {
			rate = 0.1;
			money = (int)(rate*pay);
			System.out.printf("����! �����Ͻ� ��ǰ���� �� �������� %d�Դϴ�.\n",money);
			System.out.printf("10���� �̻� �����Ͽ� %d%% �����Ǿ����ϴ�.",(int)(100*rate));
		}
		else if(pay>=70000) {
			rate = 0.09;
		money = (int)(rate*pay);
			System.out.printf("����! �����Ͻ� ��ǰ���� �� �������� %d�Դϴ�.\n",money);
			System.out.printf("10���� �̻� �����Ͽ� %d%% �����Ǿ����ϴ�.",(int)(100*rate));
		}
		else if(pay>=4000) {
			rate = 0.07;
			money = (int)(rate*pay);
			System.out.printf("����! �����Ͻ� ��ǰ���� �� �������� %d�Դϴ�.\n",money);
			System.out.printf("10���� �̻� �����Ͽ� %d%% �����Ǿ����ϴ�.",(int)(100*rate));
		}
		else {
			rate = 0.03;
			money = (int)rate*pay;
			System.out.printf("����! �����Ͻ� ��ǰ���� �� �������� %d�Դϴ�.\n",money);
			System.out.printf("10���� �̻� �����Ͽ� %d%% �����Ǿ����ϴ�.",(int)(100*rate));
		}
		sc.close();
	}

}
