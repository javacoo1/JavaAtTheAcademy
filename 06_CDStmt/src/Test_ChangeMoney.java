import java.util.Scanner;

public class Test_ChangeMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 잔돈 구해주는 프로그램
		// 이렇게 입력하면
		//	137894	
		//	5만원: 2장	
		//	1만: 3장	
		//	5천: 1장	
		//	1천: 2장	
		//	500원: 1개	
		//	100원: 3개	
		//	50원: 1개	
		//	10원: 4개	
		
		//	잔돈 계산 불가금액 : 4원
		int a,b,c,d,e,f,g,h,i = 0;
		
		System.out.println("계산 금액: ");
		int money = sc.nextInt();
		//	137894

		if (money >= 50000) {
			a = money / 50000;
			money %= 50000;
			System.out.println("50000원: " + a + "장");
		}
		if ( money >= 10000) {
			b = money / 10000;
			money %= 10000;
			System.out.println("10000원: " + b + "장");
		}
		if ( money >= 5000) {
			c = money / 5000;
			money %= 5000;
			System.out.println("5000원: " + c + "장");
		}
		if ( money >= 1000) {
			d = money / 1000;
			money %= 1000;
			System.out.println("1000원: " + d + "장");
		}
		if ( money >= 500) {
			e = money / 500;
			money %= 500;
			System.out.println("500원: " + e + "장");
		}
		if ( money >= 100) {
			f = money / 100;
			money %= 100;
			System.out.println("100원: " + f + "장");
		}
		if ( money >= 50) {
			g = money / 50;
			money %= 50;
			System.out.println("50원: " + g + "장");
		}
		if ( money >= 10) {
			h = money / 10;
			money %= 10;
			System.out.println("10원: " + h + "장");
		}
	System.out.println("잔돈 계산 불가금액: " + money + "원");	
	}
}
