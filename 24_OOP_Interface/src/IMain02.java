import java.util.Scanner;

public class IMain02 {
	public static void main(String[] args) {
		
		//	콘솔 안내
		//	주문하시겠어요?
		
		//	1. 에스프레소 | 2. 카페라떼 | 3. 바닐라라떼 | 4. 프라푸치노 |
		//	5. 나가기(break;)
		//	그 외 번호 입력시 -> 메뉴가 없음
		
		//	2, 3 선택시 -> hot or iced 물어보기
		//	나머지 메뉴 선택시 메뉴명, 가격만 출력하기
		
		//	sca, wh, if, 例外処理
		
		int user;
		
		while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. エスプレッソ｜ 2.カフェラテ｜ 3.バニララテ｜ 4.フラペチーノ| 5.（高い…）");
		System.out.println("いらっしゃいませ〜、ご注文は？");
		System.out.print("注文：　");
		try {
			user = sc.nextInt();			
		} catch (Exception e) {
			System.out.println("日本語でお願いします…");
			continue;
		}
		
			if (user < 1 || user > 5) 
			{System.out.println("そういうメニューはございません…");
				continue;
			} 
			
			if (user == 1) {
				Coffee esp = new Espresso();
				esp.name();
				esp.price();
				return;
			} else if (user == 2) {
				Coffee caf = new CafeLatte();
				caf.name();
				caf.price();
				caf.hotOrIced();				
				return;
			} else if (user == 3) {
				Coffee van = new VanillaLatte();
				van.name();
				van.price();
				van.hotOrIced();
				return;
				
			} else if (user == 4) {
				Coffee fra = new Frappuccino();
				fra.name();
				fra.price();
				return;
			} else {
				System.out.println("また来ます〜");
				break;
			}
		}
	}
}
