package koreaitday09a;

public class ClassA {			//부모 클래스
/*
 * 클래스의 상속 
 * => 클래스간의 부모(상위클래스,super)-자식(하위클래스) 관계가 만들어집니다. 
 * =>부모 클래스의 구성요소를 자식이 사용할 수 있습니다. 상속되는 요소는 필드,메소드 
 * =>extends 키워드를 사용하여 상속받을 부모 클래스를 지정합니다.
 * => private 접근한정자는 상속x 
 * => protected 는 다른패키지의 자식 클래스가  상속받을 수 있도록 합니다.
 * 
 */ 
int ab;
String name;
protected String title; //protected는 디폴트 접근한정자와 같지만 자식 클래스에만 허용 

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
