/*	오버로딩
 *	메서드의 이름이 같은데,
 *	파라미터의 개수나 타입이 다름
 */	
public class Calc {

	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public static void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
	
	public static void add(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void add(double a, double b, double c) {
		System.out.println(a + b + c);
	}
	
	//	몇개를 넣든 다 더해주는 기능
	public static void add_free(double ...a) {
		System.out.println(a);
		double sum = 0;
		for (double d : a) {
			sum += d;
		}
		System.out.println("sum : " + sum);
	}
	
	
	
	
}