package koreaitday13a;

public class C54_CompareTo {
public static void main(String[] args) {
	//��� ��ü (object ���) ���� compartTO �޼ҵ尡 �ִ�. : ���Ǻ�
	String me = "��";
	String you = "��";
	String he = "son";

	
	
	//String�� ���ĺ�(������)�� : �빮�� < �ҹ���
	System.out.println("�� �� �� : " + me.compareTo(you));  //-2(����)
	System.out.println("���� son : "+me.compareTo(he)); //24(���)
	
		int a =12 ,b=45;
		System.out.println("a-b = " + (a-b)); // 12-45 < 0
		
		Integer aa= 12;
		Integer bb= 45;
		System.out.println("12��45 : "+aa.compareTo(bb));	// -1 : aa<bb�϶�
		aa = 90;
		System.out.println("90��45 : "+aa.compareTo(bb));	// 1: aa>bb
		aa=45;
		System.out.println("45��45 : "+aa.compareTo(bb));	// 0 : aa=b=b
		
		//compareTo �� ���� �񱳴� sort (����) �� ���ȴ�!
		//������ ��������, �������� �ΰ����� ����
		/* ���Ͻ��� �������� ������ ��츦 ���ϴ�. ��ȯ���� �ʴ� ��츦 -1(����)�� ���ϵǰ� �մϴ�.
		 * ���� ��ȯ���� �ʴ� ���� 
		 *�������� : o1 < o2    	//�������� : o1 > o2 
		*/

}
}
