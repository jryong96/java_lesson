package koreaitday09b;

import koreaitday09a.ClassA;

public class ClassAB extends ClassA {
	//과연 이 클래스가 필드,메소드 상속받았나 확인, -- ClassA의 private ,default 접근한정자 요소는 상속을 받을 수 없다.
	public void test() {
//		System.out.println("name = "+name); // 오류 )name 접근 한정자는 *디폴트*! --> 다른패키지에서 사용 불가능
	title = "상속";
	System.out.println("title = "+title); //상속받은 title 필드 : 다른패지키 이지만 protected 접근한정자로 자식클래스는 허용
	setName("안녕");
	System.out.println("name = "+ getName());
	}
}
