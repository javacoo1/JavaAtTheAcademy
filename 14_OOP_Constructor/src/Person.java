
public class Person {
	
	String name;
	int age;

	//	기본 생성자 = 클래스 이름이랑 똑같이 생긴 메서드
	//	생성자를 전혀 안건드리면 자동으로 만들어줌
	//	오버로딩 생성자 만들었으면, 자동으로 안만들어줌
	
	//	안보여도 있는 것과 같음. 근데 "borning", 이름 등을 세팅해야되니까 가시화 시킨거
	
	public Person() {
	//	주의사항 : Spring.. 등 자바 객체 자동으로 만들어주는 등 일할때
		//	기본 생성자를 사용함. 이때, 오버로딩을 사용하는데, 이 기본 생성자를 빼면 에러.
		//	java상 문제 없지만 다른 프로그램 도움 받는 이슈 때문에 만드는걸 습관화.
		System.out.println("borning");
		name = "mz";
		age = 22;
	}
	
	//	오버로딩 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
}
