class Person {
	String name;
	int age;
	
	public Person() {
		this("jh", 25);
		System.out.println("기본 생성자 호출");
		age = 1;
	}

	public Person(String name, int age) {
		super();
		System.out.println("OverLoading Constructor");
		this.name = name;
		this.age = age;
	}
	
}


public class CallAnotherConst {
	public static void main(String[] args) {
		Person person = new Person("jh", 25);
		
		
		
	}
}
