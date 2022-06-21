package koreaitday11;

import koreaitday09a.Animal;

public class AShapeTest2 {
	//익명 클래스 : anonoymus, 이름이 없는 메소드
public static void main(String[] args) {
	
	//마름모 꼴
	//익명 내부 (inner) 클래스 정의 : 1회용 클래스 정의 ( 추상 메소드 재정의 필수)
	AShape sha = new AShape() {
		//추상메소드 재정의
		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return width + height;
		}
	};
	
	AShape sha2  = new AShape() {
		
		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return width + height;
		}
	}; 
	System.out.println("sha 넓이 = " + sha.getArea());
	System.out.println("sha 넓이 = " + sha2.getArea());
	
		
	//질문 : 추상클래스 아닐때도 메소드 재정의해서 쓰면 익명클래스 처럼 쓸 수 ㅇ있는가?
	//▽▽▽▽확인 : 가능하지만, 보토은 추상메소드 재정의하면 익명클래스를 많이 씀.
	
	Animal snake = new Animal() {
		int length;
		
		public void act() {
			setName("이구아나");
			setColor("얼룩이");
			length=3;
			System.out.println("action :기어다니기");
		}
			
			public String toString() {
				return "length = "+length;
			}
		 
	};
	snake.act();
	System.out.println(snake);
}
}
