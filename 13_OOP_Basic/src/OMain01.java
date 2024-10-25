
public class OMain01 {
	public static void main(String[] args) {
		//	객체 지향 - 실생활 반영
		
		//	객체 - 존재하는 모든 것
		
		//	dog
		//	나이가 3살
		//	이름이 모찌
		//	체중이 3.5kg
		
		int age = 3;
		String name = "mochi";
		double weight = 3.5;
		
		System.out.println("----------------");
		//	나이, 이름, 체중 속성을 가진 강아지를 만들어야겠다.
		//	객체를 만들려면? : 클래스 생성이 먼저
		
		//	실체화(인스턴스, 객체)
		Dog dog1 = new Dog();
		dog1.age = 3;
		dog1.name = "mochi";
		dog1.weight = 3.5;
		
		System.out.println(dog1);
		dog1.printInfo();
		
		//	2번째 강아지
		//	나이가 2살, 이름 보리, 체중 2.2
		Dog dog2 = new Dog();	//	실제 강아지 생성
		dog2.age = 2;
		dog2.name = "보리";
		dog2.weight = 2.2;
		
		dog2.printInfo();
		
		//	1번 짖게
		dog2.bark();
		System.out.println("----------------");
		//	컴퓨터를 객체로 표현해주세요
		//	cpu 2.5, ram 8, hdd 256
		//	printInfo() 정보 출력 기능
		
		//	컴 -> 객체? :class
		
		//	객체화, 실체화, 인스턴스화		->	new로 만들어달라는 말
		Computer com1 = new Computer();	//	실제 컴퓨터 생성
		com1.cpu = 2.5;
		com1.ram = 8;
		com1.hdd = 256;
		
		com1.printInfo();
		
		System.out.println("----------------");
		
		//	커피
		
		//	가격, 커피이름
		//	정보출력 기능
		
		//	아메리카노, 2000원
			//만들고 정보 출력
		//	카페라떼, 3000원
			//만들고 정보 출력
		Coffee cof1 = new Coffee();
		cof1.name = "아메리카노";
		cof1.price = 2000;
		cof1.info();
		
		Coffee cof2 = new Coffee();
		cof2.name = "카페라떼";
		cof2.price = 3000;
		cof2.info();
		
		
	}
}
