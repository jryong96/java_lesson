package koreait.day07;

import java.util.Arrays;

public class Singer {

/* Ŭ���� ���� �ϴ°��� ���Ǽ����� �����͸�ó���ϱ� ���� ������ ����
 * 
 */
	//singer ��ü�� ������� �� ���� �ٸ��� : �ν��Ͻ� �ʵ�
	String genre; //�帣
	String name_eng; 
	String name_kor;
	int debutYear;
	String[] members; //�׷��� ���, ��� �̸����� ������ �迭
	
	static final String JOB = "������";
	static String label = "��"; //singer���Դ� ��� ������ �� ǥ�� , ���� ������ ����
	
	void printMembers( ) {
		if (members == null)
			System.out.println("�ַ� ���� �Դϴ�.");
		else
		for(int i=0; i<members.length; i++) {
			if(members[i] !=null)
				System.out.println((i+1)+":"+members[i]);
		}
	}
	int actYears(int year) { //Ȱ���Ⱓ ���
		
		return year-debutYear+1;
	}
	@Override
	public String toString() {
		return "Singer [genre=" + genre + ", name_eng=" + name_eng + ", name_kor=" + name_kor + ", debutYear="
				+ debutYear + "]";
	}
	
	
}
