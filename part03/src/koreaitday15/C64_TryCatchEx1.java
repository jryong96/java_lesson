package koreaitday15;
import java.util.Scanner;
public class C64_TryCatchEx1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	try {
		String message = null;
		int cnt  = message.length();
		System.out.print("�����Է� : ");
//		int a = sc.nextInt();
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("�Է°� : "+a);
//	} catch(NullPointerException e) {
	} catch(NullPointerException | NumberFormatException e) {          // | ��ȣ�� bit���� or���� : Exception�� ��Ʈ������ ����
		//�߻��� ���� ������ Exception ��ü�� �����ϰ� �̿� ���� ���������� e �Դϴ�.
		System.out.println("���� �߻� : "+ e.getMessage());
		System.out.println("����� ��ɿ� ������ �߻��Ͽ����ϴ�.");
	} 
	finally {
		sc.close();
	}
	System.out.println("end");
}
}
