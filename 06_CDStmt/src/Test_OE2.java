import java.util.Random;
import java.util.Scanner;

public class Test_OE2 {
	public static void main(String[] args) {
		// 숫자게임

		// 입력
		Scanner sc = new Scanner(System.in);
		// 랜럼 숫자 뽑을 준비
		Random ran = new Random();

		int comNum = 0;
		int ans = 0;

		while (true) {
			comNum = ran.nextInt(10) + 1; 
			System.out.println(++comNum);

			// 사용자가 숫자 입력하기
			System.out.println("1. 홀? 2. 짝? 10.종료");
			ans = sc.nextInt();

			if (ans == 10) {
				System.out.println("게임을 종료합니다.");
				break;
			} else if (ans != 1 && ans != 2) {
				System.out.println("예외 발생");
				continue;
			}
			
			if (comNum % 2 == ans % 2) {
				System.out.println("정답");
			}  else {
				System.out.println("땡");
			}
			System.out.println("--------------");
		}

//		if (comNum % 2 == 1 && ans % 2 == 1) {
//			System.out.println("정답");
//		} else if (comNum % 2 == 1 && ans % 2 == 0) {
//			System.out.println("땡");
//		} else if (comNum % 2 == 0 && ans % 2 == 0) {
//			System.out.println("정답");
//		} else if (comNum % 2 == 0 && ans % 2 == 1) {
//			System.out.println("땡");
//		}

		// 판정
		// 맞히면 "정답"
		// 틀리면 "땡"

		// 내가 홀인데 컴터도 홀이면 -> 정답
		// 내가 홀인데 컴터가 짝이면 -> 땡
		// 내가 짝인데 컴터도 짝이면 -> 정답
		// 내가 짝인데 컴터도 홀이면 -> 땡

		// 결과출력

	}
}
