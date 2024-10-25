import java.util.Random;
import java.util.Scanner;

public class RSMain4_Test {
	public static void main(String[] args) {
		//	내가 입력한게 컴 숫자랑 일치할때까지 반복
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();		
		
		int com = ran.nextInt(11);
//		System.out.println(com); // 개발자 확인용
		
		while (true) {
			System.out.println("0~10 중 뭐 : ");
			int user = sc.nextInt();
			
			if (user == com) {
				System.out.println("정답 : " + com);
				break;
			}
		}
		
		//	up & down game
		//	홀짝 게임 - 턴마다 컴 랜덤숫자를 다시 뽑
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
