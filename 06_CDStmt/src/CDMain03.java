
public class CDMain03 {
	public static void main(String[] args) {
		
		//if, else if, esle
		
		int age = 12;
		//펍에 입장
		
		// 1. 나이가 20살 이상이면 "어서오세요"
		// 2. 15 <= 나이 < 20 이면 "더 크면 오세요"
		// 3. 10 <= 나이 < 15 이면 "나가라"
		// 4. 나머지는 "귀엽네"
		
		if (age>=20) {
			System.out.println("어서오세요");
		} else if (age>=15) {
			System.out.println("더 크면 오세요");
		} else if (age>10) {
			System.out.println("나가라");
		} else if (age>=1){
			System.out.println("귀엽네");
		}
		
		
	//Test
		// 키가 150 이상이면 welcome
		// 130~150 welcome friend
		// 100 ~130 welcome boy
		// 나머지는 hey boy
		int height = 130;
		if (height>=150) {
			System.out.println("welcome");
		} else if (height>=130) {
			System.out.println("welcome friend");
		} else if (height >= 100) {
			System.out.println("welcome boy");
		} else {
			System.out.println("hey boy");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}