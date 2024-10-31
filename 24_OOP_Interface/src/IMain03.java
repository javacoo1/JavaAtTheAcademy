import java.util.Scanner;

public class IMain03 {
	public static void main(String[] args) {

		// 콘솔 안내
		// 주문하시겠어요??
		
		// 1. 에스프레소  2. 카페라떼  3. 바닐라라떼  4. 프라푸치노
		// 5. 돈이 모자라요.. -> 그럼 나가 (break;)
		// 그 외 번호 입력시 -> 메뉴에 없네요 
		
		// 2,3 선택시 -> hot or iced 물어보기
		// 나머지 메뉴 선택시 메뉴명,가격만 출력해주기.
		
		// sca, wh, if, 예외처리
		
		
		int pick = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("주문하시겠어요?");
				System.out.println("1. 에스프레소  2. 카페라떼\n3. 바닐라라떼  4. 프라푸치노\n5. 돈이 모자라요..");
				pick = sc.nextInt();

				System.out.println();

				Coffee cof = null;
				
				if (pick < 1 || pick > 5) {
					System.out.println("메뉴에 없네요.");
					continue;
				}
				if (pick == 1) {
					cof = new Espresso();
				} else if (pick == 2) {
					cof = new CafeLatte();
					cof.hotOrIced();
				} else if (pick == 3) {
					cof = new VanillaLatte();
					cof.hotOrIced();
				} else if (pick == 4) {
					cof = new Frappuccino();
				} else if (pick == 5) {
					System.out.println("그럼 나가");
					break;
				}
				cof.name();
				cof.price();
				cof.hotOrIced();
				System.out.println();
			} catch (Exception e) {
				sc.next();
				System.err.println("문자입력오류");
			}
		}
	}
}