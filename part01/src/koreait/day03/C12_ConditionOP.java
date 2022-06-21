package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOP {
	//조건식의 결과에 따라 선택하는 조건 연산자 : 조건식 T? 값/수식 T : 값/수식F (삼항연산자)
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int korean,math;
	System.out.print("국어점수를 입력해 주세용 : ");
	korean = sc.nextInt();
	System.out.print("수학 점수를 입력해 주세용 : ");
	math = sc.nextInt();
// 삼항연산 :	System.out.println("모범학생?"+( (korean>=80 && math>=80)? " 맞습니다" : " 아닙니다 "));
	if(korean>=90 && math>=90) {
		System.out.println("맞습니다");
	}
	else {
		System.out.println("아닙니다");
	}
	
	sc.close();
}
}
