package koreait.day05;

import java.util.Scanner;

public class C28_IntArrayEx {
	/* 1. int 배열크기 5를 선언  이름은 nums
	 * 2. 배열 요소의 값은 사용자 입력으로 저장합니다.
	 * 3.입력된 값의 합계, 평균을 구합니다. -> 합계는 2번에서 입력받는 for문 안에서 수식 작성
	 * 4.입력된 값의 최댓값, 최솟값을 구하는 메소드를 만듭니다.
	 * 			ㄴmaxOfArray, minOfArray : 인자는 int 배열
	 * 
	 */
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	double avg = 0;
	int[] nums = new int[5];
	for(int i=0; i<nums.length; i++) {
		System.out.println("정수를 입력하세요 : ");
		nums[i] = sc.nextInt();
		sum = sum + nums[i];
		avg = 1.00*sum/(i+1);
		System.out.println("총합 : "+sum);
		System.out.printf("평균 : %.2f\n",avg);
		
		
	}
	int max = maxOfArray(nums);
		System.out.println("배열 nums 의 최댓값 : "+ max);
	int min = minOfArray(nums);
	System.out.println("배열 nums의 최솟값 : " +min);
		sc.close();
}
	

public static int maxOfArray(int[] array) {//최대값 메소드
		int max = array[0];
		for(int i=1; i<array.length;i++) {
			if(max < array[i])
				max = array[i];
}
		return max;
}
public static int minOfArray(int[] array) { //최솟값
	int min = array[0];
	for(int i=1; i<array.length;i++) {
		if( array[i]<min)
			min = array[i];
	}
	return min;
}
}

//max, min 변수를 각각 배열의 0번 요소값으로 초기화
// 배열요소 1번부터 마지막요소까지 max,min과 순서대로 비교해서
// max가 그 값보다 작으면 (min이 그 값보다 크면) max(min) 값을 배열요소값으로 변경합니다.
// -> 비교가 끝난다면 최종 max,min이 결정 됩니다.

	
	



	
		
	
	
	
	
	
	
			











