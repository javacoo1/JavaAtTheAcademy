
public class RS_Practice02 {
	public static void main(String[] args) {
		// 2중 for문
		// 31) 1, 3, 5, 7, 8, 10, 12
		// 30) 4, 6, 9, 11
		// 28) 2

//		for (int i = 1; i <= 12; i++) {
//			System.out.println(i + "월-------");
//			for (int j = 1; j <= 31; j++) {
//				switch (i) {
//				case 1, 3, 5, 7, 8, 10, 12:
//					System.out.printf("%d월 %d일\n", i, j);
//					break;
//				case 4, 6, 9, 11:
//					System.out.printf("%d월 %d일\n", i, j);
//					if (j > 30) {
//						break;
//					}
//
//				default:
//					System.out.printf("%d월 %d일\n", i, j);
//					if (j > 28) {
//						break;
//					}
//				}



		for (int j = 1; j <= 31; j++) {
			for (int i = 1; i <= 12; i++) {
				switch (i) {
				case 1,3,5,7,8,10,12:
					System.out.printf("%d월 %02d일 |\t", i, j);
					break;
				case 4,6,9,11:
					if (j <= 30) {
					System.out.printf("%d월 %02d일 |\t", i, j);
					} else {
						System.out.print("\t\t");
					}
				break;
				default:
					if (j <= 28) {
					System.out.printf("%d월 %02d일 |\t", i, j);
					} else {
						
						System.out.print("\t\t");
					}
					break;
				}		
			}
			System.out.println();
		}
		}
	}

