package koreaitday13a;
//��ü�� �ι�° �� ��� : ���� �� �ִ� Ÿ������ ����� . Comparable<user>�������̽�  ����
public class User implements Comparable<User> { // Comparable<User>
	private String name;
	private int age;
	
	public User(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	public int compareTo(User o) { //���簴ü�� age�� ���ڰ� age ��
		Integer o1 = this.age;
		Integer o2 = o.getAge();
		return o1.compareTo(o2);
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
		
	}

