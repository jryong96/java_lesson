package koreaitday17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {
	public static void main(String[] args) {
//	String Ŭ���� split(�п�) �޼ҵ� : ����Ÿ���� String[] 
		String temp = "��� 90 88 79";
		String result[] = temp.split(" "); // ������ �������� ���ڿ��� �������� �ɰ�
		System.out.println("1. �ݺ��� ���� ���");
		System.out.println("index 0 :  " + result[0]);
		System.out.println("index 0 :  " + result[1]);
		System.out.println("index 0 :  " + result[2]);
		System.out.println("index 0 :  " + result[3]);

		// for������
		for (int i = 0; i < result.length; i++) {
			System.out.println(String.format("result[%d] : %s", i, result[i]));
		}
		System.out.println("result : " + result.length);

//		���� for
		System.out.println("3. ���� for�� ���");
		for (String t : result)
			System.out.println("result��� : " + t);

		String temp2 = "���,88,90,12,13,14";
		result = temp2.split(",");
		System.out.println("2. split ���б�ȣ�� �޸��϶�");
		for (String t : result)
			System.out.println("result ��� : " + t);

		temp2 = "���,,88,,90,,12,,13,,14";
		result = temp2.split(",");
		System.out.println("2. split ���б�ȣ�� �޸��϶�");
		for (String t : result)
			System.out.println("result ��� : " + t);
		System.out.println("result���� : " + result.length);
		// result[1],result[3],result[5] ���̿� �� ���ڿ��� �� ������ ��������

		result = temp2.split(",,");
		System.out.println(" split ���б�ȣ�� ,,�϶�");
		for (String t : result)
			System.out.println("result ��� : " + t);
		System.out.println("result���� : " + result.length);

		// split �� ������ ���ڿ��� ���Խ� ���ڿ��Դϴ�.(���Խ� ������ ����, ��ƽ��ϴ�)
		// ex) ���Խ� ���� : []�ȿ� ǥ���ϴ� ���� ���� �������� �Ǵ�(or)�� �ش��մϴ�.

		temp2 = "���,88,90,12 13,14";
		result = temp2.split("[ ,()]"); // ���Խ� ���ڿ� : ���б�ȣ�� ���� �Ǵ� "," �Ǵ� "(" �Ǵ� ")" ��4��
		System.out.println(" split ���ڰ� ���Խ� �϶� ");
		for (String t : result)
			System.out.println("result ��� : " + t);

		temp2 = "���,90,88,79";
		result = temp2.split(",", 3);
		System.out.println("8. split �ι�° ���� limit Ȯ��");
		// limit�� ���ϵǴ� �迭�� ũ�� , �� �ɰ����� Ƚ������ Ŀ�� �� ����.
		System.out.println("result length : " + result.length);
		for (String t : result)
			System.out.println("result ��� : " + t);

		// �迭�� ������ �ڷᱸ�� : List
		// �迭�� List�� ��ȯ�غ���
		result = temp2.split(",");
		System.out.println("9. result �迭�� List��ü�� ����");
		List<String> rlist = Arrays.asList(result);
		System.out.println(rlist);
		System.out.println("rslit size : " + rlist.size());
		for (String t : rlist)
			System.out.println("rlist��� : " + t);

		// ���� rlist�� �迭�� ũ�⸸ŭ List�� �������� �����մϴ�.(�߰�,����,���� ���� �� �Ұ���)
//		rlist.add("test"); // ���� : ������ ����Ʈ
//		rlist.remove(2); //���� 
//		rlist.add(2,"100"); //����  
		// ������ List�� �����
		System.out.println("10. ArrayList�� ���ڰ� �ִ� ������ �׽�Ʈ");
		List<String> rlist2 = new ArrayList<>(rlist);
		System.out.println(rlist2);
		rlist2.add("test");
		rlist2.remove(2);
		rlist2.add(2, "100");
		System.out.println(rlist2);

		// Arrays.asList �� �׽�Ʈ������ ����� ����Ʈ ���鶧 �Ǵ� ������ ���� ����Ʈ ���鶧 ��� 
		List<Integer> ilist = Arrays.asList(1, 2, 3, 4, 100);
		System.out.println("11. Arrays.List Ȱ��");
		System.out.println(ilist);
	}
}
