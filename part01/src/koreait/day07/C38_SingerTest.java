package koreait.day07;

public class C38_SingerTest {
public static void main(String[] args) {
	Singer twice  = new Singer();
	twice.name_eng = "Twice";
	twice.name_kor = "Ʈ���̽�";
	twice.debutYear = 2015;
	twice.genre = "kpop-GirlGroup";
	twice.members = new String[9]; // *�߿� : �迭 ���� ���ϸ� ���� 
	twice.members[0]="���";
	twice.members[1]="����";
	twice.members[2]="����";
	twice.members[3]="����";
	twice.members[4]="����";
	twice.members[5]="�糪";
	twice.members[6]="��ȿ";
	twice.members[7]="ä��";
	twice.members[8]="�̳�";
	System.out.println("Ȱ���Ⱓ: "+ twice.actYears(2022)+"��");
	
	Singer beo = new Singer();
	beo.name_eng="BE'O'";
	beo.name_kor="���";
	beo.genre="����";
	beo.printMembers();
	System.out.println(Singer.JOB + Singer.label);
	System.out.println(twice.toString());
	System.out.println(beo.toString());
	System.out.println(twice); // ��ü ���� Ÿ���� �� toString ���� 
	System.out.println(beo); // 
	
	
	

			
}
}
