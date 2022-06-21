package Koreait.dayb;

import java.util.Random;

public class GameValue {
		
		private String gamer;		//���������� �̸�
		private int count; 			//���̸� �õ�Ƚ��, �ʱⰪ 0
		private boolean isSuccess;	//���߱� �������� , �ʱⰪ false
		
		
		//Ŀ���� ������ : gamer �ʱⰪ ����
		public GameValue(String gamer) {
				this.gamer=gamer;
		}
		
		//�ν��Ͻ� �޼ҵ�
		public void print() {
			System.out.println("gamer : " + gamer + ", �õ�Ƚ�� : " + count + ",���� : " + isSuccess);
		}
		
		//static - ��ü�� �ν��Ͻ� �ʵ尪�� ������� �ʴ� ���. ��, ��ü�� ������� �޼ҵ� ����.
		public static int makeNumber(int min, int max) {	//101~299 : ������ �ּҰ�,�ִ밪 ���ڷ� �ް� ���� ��ȯ
			Random r = new Random();
			return r.nextInt(max-min+1)+min;    //r.nextInt(199)+101;  -> 0~198 + 101
		}// ���� : r.nextInt(100) ��  0~99 ������ ����


		//getter �� setter 
		public GameValue setGamer(String gamer) {
			this.gamer = gamer;
		}
		
		
}
