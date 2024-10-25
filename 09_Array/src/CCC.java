import java.util.Random;
import java.util.Scanner;

public class CCC {
	public static void main(String[] args) {
		// 참참참
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		String faceTbl[] = { "left", "right", "up", "down", "hold" };
		
		int count = 0;
		int com = 0;	
		int user = 0;
		
		while (true) {
		com = ran.nextInt(5) + 1;
//		System.out.println(com);
		System.out.println("-----------------");
		System.out.println("|1. left\t|");
		System.out.println("|2. right\t|");
		System.out.println("|3. up\t\t|");
		System.out.println("|4. down\t|");
		System.out.println("|5. hold\t|");
		System.out.println("-----------------");
		System.out.print("where : ");
		user = sc.nextInt();
		
		if (user < 1 || user > 5) {
			System.err.println("!Boundary Error!");
			continue;
		}
		
		System.out.printf("You : %s\n", faceTbl[user - 1]);
		System.out.printf("Com : %s\n", faceTbl[com - 1]);
		
		if (user == com) {
			System.err.print("****fail****\n");
			System.out.printf("you success %d times\n", count);
			break;
		} else {
			System.err.println("***success***");			
			count++;
		}

		
		
		
		
		}
		
		//	판정
		// 맞추면 짐(game over)
		// 피하면 이김
		//	맟추면 "걸림"
		//	피하면 "피함"
		
		//	결과
			//	나 : 왼쪽
			//	컴 : 위
		
		
		//	예외처리(입력오류)
			// 	@ 몇 번 버텼냐
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
