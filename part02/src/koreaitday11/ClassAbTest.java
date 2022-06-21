package koreaitday11;

import koreaitday10.Person;

public class ClassAbTest {
public static void main(String[] args) {
	Person momo = new Person();
//	Class abs = new ClassAbs(); //오류 : ClassAbs는 추상클래스 new불가능!
	 ClassAbs abs = new ClassX();	//부모타입 참조
	 ClassX cls = new ClassX();		// 구현(자식) 클래스 타입 참조 
	 System.out.println("첫번째 실험 : test 메소드");
	 abs.test();
	 cls.test();
	 abs.name = "손흥민"; //name은 부모클래스 필드
	 cls.name="모모";	
	 abs.print(); 	//print()은 부모클래스 메소드
	 cls.print();
	 System.out.println("두번째 실험 : 자식필드 num");
	 cls.setNum(23);
	 cls.test();
	 ClassX x = (ClassX)abs; //다운캐스팅
	 x.setNum(100);
	 abs.test();
}

}
