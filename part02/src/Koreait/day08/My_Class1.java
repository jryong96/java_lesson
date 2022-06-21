package Koreait.day08;

public class My_Class1 {
	private int age;
	String name;
	public double point;
	//private 필드는 setter,getter 가 있어야  다른클래스에서 값을 읽기/쓰기 가 가능
	void setAge(int age) {
		if(age>1 && age<=150)
			this.age = age;
		else 
			System.out.println("잘못된 값 입니다.");
		this.age = age;
		
	}
		int getAge() {
			return age;
		}
}
/*
 *  private int age;   // private : 다른클래스에서 사용 불가능 , 현재 클레스에서만 사용(나만쓰자)
 *  String name; // default(package) : 다른패키지에서 사용 못함. 이웃이면 같이쓰자
 *  public double point;  //public : 어디에서나 사용, 다같이쓰자
 *    
 *    
 *    private , default , protected, public은
 *    변수(필드),메소드,생성자,클래스 등에 사용되는 접근한정자 입니다.(클래스는 접근한정자, default,public만 사용)
 *   */
