package Koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {
public static void main(String[] args) {
	//Member[] members = new Members[10]; ArrayList�� �� �� �Ȱ��� �غ��ô�
	ArrayList<Member> list = new ArrayList<>(); //����Ʈ�� ����Ǵ� ���� ��ü�� ������
	
	list.add(new Member("���",27));  //���ο� ��ü�� �����ϰ� �������� ����Ʈ�� �߰�
	Member member = new Member("����",26);
	list.add(member);
	list.add(new Member("����",20));
	list.add(new Member("�ź�",25));
	
	System.out.println("���� list�� ��� ���� : "+ list.size());
	System.out.println("1. ��ü ����Ʈ ���");
	System.out.println(list);
	//list.get(i)  ->  Member��ü�� ������ ������
	System.out.println("list�� ����� ������ü age �ʵ��� ���� 25 ������ �͸� ����غ���"); //for�� Ȱ��
	
	for(int i = 0; i<list.size(); i++ ) {
		if(list.get(i).getAge() <=25) 
			System.out.println("i = "+i+","+list.get(i));
	}
		System.out.println("3. '����'�� ��� �ε������� �����ϰ�  �ִ� ��ü�ΰ�?");
		for(int i= 0 ; i<list.size(); i++) {
			if(list.get(i).getName().equals("����")) //list.get���� ��ü �������� �������� �̸�������
				System.out.println("i = "+i + ","+list.get(i));
		}
		//����Ʈ ��Ұ� �������� �ʵ带 ���� ��ü�̸�  �ʵ尪 ���ϴ� equals ���� �Դϴ�.
		//								indexOf�� ��� �Ұ���  >> Stirng,�⺻�� ����Ŭ������ �߰����� ��ɱ��� ���� ���.
		System.out.println("4. ����");
		System.out.println("Member ��ü�� indexOf ���� : "+list.indexOf(new Member ("����",20))); // -1 : ��ã�� 
														//why? �������� ���� ���� ã�°ǵ� �̰��� �ʵ尪�� ���� ã���� �ٲ��࿩��
		System.out.println("Member ��ü�� indexOf ���� : "+list.indexOf(member));	
		for(int i= 0 ; i<list.size(); i++) {
			if(list.get(i).getName().equals("����") && list.get(i).getAge()== 20)
				System.out.println("i = "+i + ","+list.get(i));
}
}
}
