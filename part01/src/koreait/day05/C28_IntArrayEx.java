package koreait.day05;

import java.util.Scanner;

public class C28_IntArrayEx {
	/* 1. int �迭ũ�� 5�� ����  �̸��� nums
	 * 2. �迭 ����� ���� ����� �Է����� �����մϴ�.
	 * 3.�Էµ� ���� �հ�, ����� ���մϴ�. -> �հ�� 2������ �Է¹޴� for�� �ȿ��� ���� �ۼ�
	 * 4.�Էµ� ���� �ִ�, �ּڰ��� ���ϴ� �޼ҵ带 ����ϴ�.
	 * 			��maxOfArray, minOfArray : ���ڴ� int �迭
	 * 
	 */
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	double avg = 0;
	int[] nums = new int[5];
	for(int i=0; i<nums.length; i++) {
		System.out.println("������ �Է��ϼ��� : ");
		nums[i] = sc.nextInt();
		sum = sum + nums[i];
		avg = 1.00*sum/(i+1);
		System.out.println("���� : "+sum);
		System.out.printf("��� : %.2f\n",avg);
		
		
	}
	int max = maxOfArray(nums);
		System.out.println("�迭 nums �� �ִ� : "+ max);
	int min = minOfArray(nums);
	System.out.println("�迭 nums�� �ּڰ� : " +min);
		sc.close();
}
	

public static int maxOfArray(int[] array) {//�ִ밪 �޼ҵ�
		int max = array[0];
		for(int i=1; i<array.length;i++) {
			if(max < array[i])
				max = array[i];
}
		return max;
}
public static int minOfArray(int[] array) { //�ּڰ�
	int min = array[0];
	for(int i=1; i<array.length;i++) {
		if( array[i]<min)
			min = array[i];
	}
	return min;
}
}

//max, min ������ ���� �迭�� 0�� ��Ұ����� �ʱ�ȭ
// �迭��� 1������ ��������ұ��� max,min�� ������� ���ؼ�
// max�� �� ������ ������ (min�� �� ������ ũ��) max(min) ���� �迭��Ұ����� �����մϴ�.
// -> �񱳰� �����ٸ� ���� max,min�� ���� �˴ϴ�.

	
	



	
		
	
	
	
	
	
	
			











