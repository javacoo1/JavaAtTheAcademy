import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;

public class CMain04 {
	public static void main(String[] args) {

		// List 계열 - ArrayList : 가변 사이즈 배열
		// Set 계열 - HashSet : 가변 사이즈, 중복 자동제거, 순서 랜덤

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		System.out.println(hs.size());

		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		System.out.println("*******************");
		//	hashSet -> ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>(hs);
		//	섞기.
		Collections.shuffle(list);
		for (Integer el : list) {
			System.out.println(el);
		}
		
		
		System.out.println(hs.size()); // 중복제거
		System.out.println("------------------");

		for (Integer integer : hs) {
			System.out.println(integer); // 순서 랜덤
		}

		System.out.println("------------------");

		// 사용하려면 set -> list 사용
		ArrayList<Integer> hsToArr = new ArrayList<Integer>(hs);
		System.out.println(hsToArr.get(0));

		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student("승완", 28, 92, 82, 72));
		students.add(new Student("도윤", 26, 100, 100, 100));
		students.add(new Student("다훈", 27, 50, 50, 50));
		students.add(new Student("지우", 27, 90, 90, 100));
		students.add(new Student("지우", 27, 90, 90, 100));
		System.out.println(students.size());

		Student ss = new Student("승완", 28, 92, 82, 72);
		students.add(ss);
		students.add(ss);
		students.add(ss);
		students.add(ss);
		System.out.println(students.size());

		for (Student sss : students) {
			System.out.println(sss);
		}

		System.out.println();
		System.out.println("------------------");
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<Integer>();

		while (true) {
			lotto.add(r.nextInt(45) + 1);
			if (lotto.size() == 6) {
				break;
			}
		}
		
		for (Integer i : lotto) {
			System.out.print(i + "  ");
		}

	}
}
