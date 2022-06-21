package Koreait.day12;
import java.util.HashMap;
public class C50_HashMap {
public static void main(String[] args) {
	//�Ĵ��� �޴���(�޴��̸�, ����) �����͸� �����Ϸ��� �մϴ�.
	String[] title = {"���İ�Ƽ","������ũ","������"};
	int[] price = {12000,22000,7000};
	
	
	//Hash Map key�� �޴��̸�, value�� �������� �ϴ� hashmap ����
	// �ڡ�key�� �ߺ��� ������ ������� ���մϴ�.(������ ��)
	HashMap<String,Integer> menus = new HashMap<>(); // haspmap�� �� value �� key�� Ÿ�� ����
	
	//������ ���� : put() �޼ҵ�
	menus.put("���İ�Ƽ",12000);
	menus.put("������ũ", 22000);
	menus.put("������", 7000);
	
	System.out.println("����� ��� ���");
	System.out.println(menus);
	
	//2. ������ ����(�б�) : get() �޼ҵ� ���
	System.out.println("2. Ư���� key���� value ���");
	System.out.println("���İ�Ƽ�� ������? "+menus.get("���İ�Ƽ"));
	System.out.println("������ũ�� ������? "+menus.get("������ũ"));
	System.out.println("�������� ������? "+menus.get("������"));
	
	//���࿡ key���� �ߺ��̶��?
	menus.put("������",8200); //���� ��� : ����� (value�� ������)
	System.out.println(menus);
	
	//������ ���� : remove() �޼ҵ� 
	System.out.println("3. Ư����� ����");
	menus.remove("������ũ"); // �޼ҵ� ���ڰ� key
	System.out.println("������� Ȯ�� : "+menus);
//	menus.remove("������",6000); // �޼ҵ� ���� key, value�� * ��� ��ġ�Ҷ��� ! ����* 
	menus.remove("������",8200); 
	System.out.println("������� Ȯ�� : "+menus);
	
	
	
	
	
}
}
/*ArrayList : ������(�ε����� ����) ���� �����͸� �����ϴ� �ڷᱸ���Դϴ�.�迭�� ������ �����Դϴ�.
HashMap : �������� ������ �ƴմϴ�. �ε����� ������� �װ� Key ���� �̿��Ͽ� �����������Ͽ� ����/�б� �մϴ�.
			*�˻�*�� ���� �˰��� �����մϴ�. 
  		���ʸ� Ÿ���� K:Key , V:Value �ѽ��Դϴ�.
  		key �� value ��  ���Ÿ���� ���� (hashmap������ key value �ѽ����� ��Ұ� �ȴ�) value�� �˻��ϱ� ���� key�� ���˴ϴ�.
 Hashp Map�� ArrayList �� ���������� int,long,double �⺻�� Ÿ�� ��ſ� ����(wrapper)Ŭ������ ǥ���մϴ�.
 1) put 2)get 3) remove
*/
