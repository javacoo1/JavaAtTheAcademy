import java.util.Scanner;

public class Test_Q {
	public static void main(String[] args) {
		//문제 만들기
		Scanner sc = new Scanner(System.in);
		
		//if
		System.out.println("어려워요?");
		System.out.println("가. 그렇다 \t 나. 아니다.");
		
		//가 - 조금 더 힘내세요 ^^
		//나 - 좋아요!
		
		System.out.print("대답: ");
		String answer = sc.next();
		if (answer.equals("가")) {
			System.out.println("조금 더 힘내세요 ^^");
		} else {
			System.out.println("좋아요!");
		}
		
		
		
		System.out.println("---------------------------");
		//switch
		System.out.println("재밌나요?");
		System.out.println("1. 그렇다 \t 2. 아니다.");
		
		// 1 -> good
		// 2 -> ㅠㅠ
		int ans = sc.nextInt();
		
		switch (ans) {
		case 1: System.out.println("good");
			break;
		case 2: System.out.println("ㅠㅠ");
			break;

		default:
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
