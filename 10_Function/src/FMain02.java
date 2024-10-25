import java.util.Scanner;

public class FMain02 {

	//	월급을 넣으면 연봉을 구해서 "출력" 해주는 함수
		public static void getSalary(int monthly) {
		System.out.println("연봉 : " + monthly * 12 + "만원");
		}
	
	
	//	월급을 넣으면 연봉을 "구해주는" 함수
		public static int getSalary2(int monthly) {
		return monthly * 12;	
		}
	
	//	상품의 가격을 넣으면 부가세를 구해주는 메서드
		public static int getSurtex(int price) {
			return price / 10;
		}
		
	//	상품 가격을 넣으면 부가세를 "출력" 해주는 메서드
		public static void getSurtex2(int price) {
			System.out.println("부가세 : " + (price / 10) + "원");
		}
		
		
	//	숫자 2개를 넣으면 더 큰 수를 구해주는 메서드
		public static int bigger(int num1, int num2) {
//			if (num1 > num2) {
//				return num1;
//			}
//			else {
//				return num2;				
//			}	// return 특징 때문에 else 필요없음
			return num1 > num2 ? num1 : num2;
		}
		
		//	Test (위에 최대한 참고하지 말고)
		//	메서드(기능) 만들고 main에서 호출해서 사용까지
		
		//	1. 중간, 기말 점수를 입력하면 평균 점수를 구해주는 함수
		//	(Scanner로 중간, 기말 입력받아 처리)
		public static int avg(int mid, int fin) {
			return (mid + fin) / 2;
		}
		
		//	2. 나이를 넣으면 인사말을 "출력" 해주는 함수 (sca 입력받아 처리)
			//	10대 : 안녕
			//	20대 : 안녕하세요
			//	30대 : 안녕하십니까!
		public static void hello(int age) {
			if (age >= 30 && age < 40) {
				System.out.println("안녕하십니까!");
			} else if (age >= 20 && age < 30) {
				System.out.println("안녕하세요.");				
			} else if (age >= 10 && age < 20) {
				System.out.println("안녕.");							
			} else {
				System.err.println("입력 오류");
			}
		}
		
		//	3. 숫자 2개를 넣으면 더 큰 수를 구해주는 함수
		//	(비교할 숫자 1,2를 각각 입력받아 처리)
		
		public static int getBigger2(int a, int b) {
			return a > b ? a : b;
		}
		
		
	
	public static void main(String[] args) {
		getSalary(500);
		int aa = getSalary2(250);
		System.out.println(aa);
	
		System.out.println("부가세 :" + getSurtex(10000) + "원");
		getSurtex2(10000);
		
		int result = bigger(100, 150);
		System.out.printf("%d is more big", result);
		
		System.out.println("---------------------------");
		Scanner sc = new Scanner(System.in);
		
		//	1.
		System.out.println("mid term score : ");
		int mid = sc.nextInt();
		System.out.println("final score : ");
		int fin = sc.nextInt();
		System.out.printf("the average is %d\n", avg(mid, fin));
		
		//	2.
		System.out.println("please enter your age : ");
		int age = sc.nextInt();
		hello(age);
		
		//	3.
		System.out.println("compare num1 : ");
		int a = sc.nextInt();
		System.out.println("compare num2 : ");
		int b = sc.nextInt();
		System.out.printf("%d is more big\n", getBigger2(a, b));
	}
}
