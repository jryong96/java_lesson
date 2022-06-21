package koreaitday16;

import java.io.File;  //io: input,output  입출력과 관련된 기능들의 클래스.
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C68_FIleRead_WriteTest {
public static void main(String[] args) {
	String filename = "D:\\Work\\i_class\\Java_workspace\\자바테스트2.txt";
	
	File file = new File(filename);
	//printWriter : 출력기능을 갖는 메소드.
	//Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try ~catch 필요 
	PrintWriter pw = null;
	try {
	pw = new PrintWriter(file); //file로 지정된 위치에 출력을 위한 객체
	pw.println("안녕하세요");
	pw.println("퇴근시켜주세요");
	pw.println("살려주세요");
	pw.println("감사합니다");
	pw.println("파일출력이 완료 되었습니다.");	//sysyem.out : 표준출력(콘솔출력)
	System.out.println("출력 끝! 경로가서 확인 고고!");
	}catch (FileNotFoundException e) {
		System.out.println("사용자 오류 발생 : "+ e.getMessage());
		//출력기능에는 파일이 없으면 자동으로 파일이 생성됩니다.
	}
	finally {
		pw.close();
	}
}
}
            