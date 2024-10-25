import java.util.Random;
import java.util.Scanner;

public class Test_NGame {
	public static void main(String[] args) {
		// Number game (Up Down)
		
		//입력, 랜덤
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		// 컴퓨터 숫자 뽑기
		int corr = ran.nextInt(100) + 1;
		System.out.println(corr);
		
		// 유저 입력 받기
		System.out.print("Num(1~100) : ");
		int ans = sc.nextInt();
		
		// 판정
			//결과에 따라 "정답", "업", "다운"
		for (int i =0; i < 10; i++) {
		if (ans > corr) {
			System.out.println("Down");
			return;
		} else if (ans < corr) {
			System.out.println("Up");			
			return;
		} else {
			System.out.println("Correct");
		}
	}
		
		
		
		
		
		
		
		
		
	}
}
