package Koreait.day08;

public class Member {
private String name,email;
private int age,level;
//Ŀ���� ������ : name,email �ʵ� �ʱ�ȭ
public Member(String name, String email) {  //()���� ���޹��� ���� 
	this.name=name;
	this.email=email;
}
//�⺻(default)������ : ��¹� �߰�
public Member() {
	System.out.println("name, email,age,level �ʵ�� �⺻�� �Դϴ�.");
	System.out.println("name = "+this.name); //this�� �޼ҵ带 ���� ��Ű�� ��ü
	System.out.println("age = "+this.age);
}
//setter
public void setName(String name) {
	this.name = name;
}
public void setEmail(String email) {
	this.email = email;
}
public void setAge(int age) {
	this.age = age;
}
public void setLevel(int level) {
	this.level = level;
}
//getter
public int age() {
	return age;
}
public int level() {
	return level;
}
public String name() {
	return name;
}
public String email() {
	return email;
}

	
}

