package koreaitday09a;

public class ClassA {			//�θ� Ŭ����
/*
 * Ŭ������ ��� 
 * => Ŭ�������� �θ�(����Ŭ����,super)-�ڽ�(����Ŭ����) ���谡 ��������ϴ�. 
 * =>�θ� Ŭ������ ������Ҹ� �ڽ��� ����� �� �ֽ��ϴ�. ��ӵǴ� ��Ҵ� �ʵ�,�޼ҵ� 
 * =>extends Ű���带 ����Ͽ� ��ӹ��� �θ� Ŭ������ �����մϴ�.
 * => private ���������ڴ� ���x 
 * => protected �� �ٸ���Ű���� �ڽ� Ŭ������  ��ӹ��� �� �ֵ��� �մϴ�.
 * 
 */ 
int ab;
String name;
protected String title; //protected�� ����Ʈ ���������ڿ� ������ �ڽ� Ŭ�������� ��� 

void print() {
	System.out.println("ab =" + ab);
	System.out.println("name =" + name);
	
}
public String getName() {
	return name;
	
}
public void setName(String name) {
	this.name = name;
}
}
