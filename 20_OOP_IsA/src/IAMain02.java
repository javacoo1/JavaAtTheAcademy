
public class IAMain02 {
	public static void main(String[] args) {
		//	필드 직접 x
		//	나중에 값 수정 가능하게, 생성할 때 값 세팅도 가능하게
		
		
		
		//	컴퓨터 : 품명, 가격, cpu, ram, hdd
		//	정보출력기능
		Com com = new Com("MacBook Air 5", 200, 10, 16, 6);
		com.info();
		System.out.println("----------------------");
		
		Com com2 = new Com();
		com2.setName("MacBook Air 5");
		com2.setPrice(200);
		com2.setCpu(10);
		com2.setRam(16);
		com2.setHdd(6);
		com2.info();
		System.out.println("----------------------");
		
		//	핸드폰 : 품명, 가격, 디스플레이, 무게
		//	정보출력기능
		Phone phone = new Phone("iPhone 18", 140, 9.2, 1.2);
//		phone.setName("iPhone 18");
//		phone.setPrice(140);
//		phone.setDisplay(9.2);
//		phone.setWeight(1.2);
		phone.info();
		System.out.println("----------------------");
		
		//	펜 : 품명, 가격
		//	정보출력기능
		Pen pen = new Pen("Apple Pen", 20);
//		pen.setName("Apple Pen");
//		pen.setPrice(20);
		pen.info();
		System.out.println("----------------------");
		
		
		//	슈퍼클래스 필드가 다 private 걸려있어서 상속이 안될텐데, 
		//	어떻게 값이 세팅이 되고, 정상 동작까지 하는걸까?
		
//	1. 오버로딩 생성자 사용의 경우 :
//	상속을 못받은 필드와는 상관없이, 부모의
//	오버로딩 생성자에 접근이 가능 (super(name, price))
		
//	2. setter 사용 값 세팅의 경우 :
//	필드는 상속받지 못한게 맞지만, 
//	부모의 getter, setter는 다 상속 받았으므로 사용가능
		
	}
}
