package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
public static void main(String[] args) { //�ۼ��� �̿���
	/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
	 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
	 *  		�� indexof �� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
	 *  
	 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
	 *  		�� '@' �� indexof �� ���ؼ� �� �ں��� ������ substring ������ ���ڿ��� equals ��
	 *  
	 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
	 *  		�� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
	 *  
	 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
	 *  		�� 3���� ���ڿ��� length() �� 6���� ��
	 *  
	 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
	 *   		�� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ� �����ϴ� ��ȣ ����
	 */

	Scanner sc = new Scanner(System.in);
	String email;//@�Է¹��� ����
	String account;//@�տ�
	String domain;//@�ڿ�
	boolean isvalid = true;
		
	System.out.print("����� �̸����� �Է��� �ּ��� : ");
	email = sc.nextLine(); //���� �Է¹ޱ�
	
	
	int mark = email.indexOf('@'); //@ ã������ ���� ,@��ġ
	
	if(mark==-1) { // *@�� �Է¹��� ���ڿ��� �������
		isvalid = false;
		System.out.println(isvalid+" : @�� ���Խ��Ѽ� �ٽ� �Է��� �ּ���!");
	}
	else if(mark!=-1) { //@�� �������
		domain = email.substring(mark+1); //������ ������ ����
		if(!domain.equals("gmail.com")) { //������ ���� �� gmail ���ڿ��� �ٸ����
			isvalid = false;
			System.out.println(isvalid+" :�������� gmail�� �ƴմϴ�."); //���� ���
		}
		else { 
			
			account = email.substring(0,mark); //@�ձ��� �����ϴ� ����
			
			int length = account.length(); //account ���ڼ��� �����ϴ� ����
			if(length<6) { // @����,������ ��ġ, * account�� 6���� �̸��Ͻ�
				isvalid = false;
				System.out.println(isvalid+" :6���ڹ̸� �Դϴ�."); //���� ���
			}
			else { 
				if(email.indexOf('$')==-1 && email.indexOf('%') ==-1) { //@���� , ������ ��ġ , account 6���� �̻� , Ư������ ������
					System.out.println("�Է��Ͻ� �̸����� "+email+"�Դϴ�."); // ���� ��� ������ �̸��� ���
				}
				else {  //@����,��������ġ,account6�����̻�  *Ư������ ���Խ�
					isvalid = false;
					System.out.println(isvalid+" :Ư������ $,%�� ���ܽ����ּ���."); //�������
				}
				
			}
	}
sc.close();
	
	//�Է°��� ó������ 1,2,4,5�� �ش�����������  �����޽����� ����ϰ�, isvalid ������ false�� ���� -> isvalid ���
	













}
}
}

