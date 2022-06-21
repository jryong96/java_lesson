package koreaitday16;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyDictionary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	String num; //�޴����� ��ȣ
	
	boolean run = true;
	int level;
	String eng,kor;
	
//	HashMap<String, String> dic = new HashMap<>();
//	TreeMap<String, String> dic = new TreeMap<String, String>(); // ���� �˻��� ������ Map �� ����  : ������ �Ǵ� Map
	List<Word> mywords = new ArrayList<>(); // ** mydic�� mywords�� �ٲ㼭 ����
	
	while(run) {
	System.out.println("1.�ܾ� ����		2.�ܾ�˻�	3.�ܾ��庸��		4.������ �˻�		5.���α׷� ������");
	System.out.println("���� : ");
	num = sc.next();
	
	if(num.equals("1")) {
	
		System.out.print("������ �ܾ �Է��� �ּ���(����) : ");
		eng = sc.next();
		System.out.print("������ �ܾ �Է��� �ּ���(�ѱ�) : ");
		kor = sc.next();
		System.out.println("������ �Է��� �ּ��� -> ");
		level = Integer.parseInt(sc.next());
		Word temp = new Word(eng,kor);
		temp.setLevel(level);
		mywords.add(temp);
		continue;
	}
	else if(num.equals("2")) {
	System.out.println("�˻��� �ܾ �Է��ϼ���(����) : ");
	eng = sc.next();
	for(Word w : mywords)
		if(w.getEnglish().equals(eng))
	System.out.print("�˻���� : "+w);
	System.out.println();
	continue;
	}
	
	
	else if(num.equals("3")) {
		all(mywords);
		continue;
//		System.out.println("�ܾ��� ��ü���� : "+mywords);
	}
	else if(num.equals("4")) {
		System.out.print("���� �Է� (1~3) : ");
		int no = Integer.parseInt(sc.nextLine());
		level(mywords,no);
		continue;
	}
	
	else if(num.equals("5")) {
		System.out.println("���α׷��� �����մϴ�.");
		run = false;
		break;
}
	else
		System.out.println("�߸��� �� �Դϴ�. �ٽ� �Է��ϼ��� : ");
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

//���������͸� �Է¹������ nextInt(); ���ٴ� Integer.paseInt(sc.nextLine())�� ����ȯ ó��
		//�� ���ۿ� ���Ͱ� ���Ƽ� ������ ������ nextLine()���� ���޵Ǽ� �Է��帧�� ���ص�!

//switch�����ε� �Ȱ��� ���� ����

///* TreeMap<String, String> ������ = new TreeMap<         >  : ����

