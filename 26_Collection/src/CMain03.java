import java.util.ArrayList;

public class CMain03 {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		Student std = new Student("진현", 25, 110, 120, 130);
		System.out.println(std);
		
		students.add(std);
		students.add(new Student("승완", 28, 92, 82, 72));
		students.add(new Student("도윤", 26, 100, 100, 100));
		students.add(new Student("다훈", 27, 50, 50, 50));
		students.add(new Student("지우", 28, 90, 90, 100));
	
		// 학생수
		System.out.println(students.size());
		
		// 첫번째 학생의 국어점수
		System.out.println(students.get(0).getKor());
		
		// 두 번째 학생의 이름
		System.out.println(students.get(1).getName());
		
		
		// 세 번째 학생의 일본어 점수
		System.out.println(students.get(2).getJp());
		
		
		// 네 번째 학생의 이름과 나이
		Student st = students.get(3);
		System.out.println(st.getName() + ", " + st.getAge());
		
		
		// 다섯번째 학생의 국, 영,일 평균점수
		Student st5 = students.get(4);
		double avg = (st5.getKor() + st5.getEng() + st5.getJp()) / 3;
		System.out.println(avg);
	
	}
}
