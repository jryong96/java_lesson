package koreaitday16;

import java.util.Scanner;

public class C69_MyExceptionTest {
public static void main(String[] args) {
	System.out.println("���̸� �Է� �ϼ��� : ");
	Scanner sc = new Scanner(System.in);
	
	try {
		int age = Integer.parseInt(sc.nextLine());
		if(age < 0 || age>100) throw new AgeException("������ ������ 0~100�Դϴ�."); //Ŭ���������߰����� ������ ���� �� 
		//throw �� ������ Exception�� �߻� ��ŵ�ϴ�.=> �޽����� �ٲܶ�
		if(age ==0 ) throw new NullPointerException();
		
		System.out.println("���̰� "+age+"�� �³���?");
	} catch(NumberFormatException e) {
		System.out.println("���ڷθ� �Է��ϼ�  ");
	
	}catch(Exception e) {
		System.out.println("����� ���� ���� : "+e.getMessage());
	}
	
	
}
} //class End
// ����� Exceptuion�� ���� �� �ִ�.
class AgeException extends Exception {

	//Serializeable �������̽��� ���õ� ��.
private static final long serialVersionUID = 1L; //Ageexception�� Exception�� ��� 
//����ڰ� ���Ƿ� �����޽��� ����
	public AgeException(String message) {
		super(message);	//Exception�� �޽��� �ʵ带 ���� 
	}
	
}