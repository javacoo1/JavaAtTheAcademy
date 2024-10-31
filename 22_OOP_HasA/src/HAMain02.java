
public class HAMain02 {
	public static void main(String[] args) {
		
		//	회사
			//	회사명, 설립연도, 사옥위치
			//	정보출력 -> toString
		Company com = new Company("jh", 1999, "천안");
		
		
		//	제품
			//	품명, 가격
			//	정보출력
		Product pro = new Product("sbt합격비법", 50000, com);
		System.out.println(pro);
		
		Product pro2 = new Product("sbt합격후기", 50000, new Company("jh2", 1999, "종각" ));
		System.out.println(pro2);
		
		
		
		
		
	}
}
