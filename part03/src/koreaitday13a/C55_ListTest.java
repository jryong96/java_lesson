package koreaitday13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Koreait.day12.Member;



public class C55_ListTest {
	public static void main(String[] args) {
		//List는 인터페이스 , ArrayList는 구현체
		// 다형성 : List를 참조타입으로 하여 선언. 앞으로 배울 라이브러리에서 List타입으로 원합니다.
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(33);
		ilist.add(32);
		ilist.add(48);
		ilist.add(94);
		ilist.add(1);
		ilist.add(13);
		ilist.add(53);
	System.out.println("sort 이전 : " + ilist);
	//정렬 : 오름차순
	ilist.sort(null); // 인자로 필요한 것은 비교자 comparator 구현에 필요합니다.
						//기본형,String 은 null로 가능 (오름차순이 기본)
						//sort사용시, 인덱스안의 값 또한 바뀜 
	System.out.println("sort 이후 : " + ilist);
	ilist.sort(Comparator.reverseOrder());  //reverse 역순, comparator인터페이스의 static메소드
	System.out.println("내림차순 sort : "+ ilist);
	slist.add("소녀시대");
	slist.add("빅뱅");
	slist.add("방탄");
	slist.add("호날두");
	slist.add("노쇼두");
	slist.add("블랙핑크");
	slist.add("리춘수");
	slist.add("김부장");
	slist.add("태식이");
	slist.add("이정재");
	slist.add("apple");
	slist.add("leo");
	System.out.println("sort 이전(ASCending) : "+slist);
	slist.sort(null);
	System.out.println("sort 이후 : "+slist);
	slist.sort(Comparator.reverseOrder());
	System.out.println("내림차순 정리(Descending) : " + slist);
	
	
	System.out.println("1. Comparator 인터페이스 사용하는 sort");
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
	
	System.out.println("member 리스트 상태 : "+ mlist);
//	mlist.sort(null); //에러 ) Member 객체는 비교불가능 ->비교자 인터페이스를 인자로 전달해줘야 함.
	//Member 객체의 sort : 비교 가능한 값으로 필드중 하나를 선택해서 비교자(comparator) 구현체 만듭니다.
	mlist.sort(new MemberAgeAscending()); //인자값에 MemberAgeAscending 객체 생성후 전달
	System.out.println("member sort 확인(ASC) : "+mlist);
	mlist.sort(new MemberAgeDescending()); // 마찬가지로 인자값에 객체 생성후 전달
	System.out.println("member sort 확인(Desc) : "+ mlist);
	
	
	mlist.sort(new MemberNameAscending());
	System.out.println("member name sort 확인(ASC) " + mlist);
	mlist.sort(new MemberNameDescending());
	
	System.out.println("member name sort 확인(desc) " + mlist);
	
	System.out.println("\n2.comparable 인터페이스 사용하는 sort");
	List<User> ulist = new ArrayList<User>();
	ulist.add(new User("모모",23));
	ulist.add(new User("나나",27));
	ulist.add(new User("다현",21));
	ulist.add(new User("수지",28));
	ulist.add(new User("철수",24));
	ulist.add(new User("영히",29));
	ulist.add(new User("제니",23));
	ulist.add(new User("이쁜이",24));
	ulist.add(new User("애기",26));
	
	System.out.println("User 리스트 상태 : "+ ulist);
	//User는 비교할 수 있는 타입 : Comparable 구현체	
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
		
	});//	메소드 인자로 익명클래스를 정의해서 객체를 생성.
	System.out.println("user sort(name ASC) : " + ulist);
}
}