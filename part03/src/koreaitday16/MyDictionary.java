package koreaitday16;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyDictionary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	String num; //메뉴선택 번호
	
	boolean run = true;
	int level;
	String eng,kor;
	
//	HashMap<String, String> dic = new HashMap<>();
//	TreeMap<String, String> dic = new TreeMap<String, String>(); // 이진 검색한 구조로 Map 을 생성  : 정렬이 되는 Map
	List<Word> mywords = new ArrayList<>(); // ** mydic을 mywords로 바꿔서 구현
	
	while(run) {
	System.out.println("1.단어 저장		2.단어검색	3.단어장보기		4.레벨로 검색		5.프로그램 끝내기");
	System.out.println("선택 : ");
	num = sc.next();
	
	if(num.equals("1")) {
	
		System.out.print("저장할 단어를 입력해 주세요(영어) : ");
		eng = sc.next();
		System.out.print("저장할 단어를 입력해 주세요(한글) : ");
		kor = sc.next();
		System.out.println("레벨을 입력해 주세요 -> ");
		level = Integer.parseInt(sc.next());
		Word temp = new Word(eng,kor);
		temp.setLevel(level);
		mywords.add(temp);
		continue;
	}
	else if(num.equals("2")) {
	System.out.println("검색할 단어를 입력하세요(영어) : ");
	eng = sc.next();
	for(Word w : mywords)
		if(w.getEnglish().equals(eng))
	System.out.print("검색결과 : "+w);
	System.out.println();
	continue;
	}
	
	
	else if(num.equals("3")) {
		all(mywords);
		continue;
//		System.out.println("단어장 전체보기 : "+mywords);
	}
	else if(num.equals("4")) {
		System.out.print("레벨 입력 (1~3) : ");
		int no = Integer.parseInt(sc.nextLine());
		level(mywords,no);
		continue;
	}
	
	else if(num.equals("5")) {
		System.out.println("프로그램을 종료합니다.");
		run = false;
		break;
}
	else
		System.out.println("잘못된 값 입니다. 다시 입력하세요 : ");
}
	sc.close();
}

private static void level(List<Word> mywords, int no) {
	for(Word w : mywords)
		if(w.getLevel()== no)
			System.out.println(w);
}

private static void all(List<Word> mywords) {
mywords.sort(new Comparator<Word>() {
	
	public int compare(Word o1, Word o2) {
		return o1.getEnglish().compareTo(o2.getEnglish());
	}
});
System.out.println(String.format("%-20%%-20s\t %10s","english","korean","level"));
System.out.println("=================================");
for(Word w : mywords) {
	System.out.println(String.format("%-20%%-20s\t %10d",w.getEnglish(),w.getKorean(),w.getLevel()));
}
}
}

//정수데이터를 입력받을경우 nextInt(); 보다는 Integer.paseInt(sc.nextLine())로 형변환 처리
		//ㄴ 버퍼에 엔터가 남아서 다음에 나오는 nextLine()에게 전달되서 입력흐름에 방해됨!

//switch문으로도 똑같이 구현 가능

///* TreeMap<String, String> ㅇㅇㅇ = new TreeMap<         >  : 정렬

