package koreaitday09;

public class C44_ForEachTest {
public static void main(String[] args) {
	int[] itest = {1,2,3,4,5,6};
	String[] stest = {"one","two","three","four","five"};
	
	
	for(int i=0; i<itest.length; i++) { //배열을 for문에서 순차적으로 접근할 때  인덱스 변수를 사용 
		System.out.println("i = "+ i + ",itest[1] = " + itest[1]); //itest는 int  타입
	}
		for(int i =0; i<stest.length; i++) {
			System.out.println("s = "+ i + ",stest[1] = " + stest[1]); //stest는 String 타입
		}
		
		//코딩시 효율을 높이기 위해 for(for each) 사용
		
		System.out.println("itest 배열값 : ");
		for(int temp : itest ) //배열에 저장된 값만 순서대로 꺼내서 temp 변수에 저장
			System.out.println(temp); 
		
		System.out.println("\n stest 배열값 : ");
		for(String temp : stest)
			System.out.println(temp);
}
}
