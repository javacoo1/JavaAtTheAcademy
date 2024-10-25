import java.util.Scanner;

public class Test_Avg {
	public static void main(String[] args) {
		//성적 평균점수와 등급을 알려주는 프로그램
		//입력 받기 (중간, 기말) - int
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 : ");
		int mid = sc.nextInt();
		
		System.out.print("기말 : ");
		int fin = sc.nextInt();
		
		//평균점수
		//(중간+기말)/2
		int avg =(mid + fin) / 2;
		
		//판정
			//90 이상A
			//80 이상B
			//70 이상C
			//60 이상D
			//나머지 F
		if (avg >= 90) {
			System.out.println("평점 : " + avg + "\n등급 : A");
		} else if (avg >= 80) {
			System.out.println("평점 : " + avg + "\n등급 : B");
		} else if (avg >= 70) {
			System.out.println("평점 : " + avg + "\n등급 : C");
		} else if (avg >= 60) {
			System.out.println("평점 : " + avg + "\n등급 : D");
		} else {
			System.out.println("평점 : " + avg + "\n등급 : F");
		}
		
		//결과
			//평점 : oo
			//등급 : oo
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
