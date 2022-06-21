package koreaitday09;

import java.util.Random;
import java.util.Scanner;
public class C42_RedpenExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;
		int[] x1 = new int[10]; //모든문제의 피연산자1 저장할 배열
		int[] x2 = new int[10]; // 모든문자의 피연산자2 저장할 배열
		int[] no = new int[10]; // 틀리문제 번호 저장
		int n1,n2,ans;
		int cnt = 0;
		System.out.println("-------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 풀기");
		System.out.println("---------------------------------");
		System.out.println("시작합니다.");
		for(int i=0; i<size; i++) {
			n1 = r.nextInt(89)+11;
			n2 = r.nextInt(89)+11;
			System.out.print("문제"+(i+1)+". " +n1+"+"+n2 +"= ? ");
			ans = sc.nextInt();
			if(ans != n1+n2) { //3개배열에 틀린문제 내용 저장하기
				x1[cnt] = n1;
				x1[cnt] = n2;
				no[cnt] = i+1;
				cnt ++; //틀린문제를 카운트
			}
			
		}
		System.out.println("=======================================");
		System.out.println("채점합니다. 맞은 갯수 : "+(size-cnt)+"("+(size-cnt)*100/size+"점)");
		System.out.println(":::::::틀린문제 정답 보기::::::::::::");
		for(int i=0; i<cnt; i++) {
			System.out.println("문제"+no[i]+"." +x1[i]+"+"+x2[i] + "="+ (x1[i]+x2[i]) );
		}
			sc.close();
	}

}
