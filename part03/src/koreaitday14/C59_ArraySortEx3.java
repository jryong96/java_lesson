package koreaitday14;

import java.util.Arrays;

import Koreait.day12.Member;


public class C59_ArraySortEx3 {
public static void main(String[] args) {
	//Member ��ü�� age�ʵ尪 ������������ ����
	Member[] members = new Member[5];
	
	members[0] = new Member("�糪",23);
	members[1] = new Member("����",15);
	members[2] = new Member("����",29);
	members[3] = new Member("�̳�",23);
	members[4] = new Member("����",12);

		System.out.println("Before Sort : "+members);
	for(int i=0; i<members.length-1; i++) {
		for(int k=i+1; k<members.length; k++) {
			if(members[i].getAge()>members[k].getAge()) {
				Member temp = members[i];  //temp = names[k];
				members[i] = members[k];
				members[k] = temp;
				
			}
			
		
		}
	}
	System.out.println("After : " + Arrays.toString(members));
	
	
		
}
}
