package koreait.day06;

import java.util.Random;

public class C31_RandomEx {
public static void main(String[] args) {
/*�л� ����(����) ���� ������ ����
 * �л� �ο��� 100�� - ������ �����ϰ�(0<=����<=100)
 * 90~100 : n�� (a.0%) �Ҽ��� ���ڸ��� ǥ��
 * 80~89 : 
 * .
 * .             >>>> ī��Ʈ ���� 5�� �ʿ� a,b,c,d,e
 * .					����count[5] : counts[0],counts[1],...counts[4]
 * 60~69
 * 60�� �̸� 
 */
	
	Random r = new Random();
	
	int score[] = new int[300]; //�л��� n���̴ϱ� n���� �迭 ����� 
	int counts[] = new int[5]; // ������ 5�����̴� 5���� �迭 ����
	
	for(int i = 0; i<100 ; i++) {
		score[i] = r.nextInt(101); // ���� ���� ����
	}
	for (int i=0; i<score.length ; i++) { //�������� count�ϱ�
		if (score[i]>90 && score[i]<=100) 
			counts[0]++; //90~100 �̸� 0���迭 �� 1�߰�
				
		else if(score[i] >80 && score[i]<=90) 
			counts[1]++; //""
				
		else if(score[i] >70 && score[i]<=80) 
			counts[2]++; //""
			
		else if(score[i] >60 && score[i]<=70) 
			counts[3]++; //""
	
		else 
			counts[4]++; //""
		
		

		
	
		
}
	System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60�̸�");
	System.out.println("--------------------------------------------");
	for(int i=0; i<counts.length; i++) { //�迭�� ũ�⸸ŭ �ݺ� ,counts �迭�� �⎶
		System.out.printf("%.1f%%\t",(double)counts[i]/score.length*100);
		
}
	
}
//
}
