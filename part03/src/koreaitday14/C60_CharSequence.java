package koreaitday14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class C60_CharSequence {

	//CharSequence �������̽��� ����ü : String,StringBuffer,StringBuilder...
	public static void main(String[] args) {
		
		String result = new String();	//result = "test";  result  = new String("test");
		System.out.println("�ʱ� result : " + result); // ""
		System.out.println("1. String Ÿ�� �׽�Ʈ");
		for(int i=2; i<6; i++) {
			//���ڿ� ������ �ٲ�� ���ڿ� ��ü ��ġ�� �޶����ϴ�.
			result +=i +"/";  // result = result+(i+"/")
			System.out.println("result " + result);
		}
		StringBuffer sb = new StringBuffer();
		System.out.println("2. StringBuffer�׽�Ʈ");
		for(int i=2; i<6; i++) {
			//StringBuffer ��ü�� ���ڿ� ��ü������ �ٲ� ���� ��ü�� �߰��Ǵ� ������ �մϴ�.
			//�ݺ��Ǵ� ���� ������ ������� String? StringBuffer ���� ȿ����? -> StringBuffer
			sb.append(i).append(":");
			System.out.println("sb : "+sb);
			
		}
		//CharSequence �������̽��� ���
		String sample = "abc2/3/4/5/xyz";
		System.out.println("3. contains�޼ҵ� Ȯ�� ");
		System.out.println("sample.contains(result) : "+sample.contains(result) );//true
		System.out.println("sample.contains(sb) : "+sample.contains(sb));//false
		//�޼ҵ��� ���� �Ǵ� �ٸ� ���� ���ĵ��� Ȯ���� �� : 1)Ŭ���� or �������̽�  2)�������̽��϶� ����ü�� �����ΰ�?
		
		//���� : ArrayList ������ ��  => List �������̽� Ÿ������  
		//HashMap ����� : Map �������̽� Ÿ������  
		List<String> names = new ArrayList<>();
		names = new  Vector<>();
		Map<String, Integer> map = new HashMap<>();
		map = new TreeMap<String, Integer> ();
		
	}
}
