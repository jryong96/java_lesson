package koreaitday16;

import java.io.File;  //io: input,output  ����°� ���õ� ��ɵ��� Ŭ����.
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C68_FIleRead_WriteTest {
public static void main(String[] args) {
	String filename = "D:\\Work\\i_class\\Java_workspace\\�ڹ��׽�Ʈ2.txt";
	
	File file = new File(filename);
	//printWriter : ��±���� ���� �޼ҵ�.
	//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try ~catch �ʿ� 
	PrintWriter pw = null;
	try {
	pw = new PrintWriter(file); //file�� ������ ��ġ�� ����� ���� ��ü
	pw.println("�ȳ��ϼ���");
	pw.println("��ٽ����ּ���");
	pw.println("����ּ���");
	pw.println("�����մϴ�");
	pw.println("��������� �Ϸ� �Ǿ����ϴ�.");	//sysyem.out : ǥ�����(�ܼ����)
	System.out.println("��� ��! ��ΰ��� Ȯ�� ���!");
	}catch (FileNotFoundException e) {
		System.out.println("����� ���� �߻� : "+ e.getMessage());
		//��±�ɿ��� ������ ������ �ڵ����� ������ �����˴ϴ�.
	}
	finally {
		pw.close();
	}
}
}
            