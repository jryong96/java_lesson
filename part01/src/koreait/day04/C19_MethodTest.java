package koreait.day04;

public class C19_MethodTest {
		//���� �޼ҵ�� ������ �ϱ����� ������.���α׷� ������ ���� �� �־�� �� �޼ҵ�. static	
	public static void main(String[] args) {
		
		System.out.println("�޼ҵ带 ���� �����ؼ� ����� ���ϴ�.");
		System.out.println("���α׷��� main�޼ҵ��� ��ɹ��� ������� �����ϰ� �߰��� ȣ��� �޼ҵ带 ������ �޼ҵ尡 ���ǵ� ������ ����");
		System.out.println("��� �̵��մϴ�. �޼ҵ� ������ ����Ǹ� �ٽ� main�޼ҵ�� ���ư��ϴ�.");
		methodA(); //�޼ҵ� ȣ�� (����)
		System.out.println("2.");
		
		methodB(11,33);
		methodB(111,4243);
		System.out.println("3.");
		methodC(929,121);
		methodC(911,223.41);
		methodD();
		System.out.println(methodD()); //���ϰ��� �޾Ƽ� ����ϴ� ����
		int a = methodD(); //���ϰ��� �޾Ƽ� a������ �����ϴ� ����
		System.out.println("return =" + a);
		System.out.println("5.");
		double k = methodE(13,3.14);
		System.out.println("return =" + k);
	
		char letter = methodF('a',5);
		System.out.println("return = "+ letter);
		
		
	}
	public static void methodA() {
		System.out.println("##ù��° �޼ҵ� ���� �����Դϴ�.##");
		
}
	public static void methodB(int a,int b) {
		System.out.println("$$�ι�° �޼ҵ� ���� �����Դϴ�.$$");
		System.out.println("���޹��� �� a ="+a+ ",b=" +b);
	}
	public static void methodC(int a,double b) {
		System.out.println("@@����° �޼ҵ� ���� �����Դϴ�.@@");
		System.out.println("���޹��� �� a ="+a+ ",b=" +b);
}
	public static int methodD() { //��ȯ���� �ִ� ���� : ��ȯ���� int ������, return�� �ݵ�� �ʿ�
		System.out.println("**4��° �޼ҵ� ���� ����**"); 
		return 6;
		
		
	}
	public static double methodE(int a , double b) {
		System.out.println("###�ټ���° �޼ҵ� ���� ���� ###");
		return a+b; //���ڷ� ���޹��� ������ �����ϰ� ó����� ����
	}
	public static char methodF(char a, int b) {
		System.out.println("������° �޼ҵ� ���ǿ���");
		return (char)(a+b);
		
		
	}
}