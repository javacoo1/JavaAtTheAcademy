import java.util.Scanner;

public class Variable04 {
	public static void main(String[] args) {

		// 키보드 입력받을 준비
		Scanner scanner = new Scanner(System.in);

		// 이름 입력 받기
		System.out.println("이름을 입력해주세요.");
		String name = scanner.next();

		// 나이 입력 받기
		System.out.println("나이를 입력해주세요.");
		int age = scanner.nextInt();
		
		System.out.println(name + "님, 당신은 " + age + "살입니다.");
	}
}
