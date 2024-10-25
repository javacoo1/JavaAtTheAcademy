import java.util.Scanner;

public class Test_Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// login system
		// id, pw
		
		// db에 실제 존재하는 id, pw -> 임의 생성 및 테스트
			String db_id = "jh";
			String db_pw = "1111";
					
		// 판정
			// 둥 다 맞으면 "로그인 성공"
			// id가 틀리면 "id 에러" - "존재하지 않는 회원입니다."
			// pw가 틀리면 "pw 에러" - "비밀번호가 일치하지 않습니다"
		
		System.out.println("아이디를 입력해주세요.");
		String userId = sc.next();
		System.out.println("비밀번호를 입력해주세요.");
		String userPw = sc.next();
		
		if (userId.equals(db_id)) {
			
			if (userPw.equals(db_pw) ) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
