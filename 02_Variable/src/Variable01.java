
public class Variable01 {
	public static void main(String[] args) {
		
//		System.out.println("2024/10/11");
		
		// 변수 : 프로그램 진행 중 발생하는 데이터의 임시저장
		
			// 데이터를 담는 그릇(박스, 상자)
			// 데이터는 수정 가능
		
			// 변수 만들기
		 	// 자료형(그릇) 변수명(그릇 이름)
		
		int a = 0;
		System.out.println("0");
		System.out.println(0);
		System.out.println(a);
		
		
		//내 나이를 저장
		int myAge;	// myAge라는 이름의 그릇 생성
		myAge = 25;	//myAge에 25를 담음
		
		System.out.println(myAge);
		System.out.println("25");
		System.out.println("myAge");
		
		
		//핸드폰가격(1000) 저장하기
		int phoneCost;	// 변수 선언
		phoneCost = 1000;	// 초기화
		System.out.println(phoneCost);
		
		phoneCost = 2000;
		System.out.println(phoneCost);
		
		int phoneCost2 = 3000;	// 선언 및 초기화를 한번에(28, 29)
		System.out.println(phoneCost2);
		
		
		int the_number_of_myhair = 1000000;
		int theNumberOfMyHair = 1000000;
		
		// 변수 이름 잘 지어
		// 변수명 (아아보기 쉽게)
		
		/*
		  자유롭되 몇가지 제한 있음 : 자바 문법x, 숫자로 시작x, 소문자로 시작o -> 약속,
		  띄어쓰기 대신 낙타체 또는 _
		  
		  특수문자는 _만($도 가능) -> 자바 문법을 꼭 써야되면 앞에 _
		 */
		
		//Test
		
		//콘솔에 출력 (변수 사용해서)
		//신발 사이즈 : 260mm
		int shoesSize = 260;
		System.out.print("신발사이즈 : ");
		System.out.print(shoesSize);
		System.out.println("mm");
		
		shoesSize = 230;
		System.out.println("신발사이즈 : " + shoesSize + "mm");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
