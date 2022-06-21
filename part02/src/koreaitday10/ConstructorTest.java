package koreaitday10;

public class ConstructorTest {
public static void main(String[] args) {
	
}
}

class Product{
	int price;
	
	public Product() {
		
	}
	public Product(int price) {
		this.price = price;
		//디폴트 생성자는 동작을 안합니다.
	}
}


class Food extends Product{			//product() 디폴트 생성자 실행하므로 없으면 오류 -> Food() 디폴트 생성자 실행
		public Food(int price) {
			super(price);
		}
}

class Eletronics extends Product{ //prodcut() 디폴트 생성자 실행
		
}