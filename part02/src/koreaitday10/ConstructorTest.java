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
		//����Ʈ �����ڴ� ������ ���մϴ�.
	}
}


class Food extends Product{			//product() ����Ʈ ������ �����ϹǷ� ������ ���� -> Food() ����Ʈ ������ ����
		public Food(int price) {
			super(price);
		}
}

class Eletronics extends Product{ //prodcut() ����Ʈ ������ ����
		
}