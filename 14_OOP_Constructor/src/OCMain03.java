
public class OCMain03 {
	public static void main(String[] args) {
		//	Test
		
		// 프로그래머
			// 이름, 나이, 야근여부
			// 일하는 기능
			// 정보출력 기능
		
		// 오버로딩 생성자로 객체를 생성
			// 객체 생성 후 정보출력
		
		//syso(p1.work("일")) -> "개발하기" 출력
		//syso(p1.work("퇴근")) -> "ㄱㅅ" 출력
		
		// @ p1.work(); -> 콘솔에 "ㅋㅋ" 출력
		
		Programmer pro = new Programmer("jh", 25, true);
		
		System.out.println(pro.work("일"));
		System.out.println(pro.work("퇴근"));
		System.out.println(pro.work("안해"));		
		pro.work();
	}
}
