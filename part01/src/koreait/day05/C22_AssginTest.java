package koreait.day05;

public class C22_AssginTest {
	public static void main(String[] args) {
		
		int i =10, sum=0;
		i=i+1; //i=11
		i+=1;	//i=12
		i++;	//i=13
		++i;	//i=14
		
		System.out.println("i++ ?"+i++);  //����� 14 i���� 15
		System.out.println("++i ?"+(++i)); //���16 , i�� 16
		
		sum = sum+i;
		sum+=i;
		System.out.println("sum ?"+ sum);
	}

}
