package koreait.day06;

import java.util.Random;

public class C31_RandomEx {
public static void main(String[] args) {
/*학생 성적(국어) 분포 보고서를 생성
 * 학생 인원은 100명 - 점수는 랜덤하게(0<=점수<=100)
 * 90~100 : n명 (a.0%) 소숫점 한자리로 표기
 * 80~89 : 
 * .
 * .             >>>> 카운트 변수 5개 필요 a,b,c,d,e
 * .					ㄴㄴcount[5] : counts[0],counts[1],...counts[4]
 * 60~69
 * 60점 미만 
 */
	
	Random r = new Random();
	
	int score[] = new int[300]; //학생수 n명이니까 n개의 배열 만들기 
	int counts[] = new int[5]; // 범위가 5구역이니 5개의 배열 생성
	
	for(int i = 0; i<100 ; i++) {
		score[i] = r.nextInt(101); // 점수 난수 생성
	}
	for (int i=0; i<score.length ; i++) { //점수분포 count하기
		if (score[i]>90 && score[i]<=100) 
			counts[0]++; //90~100 이면 0번배열 에 1추가
				
		else if(score[i] >80 && score[i]<=90) 
			counts[1]++; //""
				
		else if(score[i] >70 && score[i]<=80) 
			counts[2]++; //""
			
		else if(score[i] >60 && score[i]<=70) 
			counts[3]++; //""
	
		else 
			counts[4]++; //""
		
		

		
	
		
}
	System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60미만");
	System.out.println("--------------------------------------------");
	for(int i=0; i<counts.length; i++) { //배열의 크기만큼 반복 ,counts 배열값 출렧
		System.out.printf("%.1f%%\t",(double)counts[i]/score.length*100);
		
}
	
}
//
}
