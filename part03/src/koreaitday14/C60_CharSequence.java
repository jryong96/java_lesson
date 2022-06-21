package koreaitday14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class C60_CharSequence {

	//CharSequence 인터페이스의 구현체 : String,StringBuffer,StringBuilder...
	public static void main(String[] args) {
		
		String result = new String();	//result = "test";  result  = new String("test");
		System.out.println("초기 result : " + result); // ""
		System.out.println("1. String 타입 테스트");
		for(int i=2; i<6; i++) {
			//문자열 내용이 바뀌면 문자열 객체 위치가 달라집니다.
			result +=i +"/";  // result = result+(i+"/")
			System.out.println("result " + result);
		}
		StringBuffer sb = new StringBuffer();
		System.out.println("2. StringBuffer테스트");
		for(int i=2; i<6; i++) {
			//StringBuffer 객체의 문자열 객체내용이 바뀌어도 기존 객체에 추가되는 동작을 합니다.
			//반복되는 연결 연산이 많은경우 String? StringBuffer 뭐가 효율적? -> StringBuffer
			sb.append(i).append(":");
			System.out.println("sb : "+sb);
			
		}
		//CharSequence 인터페이스의 사용
		String sample = "abc2/3/4/5/xyz";
		System.out.println("3. contains메소드 확인 ");
		System.out.println("sample.contains(result) : "+sample.contains(result) );//true
		System.out.println("sample.contains(sb) : "+sample.contains(sb));//false
		//메소드의 형식 또는 다른 여러 형식들을 확인할 때 : 1)클래스 or 인터페이스  2)인터페이스일때 구현체는 무엇인가?
		
		//참고 : ArrayList 선언할 때  => List 인터페이스 타입으로  
		//HashMap 선언시 : Map 인터페이스 타입으로  
		List<String> names = new ArrayList<>();
		names = new  Vector<>();
		Map<String, Integer> map = new HashMap<>();
		map = new TreeMap<String, Integer> ();
		
	}
}
