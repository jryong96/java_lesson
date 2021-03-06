package koreait.day07;

//C39번호 생략
public class Student {
	
	int no;
	String name;
	int grade;
	Score score; //다른 클래스 객체를 필드(구성요소)로 갖게 됨.
	//인자로 전달받은 값을 전역변수 (필드-객체의 특성을 나타내는 구성요소)에 대입 
	void setData(String name, int grade) { 
		this.name=name;
		this.grade = grade; 
	}
	
	public String toString() { // a = 값 출력
		return "Student [no=" + no + ", name=" + name + ", grade=" + grade + ", score=" + score + "]";
	} //Score는 score.toString 
}
