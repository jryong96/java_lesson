package koreaitday11;

import koreaitday09a.Animal;

public class AShapeTest2 {
	//�͸� Ŭ���� : anonoymus, �̸��� ���� �޼ҵ�
public static void main(String[] args) {
	
	//������ ��
	//�͸� ���� (inner) Ŭ���� ���� : 1ȸ�� Ŭ���� ���� ( �߻� �޼ҵ� ������ �ʼ�)
	AShape sha = new AShape() {
		//�߻�޼ҵ� ������
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
	System.out.println("sha ���� = " + sha.getArea());
	System.out.println("sha ���� = " + sha2.getArea());
	
		
	//���� : �߻�Ŭ���� �ƴҶ��� �޼ҵ� �������ؼ� ���� �͸�Ŭ���� ó�� �� �� ���ִ°�?
	//�����Ȯ�� : ����������, ������ �߻�޼ҵ� �������ϸ� �͸�Ŭ������ ���� ��.
	
	Animal snake = new Animal() {
		int length;
		
		public void act() {
			setName("�̱��Ƴ�");
			setColor("�����");
			length=3;
			System.out.println("action :���ٴϱ�");
		}
			
			public String toString() {
				return "length = "+length;
			}
		 
	};
	snake.act();
	System.out.println(snake);
}
}
