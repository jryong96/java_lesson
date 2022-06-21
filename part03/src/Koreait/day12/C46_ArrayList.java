package Koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {
public static void main(String[] args) {
	int[] data = {45,23,1,3,5,7,9}; //배열은 선언할 때 배열의 크기를 정함. --> 바뀌지않음,정적임(static)
									//배열은 기본형 데이터 타입 (int,double,long...etc..) 또는 참조형 타입 
	
	ArrayList<Integer> list = new ArrayList<>();
			//ArrayList는 크기가 동적입니다.
			//데이터 타입은 항상 참조형 타입. 기본형은 래퍼클래스를 사용
			//< E > 는 '제너릭타입'  == > 데이터 요소의 타입을 정한다. 모든 타입을 리스트에 담을 수 있다.
			//리스트에 저장하는  데이터를 요소(element)라고 합니다.
			//주요메소드 add,get,size,remove 		( indexOf,contains는 int , String에서만)
		String[] names = {"쯔위","모모","나나","신비","은하"};
		ArrayList<String> name_list = new ArrayList<>();

		//ArrayList에 데이터 추가는 add()메소드로 처리
		list.add(45); list.add(7);list.add(16); list.add(44); //list에 add메소드를 추가하는 모습
		
		System.out.println("첫번째 ArrayList<integer> 출력  ");
		System.out.println(list);  // 저장한 배열요소 순으로 출력되는 모습
		System.out.println("참고(배열) : "+Arrays.toString(data));  //data배열 출력
		System.out.println("data배열의 크기 : "+data.length);
		System.out.println("리스트의 크기 : "+list.size());
		name_list.add("쯔위"); 	name_list.add("모모");	name_list.add("신비");	name_list.add("은하");
		System.out.println("두번째 ArrayList<String> 출력");
		System.out.println("리스트의 크기 : "+name_list.size()); //데이터가 없을때는 0
		
		System.out.println("3.특정 위치에 데이터 추가");
		list.add(1,23); //1번 인덱스에 23을 대입, 단 인덱스의 위치는 리스트의 크기 미만값  
		System.out.println("add(1,23) 결과 : " + list);
		name_list.add(2,"신비");
		System.out.println("add(2, \"신비\") 결과 : "+name_list);
		
		System.out.println("4. 배열처럼 index값으로 데이터 가져오기");
		System.out.println("get(3) : " + list.get(3)); // list배열 3번 인덱스의 배열요소값 출력
		System.out.println("get(3) : " + name_list.get(3)); //name_list 배열 3번 인덱스의 배열요소값 출력
		
		System.out.println("5. 특정위치 데이터(요소) 제거");
		list.remove(4); // list배열 4번인덱스 배열요소 삭제
		name_list.remove(4); // name_list배열 4번인덱스 배열요소 삭제
		System.out.println("remove(4)결과 : " + list); //배열 출력
		System.out.println("remove(4)결과 : " + name_list); //배열 출력  : 둘다 4번인덱스가 삭제되어 출력되는 모습
		
		System.out.println("\n6. 특정값 위치 알아내기");
		System.out.println("배열 : "+Arrays.binarySearch(names, "신비")); // 신비가 몇번 인덱스에 있나 알려줌
		System.out.println("리스트 : "+ name_list.indexOf("신비"));
		
		System.out.println("\n7. 6번의 배열내용을 for문으로 실행한다면?");
		System.out.println("배열");
		int i;
		for( i=0; i<names.length;i++)
			if(names[i].equals("신비"))
				break;
		System.out.println("'신비'는 인덱스  : " + i);
		
		System.out.println("리스트");
		int j;
		for(j=0; i<name_list.size(); j++)
			if(name_list.get(i).equals("신비"))
				break;
		System.out.println("'신비'는 인덱스 : "+ j);
		
		//'신비' 요소가 여러개일때 리스트는 lastindexOf 메소드로 마지막 일치요소를 찾을 수 있다.
		
		System.out.println("\n8. contains 메소드");
		System.out.println("'나나'가 리스트에 있는가? " + name_list.contains("나나")); // neme_lsit배열에 나나가 포함되어 있는가?
		System.out.println("'모모'가 리스트에 있는가? " + name_list.contains("모모"));
}			
}
/* 배열 : 많은 양의 데이터를 저장하는 방법
	컬렉션 : 자료구조, 많은 양의 데이터를 저장하는 것이고, 데이터 특징에 따라 관리하는 차이가 있다.
															ㄴㄴ 관리 : 저장,읽기,쓰기
															데이터를 삽입/삭제 하는 것이 메소드에 구현되어 있음
		ArrayList 클래스와 HashMap 클래스가 컬렉션에 포함된다.
		
		
1)add 추가
2)get 데이터 가져오기
3)remove 특정위치 데이터 삭제
4)기본배열크기 length
5)리스트 크기 size
6) indexOf, lastindexOf

		
*/