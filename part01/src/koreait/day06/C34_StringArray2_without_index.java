package koreait.day06;

import java.util.Scanner;

public class C34_StringArray2_without_index {
public static void main(String[] args) {
	String message = "hi java!"; //message는 참조형 변수
	
	String[] engkey = {"continue","break","public","static","dynamic"};
	
	//int double char 배열에서 요소를 나타내는 nums[2], carr1[2], point[2]
	//									ㄴ기본형 데이터 타입
	//engkey 뿐만아니라 engkey[2] 도 String 참조형 타입
	
	for(int i=0; i<engkey.length;i++)
		System.out.println(engkey[1]); 	//engkey[1]는 string참조형
	
	String[]koreans = new String[5];   //배열 요소의 값이 기본형데이터 저장x, 참조값 저장
										//기본 초기값은 ? null (아무것도 참조하지않은 상태)
	
	for(int i=0; i<koreans.length;i++)
		System.out.println(koreans[1]);
	System.out.println("1. engkey 배열요소값이 참조하는 문자열의 길이");
	for(int i=0; i<engkey.length;i++)
		System.out.println(engkey[i]+":"+engkey[1].length());
	
	koreans[0]="계속하다";
	koreans[1]="멈추다";
	koreans[2]="공용의";
	
	System.out.println("2. koreans 배열요소값이 참조하는 문자열의 길이");
	for(int i=0;i<koreans.length;i++ )
		if(koreans[i] != null) //*매우 중요!!!!*
		System.out.println(koreans[i]+":"+koreans[i].length());
			//참조하고 있는 객체가 없을 떄(null) ,메소드/필드 참조하면 오류 : koreans[3],koreans[4]는 null참조
	Scanner sc = new Scanner(System.in);
	System.out.print("static 뜻? >>> ");
	koreans[3] = sc.nextLine();
	System.out.print("dynamic 뜻? >>> ");
	koreans[4] = sc.nextLine();
	
	System.out.println("모두 입력된 koreans 배열확인 : ");
	for(int i=0;i<koreans.length; i++)
		System.out.println(koreans[i]);
		
		
			//사용자가 입력한 영어단어가 engkey 배열 인덱스 몇번인지 알아내기
		System.out.println("4.문자열 배열에서 비교하기");
	System.out.print("찾을 단어를 입력해 주세요 : ");
		String find = sc.nextLine();
		int i;
		for(i=0; i<engkey.length; i++) {
		
			if(find.equals(engkey)) {
			
			System.out.println("해당 단어는 "+ engkey[i]+"번 위치에 있습니다.");
			break;
			}
			
			 if(i==engkey.length)
					System.out.println("일치하는 단어가 없습니다.");
			}
			
			
	
}
}

