package koreait.day05;

import java.util.Arrays;

public class C_27_IntArray {
public static void main(String[] args) {
	
	//배열선언
	int[] arr1 = {1,2,3,4,5,6,7}; //초기값 설정
	int[] arr2 = new int[7]; // 배열의 크기만 설정. 기본 초기값 
	
	System.out.println("\n 배열이름으로(참조형변수)출력");
	System.out.println(arr1); //16진수, 참조값과 연관있는 해쉬코드 값
	System.out.println(arr1.hashCode());
	//배열 요소값 1개 출력해보기
	System.out.println("\n 배열요소값 1개 출력(인덱스3번)");
	System.out.println("arr1[3]= ?"+arr1[3]);
	System.out.println("arr2[3]= ?"+arr2[3]);
	
	System.out.println("\n배열 요소값 1개 저장(인덱스3번)");
	arr1[3]= 999;
	arr2[3]=999;
	
	//선언된 배열의 값을 모두 출력할 수 있는 문자열로 변환시키는 메소드
	String temp = Arrays.toString(arr1);  //toString은 static 메소드, 메소드의 리턴형식
	System.out.println();
	System.out.println("arr1 : " +temp);
	System.out.println("arr2 : "+Arrays.toString(arr2));
	
	
}
}
