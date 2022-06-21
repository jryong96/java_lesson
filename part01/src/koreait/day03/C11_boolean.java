package koreait.day03;

import java.util.Scanner;

public class C11_boolean {
	public static void main(String[] args) {
//		국어 수학 모두 80이상 >> 모범학생
//		국어 수학 둘중 하나 90이상 >> 특기학생
		System.out.println("논리연산 결과 확인하기 : and");
		System.out.println(" true and true = " + (true && true));
		System.out.println(" true and false = " + (true && false));
		System.out.println(" false and true = " + (false && true));
		System.out.println(" false and false = " + (false && false));
		
		System.out.println("논리연산 결과 확인하기 : or");
		System.out.println(" true or true = " + (true || true));
		System.out.println(" true or false = " + (true || false));
		System.out.println(" false or true = " + (false || true));
		System.out.println(" false or false = " + (false || false));
		System.out.println("논리연산 결과 확인하기 : not");
		System.out.println(" not true = " + !true);    //true 값을 반대(not)값으로 바꿈
		System.out.println(" not false = " + !false);


		
		
		
		
		
		
		
				Scanner sc = new Scanner(System.in);
				int korean,math;
				System.out.print("국어점수를 입력해 주세용 : ");
				korean = sc.nextInt();
				System.out.print("수학 점수를 입력해 주세용 : ");
				math = sc.nextInt();
				System.out.println("모범학생?"+(korean>=80 && math>=80) );
				System.out.println("특기학생?"+(korean>=90 || math>=90) );
				//국어점수가 20~80사이가 아닌 학생 > 특이한학생 not연산 사용해서 만들기
				System.out.println("특이한학생?"+!(korean>=20 && korean<=80 ));
				
				sc.close();
	}

}
