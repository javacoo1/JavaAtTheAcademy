
public class Programmer {

	String name;
	int age;
	boolean nightWork;
	
	public Programmer() {
		
	}
	
	public Programmer(String name, int age, boolean nightWork) {
		this.name = name;
		this.age = age;
		this.nightWork = nightWork;
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("야근 : %s\n", nightWork);
	}
	
	void work() {
		System.out.println("ㅋㅋ..");
	}
	
	String work(String w) {
		if (w.equals("일")) {
			return "개발하기";
		} else if (w.equals("퇴근")) {
			return "ㄱㅅ";
		}
		return "퇴직";
	}
	
	
	
	
	
	
	
	
}
