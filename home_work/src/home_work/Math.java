package home_work;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Math {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //��ĳ�� Ŭ���� ȣ��
	Random r = new Random(); //���� Ŭ���� ȣ��
	int a; //������ ����
	System.out.println("======������ ����2=========")	;
	System.out.print("�� ���� Ǯ���� ? : ");
	a = sc.nextInt();
		
	int[] num1 = new int[a]; // ������ ������ �迭 ���� (a����)
	int[] num2 = new int[a]; // ���� ������ �迭  ���� (a����)
	int[] wrong = new int[a]; // ���乮�� ��ȣ�� ������ �迭 (a����)
	int[] answer = new int[a]; //����
	int c = 0; //���乮����
	for(int i=0; i<num1.length; i++) { //�Է��� Ƚ����ŭ �ݺ�
		num1[i] = r.nextInt(89)+11;
		num2[i] = r.nextInt(89)+11;
		System.out.print("����"+(i+1)+"  "+num1[i]+"+"+ num2[i] +" ="); //��������
		int k = sc.nextInt(); //�亯
		answer[i] = num1[i]+num2[i];
		
		if(k != answer[i] ) { //����� : �亯�� ����� �ٸ� ��  Ʋ��������ȣ�� ����
			System.out.println("��! ����!");
			wrong[i] = i+1; 
		}
		else { // ������ �� 
			System.out.println("��! ����!!");
			c++;
		}
		}
	
	System.out.println("================================");


	System.out.println("ä�� �մϴ�."+ "�������� : "+c+" ("+(c*10)+"��)");
	System.out.println("--------Ʋ������ ����---------");
	for(int i=0; i<a; i++) {
		if(wrong[i]!=0) {
			System.out.println("����"+(i+1)+"  "+num1[i]+"+"+ num2[i] +" = "+answer[i]);
		}
		else if(wrong[i]==0) {
			break;
		}
	}
	System.out.println("ù��° �ǿ����� : "+Arrays.toString(num1));
	System.out.println("�ι�° �ǿ����� : "+Arrays.toString(num2));
	
	sc.close();
	

}
}
