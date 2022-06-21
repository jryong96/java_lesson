package koreaitday13a;

import java.util.Comparator;
import Koreait.day12.Member;

public class MemberNameAscending implements Comparator<Member> {
	public int compare(Member o1, Member o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name2.compareTo(name1); 
	}
}

