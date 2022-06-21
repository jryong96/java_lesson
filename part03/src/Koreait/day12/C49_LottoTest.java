package Koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class C49_LottoTest {
public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<>();
	
	for (int i=0; i<45; i++) {
		numbers.add(i+1);
}
	System.out.println("numbers");
	System.out.println(numbers);
	
	Random r = new Random();
	ArrayList<Integer> lotto = new ArrayList<>(); //당첨번호 6개 배열 list
	int k; //난수로 뽑힐 값 인덱스 정합니다.
	
	for(int cnt = 0; cnt<6; cnt++) { 
		k= r.nextInt(45-cnt);
		System.out.println("k = "+"number = "+numbers.get(k));
		numbers.add(numbers.get(k));
		numbers.remove(k); //뽑힌값 리스트에서 삭제
		lotto.add(k); //당첨번호에 추가
		System.out.println("남은공");
		System.out.println(numbers);
		
	}
	System.out.println("최종 숫자 선택 6개");
	System.out.println(lotto);
}
}
