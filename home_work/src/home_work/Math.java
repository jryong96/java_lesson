package home_work;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Math {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //스캐너 클래스 호출
	Random r = new Random(); //랜덤 클래스 호출
	int a; //문제의 갯수
	System.out.println("======빨간펜 수학2=========")	;
	System.out.print("몇 문제 풀래요 ? : ");
	a = sc.nextInt();
		
	int[] num1 = new int[a]; // 더해질 숫자의 배열 길이 (a문제)
	int[] num2 = new int[a]; // 더할 숫자의 배열  길이 (a문제)
	int[] wrong = new int[a]; // 오답문제 번호를 저장할 배열 (a문제)
	int[] answer = new int[a]; //정답
	int c = 0; //정답문제수
	for(int i=0; i<num1.length; i++) { //입력한 횟수만큼 반복
		num1[i] = r.nextInt(89)+11;
		num2[i] = r.nextInt(89)+11;
		System.out.print("문제"+(i+1)+"  "+num1[i]+"+"+ num2[i] +" ="); //덧셈문제
		int k = sc.nextInt(); //답변
		answer[i] = num1[i]+num2[i];
		
		if(k != answer[i] ) { //오답시 : 답변이 정답과 다를 때  틀린문제번호를 저장
			System.out.println("땡! 오답!");
			wrong[i] = i+1; 
		}
		else { // 정답일 때 
			System.out.println("굿! 정답!!");
			c++;
		}
		}
	
	System.out.println("================================");


	System.out.println("채점 합니다."+ "맞은개수 : "+c+" ("+(c*10)+"점)");
	System.out.println("--------틀린문제 보기---------");
	for(int i=0; i<a; i++) {
		if(wrong[i]!=0) {
			System.out.println("문제"+(i+1)+"  "+num1[i]+"+"+ num2[i] +" = "+answer[i]);
		}
		else if(wrong[i]==0) {
			break;
		}
	}
	System.out.println("첫번째 피연산자 : "+Arrays.toString(num1));
	System.out.println("두번째 피연산자 : "+Arrays.toString(num2));
	
	sc.close();
	

}
}
