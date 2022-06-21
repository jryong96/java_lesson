package koreait.day02;

public class C09_Character {
public static void main(String[] args) {
char c1 = 'a';
char c2 = 97;
System.out.println("c1 = "+c1);
System.out.println("c2 = "+c2);
System.out.printf("c1=%d\n",(int)c1);
System.out.printf("c1=%d\n",(int)c2);

c1=(char)(c1+1);
System.out.println(c1);

//한글 문자 테스트 :한글은 10진수값으로 44032~55203 ,  16진수로는 ac00~d7a3
char h1 = '가';
char h2 = 44032;
char h3 = '\uac00'; // \\u는 16진수유니코드 , ac00은 16진수 값
System.out.println("h1 = "+h1);
System.out.println("h2 ="+h2);
System.out.println("h3 = "+h3);
System.out.printf("h1=%d\n",(int)h1);
System.out.printf("h2=%d\n",(int)h2);
System.out.printf("h3=%d\n",(int)h3);
h1++;
System.out.println("h1 = "+h1);
h1++;
System.out.println("h2 = "+h1);

//한글의 마지막 문자
char h4 = 55203;
char h5 = '\ud7a3';
System.out.println("h4 = "+h4);
System.out.println("h5 = "+h5);
h5--;
System.out.println("h5 = "+h5);
}
}
