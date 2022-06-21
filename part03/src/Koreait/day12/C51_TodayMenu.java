package Koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class C51_TodayMenu {
public static void main(String[] args) {
	System.out.println("오늘의 저녁메뉴를 투표합니다!!");
	String foods = "치맥 ,떡볶이, 곱창, 오징어, 햄버거 , 불고기";
	

//key : 메뉴이름, value : 투표수
	//초기화
	HashMap<String,Integer> map = new HashMap<>();
	map.put("치맥",0);
	map.put("떡볶이",0);
	map.put("곱창",0);
	map.put("오징어",0);
	map.put("햄버거",0);
	map.put("불고기",0);

	Scanner sc = new Scanner(System.in);
	//메뉴선택 (반복)
	while(true) {
		System.out.print("선택 메뉴 음식명을 입력하세요(종료는 end 입력) : ");
		String menu = sc.nextLine();
		if(menu.equals("end")) {
			break; 
		}
		if(!map.containsKey(menu)) { //map의 키값중 menu 입력문장이 있는지 검사
//			System.out.println("없는 메뉴 입니다. 다시 입력하세요  : ");
			System.out.println("없는 메뉴 입니다. 메뉴에 추가합니다 ");
			map.put(menu,1); 
			foods += "," + menu;
			continue;
			
		}
			//입력받은 menu의 value값을 가져오기 -> +1하기 -> 결과저장
			int temp = map.get(menu);
			++temp; // temp++ : put => 증가          ++temp : 증가 => put
			map.put(menu, temp); // ++tmep와 put을  	map.put(menu, ++temp) 로 한줄로 요약 가능
			
			
		
	}
	System.out.println("투표를 종료합니다.");
	System.out.println(map);
	System.out.println("최대 득표수 : "+ Collections.max(map.values()));
	System.out.println("최대 득표 메뉴 : "+ Collections.max(map.keySet()));
	//Entry<key,value>
}
}