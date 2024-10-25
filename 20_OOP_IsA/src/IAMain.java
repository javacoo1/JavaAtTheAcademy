
public class IAMain {
	public static void main(String[] args) {
		//	사람 = 이름, 나이 			 자기소개(정보출력기능)
			//	원호, 25
		Person person = new Person();
		person.name = "원호";
		person.age = 25;
		person.info();
		System.out.println("-------------------");
		
		//	학생 = 이름, 나이, 일본어 점	 자기소개(정보출력기능)
			//	수진, 26, 99
		Student student = new Student();
		student.name = "수진";
		student.age = 26;
		student.jpScore = 99;
		student.info();
		System.out.println("-------------------");
		
		//	선생 = 이름, 나이, 담당과목	 자기소개(정보출력기능)
			//	mz, 30, Java
		Teacher teacher = new Teacher();
		teacher.name = "mz";
		teacher.age = 30;
		teacher.subject = "Java";
		teacher.info();
		
	}
}
