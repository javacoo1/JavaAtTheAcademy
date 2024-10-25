//	함수, 기능, 메서드

//	관련있는 작업을 한데 묶어 정의해놓고 필요할 때 불러다 씀 

/*
 * 1.함수 정의
 * public static void 함수명() {
 *     호출 시 실행할 코드
 * }
 * 
 * 1) 함수의 인자(argument), 매개변수(parameter) : 함수 수행에 필요한 것들
 * public static void 함수명22(자료형 변수명, 자료형 변수명, ...(param) {
 * 		호출 당하면 여기 실행
 * }
 * 
 * 2) 위에꺼 호출
 * 함수명22(5);		여기서 숫자 5가 인자(argument) : 실제 그 값.
 * 
 *  
 */

public class FMain {
	
	public static void add(int a, int b) {
		System.out.println(a +b);
	}
	
	public static int add2(int a, int b) {
		return a+ b;
	}
	
	private static void pushUp(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("Push");
			System.out.println("Up");			
		}
	}
	
	
	public static void main(String[] args) {
		info();
		add(1, 2);
		add2(1, 2);
		System.out.println(add2(1, 2));
		int a = add2(3, 4);
		System.out.println(a);
		System.out.println("ready~");
		System.out.println("------");
			pushUp(5);		
			sport("soccer");
	}

	private static void sport(String spt) {
		//	축구, 농구
		System.out.println("공 챙겨");		

		if (spt.equals("soccer")) {
			System.out.println("축구공");
		} else if (spt.equals("baketball")) {
			System.out.println("농구공");
		}
		System.out.println("공 반납해");
	}
	
	
	// 호출하면 "배아파"를 출력해주는 메서드
	public static void info() {
		System.out.println("배아파");
	}	






}

