
public class CDMain04 {
	public static void main(String[] args) {
		
		//if, else if(여러 조건 중 하나만)
		
		// 1. 5배수 조건 "oo는 5의 배수" 출력
		// 2. 2배수 조건 "oo는 2의 배수" 출력
		// 3. 4배수 조건 "oo는 4의 배수" 출력
		// 나머지는 "해당없음" 출력
		int a = 6;
		
		if (a % 5 == 0) {
			System.out.println(a + "는 5의 배수");
		} else if (a % 2 == 0) {
			System.out.println(a + "는 2의 배수");
		} else if (a % 4 == 0) {
			System.out.println(a + "는 4의 배수");
		} else {
			System.out.println("해당없음");
		}
		
		System.out.println("-----------------------------");
		// 위에서 인지한 이슈 해결
		// ex) 4 -> 2배수, 4배수
		//     6 -> 2배수
		if (a % 5 == 0) {
			System.out.println(a + "는 5의 배수");
		} else if (a % 2 == 0) {
			System.out.println(a + "는 2의 배수");
			if (a % 4 == 0) {
				System.out.println(a + "는 2의 배수, 4의 배수");
		} else {
			System.out.println("해당없음");
		}
		
	}
		System.out.println("-----------------------------");
		a = 17;
		if (a % 5 ==0) {
			System.out.print("5배수\t");
		}
		if (a % 2 ==0) {
			System.out.print("2배수\t");
		}
		if (a % 4 ==0) {
			System.out.print("4배수\t");
		}
		if (a%5 !=0 && a%2 !=0 && a%4 !=0) {
			System.out.println("해당없음");
		}
		
		System.out.println("-----------------------------");
		//중첩 if문 : 두 조건이 참일 때, 두 조건 모두 실행
		//첫번째 조건이 참일 때 실행
		int b = 10;
		
		if (b % 2 == 0) {
			System.out.println("2배수");
			if (b % 5 == 0) {
				System.out.println("5배수");
			}
		}
		
		System.out.println("-----------------------------");
		
		int c = 3;

        if (c % 3 == 0) {
        	// 3, 6
            System.out.println(c + "는 3배수");

            if (c % 4 == 0) {
            	// 12 , 24
                System.out.println(c + "는 4배수");
            }else {
            	// 8 , 20
                System.out.println("3배수라 첫문장은 실행 됐지만 4배수는 아님");
            }


        } else {
            System.out.println("c에 4가 있지만 중첩이라 안에껀 실행 x");
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
}
}
