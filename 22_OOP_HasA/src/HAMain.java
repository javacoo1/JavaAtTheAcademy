
public class HAMain {
	public static void main(String[] args) {
		//	사람
			//	이름, 나이, 성별, 자기소개
		AMan man = new AMan("jh", 25, "man");
//		try {
			man.info();
			
//		} catch (NullPointerException e) {
//			System.out.println("Has no dog");
//		}
		
		System.out.println("~~~~~~~~~~~~~~~");
		//	강아지
			//	이름, 나이, 종, 정보출력
		ADog dog = new ADog("mocchi", 1, "말티푸");
		dog.info();
		
		System.out.println("~~~~~~~~~~~~~~~");
		AMan man2 = new AMan("jk", 25, "man", dog);
		man2.info();	
	
		System.out.println("~~~~~~~~~~~~~~~");
		//	자기소개 기능	값 세팅
		Test test = new Test();
		test.title = "타이타닉";
		test.content = "영화";
		test.no = 1;
		System.out.println(test.toString());
	
	}
	
}
