
public class TCMain {
	public static void main(String[] args) {

		// 형 변환(Type Castiong)
			// 그릇의 종류를 바꾸는 것
	
			// 기본 자료형
			// 정수 : int
			// 실수 : double
		
		// int랑 int 연산 : 결과는 int
		// int랑 double 연산 : 결과는 double
	
		double a = (double) 10 / 4;
		System.out.println(a);
		
		// int 21억~~ long 그것보단 큰거
		int aa = 10;
		long bb = aa;	// int -> long
		
		System.out.println(bb);
		
		int cc = (int) bb;	// long -> int
	
		double dd = cc;	//int -> double
		int ee = (int) dd;	// double -> int
		// 마우스 에러줄 형변환 가능
		// 맞는 타입으로 캐스트
		
		int b = 5;
		
		System.out.println(ee + b);
		System.out.println("----------------");
		
		// String + ? = String
		String ff = ee + "";
		System.out.println(ff);
		
		System.out.println(ff +b); // 문자10 숫자5
		
		
		
	}
}
