//	부모클래스(슈퍼클래스) - Person
//	자식클래스(서브클래스) - Teacher

//	teacher is a person : 계승
public class Teacher extends Person {
	String subject;
	
	//	재정의 (상속받은 메서드 만진거)
	@Override
	void info() {
		super.info();
		System.out.println(subject);
	}
}
