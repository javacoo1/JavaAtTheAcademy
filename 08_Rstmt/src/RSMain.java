
public class RSMain {
	public static void main(String[] args) {
		// 반복문 Repeat Stmt

		// for(초기화; 조건; 증감){ 반복될 코드 }

		for (int i = 0; i < 3; i++) {
			System.out.println("z");

			// 셍김새 비교

			// 반복 횟수가 명활하지 않으면 while
			int z = 0;
			while (z < 3) {
				System.out.println("zz");
				z++;
			}

		}

		// zzz를 콘솔에 3번 출력하세요
		for (int i1 = 0; i1 < 3; i1++) {
			System.out.println("zzz");
		}

		for (int j = 0; j < -1; j++) {
			System.out.println(111);

		}

		for (int i = 0; i < 2; i += 2) {
			System.out.println(222);
		}

		System.out.println("--------------------------");
		// 0 2 4 6
		for (int i = 0; i <= 6; i+=2) {
			System.out.print(i + "\t");
		}
		
		
		System.out.println("\n--------------------------");

		for (int i = 0; i < 7; i++) {
			if (i % 2 == 0) {
			System.out.print(i + "\t");
			}
		}
		
		System.out.println("\n--------------------------");
		
		int a = 0;
		//1~10 1+2+3+4+5+6+7+8+9+10
		for (int i = 1; i <= 10; i++) {
			a += i;
			System.out.println(a);
		}
		System.out.println("총합 : " + a);
		
		// 1+2+3+4...392
		int b = 0;
		for (int i = 1; i <=392; i++) {
			b += i;
			System.out.println("총합 : " +b);
		}		
		
		System.out.println("\n--------------------------");
		
		// 1~20 까지 다 곱하면 몇?
		long c = 1L;
		for (int i = 1; i <=20; i++) {
			c *= i;
			System.out.println(c);
		}		
		
		// 구구단 2단 출력
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 x " + i + " = " + (2*i));
		}
		
		System.out.println("\n증감--------------------------");
		// 증감식 조절 / if문
		for (int i = 0; i <= 4; i++) {
			a = i * 2 + 1;
			System.out.println("3 x " + a + " = " + (3 * a));
		}
		
		System.out.println("\nif문--------------------------");
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println("3 x " + i + " = " + (3*i));				
			} 
	
		}
		
		System.out.println("\n역순--------------------------");
		
		// 아래 딱 3개만 나오게
		for (int i = 0; i <= 2; i++) {
			a = 9 - (i*3);
			System.out.println("4 x " + a + " = " + (4 * a));
		}
		
		//감소식으로도 가능
		for (int i = 9; i >= 3 ; i-= 3) {
			System.out.printf("a x %d = %d\n", i, (i * 4));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n--------------------------");
		
		for (int x = 2; x <= 9; x++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(x + " x " + i + " = " + (x*i));
			}
			
		}
		
	}
}
