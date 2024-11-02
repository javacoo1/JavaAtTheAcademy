import java.util.ArrayList;
import java.util.Comparator;

public class CMain03 {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		Student std = new Student("진현", 25, 110, 120, 130);
		System.out.println(std);
		
		students.add(std);
		students.add(new Student("승완", 28, 92, 82, 72));
		students.add(new Student("도윤", 26, 100, 100, 100));
		students.add(new Student("다훈", 27, 50, 50, 50));
		students.add(new Student("지우", 27, 90, 90, 100));
	
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
		
		System.out.println("---------------------");	
		for (Student ss : students) {
			System.out.println(ss);
		}
		System.out.println("---------------------");
		
		//	나이순 정렬
		Comparator<Student> byAge = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				Integer o1Age = o1.getAge();
				Integer o2Age = o2.getAge();
				return o1Age.compareTo(o2Age);
			}
		};	
		
		students.sort(byAge);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		
		students.sort(byAge.reversed());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	
	
	//	종합 성적순
	Comparator<Student> byEvr = new Comparator<Student>() {
		
		@Override
		public int compare(Student o1, Student o2) {
			Double o1Avg = (o1.getKor() + o1.getEng() + o1.getJp()) / 3.0;
			Double o2Avg = (o2.getKor() + o2.getEng() + o2.getJp()) / 3.0;
			return o1Avg.compareTo(o2Avg);
		}
	};
	students.add(new Student("꼴등", 20, 1, 1, 1));
	students.sort(byEvr);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	for (Student student : students) {
		System.out.println(student);
	}
	System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	
	students.sort(byEvr.reversed());
	System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	for (Student student : students) {
		System.out.println(student);
	}
	
	System.out.println("~~~~~~~1등, 꼴등~~~~~~~~");
	
	//	1등 정보 출력
	System.out.println(students.get(0));
	
	//	꼴등 정보 출력
	System.out.println(students.get(students.size()-1));
	
	
	}
}

