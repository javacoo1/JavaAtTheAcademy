
public class OMain02 {
	public static void main(String[] args) {
		//	사람
			//	속성 : 이름, 나이
			// 자기소개 기능
		Person per1 = new Person();
//		Person per2 = new Person();
		//	진현, 25살 만들고 자기소개
		per1.name = "진현";
		per1.age = 25;
		per1.selfIntr1();

		System.out.println(per1);
		Person per2 = per1;
		System.out.println(per2);
		
		per2.name = "도윤";
		per2.selfIntr2();
		System.out.println("-------------------");
		per1.selfIntr1();
		per2 = null;	//	참조형 변수 속에 있는 주소값 지움
//		System.out.println(per2);
		per1 = null;
		//	GC (heap 영역 자동 정리. 지금 코드에선 이때 발동)
		//	더 이상 그 주소값을 가리키는 변수가 없을 때(사용 안할때)
		
		
		
		
		
		
		
//		//	도윤, 26살 만들고 자기소개
//		per2.name = "도윤";
//		per2.age = 26;
//		per2.selfIntr2();
		
		
	}
}
