package koreaitday15;

import java.io.File;  //io: input,output  입출력과 관련된 기능들의 클래스.
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {
public static void main(String[] args) {
	String filename = "C:\\Users\\ITCS\\eclipse-workspace\\자바테스트.txt";
	
	File file = new File(filename);
	Scanner sc=  null;
	try {
		
		sc = new Scanner(file);	//system.in : 표준입력(콘솔입력)
		while(sc.hasNext()) { 
		System.out.println("파일에서 읽은 내용 : " + sc.nextLine());} //구분자 엔터를 기준으로 다음 데이터가 있으면 true.
	}
	catch (FileNotFoundException e) {
		//입력기능에는 파일이 없으면 Exception이 발생
		e.printStackTrace();
	}
	
		//출력기능에는 파일이 없으면 자동으로 파일이 생성됩니다.*/
	
	finally {
		if(sc!=null) 
	
		sc.close();
	}
}
}



//try ~catch 자원헤제 방법은 finally 안쓰고 java 7 버전부터 다른 구문 형식이 가능합니다. 
//	ㄴㄴ 관련된 인터페이스가 무엇인지도 찾아보기