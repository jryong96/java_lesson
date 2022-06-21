package Koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {
public static void main(String[] args) {
	//Member[] members = new Members[10]; ArrayList로 위 와 똑같이 해봅시다
	ArrayList<Member> list = new ArrayList<>(); //리스트에 저장되는 것은 객체의 참조값
	
	list.add(new Member("모모",27));  //새로운 객체를 생성하고 참조값을 리스트에 추가
	Member member = new Member("다현",26);
	list.add(member);
	list.add(new Member("나나",20));
	list.add(new Member("신비",25));
	
	System.out.println("현재 list의 요소 갯수 : "+ list.size());
	System.out.println("1. 전체 리스트 출력");
	System.out.println(list);
	//list.get(i)  ->  Member객체의 참조값 가져옴
	System.out.println("list의 요소중 참조객체 age 필드의 값이 25 이하인 것만 출력해보기"); //for문 활용
	
	for(int i = 0; i<list.size(); i++ ) {
		if(list.get(i).getAge() <=25) 
			System.out.println("i = "+i+","+list.get(i));
	}
		System.out.println("3. '나나'는 몇번 인덱스에서 참조하고  있는 객체인가?");
		for(int i= 0 ; i<list.size(); i++) {
			if(list.get(i).getName().equals("나나")) //list.get으로 객체 가져오고 네임으로 이름가져옴
				System.out.println("i = "+i + ","+list.get(i));
		}
		//리스트 요소가 여러개의 필드를 갖는 객체이면  필드값 비교하는 equals 예제 입니다.
		//								indexOf는 사용 불가능  >> Stirng,기본형 래퍼클래스만 추가적인 기능구현 없이 사용.
		System.out.println("4. 참고");
		System.out.println("Member 객체로 indexOf 실행 : "+list.indexOf(new Member ("나나",20))); // -1 : 못찾음 
														//why? 참조값이 같은 것을 찾는건데 이것을 필드값과 비교해 찾도록 바꿔줘여함
		System.out.println("Member 객체로 indexOf 실행 : "+list.indexOf(member));	
		for(int i= 0 ; i<list.size(); i++) {
			if(list.get(i).getName().equals("나나") && list.get(i).getAge()== 20)
				System.out.println("i = "+i + ","+list.get(i));
}
}
}
