package koreaitday09;
// C42���� MathProblem Ŭ������ ����ϴ� ������ �ٲٱ� :  ������ ����.
import java.util.Random;
import java.util.Scanner;
public class C43_RedpenExam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;
		int max_size = MathProblem.max_size;
		
		MathProblem[] problems =  new MathProblem[size]; //��� ������ ������ �迭
		
		
		//�迭�� Ÿ���� MathProblem ��ü������ : n1, n2, op, isCorrect
		
		int n1,n2,ans; // n1, n2�� ���￹�� ��ſ� �� ���� �����غ���
		int cnt = 0;
		System.out.println("-------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� Ǯ��");
		System.out.println("---------------------------------");
		System.out.println("�����մϴ�.");
		for(int i=0; i<size; i++) {
			MathProblem temp = new MathProblem('+');
			
			temp.makeProb();  // n1, n2���� ��ü�� �ʵ�� ��������  >> MathProblem�� prob 
		
			System.out.print("����"+(i+1)+". " +temp.getN1()+"+"+temp.getN2() +"= ? ");
			ans = sc.nextInt();
			
			if(ans == temp.showAnswer()) { //���� ���� count 
			temp.setCorrect(true);
				cnt ++; // ī��Ʈ
			}
			
			problems[i] = temp;
			
		
			
		}
		System.out.println("=======================================");
		System.out.println("ä���մϴ�. ���� ���� : "+(cnt)+"("+(cnt)*100/size+"��)");
		System.out.println(":::::::Ʋ������ ���� ����::::::::::::");

		for(MathProblem temp : problems)	{	
//		for(int i=0; i<problems.length; i++) { i���� for�� �ۼ��غ���
			if(!temp.isCorrect()) {
//			if(problems[i].isCorrect()== false) {
			System.out.println(temp.Problem() + temp.showAnswer());
//			System.out.println("����"+(i+1)+". " +problems[i].Problem()+problems[i].showAnswer()) ;
			}
		
		}
		
		sc.close();
	}
}





