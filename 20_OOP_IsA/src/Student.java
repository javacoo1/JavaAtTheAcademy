
//	student is a person : 계승
public class Student extends Person {
	int jpScore;
	
	@Override
	void info() {
		super.info();
		System.out.println(jpScore);
		
	}
	
}
