package Koreait.daya;
import koreait.day08.My_Class1;
public class MyclassTest {
// My class1 ��ü ����	 �ٸ� Ŭ������ ������ ��import ��Ű��.Ŭ����
	public static void main(String[] args) {
	My_Class1 my = new My_Class1();	 //public Ŭ���� ������ import�� ����� ��
	
	//��Ű���� �ٸ� My_Class1 Ŭ������ �ʵ� �� ����� �� �ִ� ����?
	my.name= "haha";
	my.point= 3.1414;
//	my.age = 23; // ���� : private ������ �ʵ�
	my.setAge(23); //private �ʵ尪 ����(����)�ϴ� �޼ҵ�  : setter
	System.out.println("age = "+my.getAge()); //private ���� �о���� �޼ҵ� : getter
	my.setAge(-1);
	System.out.println("age = "+ my.getAge());
	System.out.println("point = "+my.point);
	System.out.println("name = "+my.name);
	
	
	}

	
	
}
