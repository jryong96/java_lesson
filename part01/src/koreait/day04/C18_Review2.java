package koreait.day04;

import java.util.Scanner;

public class C18_Review2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int math,sci,eng;
		String best;
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		System.out.print("과학 점수 입력 : ");
		sci = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
	
		if(math>eng) {
			if(math>sci) {
				best = "수학";
				System.out.printf("귀하의 특기과목은  %s 입니다.",best);
			}
			else if(sci>math) {
				best = "과학";
		}
		if(math<eng) {
			if(eng>sci) {
				best = "영어";
				System.out.printf("귀하의 특기과목은  %s 입니다.",best);
			}
			else if(eng<sci) {
				best = "과학";
				System.out.printf("귀하의 특기과목은  %s 입니다.",best);
			}
			else if(math==sci) {
				best = "수학,과학";
				System.out.printf("귀하의 특기과목은  %s 입니다.",best);
			}
			else if(math==eng) {
				best = "영어,수학";
				System.out.printf("귀하의 특기과목은  %s 입니다.",best);
			}
			else if(eng==sci) {
				best = "영어,과학";
				System.out.printf("귀하의 특기과목은  %s 입니다.",best);
			}
			else if(sci==math && math == eng && eng == sci) {
				best = "영어,수학,과학";
				System.out.printf("귀하의 특기과목은  %s 입니다.",best);
				
			}
		}
		
		}
		
	}

}
