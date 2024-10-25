
public class OSMain03 {
	public static void main(String[] args) {
		//	Samsung
		
		//	Galaxy
		
		//	품명: Galaxy flip4, 가격: 110, 제조사: Samsung
		//	품명: Galaxy flip5, 가격: 150, 제조사: Samsung
		//	품명: Galaxy 10, 가격: 20, 제조사: Samsung
	
		//1. 필드 '직접' 접근 안되게
		//2. 제조사는 다 삼성(상수로)
		//3. 모든 제품의 생성은 오버로딩 생성자로
		//4. 상품의 이름/가격은 수정가능. 별도의 값 얻기도 가능하게
		//5. 상품정보 출력 기능
	
		Samsung flip4 = new Samsung();
		flip4.setName("Galaxy flip4");
		flip4.setPrice(110);
		
		Samsung flip5 = new Samsung();
		flip5.setName("Galaxy flip5");
		flip5.setPrice(150);
	
		Samsung g10 = new Samsung();
		g10.setName("Galaxy 10");
		g10.setPrice(150);
	
		flip4.info();
		flip5.info();
		g10.info();
	
		//	총 생산된 갤럭시 몇 대?
		System.out.println("총 댓수");
		System.out.printf("총 %d 대", Samsung.getCount());
	}
}
