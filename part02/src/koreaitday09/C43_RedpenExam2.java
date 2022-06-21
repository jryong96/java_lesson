package koreaitday09;
// C42번을 MathProblem 클래스를 사용하는 것으로 바꾸기 :  연산은 덧셈.
import java.util.Random;
import java.util.Scanner;
public class C43_RedpenExam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;
		int max_size = MathProblem.max_size;
		
		MathProblem[] problems =  new MathProblem[size]; //모든 문제를 저장할 배열
		
		
		//배열의 타입은 MathProblem 객체참조형 : n1, n2, op, isCorrect
		
		int n1,n2,ans; // n1, n2는 지울예정 대신에 뭐 들어갈지 생각해보기
		int cnt = 0;
		System.out.println("-------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 풀기");
		System.out.println("---------------------------------");
		System.out.println("시작합니다.");
		for(int i=0; i<size; i++) {
			MathProblem temp = new MathProblem('+');
			
			temp.makeProb();  // n1, n2값이 객체의 필드로 난수생성  >> MathProblem의 prob 
		
			System.out.print("문제"+(i+1)+". " +temp.getN1()+"+"+temp.getN2() +"= ? ");
			ans = sc.nextInt();
			
			if(ans == temp.showAnswer()) { //맞은 개수 count 
			temp.setCorrect(true);
				cnt ++; // 카운트
			}
			
			problems[i] = temp;
			
		
			
		}
		System.out.println("=======================================");
		System.out.println("채점합니다. 맞은 갯수 : "+(cnt)+"("+(cnt)*100/size+"점)");
		System.out.println(":::::::틀린문제 정답 보기::::::::::::");

		for(MathProblem temp : problems)	{	
//		for(int i=0; i<problems.length; i++) { i없이 for문 작성해보기
			if(!temp.isCorrect()) {
//			if(problems[i].isCorrect()== false) {
			System.out.println(temp.Problem() + temp.showAnswer());
//			System.out.println("문제"+(i+1)+". " +problems[i].Problem()+problems[i].showAnswer()) ;
			}
		
		}
		
		sc.close();
	}
}





