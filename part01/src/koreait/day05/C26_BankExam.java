package koreait.day05;

import java.util.Scanner;

public class C26_BankExam { //CLI 방식의 메뉴선택을 while문으로 연습
//GUI : graphic user Interface
//CLI : Command Line Interface

public static void main(String[] args) {// 가상은행의 예금/출금/잔고조회 실행
	Scanner sc = new Scanner(System.in);
	boolean run = true; //(반복을 제어할 변수)
	int sel; //선택 사항 저장
	int balance = 0; // 잔고
	
	while(run) { //초기값은 true 로
		int money; // while문 지역변수, 입금액과 출금액 저장
		System.out.println("------------------------");
		System.out.println(" 1.입금     2.출금        3. 잔고확인          4.종료");
		System.out.println("------------------------");
		System.out.println("메뉴 선택 : ");
		sel = sc.nextInt();
		switch(sel) {
		case 1: //예금처리 (입금금액 입력하고 잔액에 더하기)
			System.out.println("입금액을 입력하세요 : ");
			money = sc.nextInt();
			balance = balance+money;  // balacne+=money
			System.out.println("현재 잔액은 "+balance+"원 입니다.");
			break;
			
		
		case 2: //출금처리 (출금금액 입력 -> 잔액보다 많지 않을때 처리  (잔액-출금액)
			money = 0;
			if(money<balance) {
			System.out.println("출금하실 금액을 입력해 주세요 : ");
			money = sc.nextInt();
			balance-=money; // balance = balance - out_money
			System.out.println("현재 잔액은 "+balance+"원 입니다.");
			break;
	
			}
			else {
				System.out.println("잔액이 부족합니다");
			}
		case 3: // 잔액확인
			System.out.println("현재 잔액은 "+balance+"원 입니다.");
			System.out.println();
			break;
				
		case 4: // 반복종료
			run = false; //switch문 안에서 break로 while문 탈출은 불가능!
			break;
		default : //1~4 번호가 아닐때
			System.out.println("번호를 다시 확인해 주세요!");
			
			}
				
			
				
			
			
			
	
	}
	sc.close();
	
	
}
}
