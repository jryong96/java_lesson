package koreaitday14;

import java.util.Arrays;


public class C57_ArraySortEx2 {
public static void main(String[] args) {
	//�迭���� ����� ��(���ڿ�)�� �����غ��� //ComapreTo Ȱ��
String[] names = {"����","����","����","�ź�","����","���"};

	
	for(int i=0; i<names.length-1; i++) {
		for(int k=i+1; k<names.length; k++) {
			if(names[i].compareTo(names[k])>0) {
				String temp = names[i];  //temp = names[k];
				names[i] = names[k];
				names[k] = temp;
				
			}
			
		
		}
	}
	System.out.println("After : " + Arrays.toString(names));
	
	
		
}
}
