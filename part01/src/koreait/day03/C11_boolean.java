package koreait.day03;

import java.util.Scanner;

public class C11_boolean {
	public static void main(String[] args) {
//		���� ���� ��� 80�̻� >> ����л�
//		���� ���� ���� �ϳ� 90�̻� >> Ư���л�
		System.out.println("������ ��� Ȯ���ϱ� : and");
		System.out.println(" true and true = " + (true && true));
		System.out.println(" true and false = " + (true && false));
		System.out.println(" false and true = " + (false && true));
		System.out.println(" false and false = " + (false && false));
		
		System.out.println("������ ��� Ȯ���ϱ� : or");
		System.out.println(" true or true = " + (true || true));
		System.out.println(" true or false = " + (true || false));
		System.out.println(" false or true = " + (false || true));
		System.out.println(" false or false = " + (false || false));
		System.out.println("������ ��� Ȯ���ϱ� : not");
		System.out.println(" not true = " + !true);    //true ���� �ݴ�(not)������ �ٲ�
		System.out.println(" not false = " + !false);


		
		
		
		
		
		
		
				Scanner sc = new Scanner(System.in);
				int korean,math;
				System.out.print("���������� �Է��� �ּ��� : ");
				korean = sc.nextInt();
				System.out.print("���� ������ �Է��� �ּ��� : ");
				math = sc.nextInt();
				System.out.println("����л�?"+(korean>=80 && math>=80) );
				System.out.println("Ư���л�?"+(korean>=90 || math>=90) );
				//���������� 20~80���̰� �ƴ� �л� > Ư�����л� not���� ����ؼ� �����
				System.out.println("Ư�����л�?"+!(korean>=20 && korean<=80 ));
				
				sc.close();
	}

}
