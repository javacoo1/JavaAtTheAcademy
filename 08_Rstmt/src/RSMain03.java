
public class RSMain03 {
	public static void main(String[] args) {
		// 중첩 for문		이중 for문
		
		for (int dan = 2; dan < 10; dan++) {
			
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", dan, j, dan*j);
			}
			System.out.println("------");
			
		}
		
		// 1.
		//	z		
		//	zz
		//	zzz		
		//	zzzz	
		//	zzzzz	
		
		/**
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("z");
			}
			System.out.println();
		}
				
		System.out.println("------");
		 */
		
		//2.
//		zzzz
//		zzz	
//		zz
//		z
		for (int i = 4; i >= 1; i--) {
			for (int j = i; j > 0 ; j--) {
				System.out.print("z");
			}
			System.out.println();
		}
				
		System.out.println("------");	
		
		
		//3.		
//		z		
//		z
//		zz
//		zz
//		zzz
		
		for (int i = 0; i < 5 ; i++) {
			for (int j = ((i / 2) + 1); j > 0 ; j--) {
				System.out.print("z");
			}
			System.out.println();
		}
		
		System.out.println("------");	
		
		
		
		//4.
//		z
//		 z
//		  z
//		   z
//		    z

		for (int i = 1; i < 6; i++) {
			for (int j = i; j > 0 ; j--) {
				System.out.print(" ");
			}
			System.out.print("z");
			System.out.println();
		}
	
		System.out.println("------");	
		
		//5.
		for (int i = 1; i < 6; i++) {
			for (int j = i; j > 0 ; j--) {
				System.out.print(" ");
			}
			System.out.println("z\n");
		}
		
		
		
		}
}
