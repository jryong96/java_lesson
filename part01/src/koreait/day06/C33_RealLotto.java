package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto { //공번호를 인덱스로
	//작성자 : 이용학
public static void main(String[] args) {
Random r = new Random();
int numbers[] = new int[45]; //로또공 배열

for(int i=0; i<45; i++) //인덱스 범위
	numbers[i]=i+1; //1~45

System.out.println("numbers 배열 초기값=================");
	System.out.println(Arrays.toString(numbers));
	System.out.println("=====================================");
	
	int[]lotto = new int[6]; //당첨번호 6개의 배열,  길이 :6
	int k;
	for(int count=0; count<6;count++) { //
		k = r.nextInt(45-count); //당첨번호를 제외한 나머지 인덱스 배열들
		System.out.println("k="+k+",number = "+numbers[k]);
		
		lotto[count] = numbers[k]; //당첨번호 
		
		for(int i=k; i<numbers.length-1;i++) { 
			numbers[i] = numbers[i+1]; //당첨된 공의번호(인덱스) 삭제 (중복방지)
		}
		System.out.println(Arrays.toString(numbers));
	}
		System.out.println("당첨번호 : ");
		System.out.println(Arrays.toString(lotto)); //당첨번호 출력
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto)); //당첨번호를 오름차순으로 정리
		
	}
}

