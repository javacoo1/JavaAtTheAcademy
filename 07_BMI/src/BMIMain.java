import java.util.Scanner;

public class BMIMain {
	public static void main(String[] args) throws InterruptedException {
		//	BMI(체질량 지수 구하는 프로그램)
		
		// 1. 필요한 값: 키, 체중, 이름
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("키 : ");
		double hei = sc.nextDouble();
		
		System.out.print("체중 : ");
		double wei = sc.nextDouble();
		
		String res;
		
		//	계산식
			// 체중 / (신장*신장) m단위
		
		if (hei > 10) {
			//	cm로 입력했을 것
			hei /= 100;
		}
		double bmi = wei / (hei*hei);
		
		//	판정
		
			if (bmi >= 35) {
			res = "3단계 비만";
		} else if (bmi >= 30) {
			res = "2단계 비만";
		} else if (bmi >= 25) {
			res = "1단계 비만";
		} else if (bmi >= 23) {
			res = "비만 전단계";
		} else if (bmi >= 18.5) {
			res = "정상";
		} else {
			res = "저체중";
			}

			System.out.print("계산중.");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".\n\n");
			
			
		System.out.printf("BMI 지수 %.2f: \n", bmi);
		System.out.println(name + "님, 당신은 " + res + "입니다.");
		
		// 결과출력 소수점은 1~2자리 까지만.
		//	BMI 지수 :oo
		//	oo님, 당신은 oo입니다.
		System.out.println("종료하려면 아무키나");
		sc.next();

		
		
		
		
		
	}
}
