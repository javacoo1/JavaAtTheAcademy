
public class OCMain {
	public static void main(String[] args) {
		
		//	사람
		//	이름, 나이

		Person person1 = new Person();
		System.out.println(person1.name);
		System.out.println(person1.age);
		
		Person person2 = new Person("jh", 20);
		System.out.println(person2.name);
		System.out.println(person2.age);
		
		//	생성자 why?
		// - 값을 초기화 하는 경우 사용
		
		
	}
}
