import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//숫자 4개를 하나씩 입력 받기
		//ex)
//		입력1 : 사용자가 숫자 하나를 입력
//		입력2 : 사용자가 숫자 하나를 입력
//		입력3 : 사용자가 숫자 하나를 입력
//		입력4 : 사용자가 숫자 하나를 입력
		
		System.out.println("입력1 : ");
		int wr1 = sc.nextInt();
		
		System.out.println("입력2 : ");
		int wr2 = sc.nextInt();
		
		System.out.println("입력3 : ");
		int wr3 = sc.nextInt();
		
		System.out.println("입력4 : ");
		int wr4 = sc.nextInt();
	
		int total = wr1 + wr2 + wr3 + wr4;
		
		System.out.printf("%d + %d + %d + %d = %d\n", wr1, wr2, wr3, wr4, total);
		System.out.println("총합 : " + total);
	
	
	
	}
}
