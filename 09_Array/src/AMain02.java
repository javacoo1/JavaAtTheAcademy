import java.lang.reflect.Array;
import java.util.Iterator;

public class AMain02 {
	public static void main(String[] args) {
		// 학생들의 일본어 점수
		// 학생 5명의 점수
		// 들어올 값을 모를 때 (요소, element)
		int[] jpScore = new int[5]; // 5칸짜리 배열
//		                     (index)

		jpScore[0] = 100;
		jpScore[1] = 70;
		jpScore[2] = 90;
		jpScore[3] = 30;
		jpScore[4] = 60;

		System.out.println("No.4" + jpScore[3]);

		// 마지막 학생의 점수
		System.out.println("No.last" + jpScore[3]);
		System.out.println("----------------");

		// 값을 이미 알고 있을 때
//		int engTest[] = new int[] {10, 20, 30, 40, 50};
		int engTest[] = { 10, 20, 30, 40, 50 };

		System.out.println(engTest[1]);
		System.out.println(engTest.length);

		System.out.println(Array.get(engTest, 0));

		System.out.println("----------------");
		// 학생 5명의 일본어 점수 50~90 (jpTest)
		int jpTest[] = { 50, 60, 70, 80, 90 };

		// 배열의 길이를 출력 (몇 칸인지?)
		System.out.println(jpTest.length);

		// 전체 평균점수 계산해서 출력
		int avg = (jpTest[0] + jpTest[1] + jpTest[2] + jpTest[3] + jpTest[4]) / jpTest.length;
		System.out.println(avg);

		System.out.println("----------------");

		for (int i = 0; i < jpTest.length; i++) {
			if (jpTest[i] > 70) {
				System.out.println("good");
			} else {
				System.out.println("bad");

			}
			
			System.out.println("----------------");
			//	foreach (증감 개념x, 순차적으로)
			
			for (int asd : jpTest) {
				System.out.println(asd);
			}
		}

		System.out.println("----------------");
		
		//	jpScore	2번째 헉생 점수
		System.out.println(jpScore[2]);
		
		//	jpScore	몇칸짜리 배열?
		System.out.println(jpScore.length);
		
		//	for로 하나씩 다 출력
		for (int i = 0; i < jpScore.length; i++) {
			System.out.println(jpScore[i]);
		}
		
		//	foreach로 하나씩 다 출력
		for (int i : jpScore) {
			System.out.println(i);
		}
		
		System.out.println("----------------");
		//	민석, 민재, 지훈
		String classMem[] = {"민석", "민재", "지훈"};
		
		for (int i = 0; i < classMem.length; i++) {
			System.out.println(classMem[i]);
		}
		
		for (String string : classMem) {
			System.out.println(string);
		}
		
		System.out.println("----------------");
		//	5칸 짜리 배열
		int push[] = new int[5];
		//	배열 만들고 초기화 안하면 0이 자동으로 들어가 있음
		for (int i = 0; i < push.length; i++) {
			System.out.println(push[i]);
		}
		//	double - 
		double array[] = new double[5];
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//	String - 
		String array2[] = new String[5];
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		System.out.println("----------------");
		/*
		push[0] = 1;
		push[4] = 2;
		push[2] = 3;
		push[1] = 4;
		push[3] = 5; 
		 */

		for (int i = 0; i < push.length; i++) {
			push[i] = i + 1;
			System.out.println(push[i]);
		}
		
		System.out.println("----------------");
		//	저장된거 다 더하기
		int sum = 0;
		for (int i = 0; i < push.length; i++) {
			sum += push[i];
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for (int elem : push) {
			sum2 += elem;
		}
		System.out.println(sum2);
		
		System.out.println("----------------");
		//	jpTest 평균값 출력 for / foreach 활용
		int all = 0;
		int avg2 = 0;
		for (int i = 0; i < jpTest.length; i++) {
			all += jpScore[i];
			avg = all / jpScore.length;
		}
		System.out.println(avg);
		
		for (int sum3 : jpScore) {
			avg2 = sum3 / jpScore.length;
		}
		System.out.println(avg);
		
		
	}
}
