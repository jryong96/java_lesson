package koreait.day01;

public class C02_TwicePrint {
public static void main(String[] args) {
	System.out.println("Ʈ���̽�");
	System.out.println("�̸�\t�������\t\t����");
	System.out.println("--------------------------------------");
	System.out.println("�糪\t1996.12.29\t27");
	System.out.println("��ȿ\t1997.02.01\t26");
	System.out.println("�̳�\t1998.03.24\t25");
	System.out.printf("%-12s%s%5d\n","dayeon","1998.05.28",25);
	System.out.printf("%-12s%s%5d\n","momo","1999.04.23",24);
	System.out.printf("%-12s%s%5d\n","nana","1997.06.14",27);
	
	
	
	
	
	System.out.printf("%-12s%4d.%02d.%02d%5d\n","dayeon",1998,5,28,25);
	System.out.printf("%-12s%4d.%02d.%02d%5d\n","momo",1999,4,23,24);
	System.out.printf("%-12s%4d.%02d.%02d%5d\n","nana",1997,6,14,27);
	
}
}
