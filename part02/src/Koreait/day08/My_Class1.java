package Koreait.day08;

public class My_Class1 {
	private int age;
	String name;
	public double point;
	//private �ʵ�� setter,getter �� �־��  �ٸ�Ŭ�������� ���� �б�/���� �� ����
	void setAge(int age) {
		if(age>1 && age<=150)
			this.age = age;
		else 
			System.out.println("�߸��� �� �Դϴ�.");
		this.age = age;
		
	}
		int getAge() {
			return age;
		}
}
/*
 *  private int age;   // private : �ٸ�Ŭ�������� ��� �Ұ��� , ���� Ŭ���������� ���(��������)
 *  String name; // default(package) : �ٸ���Ű������ ��� ����. �̿��̸� ���̾���
 *  public double point;  //public : ��𿡼��� ���, �ٰ��̾���
 *    
 *    
 *    private , default , protected, public��
 *    ����(�ʵ�),�޼ҵ�,������,Ŭ���� � ���Ǵ� ���������� �Դϴ�.(Ŭ������ ����������, default,public�� ���)
 *   */
