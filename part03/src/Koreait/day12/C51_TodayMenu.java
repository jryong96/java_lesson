package Koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class C51_TodayMenu {
public static void main(String[] args) {
	System.out.println("������ ����޴��� ��ǥ�մϴ�!!");
	String foods = "ġ�� ,������, ��â, ��¡��, �ܹ��� , �Ұ��";
	

//key : �޴��̸�, value : ��ǥ��
	//�ʱ�ȭ
	HashMap<String,Integer> map = new HashMap<>();
	map.put("ġ��",0);
	map.put("������",0);
	map.put("��â",0);
	map.put("��¡��",0);
	map.put("�ܹ���",0);
	map.put("�Ұ��",0);

	Scanner sc = new Scanner(System.in);
	//�޴����� (�ݺ�)
	while(true) {
		System.out.print("���� �޴� ���ĸ��� �Է��ϼ���(����� end �Է�) : ");
		String menu = sc.nextLine();
		if(menu.equals("end")) {
			break; 
		}
		if(!map.containsKey(menu)) { //map�� Ű���� menu �Է¹����� �ִ��� �˻�
//			System.out.println("���� �޴� �Դϴ�. �ٽ� �Է��ϼ���  : ");
			System.out.println("���� �޴� �Դϴ�. �޴��� �߰��մϴ� ");
			map.put(menu,1); 
			foods += "," + menu;
			continue;
			
		}
			//�Է¹��� menu�� value���� �������� -> +1�ϱ� -> �������
			int temp = map.get(menu);
			++temp; // temp++ : put => ����          ++temp : ���� => put
			map.put(menu, temp); // ++tmep�� put��  	map.put(menu, ++temp) �� ���ٷ� ��� ����
			
			
		
	}
	System.out.println("��ǥ�� �����մϴ�.");
	System.out.println(map);
	System.out.println("�ִ� ��ǥ�� : "+ Collections.max(map.values()));
	System.out.println("�ִ� ��ǥ �޴� : "+ Collections.max(map.keySet()));
	//Entry<key,value>
}
}