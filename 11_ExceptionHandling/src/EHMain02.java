import java.util.InputMismatchException;
import java.util.Scanner;

public class EHMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 0;
		int y = 0;
		
		try {
			System.out.print("x : ");
			x = sc.nextInt();
			System.out.print("y : ");
			y = sc.nextInt();
			System.out.println(x / y);			
			int[] ar = {10, 20};
			System.out.print("배열 몇번?(0, 1) : ");
			int i = sc.nextInt();			
			System.out.printf("%d 번째", ar[i]);				
		} catch (Exception e) {
			System.out.println("오류오류");
		}
		
		
//		try {
//			System.out.print("x : ");
//			x = sc.nextInt();
//			System.out.print("y : ");
//			y = sc.nextInt();
//			System.out.println(x / y);			
//			int[] ar = {10, 20};
//			System.out.print("배열 몇번?(0, 1) : ");
//			int i = sc.nextInt();			
//			System.out.printf("%d 번째", ar[i]);				
//		
//		} catch (ArithmeticException e) {
//			System.out.println("그렇게 길지 않아.");
////			e.printStackTrace();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("0 넣지 말라고 했지.");
//		} catch (InputMismatchException e) {
//			System.out.println("그건 숫자가 아니야.");
//		}
//		}
		
		
		
		
//		System.out.print("x : ");
//		int x = sc.nextInt();
//		System.out.print("y : ");
//		int y = sc.nextInt();
//		
//		try {
//			System.out.println(x / y);			
//		} catch (Exception e) {
//			System.out.println("0 넣지 말라고 했지.");
////			e.printStackTrace();
//		}
//		int[] ar = {10, 20};
//		System.out.print("배열 몇번?(0, 1) : ");
//		int i = sc.nextInt();
//		try {
//			System.out.printf("%d 번째", ar[i]);			
//		} catch (Exception e) {
//			System.out.println("그렇게 길지 않아.");
////			e.printStackTrace();
//		}
	}}

