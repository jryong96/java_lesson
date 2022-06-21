package Koreait.day12;


import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	String num; //메뉴선택 번호
	
	boolean run = true;
	
//	HashMap<String, String> word = new HashMap<>();
	TreeMap<String, String> word = new TreeMap<String, String>(); // 이진 검색한 구조로 Map 을 생성  : 정렬이 되는 Map
	while(run) {
	System.out.println("1.단어 저장		2.단어검색	3.단어장보기		4.프로그램 끝내기");
	System.out.println("선택 : ");
	num = sc.next();
	
	if(num.equals("1")) {
	
		System.out.print("저장할 단어를 입력해 주세요(영어) : ");
		String eng = sc.next();
		System.out.print("저장할 단어를 입력해 주세요(한글) : ");
		String kor = sc.next();
		word.put(eng, kor);
		continue;
	}
	else if(num.equals("2")) {
	System.out.println("검색할 단어를 입력하세요(영어) : ");
	String search_eng = sc.next();
	System.out.print("검색결과 : ");
	System.out.println(word.get(search_eng));
	break;
	}
	
	
	else if(num.equals("3")) {
		System.out.println("단어장 전체보기 : "+word);
	}
	
	else if(num.equals("4")) {
		System.out.println("프로그램을 종료합니다.");
		run = false;
		break;
}
	else
		System.out.println("잘못된 값 입니다. 다시 입력하세요 : ");
}
	sc.close();
}
}

//정수데이터를 입력받을경우 nextInt(); 보다는 Integer.paseInt(sc.nextLine())로 형변환 처리
		//ㄴ 버퍼에 엔터가 남아서 다음에 나오는 nextLine()에게 전달되서 입력흐름에 방해됨!

//switch문으로도 똑같이 구현 가능

///* TreeMap<String, String> ㅇㅇㅇ = new TreeMap<         >  : 정렬

