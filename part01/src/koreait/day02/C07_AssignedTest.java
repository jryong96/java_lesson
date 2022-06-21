package koreait.day02;

public class C07_AssignedTest {
	public static void main(String[] args) {
		
	
int a,b;
a=123;
b=13;
double c =10.34;
int isum;
double dsum;

isum= a+b;
dsum = a+c;

System.out.println("a+b = "+isum);
System.out.println("a+c = "+dsum);
System.out.println((int)3.98);
System.out.println("a/b = "+(a/b));
System.out.println("a%b = "+(a%b));

System.out.printf("%d/%d=%d\n",a,b,a/b);
System.out.printf("%d %% %d=%d\n",a,b,a%b);
System.out.printf("%d / %d=%.1f\n",a,b,(double)a/b);
}
}