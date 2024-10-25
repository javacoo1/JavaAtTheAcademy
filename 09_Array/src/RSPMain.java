import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RSPMain {
	public static void main(String[] args) {
		// 가위바위보
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
			
			// 글자 치면 승률에 영향이 감. 수정 필요
			try {
				user = sc.nextInt();								
			} catch (InputMismatchException e) {
				System.out.println("please write number");
				sc.next();
				
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
			} 

			// 판정 & 결과  
			//**********user랑 com을 연산해서 더 짧게 줄이기***********
			if (user == com) {
				System.err.println("   draw");
			} else if ((com == 1 && user == 2) || (com == 2 && user == 3) || (com == 3 && user == 1)) {
				win += 1;
				winningStreak += 1;
				System.err.println("   win");
			} else if ((com == 1 && user == 3) || (com == 2 && user == 1) || (com == 3 && user == 2)) {
				//************이 if문이 굳이 여기있을 필요 없을듯. 현재 if문 위로 빼자*************
				if (winningStreak >= mostWins) {
				mostWins = winningStreak;
				}
				winningStreak = 0;
				System.err.println("   lose");
			}
			
			
			//**************에러에서 총게임수가 증가하는 문제 발생 // 범위관련 try-catch를 if로 바꾼 뒤, 거기에 count--를 하자*********
			count += 1;
			System.out.println("----------------------result");
			System.out.printf("On a winning streak %d times!\n", winningStreak);

			oow = ((double) win / count) * 100;
			System.out.printf("odds of winning : %.0f", oow);         //**********원하는 위치에 %%를 쓰면 아래 한줄 줄일 수 있을 듯*************
			System.out.println("%");
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