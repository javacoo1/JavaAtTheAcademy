import java.util.Iterator;

public class AMain05 {
	public static void main(String[] args) {
		// 2차원 배열

		// 학생들의 키, 체중 (한명만 만들게 아님)

		// int[행][열]

		int studs[][] = { { 180, 80 }, { 170, 70 }, { 160, 60 } };
		// 첫번째 학생의 키
		System.out.println(studs[0][0]);

		// 세번째 학생의 체중
		System.out.println(studs[2][1]);

		// 두번째 학생의 키
		System.out.println(studs[1][0]);

		// 이름과 사는곳
		String[][] per = { { "진현", "종각" }, { "도윤", "인천" }, { "지원", "동대문" }

		};
		// 두번째 사람의 사는곳
		System.out.println(per[1][1]);

		// 첫번째 사람의 이름
		System.out.println(per[0][0]);

		// 세번째 사람의 이름과 사는곳 ex) oo / oo
		System.out.println(per[2][0] + " / " + per[2][1]);

		System.out.println("-------------------");

		int[][] ar = new int[3][4];

		// 값세팅
		int num = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				ar[i][j] = num++;
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("-------------------");
		// [면][행][열]
		int[][][] thr = {

				{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } },
				{ { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 } } };

		// 10
		System.out.println(thr[1][0][0]);

		// 4
		System.out.println(thr[0][1][0]);

		// 17
		System.out.println(thr[1][2][1]);

		// 23
		System.out.println(thr[2][1][1]);

		// 26
		System.out.println(thr[2][2][1]);

		System.out.println("-------------------");
		for (int i = 0; i < thr.length; i++) {
			for (int j = 0; j < thr.length; j++) {
				for (int k = 0; k < thr.length; k++) {
					System.out.printf(" %d ", thr[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
