package Koreait.day12;


import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	String num; //�޴����� ��ȣ
	
	boolean run = true;
	
//	HashMap<String, String> word = new HashMap<>();
	TreeMap<String, String> word = new TreeMap<String, String>(); // ���� �˻��� ������ Map �� ����  : ������ �Ǵ� Map
	while(run) {
	System.out.println("1.�ܾ� ����		2.�ܾ�˻�	3.�ܾ��庸��		4.���α׷� ������");
	System.out.println("���� : ");
	num = sc.next();
	
	if(num.equals("1")) {
	
		System.out.print("������ �ܾ �Է��� �ּ���(����) : ");
		String eng = sc.next();
		System.out.print("������ �ܾ �Է��� �ּ���(�ѱ�) : ");
		String kor = sc.next();
		word.put(eng, kor);
		continue;
	}
	else if(num.equals("2")) {
	System.out.println("�˻��� �ܾ �Է��ϼ���(����) : ");
	String search_eng = sc.next();
	System.out.print("�˻���� : ");
	System.out.println(word.get(search_eng));
	break;
	}
	
	
	else if(num.equals("3")) {
		System.out.println("�ܾ��� ��ü���� : "+word);
	}
	
	else if(num.equals("4")) {
		System.out.println("���α׷��� �����մϴ�.");
		run = false;
		break;
}
	else
		System.out.println("�߸��� �� �Դϴ�. �ٽ� �Է��ϼ��� : ");
}
	sc.close();
}
}

//���������͸� �Է¹������ nextInt(); ���ٴ� Integer.paseInt(sc.nextLine())�� ����ȯ ó��
		//�� ���ۿ� ���Ͱ� ���Ƽ� ������ ������ nextLine()���� ���޵Ǽ� �Է��帧�� ���ص�!

//switch�����ε� �Ȱ��� ���� ����

///* TreeMap<String, String> ������ = new TreeMap<         >  : ����

