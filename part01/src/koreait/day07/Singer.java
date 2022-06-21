package koreait.day07;

import java.util.Arrays;

public class Singer {

/* 클래스 정의 하는것은 현실세계의 데이터를처리하기 위한 형식을 지정
 * 
 */
	//singer 객체가 만들어질 때 마다 다른값 : 인스턴스 필드
	String genre; //장르
	String name_eng; 
	String name_kor;
	int debutYear;
	String[] members; //그룹일 경우, 멤버 이름들을 저장할 배열
	
	static final String JOB = "연예인";
	static String label = "★"; //singer에게는 모두 동일한 별 표기 , 변경 가능한 변수
	
	void printMembers( ) {
		if (members == null)
			System.out.println("솔로 가수 입니다.");
		else
		for(int i=0; i<members.length; i++) {
			if(members[i] !=null)
				System.out.println((i+1)+":"+members[i]);
		}
	}
	int actYears(int year) { //활동기간 계산
		
		return year-debutYear+1;
	}
	@Override
	public String toString() {
		return "Singer [genre=" + genre + ", name_eng=" + name_eng + ", name_kor=" + name_kor + ", debutYear="
				+ debutYear + "]";
	}
	
	
}
