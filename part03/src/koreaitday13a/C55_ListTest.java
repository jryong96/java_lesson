package koreaitday13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Koreait.day12.Member;



public class C55_ListTest {
	public static void main(String[] args) {
		//List�� �������̽� , ArrayList�� ����ü
		// ������ : List�� ����Ÿ������ �Ͽ� ����. ������ ��� ���̺귯������ ListŸ������ ���մϴ�.
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(33);
		ilist.add(32);
		ilist.add(48);
		ilist.add(94);
		ilist.add(1);
		ilist.add(13);
		ilist.add(53);
	System.out.println("sort ���� : " + ilist);
	//���� : ��������
	ilist.sort(null); // ���ڷ� �ʿ��� ���� ���� comparator ������ �ʿ��մϴ�.
						//�⺻��,String �� null�� ���� (���������� �⺻)
						//sort����, �ε������� �� ���� �ٲ� 
	System.out.println("sort ���� : " + ilist);
	ilist.sort(Comparator.reverseOrder());  //reverse ����, comparator�������̽��� static�޼ҵ�
	System.out.println("�������� sort : "+ ilist);
	slist.add("�ҳ�ô�");
	slist.add("���");
	slist.add("��ź");
	slist.add("ȣ����");
	slist.add("����");
	slist.add("����ũ");
	slist.add("�����");
	slist.add("�����");
	slist.add("�½���");
	slist.add("������");
	slist.add("apple");
	slist.add("leo");
	System.out.println("sort ����(ASCending) : "+slist);
	slist.sort(null);
	System.out.println("sort ���� : "+slist);
	slist.sort(Comparator.reverseOrder());
	System.out.println("�������� ����(Descending) : " + slist);
	
	
	System.out.println("1. Comparator �������̽� ����ϴ� sort");
	List<Member> mlist = new ArrayList<>();
	
	mlist.add(new Member("momo",28));
	mlist.add(new Member("zenny",26));
	mlist.add(new Member("nana",23));
	mlist.add(new Member("ronaldo",33));
	mlist.add(new Member("hyun",23));
	mlist.add(new Member("kai",27));
	mlist.add(new Member("hunter",24));
	mlist.add(new Member("crow",21));
	mlist.add(new Member("apple",23));
	
	System.out.println("member ����Ʈ ���� : "+ mlist);
//	mlist.sort(null); //���� ) Member ��ü�� �񱳺Ұ��� ->���� �������̽��� ���ڷ� ��������� ��.
	//Member ��ü�� sort : �� ������ ������ �ʵ��� �ϳ��� �����ؼ� ����(comparator) ����ü ����ϴ�.
	mlist.sort(new MemberAgeAscending()); //���ڰ��� MemberAgeAscending ��ü ������ ����
	System.out.println("member sort Ȯ��(ASC) : "+mlist);
	mlist.sort(new MemberAgeDescending()); // ���������� ���ڰ��� ��ü ������ ����
	System.out.println("member sort Ȯ��(Desc) : "+ mlist);
	
	
	mlist.sort(new MemberNameAscending());
	System.out.println("member name sort Ȯ��(ASC) " + mlist);
	mlist.sort(new MemberNameDescending());
	
	System.out.println("member name sort Ȯ��(desc) " + mlist);
	
	System.out.println("\n2.comparable �������̽� ����ϴ� sort");
	List<User> ulist = new ArrayList<User>();
	ulist.add(new User("���",23));
	ulist.add(new User("����",27));
	ulist.add(new User("����",21));
	ulist.add(new User("����",28));
	ulist.add(new User("ö��",24));
	ulist.add(new User("����",29));
	ulist.add(new User("����",23));
	ulist.add(new User("�̻���",24));
	ulist.add(new User("�ֱ�",26));
	
	System.out.println("User ����Ʈ ���� : "+ ulist);
	//User�� ���� �� �ִ� Ÿ�� : Comparable ����ü	
	ulist.sort(null);
	System.out.println("User sort(ASC) : "+ ulist);
	ulist.sort(Comparator.reverseOrder());
	System.out.println("User sort(DESC) : "+ ulist);
	
	ulist.sort(new Comparator<User>() {
		

		@Override
		public int compare(User o1, User o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
		
	});//	�޼ҵ� ���ڷ� �͸�Ŭ������ �����ؼ� ��ü�� ����.
	System.out.println("user sort(name ASC) : " + ulist);
}
}