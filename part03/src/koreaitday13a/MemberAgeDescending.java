package koreaitday13a;

import java.util.Comparator;
import Koreait.day12.Member;

public class MemberAgeDescending implements Comparator<Member> {
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		return age1.compareTo(age2); //내림차순 
	};
}

