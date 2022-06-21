package koreait.day03;

import java.util.Scanner;

public class C16_SwitchTest {
public static void main(String[] args) {
//switch문은 if~ else if 를 대신하는 명령문
Scanner sc = new Scanner(System.in);
int item_no;
int pay = 0;

System.out.println("상품목록 : 1.피자 : 2200원  2.딸기 : 1900원 3.꽃 : 3600원  4.포도 : 2870원");
		System.out.print("원하시는 번호를 입력해 주세요 : ");
		item_no = sc.nextInt();
		
		switch(item_no) {
		case 1 : 
			pay = 2200;
			System.out.println(pay+"원 입니다.");
			break;
		case 2 : 
			pay = 1900;
			System.out.println(pay+"원 입니다.");
			break;
		case 3 :
			pay = 3600;
			System.out.println(pay+"원 입니다.");
			break;
		case 4:
			pay = 2870;
			System.out.println(pay+"원 입니다.");
			break;
		default: // case문에 해당되지 않는 나머지 경우
			System.out.println("잘못된 번호 입니다.");
			break;
			
		}
		
		if(item_no==1) {
			pay=2200;
					}
			else if(item_no==2) {
				pay=1900;
						}
			else if(item_no==3) {
				pay = 3600;
						}
			else if(item_no==4) {
				pay = 2870;
						}
		
			else {
				System.out.println("잘못된 번호 입니다.");
			}
		System.out.println(pay+"원 입니다.");
		
		
		
		
		
		
	
		
		
		
		
		
		
		
}
}
