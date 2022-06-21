package koreaitday13a;

public class C54_CompareTo {
public static void main(String[] args) {
	//모든 객체 (object 상속) 에는 compartTO 메소드가 있다. : 값의비교
	String me = "나";
	String you = "너";
	String he = "son";

	
	
	//String은 알파벳(사전식)비교 : 대문자 < 소문자
	System.out.println("나 와 너 : " + me.compareTo(you));  //-2(음수)
	System.out.println("나와 son : "+me.compareTo(he)); //24(양수)
	
		int a =12 ,b=45;
		System.out.println("a-b = " + (a-b)); // 12-45 < 0
		
		Integer aa= 12;
		Integer bb= 45;
		System.out.println("12와45 : "+aa.compareTo(bb));	// -1 : aa<bb일때
		aa = 90;
		System.out.println("90과45 : "+aa.compareTo(bb));	// 1: aa>bb
		aa=45;
		System.out.println("45와45 : "+aa.compareTo(bb));	// 0 : aa=b=b
		
		//compareTo 와 같은 비교는 sort (정렬) 에 사용된다!
		//정렬은 오름차순, 내림차순 두가지로 정의
		/* 리턴식은 음수값이 나오는 경우를 씁니다. 교환하지 않는 경우를 -1(음수)로 리턴되게 합니다.
		 * 각각 교환하지 않는 경우는 
		 *오름차순 : o1 < o2    	//내림차순 : o1 > o2 
		*/

}
}
