package koreait.day05;

import java.util.Arrays;

public class C_27_IntArray {
public static void main(String[] args) {
	
	//�迭����
	int[] arr1 = {1,2,3,4,5,6,7}; //�ʱⰪ ����
	int[] arr2 = new int[7]; // �迭�� ũ�⸸ ����. �⺻ �ʱⰪ 
	
	System.out.println("\n �迭�̸�����(����������)���");
	System.out.println(arr1); //16����, �������� �����ִ� �ؽ��ڵ� ��
	System.out.println(arr1.hashCode());
	//�迭 ��Ұ� 1�� ����غ���
	System.out.println("\n �迭��Ұ� 1�� ���(�ε���3��)");
	System.out.println("arr1[3]= ?"+arr1[3]);
	System.out.println("arr2[3]= ?"+arr2[3]);
	
	System.out.println("\n�迭 ��Ұ� 1�� ����(�ε���3��)");
	arr1[3]= 999;
	arr2[3]=999;
	
	//����� �迭�� ���� ��� ����� �� �ִ� ���ڿ��� ��ȯ��Ű�� �޼ҵ�
	String temp = Arrays.toString(arr1);  //toString�� static �޼ҵ�, �޼ҵ��� ��������
	System.out.println();
	System.out.println("arr1 : " +temp);
	System.out.println("arr2 : "+Arrays.toString(arr2));
	
	
}
}
