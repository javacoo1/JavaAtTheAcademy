import java.util.Scanner;

public class Test_Calendar {
	public static void main(String[] args) {
		// 각 월이 몇일까지 있는지 알려주는 프로그램

		// 31) 1, 3, 5, 7, 8, 10, 12
		// 30) 4, 6, 9, 11
		// 28) 2

		int day = 0;

		// 입력
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();

		// 판정
		switch (mon) {
		case 1, 3, 5, 7, 8, 10, 12:
			day = 31;
			break;
		case 4, 6, 9, 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("입력 오류");
			break;
		}
		System.out.println(day + "일 까지");

		// 결과

		// +1~12 벗어난 숫자는 "입력오류"

	}
}
