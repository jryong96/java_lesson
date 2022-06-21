package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
	//난수 발생하는 Random 클래스의 메소드를 테스트
public static void main(String[] args) {
	Random r = new Random(); //Random클래스의 객체를 생성 (new연산) r은 참조형 변수(주소)
	System.out.println("1. 정수 랜덤값 10개 출력");
	for(int i = 0; i<10; i++) {
		int inum = r.nextInt(); //int 범위내에서 임의의 정수 출력 (난수생성)
		System.out.println(inum);
		
	}
	System.out.println("1. 정수형 랜덤값 10개 출력 : bound(경계)값 있음");
	for(int i =0; i<10; i++) {
		int inum=r.nextInt(100);  //    0<=난수 < 100 범위의 랜덤값을 만듦 해당코드는 0~99까지 난수 생성
		System.out.println(inum);
	}// 바운드값은 양수만 가능
	
	//ex ) 1부터 100 까지의 난수를 생성해보자
	
	System.out.println("3.특정범위의 랜덤값 10개 출력 - bound를 이용한 수식");
	for(int i =0; i<10; i++) {
		int inum=r.nextInt(100)+1;
		System.out.println(inum);
	}
	
	//n보다 크거나 같고 m보다 작은 범위의 난수(n<=난수<m : r.nextInt(m-n+1)+n  
	
	System.out.println("4. 2~46의 값으로 난수 10개 생성하기");
	for(int i =0; i<10; i++) {
		int inum=r.nextInt(46-2+1)+2;
		System.out.println(inum);
	}



}
}
