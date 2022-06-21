package koreait.day07;

public class C41_StudentScore {
public static void main(String[] args) {
		Student[] stus = new Student[5];  //배열요소가 5개, students 객체 참조
		String[] names = {"학생1","학생2","학생3","학생4","학생5"};
		stus[0] =  new Student ();
		stus[0].name = names[0];
		stus[0].no = 1;
		stus[0].grade = 3;
		
		// for문으로 나머지 4개 객체를 생성해서 stus 배열에 참조시키기
		
		for(int i=1; i<stus.length; i++) {
			stus[i] = new Student();  // *** 객체 생성해서 참조시키기
			stus[i].name = names[i];
			stus[i].no = i+1;
			stus[i].grade = 3;
		}
		
		
		for(int i =0; i<stus.length;  i++) {
			System.out.println(stus[i]);
		}
		// 각 생성된 student 객체가 score 객체를 필드로 갖도록 하기. -> score 객체 3개 필드값 입력 실행
		for (int i=0; i<stus.length;i++) {
			System.out.println(stus[i].name+"점수 >>" );
			Score temp = new Score(); //***객체 생성 Score 클래스 가져오기
			temp.input(); // korean,english,science 3개의 필드값은 있는 상태.
			stus[i].score = temp; // *** 중요
//			stus[i].score.input();
			System.out.println(stus[i]);		 //확인
			/* 
			 * stus[i].score = new Score();
			 * stus[i].score.input();
			 * 로 temp없이도 가능
			 */
			
		}
				System.out.println("성적통계");
				System.out.printf("%4s %6s %7s %7s\n","번호","이름","총점","평균");
				for(int i =0; i<stus.length; i++) {
					System.out.printf("%4d %6s %7d %7.1f\n",stus[i].no,stus[i].name,stus[i].score.sum(),
							stus[i].score.average());
				}
}

}
