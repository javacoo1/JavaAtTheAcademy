import java.lang.reflect.Array;
import java.util.ArrayList;

public class CMain02 {
	public static void main(String[] args) {
		
		//	List 계열 : 가변 사이즈 배열		- 가장 많이 사용
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(1.1);
		al.add("니나노");
		System.out.println(al.size());
		//	자료형 상관없이 사용 가능 -> 근데 사용x
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("sleepy...0");
		al2.add("sleepy...1");
		al2.add("sleepy...2");
		System.out.println(al2.size());
		System.out.println(al2.get(2));
		
		for (String asd : al2) {
			System.out.println(asd);
		}
		System.out.println("---------------");
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		System.out.println("---------------");

		al2.add("아바바");	// 언제든 추가 가능
		al2.add(0, "gg");	// 위치 지정 기능
		al2.set(1, "i'm good");	// 수정 기능
		al2.remove(3);	// 삭제
		
		for (String ss : al2) {
			System.out.println(ss);
		}
	
		System.out.println("---------------");
		// <클래스명> : generic => 데이터 타입을 제한 하는거
								// 컴파일 단계에서 이미 오류 확인 가능
	
		//	정수 10, 20 추가하고 다 출력
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(10);
		al3.add(20);
		al3.add(10);
	
		for (Integer integ : al3) {
			System.out.println(integ);
		}
	}
}
