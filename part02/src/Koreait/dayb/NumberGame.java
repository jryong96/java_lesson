package Koreait.dayb;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
public static void main(String[] args) {
	Random r = new Random(); //난수 생성
	Scanner sc = new Scanner(System.in); //값 입력받기
	int max = 10; //시도횟수
	int[]triallst = new int[max]; //배열의 크기 10 조정
	
	
	System.out.println("숫자맞추기 게임을 시작합니다. 나 컴퓨터는 숫자를 정했습니다.");
	System.out.println("당신의 차례입니다. 숫자를 맞춰보세요(101~209)"); 
	int numCpu = r.nextInt(199)+101; // 101~209 까지 난수 생성 , 정답
	int nump;  // 입력번호
	int i = 0;
	
	
	do { //do while  참 거짓 여부 상관없이 do아래는 무조건 한번 실행
		System.out.print("정답을 입력 하세요 " +"기회 "+"("+(max-i)+"회)  :");
		nump = sc.nextInt();
		if (numCpu > nump) {
			triallst[i] = nump;
			i++; //i : 도전한 횟수
			System.out.println("더 크게!");
		}
		else if(numCpu < nump) {
			triallst[i] = nump;
			i++;
			System.out.println("더 작게!");
		}
		if (i==10) break;
	}
	while (numCpu != nump);
			
		
	if(i==10) {
		System.out.println("입력 내용 : "+Arrays.toString(triallst));
		System.out.println("횟수초과! 다시 시작하세요");
		System.out.println("정답은 "+numCpu+"였지롱~");
}
	else { 
		System.out.println("정답! "+ " 성공까지 시도횟수 : "+i+1);
	}
	sc.close();
}
}