
public class UMain {
	public static void main(String[] args) {
		
		String s = "hello";
		System.out.println(s);
		String s2 = "helllo";
		System.out.println(s == s2);
		
		System.out.println("---------------");
		
		String ss = new String("이제 2시간만..");
		System.out.println(ss);
		
		String ss2 = "이제 2시간만..";
		System.out.println(ss.equals(ss2));

		System.out.println("---------------");
	
		//	ss의 두번째 글자를 출력하시오.
		System.out.println(ss.charAt(1));
	
		System.out.println(ss.charAt(4));
		
		//	ss의 세번째 글자를 출력
		System.out.println(ss.charAt(2));

		//	ss의 전체 글자 수
		System.out.println(ss.length());
		
		//	ss에서 '시' 라는 글자가 몇번째에 있나?
		System.out.println(ss.indexOf("시"));
		
		//	ss가 '.' 으로 끝나는가?
		System.out.println(ss.endsWith("."));
		
		//	ss가 '요' 로 끝나는가?
		System.out.println(ss.endsWith("."));
		
		//	ss가 '이' 로 시작하는가?
		System.out.println(ss.startsWith("이"));

		//	ss가 '두' 로 시작하는가?
		System.out.println(ss.startsWith("두"));
	
		System.out.println();
		//	gpt (x) / 구글링 (o)
		
		//	ss에서 '2시간만' -> '1시간만' 으로 바꾸기
		System.out.println(ss.replace("2시간만", "1시간만"));
		
		//	ss에서 2~5번째 글자까지 출력하기 (1.제 2시  2.제 1시)
		System.out.println(ss.substring(1, 5));
		
		//	문자열 분리
		String sss = "딸기,망고,바나나";
		String[] sss2 = sss.split(",");
		for (String string : sss2) {
			System.out.println(string);
		}
		System.out.println("-------------------");
		//	문자열 붙이기
		
		//	안좋다.	(Java 1.5 이하)
		String s1 = "첫";
		s1 += "번";
		s1 += "째";
		s1 += "시";
		s1 += "간";
		
		System.out.println(s1);
		
		//	좋은 방법. 수정 가능한 문자열 객체
		StringBuffer sb = new StringBuffer();
		String s22 = "첫";
		sb.append(s22);
		sb.append("번");
		sb.append("째");
		sb.append("시");
		sb.append("간");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		StringBuilder sb2 = new StringBuilder();
		String s33 = "첫";
		sb2.append(s33);
		sb2.append("번");
		sb2.append("째");
		sb2.append("시");
		sb2.append("간");
		
		
		
		
		
		
	}
}
