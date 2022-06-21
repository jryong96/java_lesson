package koreait.day03;

import java.util.Scanner;

public class C14_ifElseif {
	public static void main(String[] args) {
		//if(조건식){..}else if(조건식){..}
		Scanner sc = new Scanner(System.in);
		int money,pay; //money 적립금 , pay : 사용금액
		double rate; //적립비율
		System.out.print("사용하신 금액을 입력해 주세요 : ");
		pay=sc.nextInt();
		if(pay>=100000) {
			rate = 0.1;
			money = (int)(rate*pay);
			System.out.printf("고객님! 구매하신 상품들의 총 적립금은 %d입니다.\n",money);
			System.out.printf("10만원 이상 구매하여 %d%% 적립되었습니다.",(int)(100*rate));
		}
		else if(pay>=70000) {
			rate = 0.09;
		money = (int)(rate*pay);
			System.out.printf("고객님! 구매하신 상품들의 총 적립금은 %d입니다.\n",money);
			System.out.printf("10만원 이상 구매하여 %d%% 적립되었습니다.",(int)(100*rate));
		}
		else if(pay>=4000) {
			rate = 0.07;
			money = (int)(rate*pay);
			System.out.printf("고객님! 구매하신 상품들의 총 적립금은 %d입니다.\n",money);
			System.out.printf("10만원 이상 구매하여 %d%% 적립되었습니다.",(int)(100*rate));
		}
		else {
			rate = 0.03;
			money = (int)rate*pay;
			System.out.printf("고객님! 구매하신 상품들의 총 적립금은 %d입니다.\n",money);
			System.out.printf("10만원 이상 구매하여 %d%% 적립되었습니다.",(int)(100*rate));
		}
		sc.close();
	}

}
