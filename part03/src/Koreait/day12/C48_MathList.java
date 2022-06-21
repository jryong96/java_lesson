package Koreait.day12;

import java.util.Scanner;
import java.util.ArrayList;

// C43�� ���� list�� �ٲٱ�	//�ۼ��� : �̿���
public class C48_MathList {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = 5;
	ArrayList<MathProblem> problems = new ArrayList<>();
	

	int ans;
	int cnt = 0;
		
	System.out.println("===============================");
	System.out.println("������ ���� 2�ڸ� ���� Ǯ��");
	System.out.println("---------------------------");
	System.out.println("�����մϴ�.");
	for(int i=0; i<size; i++) {
		MathProblem temp = new MathProblem('+');
		temp.makeProb();
		
		System.out.print("����"+(i+1)+". " +temp.getN1()+"+"+temp.getN2() +"= ? ");
		ans = sc.nextInt();
		
		if(ans == temp.showAnswer()) {
			temp.setCorrect(true);
			cnt ++;
		} //���乮�� ����
		problems.add(i,temp);
	}
	System.out.println("===============================");
	System.out.println("ä���մϴ�. ���� ���� : "+(cnt)+"("+(cnt)*100/size+"��)");
	System.out.println(":::::::Ʋ������ ���� ����::::::::::::");
	
	
		for(int i=0; i<problems.size(); i++) {
			if(problems.get(i).isCorrect() == false) {
				System.out.println("����"+(i+1)+ " "+problems.get(i).getN1()+"+"+problems.get(i).getN2()+"="+
			problems.get(i).showAnswer());
			}
		
	
sc.close();
}
	
	
}
}