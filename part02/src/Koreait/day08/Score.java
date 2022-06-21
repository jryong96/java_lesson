package Koreait.day08;

public class Score {
private int korean;
private int english;
private int science;
private String grade; // getter setter  작성해보기

void setkorean (int korean) {
	this.korean= korean;
	//메소드 인자로 전달받은 값을 클래스 전역변수 korean 에 대입
	//this는 setkorean 메소드를 실행시키는 객체
}

	int getkorean() {
		return korean;
	}
	
	void setenglish (int english) {
		this.english = english;
		
	}
	
	int getenglish() {
		return english;
	}
	void setgrade (String grade) {
		this.grade = grade;
		
	}
	String getgrade () {
		return grade;
	}
	 void setScience(int science) {
		this.science = science;
	}
}
