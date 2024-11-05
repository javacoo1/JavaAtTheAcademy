import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RSPMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		String[] handTbl = { "", "scissors", "rock", "paper" };

		int com = 0;
		int user = 0;
		int win = 0;
		int winningStreak = 0;
		int count = 0;
		double oow = 0;
		int mostWins = 0;
		
		while (true) {
			com = ran.nextInt(3) + 1;
			System.out.println(handTbl[com]);

			System.out.println("------------");
			System.out.println("1. scissors");
			System.out.println("2. rock");
			System.out.println("3. paper");
			System.out.println("4. End");
			System.out.println("------------");
			System.out.print("please pick : ");
			
			try {
				user = sc.nextInt();								
			} catch (InputMismatchException e) {
				System.out.println("please write number");
				sc.next();
				count -= 1;		//***
				
			}
			
			if (user == 4) {
				System.out.println("-------------Game End");
				break;
			}

			System.out.println("------------result");

			try {
				System.out.printf("computer : %s\n", handTbl[com]);
				System.out.printf("you      : %s\n", handTbl[user]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("please pick from 1 to 4");
				count -= 1;		//***
			} 

			// 판정 & 결과  
			int result = com - user;		//***
			if (result == 0) {
				System.err.println("   draw");
			} else if (result == 2 || result == -1) {
				win += 1;
				winningStreak += 1;
				System.err.println("   win");
			} else if (result == 1 || result == -2) {
				if (winningStreak >= mostWins) {
				mostWins = winningStreak;
				}
				winningStreak = 0;
				System.err.println("   lose");
			}
			
			count += 1;
			System.out.println("----------------------result");
			System.out.printf("On a winning streak %d times!\n", winningStreak);

			oow = ((double) win / count) * 100;
			System.out.printf("odds of winning : %.0f%%\n", oow);
			System.out.println("----------------------result");
		}
		
		System.out.printf("Most consecutive wins : %d\n", mostWins);
		System.out.println("----------------------Game End");
	}
}

// 나 : oo            O
// 컴 : oo            O
// 승 / 패 / 무승부     O
// @ x 연승중!         O

// 게임반복             O
// 예외처리             O x
// 몇 번 이겼나? - 종료시 총 이긴 횟수 안내   O
// @ + 최다 연승        O(win)          O

// @ 연승              O
// @ 최다 연승 횟수 안내  O
// (연승과 최다연승은 다름. 2번 이겼다가 지면 연승은 깨지는 거고
// 4번 연승한 적이 있다가 지고 2번 연승하고 게임을 종료하면 최다연승은 4)

// @ 현재 나의 승률 = (이긴거 / 전체 게임수) * 100     O