package koreaitday11;

public class AShapeTest {
//main 메소드는 클래스로 만들어진 애플리케이션, 추상클래스로 완성된 애플리케이션에서 새로운 추상메소드를 추가하고싶어!
	public static void main(String[] args) {
		Triangle tri = new Triangle(100,84);
		tri.shapeName = "직각 삼각형";
		System.out.println("tri");
		System.out.println("넓이 = "+tri.getArea());
		
		Circle cir = new Circle();
		cir.shapeName = "원";
		cir.setRadius(89);
		System.out.println(cir);
		System.out.println("넓이 = "+cir.getArea());
}

} // Ashape Test
/*
 * 참고 : 메소드 재정의할때 접근한정자
 * 부모 public -> 자식 default : 오류
 * 부모 default -> 자식 public : 가능
 */
	

abstract class AShape  {		//도형
	protected String shapeName;
	protected int width; 
	protected int height;
	
	public AShape() {// AShape()는 객체는 직접 만들지 못하고 자식객체가 만들어질때 사용
		System.out.println("AShape 디폴트 생성자 동작합니다.");
	}
	
	public AShape(int width, int height) {	//AShape() 는 객체 생성을 직접 못하고, 자식 객체 만들어질때 실행
		System.out.println("AShape 커스텀 생성자 동작합니다");
		this.width = width;
		this.height = height;
	}

	
	public abstract double getArea(); //도형의 넓이
	
	//추상 클래스도 인스턴스 메소드를 정의해서 자식 클래스를 재정의 할 수 있다
	public  String explain() { //애플리케이션 완료 후 추상메소드 추가오류 발생하기때문에 인스턴스 메소드 추가
		return null;
	}

	@Override
	public String toString() {
		return "AShape [도형의 종류=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
	
} //AShape 
	
class Triangle extends AShape{  //삼각형넓이
		
		public Triangle(int width, int height) {
			super(width,height);
//			this.width = width;
//			this.height= height;
		}
		public double getArea() {
		return width * height /2;
		}
}
			
			
		
	class Circle extends AShape { //원의 넓이
		
		private int radius; //반지름 길이
		@Override
			public double getArea() {
			return radius*radius*3.14;
			
			}
	
		

		@Override
		public String toString() {
			return "Circle [반지름=" + radius + ", shapeName=" + shapeName + ", width=" + width + ", height=" + height
					+ "]";
		}
		public void setRadius(int radius) {
			this.radius = radius;
		}
		
		
		
	}
	
class Rectangle extends AShape{  //직사각형
	@Override
	public double getArea() {
		
		return width * height;
	}
}

	

	