import java.util.Scanner;

public class Test_ChangeMoney2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산 금액: ");
		int money = sc.nextInt();
		//	137894
		
		int cnt = 0;
		if (money >= 50000) {
			cnt = money /50000;
			System.out.printf("5만원 : %d장\n", cnt);
			//이렇게 끝까지. 
		}
	}
}
