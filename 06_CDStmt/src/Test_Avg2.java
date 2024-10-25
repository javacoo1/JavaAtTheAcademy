import java.util.Scanner;

public class Test_Avg2 {
	public static void main(String[] args) {
		
		String grade;
		
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
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("평점 : " + avg);
		System.out.println("등급 : " + grade);
		
		//결과
			//평점 : oo
			//등급 : oo
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
