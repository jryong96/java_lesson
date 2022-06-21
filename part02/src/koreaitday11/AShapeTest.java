package koreaitday11;

public class AShapeTest {
//main �޼ҵ�� Ŭ������ ������� ���ø����̼�, �߻�Ŭ������ �ϼ��� ���ø����̼ǿ��� ���ο� �߻�޼ҵ带 �߰��ϰ�;�!
	public static void main(String[] args) {
		Triangle tri = new Triangle(100,84);
		tri.shapeName = "���� �ﰢ��";
		System.out.println("tri");
		System.out.println("���� = "+tri.getArea());
		
		Circle cir = new Circle();
		cir.shapeName = "��";
		cir.setRadius(89);
		System.out.println(cir);
		System.out.println("���� = "+cir.getArea());
}

} // Ashape Test
/*
 * ���� : �޼ҵ� �������Ҷ� ����������
 * �θ� public -> �ڽ� default : ����
 * �θ� default -> �ڽ� public : ����
 */
	

abstract class AShape  {		//����
	protected String shapeName;
	protected int width; 
	protected int height;
	
	public AShape() {// AShape()�� ��ü�� ���� ������ ���ϰ� �ڽİ�ü�� ��������� ���
		System.out.println("AShape ����Ʈ ������ �����մϴ�.");
	}
	
	public AShape(int width, int height) {	//AShape() �� ��ü ������ ���� ���ϰ�, �ڽ� ��ü ��������� ����
		System.out.println("AShape Ŀ���� ������ �����մϴ�");
		this.width = width;
		this.height = height;
	}

	
	public abstract double getArea(); //������ ����
	
	//�߻� Ŭ������ �ν��Ͻ� �޼ҵ带 �����ؼ� �ڽ� Ŭ������ ������ �� �� �ִ�
	public  String explain() { //���ø����̼� �Ϸ� �� �߻�޼ҵ� �߰����� �߻��ϱ⶧���� �ν��Ͻ� �޼ҵ� �߰�
		return null;
	}

	@Override
	public String toString() {
		return "AShape [������ ����=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
	
} //AShape 
	
class Triangle extends AShape{  //�ﰢ������
		
		public Triangle(int width, int height) {
			super(width,height);
//			this.width = width;
//			this.height= height;
		}
		public double getArea() {
		return width * height /2;
		}
}
			
			
		
	class Circle extends AShape { //���� ����
		
		private int radius; //������ ����
		@Override
			public double getArea() {
			return radius*radius*3.14;
			
			}
	
		

		@Override
		public String toString() {
			return "Circle [������=" + radius + ", shapeName=" + shapeName + ", width=" + width + ", height=" + height
					+ "]";
		}
		public void setRadius(int radius) {
			this.radius = radius;
		}
		
		
		
	}
	
class Rectangle extends AShape{  //���簢��
	@Override
	public double getArea() {
		
		return width * height;
	}
}

	

	