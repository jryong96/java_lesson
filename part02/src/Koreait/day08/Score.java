package Koreait.day08;

public class Score {
private int korean;
private int english;
private int science;
private String grade; // getter setter  �ۼ��غ���

void setkorean (int korean) {
	this.korean= korean;
	//�޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� korean �� ����
	//this�� setkorean �޼ҵ带 �����Ű�� ��ü
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
