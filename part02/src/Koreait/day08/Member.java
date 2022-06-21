package Koreait.day08;

public class Member {
private String name,email;
private int age,level;
//커스텀 생성자 : name,email 필드 초기화
public Member(String name, String email) {  //()안은 전달받을 인자 
	this.name=name;
	this.email=email;
}
//기본(default)생성자 : 출력문 추가
public Member() {
	System.out.println("name, email,age,level 필드는 기본값 입니다.");
	System.out.println("name = "+this.name); //this는 메소드를 실행 시키는 객체
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

