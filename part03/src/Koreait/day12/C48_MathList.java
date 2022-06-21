package Koreait.day12;

import java.util.Scanner;
import java.util.ArrayList;

// C43번 예제 list로 바꾸기	//작성자 : 이용학
public class C48_MathList {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = 5;
	ArrayList<MathProblem> problems = new ArrayList<>();
	

	int ans;
	int cnt = 0;
		
	System.out.println("===============================");
	System.out.println("빨간펜 수학 2자리 덧셈 풀기");
	System.out.println("---------------------------");
	System.out.println("시작합니다.");
	for(int i=0; i<size; i++) {
		MathProblem temp = new MathProblem('+');
		temp.makeProb();
		
		System.out.print("문제"+(i+1)+". " +temp.getN1()+"+"+temp.getN2() +"= ? ");
		ans = sc.nextInt();
		
		if(ans == temp.showAnswer()) {
			temp.setCorrect(true);
			cnt ++;
		} //오답문제 저장
		problems.add(i,temp);
	}
	System.out.println("===============================");
	System.out.println("채점합니다. 맞은 갯수 : "+(cnt)+"("+(cnt)*100/size+"점)");
	System.out.println(":::::::틀린문제 정답 보기::::::::::::");
	
	
		for(int i=0; i<problems.size(); i++) {
			if(problems.get(i).isCorrect() == false) {
				System.out.println("문제"+(i+1)+ " "+problems.get(i).getN1()+"+"+problems.get(i).getN2()+"="+
			problems.get(i).showAnswer());
			}
		
	
sc.close();
}
	
	
}
}