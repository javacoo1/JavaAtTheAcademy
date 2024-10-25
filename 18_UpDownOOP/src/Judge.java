
public class Judge {

//	private Object cnt;

	public void play(Player player, Enemy enemy) {
		int comNum = enemy.chooseN();
		System.out.println(comNum); // 개발자 확인용

		for (int turn = 0; turn <= 10; turn++) {
			System.out.printf("chellange %d times\n", turn);
			System.out.println("what will you choose from 1 to 100?");
			int playNum = player.say();
			
			Boolean isOver = result(comNum, playNum, turn);

			if (playNum < 1 || playNum > 100) {
				turn--;
				System.err.println("***RANGE OVER!(1~100)***");
				continue;
			}
			
			
			if (isOver) {
				break;
			}

		}

	}

	private boolean result(int comNum, int playNum, int turn) {

		if (comNum == playNum) {
			System.err.printf("correct! you tried %d times", turn);
			return true;
		} else if (comNum < playNum) {
			System.err.println("|	down	|");
		} else {
			System.err.println("|	up	|");
		}
		return false;

	}

}
