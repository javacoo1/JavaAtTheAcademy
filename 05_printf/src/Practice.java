import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		// 값을 입력받아서 처리하기
		// 3개
		
		// 입력받을 준비
		String a = "jh";
		int b = 25;
		String c = "종로";
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력세요");
		String name = sc.next();
		
		System.out.println("나이를 입력세요");
		int age = sc.nextInt();

		System.out.println("사는곳을 입력세요");
		String reg = sc.next();
		
		System.out.printf("*******************\r* 이름\t: %s\t  *\r* 나이\t: %d\t  *\r* 사는곳\t: %s\t  *\r*******************", name,age,reg);
	
		
		
		
		
		
		
		
		
	}
}
