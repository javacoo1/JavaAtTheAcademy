import java.util.Scanner;

public class RSMain05_test {
	public static void main(String[] args) {
		//	lable x
		
		/*
		 * 1.상품등록 2.상품검색 3.상품삭제 4.종료
		 * 
		 * 몇 번? (사용자가 입력)
		 * 
		 * 1번 입력 - '등록합니다.' 출력 / 2번 입력 - '검색합니다.' / 3번 입력 - '삭제합니다.' / 4번 입력 - 종료
		 * 그 외 번호 입력하면 '입력오류'
		 */
		//sca, cd, rs
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("1.상품등록 | 2.상품검색 | 3.상품삭제 | 4.종료");
			System.out.println("입력쿠다사이(1~4): ");
			int userAns = sc.nextInt();
			switch (userAns) {
			case 1:
				System.out.println("등록합니다.");
				break;
			case 2:
				System.out.println("검색합니다.");
				break;
			case 3:
				System.out.println("삭제합니다.");
				break;
			case 4:
				System.out.println("종료합니다.");
				break;

			default:
				System.err.println("입력 오류");
				break;
			}
			if (userAns == 4) {
				break;
			}
		}
		
		
		
		
		
		
		
	}
}
