package koreait.day06;

public class C32_ArrayManipulation {
public static void main(String[] args) {
	//�迭����� ���԰� ����
	
	int[]test = {11,22,33,44,55,66,77};
	
	//�ε����� 2 �����Ҷ� - ������ �ε��� ���� �������� �̵�
	for(int i=test.length-2;i>=2;  i--) {
//	for(int i =2;i<test.length-1;i++) //�߸��� �ڵ� 
		test[i+1]=test[i];
		
	}
	
	test[2]=23;
	for(int i=0; i<test.length; i++) {
		System.out.print(test[i]+"\t"); //�迭 �ε����ڸ��� 1ĭ�� �о 77�� �����
		
	}
	System.out.println();
		int[] test2 = {11,22,33,44,55,66,77}; //2�� �ε��� �� �����ϱ�
		//�ε��� 2�� ������ ��  -���� �ε��� �������� �̵�,
		System.out.println("\n------------------------------------------------------------------");
		for(int i=3; i<test2.length;i++) 
			test2[i-1] = test2[i];
		
		System.out.println();
			
			
			
			
		
	
	
}
}


