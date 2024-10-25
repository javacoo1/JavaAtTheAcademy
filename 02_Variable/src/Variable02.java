
public class Variable02 {
	public static void main(String[] args) {
		System.out.println("sasa");
		/*
        
		기본형(primitive type) 변수
		정수형 : byte, short, int, long
		실수형 : float, double
		문자형 : char
		논리형 : boolean

		메모리 공간중 stack 영역에 실제 데이터가 저장
		stack 영역 데이터들은 프로그램 종료시 자동처리됨

		참조형(reference type) 변수
		객체의 참조 값을 나타내는 자료형
		문자열 : String
		실제 값은 heap영역에, stack에는 값이 있는 heap영역의
		번지수가 저장
		heap 영역은 수동으로 정리 해줘야됨 (C언어 등)
		자바는 자동처리됨 => GC (Garbage Collection)

		1.1 정수형 (소수점 없는 숫자)
		byte 127까지, short 32222까지, int 21억 .., long
		보통 int(default)

		*/

		long a = 21000000000L;
		
		//1.2 실수형(소수점 있는 숫자)
		// 보통 double(default)
		double eyeSight = 1.5;
		float eyeSight2 = 1.5F;
		
		double weight = 60.66;
		
		//1.3 문자형(한글)
		char gender = '남';

		//1.4 논리형(참/거짓) true, false
		boolean soldOut = false;
		System.out.println(soldOut);
		
		
		int b = 10;
		int c = 20;
		
		int d, e, f;
		d = 30;
		e = 40;
		f = 50;
		

		boolean judge = b < c;
		System.out.println(judge);
		
		
		// 3.아무것도 없다  void
		
		
		
	}
}
