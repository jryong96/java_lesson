package koreaitday09;

public class C44_ForEachTest {
public static void main(String[] args) {
	int[] itest = {1,2,3,4,5,6};
	String[] stest = {"one","two","three","four","five"};
	
	
	for(int i=0; i<itest.length; i++) { //�迭�� for������ ���������� ������ ��  �ε��� ������ ��� 
		System.out.println("i = "+ i + ",itest[1] = " + itest[1]); //itest�� int  Ÿ��
	}
		for(int i =0; i<stest.length; i++) {
			System.out.println("s = "+ i + ",stest[1] = " + stest[1]); //stest�� String Ÿ��
		}
		
		//�ڵ��� ȿ���� ���̱� ���� for(for each) ���
		
		System.out.println("itest �迭�� : ");
		for(int temp : itest ) //�迭�� ����� ���� ������� ������ temp ������ ����
			System.out.println(temp); 
		
		System.out.println("\n stest �迭�� : ");
		for(String temp : stest)
			System.out.println(temp);
}
}
