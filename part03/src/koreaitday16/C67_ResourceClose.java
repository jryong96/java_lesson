package koreaitday16;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;
public class C67_ResourceClose {
public static void main(String[] args) {
//	String filename = "D:\\Work\\i_class\\Java_workspace\\자바테스트1.txt"; //읽기 : 존재하는 파일
//	String filename2 = "D:\\Work\\i_class\\Java_workspace\\자바테스트2.txt"; //읽기 : 존재하지않는 파일

//	File file = new File(filename);
//	PrintWriter pw = null;
//	Scanner sc = null;
	//파일 대화상자 사용하기 
	String filename = fileDialogOpen();
	String filename2 = fileDialogSave();
	File ifile = new File(filename);
	File ofile  = new File(filename2);
	
	try ( Scanner sc = new Scanner("ifile");
			PrintWriter pw = new PrintWriter(ofile)){
	while (sc.hasNext()){
		String temp = sc.nextLine(); // 파일에서 읽어온 1줄
		System.out.println(temp); // 표준 출력(콘솔)
		pw.println(temp);//파일출력
	}
	System.out.println("복사완료");
	}	
	catch(FileNotFoundException e) {
		System.out.println("경로에 문제가 있는거 같은데요~? 오류내용 : "+e.getMessage());
		
	}
	catch(Exception e ) {// finalnotexception 제외한모든 exception 처리
		System.out.println("알수없는 오류 입니다.");
	}
}
	public static String fileDialogOpen() {
		// 콘솔 입출력으로 실행하는 프로그램 : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
		// 자바에서도 GUI 를 만들수 있는 클래스들이 있습니다. 그 중 하나인 파일대화상자를 사용합니다. 라이브러리는 awt,swing,javaFX 등이 있습니다.
		// Windows OS는 프로그램들이 window라는 틀 안에서 만들어지는데 자바에서는 그것은 프레임이라고 합니다.
				
				JFrame f = new JFrame();  //파일대화상자를 시작할 프레임객체 생성
				
				FileDialog fdr = new FileDialog(f,"파일 열기",FileDialog.LOAD);	//파일대화상자 객체 생성
				fdr.setVisible(true);		//파일 대화상자 보이기
				
				String filename = fdr.getDirectory() + fdr.getFile(); 	//선택한 파일의 경로와 파일명 연결
				System.out.println("선택한 경로와 파일 : " + filename);
				System.out.println("선택한 경로 : " + fdr.getDirectory() + ",선택한 파일:" + fdr.getFile());
				File file = new File(filename);
				System.out.println("선택한 파일 크기 : "+ file.length()+"바이트");
				return filename;
	}
	public static String fileDialogSave() {
		JFrame f = new JFrame();
		FileDialog fdw = new FileDialog(f, "파일저장",FileDialog.SAVE);
		fdw.setVisible(true);
		String filename = fdw.getDirectory() + fdw.getFile();
		System.out.println("저장한 경로와 파일 : "+fdw.getDirectory()+fdw.getFile());
		
		return filename;
		
	}


	
}
