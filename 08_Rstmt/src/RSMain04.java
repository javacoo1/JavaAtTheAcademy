import java.util.Scanner;

public class RSMain04 {
	public static void main(String[] args) {
		//1+2+3+4+5+6+7+8+9+10
		int a = 0;
		for (int i = 0; i < 11; i++) {
			a += i;
		}
		System.out.println("총합 : " + a);
	
		System.out.println("---------------------");

		//	for(반복횟수)
		//	while(반복조건)
	
		// 1+2+3+4+5 ... 몇까지 더해야 5000이 넘나요?
		int i = 0;
		int b = 0;
		while (b < 5000) {	//여기만 바꾸면 해결됨
		//	System.out.println(i);
			b += ++i;
		}

		System.out.println("숫자 : " + i);
		System.out.println("총합 : " + b);
		
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		//입력
		//0을 넣으면 stop
		int d = 1;
		
		while (d != 0) {
			System.out.println("d : ");
			d = sc.nextInt();
		}
		System.out.println("게임이 종료되었습니다.");
		System.out.println("-------------------");
		
		int e = 0;
		while (true) {
			System.out.println("e : ");
			e = sc.nextInt();
			if (e == 0) {
			break;
			}
		}
		System.out.println("게임이 종료되었습니다.");
		System.out.println("-------------------");
	
		//	aaa에 10이 들어가면 stop	(10은 종료기능임을 가정)
		
		int aaa = 0;
		while (true) {
			System.out.println("1~10 중, 번호를 입력해주세요.");
			aaa = sc.nextInt();
			if (aaa == 10) {
				System.out.println("게임 종료.");
				break;
			}
		}
	
		System.out.println("-------------------");
		// 몇까지 더해야 500이 넘나?
		
		int sum = 0;
		int pl = 0;
		while (sum < 500) {
			sum += ++pl;
		}
		System.out.println("답 : " + pl);		
		System.out.println("-------------------");
		//	do-while
		//	조건 여부와 상관없이 한번은 실행 보장
		
		int kk = 0;
		int ll = 0;
		
		do {
			kk++;
			ll+=2;
		} while (kk < -100);
		
		System.out.println(kk);
		System.out.println(ll);
	
	
	
	
	
	
	
	
	
	}
}
