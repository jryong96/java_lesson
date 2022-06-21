package koreaitday16;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;
public class C67_ResourceClose {
public static void main(String[] args) {
//	String filename = "D:\\Work\\i_class\\Java_workspace\\�ڹ��׽�Ʈ1.txt"; //�б� : �����ϴ� ����
//	String filename2 = "D:\\Work\\i_class\\Java_workspace\\�ڹ��׽�Ʈ2.txt"; //�б� : ���������ʴ� ����

//	File file = new File(filename);
//	PrintWriter pw = null;
//	Scanner sc = null;
	//���� ��ȭ���� ����ϱ� 
	String filename = fileDialogOpen();
	String filename2 = fileDialogSave();
	File ifile = new File(filename);
	File ofile  = new File(filename2);
	
	try ( Scanner sc = new Scanner("ifile");
			PrintWriter pw = new PrintWriter(ofile)){
	while (sc.hasNext()){
		String temp = sc.nextLine(); // ���Ͽ��� �о�� 1��
		System.out.println(temp); // ǥ�� ���(�ܼ�)
		pw.println(temp);//�������
	}
	System.out.println("����Ϸ�");
	}	
	catch(FileNotFoundException e) {
		System.out.println("��ο� ������ �ִ°� ��������~? �������� : "+e.getMessage());
		
	}
	catch(Exception e ) {// finalnotexception �����Ѹ�� exception ó��
		System.out.println("�˼����� ���� �Դϴ�.");
	}
}
	public static String fileDialogOpen() {
		// �ܼ� ��������� �����ϴ� ���α׷� : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
		// �ڹٿ����� GUI �� ����� �ִ� Ŭ�������� �ֽ��ϴ�. �� �� �ϳ��� ���ϴ�ȭ���ڸ� ����մϴ�. ���̺귯���� awt,swing,javaFX ���� �ֽ��ϴ�.
		// Windows OS�� ���α׷����� window��� Ʋ �ȿ��� ��������µ� �ڹٿ����� �װ��� �������̶�� �մϴ�.
				
				JFrame f = new JFrame();  //���ϴ�ȭ���ڸ� ������ �����Ӱ�ü ����
				
				FileDialog fdr = new FileDialog(f,"���� ����",FileDialog.LOAD);	//���ϴ�ȭ���� ��ü ����
				fdr.setVisible(true);		//���� ��ȭ���� ���̱�
				
				String filename = fdr.getDirectory() + fdr.getFile(); 	//������ ������ ��ο� ���ϸ� ����
				System.out.println("������ ��ο� ���� : " + filename);
				System.out.println("������ ��� : " + fdr.getDirectory() + ",������ ����:" + fdr.getFile());
				File file = new File(filename);
				System.out.println("������ ���� ũ�� : "+ file.length()+"����Ʈ");
				return filename;
	}
	public static String fileDialogSave() {
		JFrame f = new JFrame();
		FileDialog fdw = new FileDialog(f, "��������",FileDialog.SAVE);
		fdw.setVisible(true);
		String filename = fdw.getDirectory() + fdw.getFile();
		System.out.println("������ ��ο� ���� : "+fdw.getDirectory()+fdw.getFile());
		
		return filename;
		
	}


	
}
