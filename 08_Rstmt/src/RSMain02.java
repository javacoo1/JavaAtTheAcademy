import java.util.Random;

public class RSMain02 {
	public static void main(String[] args) {
		// 무한루프
		
//		for (int i = 0; true; i++) {
//			System.out.println(i);
//		}
		
//		for (;;) {
//			System.out.println("test");
//		}
		
		for (int i = 0; i < 3;) {
			System.out.println(i);
			i++;
		}
		
//		while (true) {
//			System.out.println("와일와일");
//		}
		
		int z = 0;
		for ( ; ; ) {
			System.out.println("for문 무한루프" + z);
			z++;
			if(z == 101) {
			break;
			}
		}
		
		
		
		// 랜덤 하고싶은데 실패함
		Random ran = new Random(5);
		
		int x = 0;
		while (true) {
			System.out.println("While문 무한루프 : " + ran.nextInt());
//			x++;
			if (ran.nextInt() >= 3) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
