import java.util.Iterator;
import java.util.Scanner;

public class AMain03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] aa = new int[4];

		// 입력 받기
		for (int i = 0; i < aa.length; i++) {
			System.out.printf("입력할 점수 %d : ", i + 1);
			aa[i] = sc.nextInt();
		}
		// 다 더하기
		int sum = 0;
		for (int i = 0; i < aa.length; i++) {
			sum += aa[i];
		}
		System.out.println(sum);

		sum = 0;
		for (int ele : aa) {
			sum += ele;
		}
		System.out.println(sum);

		// 결과 출력
		// 1 + 2 + 3 + 4 = 10
		System.out.printf("%d + %d + %d + %d = %d", aa[0], aa[1], aa[2], aa[3], sum);
		System.out.println("\n-----------------------");

		int sum3 = 0;
		for (int i = 0; i < aa.length; i++) {
			System.out.printf("입력할 점수 %d : ", i + 1);
			aa[i] = sc.nextInt();
			sum3 += aa[i];
		}
		System.out.println(sum3);

		
		System.out.println("now----------------------");
		// 응용
		int sum4 = 0;
		for (int i = 0; i < aa.length; i++) {
			System.out.printf("\n입력할 점수 %d : \n", i+1);
			aa[i] = sc.nextInt();

				sum4 += aa[i];
			

			for (int j = 0; j <= i; j++) {
				if (j != i) {
					System.out.printf(aa[j] + " + ");
				} else {
					System.out.printf(aa[j] + " = ");
					System.out.println(sum4);
				}
			}
		}

	}
}
