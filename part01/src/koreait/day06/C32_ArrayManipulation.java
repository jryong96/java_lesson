package koreait.day06;

public class C32_ArrayManipulation {
public static void main(String[] args) {
	//배열요소의 삽입과 삭제
	
	int[]test = {11,22,33,44,55,66,77};
	
	//인덱스에 2 삽입할때 - 오른쪽 인덱스 증가 방향으로 이동
	for(int i=test.length-2;i>=2;  i--) {
//	for(int i =2;i<test.length-1;i++) //잘못된 코드 
		test[i+1]=test[i];
		
	}
	
	test[2]=23;
	for(int i=0; i<test.length; i++) {
		System.out.print(test[i]+"\t"); //배열 인덱스자리를 1칸씩 밀어서 77이 사라짐
		
	}
	System.out.println();
		int[] test2 = {11,22,33,44,55,66,77}; //2번 인덱스 값 삭제하기
		//인덱스 2를 삭제할 때  -왼쪽 인덱스 방향으로 이동,
		System.out.println("\n------------------------------------------------------------------");
		for(int i=3; i<test2.length;i++) 
			test2[i-1] = test2[i];
		
		System.out.println();
			
			
			
			
		
	
	
}
}


