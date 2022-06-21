package koreaitday15;

import java.io.File;  //io: input,output  ����°� ���õ� ��ɵ��� Ŭ����.
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {
public static void main(String[] args) {
	String filename = "C:\\Users\\ITCS\\eclipse-workspace\\�ڹ��׽�Ʈ.txt";
	
	File file = new File(filename);
	Scanner sc=  null;
	try {
		
		sc = new Scanner(file);	//system.in : ǥ���Է�(�ܼ��Է�)
		while(sc.hasNext()) { 
		System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());} //������ ���͸� �������� ���� �����Ͱ� ������ true.
	}
	catch (FileNotFoundException e) {
		//�Է±�ɿ��� ������ ������ Exception�� �߻�
		e.printStackTrace();
	}
	
		//��±�ɿ��� ������ ������ �ڵ����� ������ �����˴ϴ�.*/
	
	finally {
		if(sc!=null) 
	
		sc.close();
	}
}
}



//try ~catch �ڿ����� ����� finally �Ⱦ��� java 7 �������� �ٸ� ���� ������ �����մϴ�. 
//	���� ���õ� �������̽��� ���������� ã�ƺ���