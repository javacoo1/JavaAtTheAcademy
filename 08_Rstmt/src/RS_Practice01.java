
public class RS_Practice01 {
	public static void main(String[] args) {
		//	최대한 안보고
		//	이중 for문으로 구구단 다 출력
		
//		for (int i = 2; i <= 9 ; i++) {
//			System.out.println(i + "단----------");
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d x %d = %d\n", i,j,i*j);
//			}
//		}

		
		for (int i = 1; i <= 9 ; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", j,i,i*j);
			}
			System.out.println();
		}
	}
}
