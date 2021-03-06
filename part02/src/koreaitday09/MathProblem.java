package koreaitday09;

import java.util.Random;



public class MathProblem {
	//인스턴스 필드 : static이 아닌 형식, 객체가 생성될 때 마다 다른값을 가짐.
	private int n1; //private 생성시 게터 세터 꼭 생각해주기
	private int n2;
	private char op;   // +-*/
	private boolean isCorrect; //정답여부 정답일 경우 true
	public static final int max_size = 20; //문제 최대갯수를 20으로 고정 >> static (정적인) 필드 
	public MathProblem(char op) {// 커스텀생성자 : 커스텀 생성자 사용시 기본생성자(default) 사용 불가능
		 this.op = op; //인자로  전달받을 값이 연산자.
	}
	/*참고
	 * static 메소드는 인스턴스 필드값과 무관(객체와 연결되어 있지 않음)하게 동작하는 메소드
	 * 인스턴스 메소드는 인스턴스 필드값과  상관 있이 동작하는 메소드 
	 * 
	 * 
	 * 
	 * 
	 */
	public void makeProb() { // 사칙연산 종류별로 적절한 난수 생성하기->문제를 만들어 줍니다.
		
		Random r = new Random();
		int max1=0,min1=0,max2=0,min2=0;
		switch (op) {
		case '+':
			max1=99;max2=99;min1=11;min2=11; //n1,n2 모두 11~99
			break;
		case '-':
			max1=99;max2=49;min1=50;min2=11; //n1 : 50~99 n2: 11~49
			break;
		case '*':
			max1=77;max2=29;min1=11;min2=11; //n1 : 11~77  n2: 11~29
			break;
		case '/':
			max1=99;max2=29;min1=41;min2=11; // n1 : 41~99 n2: 11~29
			break;

		}
		n1=r.nextInt(max1-min1+1)+min1; //난수범위 min1~max1
		n2=r.nextInt(max2-min2+1)+min2; //난수범위  min2 ~ max2
	}
	public int showAnswer() {		//n1,n2,op 필드값을 가져와서 정답계산하여 반환합니다.
		int result=0;
	
		switch (op) {
		case '+':
			result=n1+n2;
			break;
		case '-':
			result=n1-n2;
			break;
		case '*':
			result=n1*n2;
			break;
		case '/':
			result=n1/n2;
			break;
		}
		
		return result;
	}
	
	
	
	public String Problem() {
		return n1 + " " + op + " " + n2 + " = ";
	}
	//getter, setter 
	public int getN1() {
		return n1;
	}
	public int getN2() {
		return n2;
	}
	public int getOp() {
		return op;
	}
	public boolean isCorrect() {
		return isCorrect;
	}
	
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
}

