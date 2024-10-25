import java.util.Scanner;

public class CDMain05_Switch_case {
	public static void main(String[] args) {
		// if(참) else(거짓) -> 삼항연산자
		// switch case -> if

		// jr / 야마노테센 / 다른거
		String line = "jr";

		switch (line) {
		case "jr":
			System.out.println("No.1 플랫폼");
			break;
		case "야마노테센":
			System.out.println("No.2 플랫폼");
			break;
		case "다른거":
			System.out.println("No.3 플랫폼");
			break;

		default:
			break;
		}

		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------");
		System.out.println("몇번 메뉴? (1~4)");
		System.out.println("1. 밥");
		System.out.println("2. 빵");
		System.out.println("3. 면");
		System.out.println("4. 굶");
		System.out.print("뭐먹?");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("비빔밥");
			break;
		case 2:
			System.out.println("에그타르트");
			break;
		case 3:
			System.out.println("우육탕면");
			break;
		case 4:
			System.out.println("굶어");
			break;

		default:
			break;
		}

		System.out.println("------------------");
		// 이병(1), 일병(2), 상병(3), 병장(4)

		// 이병 : 눈치, 부르면 튀어가기, 훈련, 잠
		// 일병 : 부르면 튀어가기, 훈련, 잠
		// 상병 : 훈련, 잠
		// 병장 : 잠
		String grade = "이병";

//		System.out.println("눈치");
//		System.out.println("부르면 튀어가기");
//		System.out.println("훈련");
//		System.out.println("잠");

		// 문자열 비교 ( == 말고 다른거)
		if (grade.equals("이병")) {
			System.out.println("눈치");
			System.out.println("부르면 튀어가기");
			System.out.println("훈련");
			System.out.println("잠");
		} else if (grade.equals("일병")) {
			System.out.println("부르면 튀어가기");
			System.out.println("훈련");
			System.out.println("잠");
		} else if (grade.equals("상병")) {
			System.out.println("훈련");
			System.out.println("잠");
		} else if (grade.equals("병장")) {
			System.out.println("잠");
		}

		System.out.println("-------------------------");

		switch (grade) {
		case "이병":
			System.out.println("눈치");
		case "일병":
			System.out.println("부르면 튀어가기");
		case "상병":
			System.out.println("훈련");
		case "병장":
			System.out.println("잠");

		default:
			break;
		}

		System.out.println("-------------------------");
		// 1~9살 업어주기
		// 20대 술마시기
		// 30대 일열심히
		System.out.println("몇살?");
		int age = sc.nextInt();

		if (age >= 30) {
			System.out.println("일열심히");
		} else if (age >= 20) {
			System.out.println("술마시기");
		} else if (age > 0 && age < 10) {
			System.out.println("업어주기");
		}

		System.out.println("-------------------------");
		System.out.println("몇살?");
		int age2 = sc.nextInt();

		
		
		
		
		
		
		

	}
}
