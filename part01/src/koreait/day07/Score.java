package koreait.day07;

import java.util.Scanner;

//C40 번호생략
public class Score {
	int korean,english,science;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 >>");  this.korean = sc.nextInt();
		System.out.print("영어 >>");  this.english = sc.nextInt();
		System.out.print("과학 >>");  this.science = sc.nextInt();
		//sc.close(); 는 완전 종료시에만
	}
	int sum() { 
		return (korean+english+science);
		
	}
	
	double average() {
		return (double)sum()/3;
	}
	@Override
	public String toString() {
		return "Score [korean=" + korean + ", english=" + english + ", science=" + science + "]";
	}
	
}
