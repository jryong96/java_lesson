package Koreait.day08;

public class MyClass2 {
private int age;
private String name;

//커스텀 생성자 정의 연습 : 생성자 메소드 이름은 반.드.시  클래스명과 동일하게, 2) 리턴타입은 없는 형식
// 3)접근 한정자는 4가지 모두 가능  : 지금 예시는 default (기본) package 
MyClass2(String name){
	this.name=name;
	
}
public void setAge(int age) {
	this.age = age; 
	
}

public int getAge() { //setter는 생성자로 대체, getter 만 있는 예시
			return age;
}						// --> 생성자에서 초기화한 값을 변경하지는 못함.
	 
	 public String getName() {
		 return name;
	 }
	 //커스텀 생성자의 연습 : 생성자 메소드 이름은 반드시 1)클래스명과 동일하게   2) 리턴타입은 없는 형식으로   3)접근한정자는 4가지 모두 가능 : 예시는 기본패키지
	 // 목적 : 필드 초기화 및 연산식 또는 명령어
}







/*
생성자 메소드 연습합니다.(리턴값은 없고 , 인자는 있을수도 있는 메소드 )- constructor
-> 생성자 메소드 실행으로 객체가 만들어집니다. 	
-> 기본생성자 : 인자가 없는 형식의 생성자
-> 커스텀생성자 : 필드값 초기화를 위해서 인자가 있는 형식의 생성자
*/