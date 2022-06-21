package koreaitday15;

import java.io.File;  //io: input,output  ����°� ���õ� ��ɵ��� Ŭ����.
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriting {
public static void main(String[] args) {
	String filename = "C:\\Users\\ITCS\\eclipse-workspace\\�ڹ��׽�Ʈ.txt";
	
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
            