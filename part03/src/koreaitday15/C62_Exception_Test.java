package koreaitday15;
import java. util.Scanner;
public class C62_Exception_Test {
public static void main(String[] args) {
	//Throwable Ŭ������ ����Ŭ���� : error, exception
//	error => �ý��ۻ� ����
//	exception => �������� ���α׷� �ܺ��� ���� 
//	int a = 4.1; // ����������  ������ ��ü�� �ȵ˴ϴ�.
	
	//Exception ����1 : java.lang.NullPointerException (��ü ������ null�̸� �޼ҵ�  ������ �ȵ�.)

	
	//Exception ����3 : java.util.InputMismatchException
			Scanner sc = new Scanner(System.in);
			System.out.print("�����Է� : ");
//			int a = sc.nextInt();	
			int a = Integer.parseInt(sc.nextLine());//Ű�����Է��� ������ ��ȯ�ؼ� ������ �����մϴ�. => ���ڿܿ� �ٸ� ���� �Է��ϸ�  java.lang.NumberFormatException ���� �߻�
			System.out.println("�Է��� : "+a);

	
			String message = null;
			
			char temp = message.charAt(0);     //message ���ڿ����� ù��°(0) ���� 1�� �����ɴϴ�.
			//Exception ����2 : java.lang.ArrayIndexOutOfBoundsException
			int[] nums = new int[5];		//�迭���� : ��� 5���Դϴ�.
			nums[5] =100;


	
}
}
/*
Exception ��� : ���������� �ƴմϴ�. �����ϸ鼭 �߻��ϴ� ���� �Դϴ�.(�߻����ɼ��� ����ؼ� ���α׷����ؾ��մϴ�.)
     -> ���ο� ���� �ٸ��̸� XXXXException �� �߻��ϰ� �̵��� Exception Ŭ������ �ڽ� Ŭ�����Դϴ�.
     -> Exception �� ���� �߿� �߻��ϸ� �� ���Ĵ�?..... ���α׷��� �� �������� �ߴܵ˴ϴ�. 
         ����, Exception �� �����ϰ� ���α׷��� �ߴܵ��� �ʵ��� ���α׷� ������ �ؾ��մϴ�.
*/
