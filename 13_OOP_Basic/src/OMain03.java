
public class OMain03 {
	public static void main(String[] args) {
		//제품
		
		//품명, 가격, 원산지
		//상품의 정보 출력하는 기능
		
		//1.품명이 보드마카, 가격이 1000원, 원산지가 한국
			//정보출력
		
		//2.품명이 형광펜, 가격이 500원, 원산지가 중국
			//정보출력
		
		Product pr1 = new Product();
		Product pr2 = new Product();
		
		pr1.name = "Board Marker";
		pr2.name = "Highlighter";
		
		pr1.price = 1000;
		pr2.price = 500;
		
		pr1.origin = "Korea";
		pr2.origin = "China";
		
		pr1.info();
		pr2.info();
		
		
		
	}
}
