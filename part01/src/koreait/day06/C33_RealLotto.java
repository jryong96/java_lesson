package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto { //����ȣ�� �ε�����
	//�ۼ��� : �̿���
public static void main(String[] args) {
Random r = new Random();
int numbers[] = new int[45]; //�ζǰ� �迭

for(int i=0; i<45; i++) //�ε��� ����
	numbers[i]=i+1; //1~45

System.out.println("numbers �迭 �ʱⰪ=================");
	System.out.println(Arrays.toString(numbers));
	System.out.println("=====================================");
	
	int[]lotto = new int[6]; //��÷��ȣ 6���� �迭,  ���� :6
	int k;
	for(int count=0; count<6;count++) { //
		k = r.nextInt(45-count); //��÷��ȣ�� ������ ������ �ε��� �迭��
		System.out.println("k="+k+",number = "+numbers[k]);
		
		lotto[count] = numbers[k]; //��÷��ȣ 
		
		for(int i=k; i<numbers.length-1;i++) { 
			numbers[i] = numbers[i+1]; //��÷�� ���ǹ�ȣ(�ε���) ���� (�ߺ�����)
		}
		System.out.println(Arrays.toString(numbers));
	}
		System.out.println("��÷��ȣ : ");
		System.out.println(Arrays.toString(lotto)); //��÷��ȣ ���
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto)); //��÷��ȣ�� ������������ ����
		
	}
}

