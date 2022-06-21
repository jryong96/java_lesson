package koreaitday16;

public class Word {
	// enum (열거형 타입) ==> 상수만 정의한 클래스 꼭 조사해보기
	public static final int NOOBIE = 1;
	public static final int NORMAL = 2;
	public static final int EXPERT = 3;
	
	private String english;
	private String korean;
	private int level;
	
	
	
	@Override
	public String toString() {
		return english + " " + korean + " " + level + (
	this.level==NOOBIE?"초보" : this.level==NORMAL?"중급" :"고급");
	}

	public Word() {
		// TODO Auto-generated constructor stub
	}
	
	public Word(String english) {
		this.english = english;
	}
	
	public Word(String english,String korean) {
		this.english = english;
		this.korean = korean;
	}
	
	public String getEnglish() {
		return english;
	}
	
	public void setEnglish(String english) {
		this.english = english;
	}
	
	public String getKorean() {
		return korean;
	}
	
	public void setKorean(String korean) {
		this.korean = korean;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
}
