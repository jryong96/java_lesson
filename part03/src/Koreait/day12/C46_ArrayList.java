package Koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {
public static void main(String[] args) {
	int[] data = {45,23,1,3,5,7,9}; //�迭�� ������ �� �迭�� ũ�⸦ ����. --> �ٲ�������,������(static)
									//�迭�� �⺻�� ������ Ÿ�� (int,double,long...etc..) �Ǵ� ������ Ÿ�� 
	
	ArrayList<Integer> list = new ArrayList<>();
			//ArrayList�� ũ�Ⱑ �����Դϴ�.
			//������ Ÿ���� �׻� ������ Ÿ��. �⺻���� ����Ŭ������ ���
			//< E > �� '���ʸ�Ÿ��'  == > ������ ����� Ÿ���� ���Ѵ�. ��� Ÿ���� ����Ʈ�� ���� �� �ִ�.
			//����Ʈ�� �����ϴ�  �����͸� ���(element)��� �մϴ�.
			//�ֿ�޼ҵ� add,get,size,remove 		( indexOf,contains�� int , String������)
		String[] names = {"����","���","����","�ź�","����"};
		ArrayList<String> name_list = new ArrayList<>();

		//ArrayList�� ������ �߰��� add()�޼ҵ�� ó��
		list.add(45); list.add(7);list.add(16); list.add(44); //list�� add�޼ҵ带 �߰��ϴ� ���
		
		System.out.println("ù��° ArrayList<integer> ���  ");
		System.out.println(list);  // ������ �迭��� ������ ��µǴ� ���
		System.out.println("����(�迭) : "+Arrays.toString(data));  //data�迭 ���
		System.out.println("data�迭�� ũ�� : "+data.length);
		System.out.println("����Ʈ�� ũ�� : "+list.size());
		name_list.add("����"); 	name_list.add("���");	name_list.add("�ź�");	name_list.add("����");
		System.out.println("�ι�° ArrayList<String> ���");
		System.out.println("����Ʈ�� ũ�� : "+name_list.size()); //�����Ͱ� �������� 0
		
		System.out.println("3.Ư�� ��ġ�� ������ �߰�");
		list.add(1,23); //1�� �ε����� 23�� ����, �� �ε����� ��ġ�� ����Ʈ�� ũ�� �̸���  
		System.out.println("add(1,23) ��� : " + list);
		name_list.add(2,"�ź�");
		System.out.println("add(2, \"�ź�\") ��� : "+name_list);
		
		System.out.println("4. �迭ó�� index������ ������ ��������");
		System.out.println("get(3) : " + list.get(3)); // list�迭 3�� �ε����� �迭��Ұ� ���
		System.out.println("get(3) : " + name_list.get(3)); //name_list �迭 3�� �ε����� �迭��Ұ� ���
		
		System.out.println("5. Ư����ġ ������(���) ����");
		list.remove(4); // list�迭 4���ε��� �迭��� ����
		name_list.remove(4); // name_list�迭 4���ε��� �迭��� ����
		System.out.println("remove(4)��� : " + list); //�迭 ���
		System.out.println("remove(4)��� : " + name_list); //�迭 ���  : �Ѵ� 4���ε����� �����Ǿ� ��µǴ� ���
		
		System.out.println("\n6. Ư���� ��ġ �˾Ƴ���");
		System.out.println("�迭 : "+Arrays.binarySearch(names, "�ź�")); // �ź� ��� �ε����� �ֳ� �˷���
		System.out.println("����Ʈ : "+ name_list.indexOf("�ź�"));
		
		System.out.println("\n7. 6���� �迭������ for������ �����Ѵٸ�?");
		System.out.println("�迭");
		int i;
		for( i=0; i<names.length;i++)
			if(names[i].equals("�ź�"))
				break;
		System.out.println("'�ź�'�� �ε���  : " + i);
		
		System.out.println("����Ʈ");
		int j;
		for(j=0; i<name_list.size(); j++)
			if(name_list.get(i).equals("�ź�"))
				break;
		System.out.println("'�ź�'�� �ε��� : "+ j);
		
		//'�ź�' ��Ұ� �������϶� ����Ʈ�� lastindexOf �޼ҵ�� ������ ��ġ��Ҹ� ã�� �� �ִ�.
		
		System.out.println("\n8. contains �޼ҵ�");
		System.out.println("'����'�� ����Ʈ�� �ִ°�? " + name_list.contains("����")); // neme_lsit�迭�� ������ ���ԵǾ� �ִ°�?
		System.out.println("'���'�� ����Ʈ�� �ִ°�? " + name_list.contains("���"));
}			
}
/* �迭 : ���� ���� �����͸� �����ϴ� ���
	�÷��� : �ڷᱸ��, ���� ���� �����͸� �����ϴ� ���̰�, ������ Ư¡�� ���� �����ϴ� ���̰� �ִ�.
															���� ���� : ����,�б�,����
															�����͸� ����/���� �ϴ� ���� �޼ҵ忡 �����Ǿ� ����
		ArrayList Ŭ������ HashMap Ŭ������ �÷��ǿ� ���Եȴ�.
		
		
1)add �߰�
2)get ������ ��������
3)remove Ư����ġ ������ ����
4)�⺻�迭ũ�� length
5)����Ʈ ũ�� size
6) indexOf, lastindexOf

		
*/