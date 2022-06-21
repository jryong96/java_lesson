package koreaitday14;

import java.util.Arrays;


public class C57_ArraySortEx2 {
public static void main(String[] args) {
	//배열값의 저장된 값(문자열)을 정렬해보기 //ComapreTo 활용
String[] names = {"제니","다현","나연","신비","은하","모모"};

	
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
