package koreait.day07;

public class C41_StudentScore {
public static void main(String[] args) {
		Student[] stus = new Student[5];  //�迭��Ұ� 5��, students ��ü ����
		String[] names = {"�л�1","�л�2","�л�3","�л�4","�л�5"};
		stus[0] =  new Student ();
		stus[0].name = names[0];
		stus[0].no = 1;
		stus[0].grade = 3;
		
		// for������ ������ 4�� ��ü�� �����ؼ� stus �迭�� ������Ű��
		
		for(int i=1; i<stus.length; i++) {
			stus[i] = new Student();  // *** ��ü �����ؼ� ������Ű��
			stus[i].name = names[i];
			stus[i].no = i+1;
			stus[i].grade = 3;
		}
		
		
		for(int i =0; i<stus.length;  i++) {
			System.out.println(stus[i]);
		}
		// �� ������ student ��ü�� score ��ü�� �ʵ�� ������ �ϱ�. -> score ��ü 3�� �ʵ尪 �Է� ����
		for (int i=0; i<stus.length;i++) {
			System.out.println(stus[i].name+"���� >>" );
			Score temp = new Score(); //***��ü ���� Score Ŭ���� ��������
			temp.input(); // korean,english,science 3���� �ʵ尪�� �ִ� ����.
			stus[i].score = temp; // *** �߿�
//			stus[i].score.input();
			System.out.println(stus[i]);		 //Ȯ��
			/* 
			 * stus[i].score = new Score();
			 * stus[i].score.input();
			 * �� temp���̵� ����
			 */
			
		}
				System.out.println("�������");
				System.out.printf("%4s %6s %7s %7s\n","��ȣ","�̸�","����","���");
				for(int i =0; i<stus.length; i++) {
					System.out.printf("%4d %6s %7d %7.1f\n",stus[i].no,stus[i].name,stus[i].score.sum(),
							stus[i].score.average());
				}
}

}
