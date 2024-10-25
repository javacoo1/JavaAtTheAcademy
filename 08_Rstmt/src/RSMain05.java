import java.util.Scanner;

public class RSMain05 {
	public static void main(String[] args) {

		// break : 현재 위치에서 가장 가까운 switch문 또는 반복문 탈출

		// continue : 현재 반복을 건너뛰고 증감식으로 넘어감(다음 반복 진행)

		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("-------------------");
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		aaa: for (int i = 0; i < 3; i++) {
			bbb: while (true) {
				System.out.println("정답은? ");
				ans = sc.nextInt();
				switch (ans) {
				case 1:
					System.out.println("정답");
					break;
				case 2:
					System.out.println("오답");
					break;
				case 3:
					System.out.println("종료");
					break aaa;
				default:
					break;
				}
//			if (ans == 3) {
//				System.out.println("종료합니다.");
//				break;
			}
		}
	}
}
