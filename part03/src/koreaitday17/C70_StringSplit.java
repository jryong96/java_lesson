package koreaitday17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {
	public static void main(String[] args) {
//	String 클래스 split(분열) 메소드 : 리턴타입이 String[] 
		String temp = "모모 90 88 79";
		String result[] = temp.split(" "); // 공백을 기준으로 문자열을 여러개로 쪼갬
		System.out.println("1. 반복문 없이 출력");
		System.out.println("index 0 :  " + result[0]);
		System.out.println("index 0 :  " + result[1]);
		System.out.println("index 0 :  " + result[2]);
		System.out.println("index 0 :  " + result[3]);

		// for문으로
		for (int i = 0; i < result.length; i++) {
			System.out.println(String.format("result[%d] : %s", i, result[i]));
		}
		System.out.println("result : " + result.length);

//		향상된 for
		System.out.println("3. 향상된 for문 출력");
		for (String t : result)
			System.out.println("result요소 : " + t);

		String temp2 = "모모,88,90,12,13,14";
		result = temp2.split(",");
		System.out.println("2. split 구분기호가 콤마일때");
		for (String t : result)
			System.out.println("result 요소 : " + t);

		temp2 = "모모,,88,,90,,12,,13,,14";
		result = temp2.split(",");
		System.out.println("2. split 구분기호가 콤마일때");
		for (String t : result)
			System.out.println("result 요소 : " + t);
		System.out.println("result길이 : " + result.length);
		// result[1],result[3],result[5] 사이에 빈 문자열이 들어감 나머지 마찬가지

		result = temp2.split(",,");
		System.out.println(" split 구분기호가 ,,일때");
		for (String t : result)
			System.out.println("result 요소 : " + t);
		System.out.println("result길이 : " + result.length);

		// split 의 인자인 문자열은 정규식 문자열입니다.(정규식 패턴은 복잡, 어렵습니다)
		// ex) 정규식 예시 : []안에 표시하는 것은 문자 여러개가 또는(or)에 해당합니다.

		temp2 = "모모,88,90,12 13,14";
		result = temp2.split("[ ,()]"); // 정규식 문자열 : 구분기호는 공백 또는 "," 또는 "(" 또는 ")" 총4개
		System.out.println(" split 인자가 정규식 일때 ");
		for (String t : result)
			System.out.println("result 요소 : " + t);

		temp2 = "모모,90,88,79";
		result = temp2.split(",", 3);
		System.out.println("8. split 두번째 인자 limit 확인");
		// limit은 리턴되는 배열의 크기 , 단 쪼개지는 횟수보다 커질 수 없다.
		System.out.println("result length : " + result.length);
		for (String t : result)
			System.out.println("result 요소 : " + t);

		// 배열과 유사한 자료구조 : List
		// 배열을 List로 변환해보자
		result = temp2.split(",");
		System.out.println("9. result 배열을 List객체로 변경");
		List<String> rlist = Arrays.asList(result);
		System.out.println(rlist);
		System.out.println("rslit size : " + rlist.size());
		for (String t : rlist)
			System.out.println("rlist요소 : " + t);

		// 위의 rlist는 배열의 크기만큼 List를 정적으로 생성합니다.(추가,삭제,변경 전부 다 불가능)
//		rlist.add("test"); // 오류 : 고정된 리스트
//		rlist.remove(2); //오류 
//		rlist.add(2,"100"); //오류  
		// 동적인 List로 만들기
		System.out.println("10. ArrayList의 인자가 있는 생성자 테스트");
		List<String> rlist2 = new ArrayList<>(rlist);
		System.out.println(rlist2);
		rlist2.add("test");
		rlist2.remove(2);
		rlist2.add(2, "100");
		System.out.println(rlist2);

		// Arrays.asList 는 테스트용으로 사용할 리스트 만들때 또는 간단한 고정 리스트 만들때 사용 
		List<Integer> ilist = Arrays.asList(1, 2, 3, 4, 100);
		System.out.println("11. Arrays.List 활용");
		System.out.println(ilist);
	}
}
