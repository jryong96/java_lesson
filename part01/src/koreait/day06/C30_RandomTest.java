package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
	//���� �߻��ϴ� Random Ŭ������ �޼ҵ带 �׽�Ʈ
public static void main(String[] args) {
	Random r = new Random(); //RandomŬ������ ��ü�� ���� (new����) r�� ������ ����(�ּ�)
	System.out.println("1. ���� ������ 10�� ���");
	for(int i = 0; i<10; i++) {
		int inum = r.nextInt(); //int ���������� ������ ���� ��� (��������)
		System.out.println(inum);
		
	}
	System.out.println("1. ������ ������ 10�� ��� : bound(���)�� ����");
	for(int i =0; i<10; i++) {
		int inum=r.nextInt(100);  //    0<=���� < 100 ������ �������� ���� �ش��ڵ�� 0~99���� ���� ����
		System.out.println(inum);
	}// �ٿ�尪�� ����� ����
	
	//ex ) 1���� 100 ������ ������ �����غ���
	
	System.out.println("3.Ư�������� ������ 10�� ��� - bound�� �̿��� ����");
	for(int i =0; i<10; i++) {
		int inum=r.nextInt(100)+1;
		System.out.println(inum);
	}
	
	//n���� ũ�ų� ���� m���� ���� ������ ����(n<=����<m : r.nextInt(m-n+1)+n  
	
	System.out.println("4. 2~46�� ������ ���� 10�� �����ϱ�");
	for(int i =0; i<10; i++) {
		int inum=r.nextInt(46-2+1)+2;
		System.out.println(inum);
	}



}
}
