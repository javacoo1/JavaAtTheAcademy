import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CMain05 {
	public static void main(String[] args) {
		
		//	Map 계열 : HashMap : 가변사이즈, 순서 시스템x, 키-값 쌍
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("탄수화물", 10);
		hm.put("단백질", 20);
		hm.put("지방", 30);
		
		System.out.println(hm.get("탄수화물"));
		System.out.println("----------------------");
		
		//	찾고 싶은 학생이 있음
		//	찾고싶은 학생의 이름을 쓰면, 정보를 보여주세요.
		
		//	학생을 뭘로 찾을지
		
		//	1.학생 번호로 찾겠다. => list
		//	2.이름으로 찾겠다. => map
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		students.put("sw", new Student("승완", 28, 92, 82, 72));
		students.put("dy", new Student("도윤", 26, 100, 100, 100));
		students.put("dh", new Student("다훈", 27, 50, 50, 50));
		students.put("jw", new Student("지우", 27, 90, 90, 100));
		
//		System.out.println(students.get("sw").getAge());
		Scanner sc = new Scanner(System.in);
		
		//	누가 있는지 보여줘야함 (key)
		//	key 값만 추출
		Set<String> stdNames = students.keySet();
		for (String stdN : stdNames) {
			System.out.println(stdN);
		}
		
		System.out.print("누구?");
		String name = sc.next();
		
		System.out.println(students.get(name));
		
		
		
	}
}
