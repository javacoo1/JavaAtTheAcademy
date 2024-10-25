
public class OSMain02 {
	public static void main(String[] args) {
		
		//	애플 쇼핑몰
		
		//	Goods
		
		//	품명 : 아이폰 6s, 가격 : 120, 제조사 : 애플
		//	품명 : 아이패드,  가격 : 150,  제조사 : 애플
		//	품명 : 에어팟,   가격 : 30,  제조사 : 애플
	
		// - 제조사는 정해져 있음. = 상수 static final MAKER
		// - 품명, 가격 등 '직접' 접근 못하게 = private
		
		//	생성된 제품의 가격, 품명 모두 수정 가능 = setXX
	
		System.out.println("-----------gatter");
		
		AppleGoods iPhone = new AppleGoods();
		iPhone.setName("iPhone 6s");
		System.out.println(iPhone.getName());
		iPhone.setPrice(120);
		System.out.println(iPhone.getPrice());
		System.out.println(AppleGoods.MAKER);
		
		
		
		System.out.println("---------------");
		
		AppleGoods iPad = new AppleGoods();
		iPad.setName("iPad");
		System.out.println(iPad.getName());
		iPad.setPrice(150);
		System.out.println(iPad.getPrice());
		System.out.println(AppleGoods.MAKER);
		

		System.out.println("---------------");

		AppleGoods airPods = new AppleGoods();
		airPods.setName("Airpods");
		System.out.println(airPods.getName());
		airPods.setPrice(30);
		System.out.println(airPods.getPrice());
		System.out.println(AppleGoods.MAKER);
	
		System.out.println("------------info()");
	
		iPhone.info();
		System.out.println("---------------");
		iPad.info();
		System.out.println("---------------");
		airPods.info();
		System.out.println("---------------");
	
		System.out.println("~~~~~~~~~~~~~~~");
	
		AppleGoods airPods2 = new AppleGoods("airPods Pro", 30);
		//	가격 수정
		airPods2.setPrice(29);
		airPods2.info();
	
	
		
	
	
	
	
	
	
	
	}
	
}
