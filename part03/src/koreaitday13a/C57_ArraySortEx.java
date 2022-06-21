package koreaitday13a;

import java.util.Arrays;
import java.util.Random;

public class C57_ArraySortEx {
public static void main(String[] args) {
	//배열값의 저장된 값을 직접 정렬 구현보기
Random r = new Random();
int[] num = new int[6];
int temp = 0;
	for(int i=0; i<num.length; i++) {
		num[i] = r.nextInt(100);
	}
	System.out.println("Before : "+ Arrays.toString(num));
	
	for(int i=0; i<num.length-1; i++) {
		for(int k=i+1; k<num.length; k++) {
			if(num[i]>num[k]) {
				temp = num[k];
				num[k] = num[i];
				num[i] = temp;
				
			}
			
		
		}
	}
	System.out.println("After : " + Arrays.toString(num));
	
	
		
}
}
