import java.util.Random;
import java.util.Scanner;

public class Test_NGame2 {
	public static void main(String[] args) {
		// Number game (Up Down)
		
		// 맞추면 끝
		// @ 몇 번만에 맞췄는지? (맞췄을 때 안내하기)
		// @ 횟수제한 10회 (남은 기회 : 10..9..8..)
		// @ 예외처리 ex) 1~100 아닌 숫자는 입력오류


		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int com = ran.nextInt(100) + 1;
		int ans = 0;
//		System.out.println(com);
		
			String totalValue = "";
			String a = "";
			System.out.println("The chance given is 10 times.");
		for (int i = 1; i <= 10; i++) {
			System.out.print("Num(1~100) : ");
			ans = sc.nextInt();
			totalValue += ans + " ";
			
			//예외처리
			if (ans > 100 || ans < 1) {
				System.out.println("you have to write 1~100");
				continue;
			}
			
			
				if (ans > com) {
					System.out.println("Down");
				} else if (ans < com) {
					System.out.println("Up");			
				} else {
					System.out.printf("Correct. You got it right in %d.\n", i);
					break;
				}
				
				System.out.println("--------------");
				
				if (ans > com) {
					a = "Down";
				} else if (ans < com) {
					a = "Up";
				}
				totalValue += (a + "  |  ");
				System.out.println(totalValue);
				System.out.printf("Remaining chance: %d\n", (10 - i));
				System.out.println("--------------");
				
				if (i == 10) {
					System.out.println("Game Over...");
				}
		}
		}				
	}

