package Koreait.dayb;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
public static void main(String[] args) {
	Random r = new Random(); //���� ����
	Scanner sc = new Scanner(System.in); //�� �Է¹ޱ�
	int max = 10; //�õ�Ƚ��
	int[]triallst = new int[max]; //�迭�� ũ�� 10 ����
	
	
	System.out.println("���ڸ��߱� ������ �����մϴ�. �� ��ǻ�ʹ� ���ڸ� ���߽��ϴ�.");
	System.out.println("����� �����Դϴ�. ���ڸ� ���纸����(101~209)"); 
	int numCpu = r.nextInt(199)+101; // 101~209 ���� ���� ���� , ����
	int nump;  // �Է¹�ȣ
	int i = 0;
	
	
	do { //do while  �� ���� ���� ������� do�Ʒ��� ������ �ѹ� ����
		System.out.print("������ �Է� �ϼ��� " +"��ȸ "+"("+(max-i)+"ȸ)  :");
		nump = sc.nextInt();
		if (numCpu > nump) {
			triallst[i] = nump;
			i++; //i : ������ Ƚ��
			System.out.println("�� ũ��!");
		}
		else if(numCpu < nump) {
			triallst[i] = nump;
			i++;
			System.out.println("�� �۰�!");
		}
		if (i==10) break;
	}
	while (numCpu != nump);
			
		
	if(i==10) {
		System.out.println("�Է� ���� : "+Arrays.toString(triallst));
		System.out.println("Ƚ���ʰ�! �ٽ� �����ϼ���");
		System.out.println("������ "+numCpu+"������~");
}
	else { 
		System.out.println("����! "+ " �������� �õ�Ƚ�� : "+i+1);
	}
	sc.close();
}
}