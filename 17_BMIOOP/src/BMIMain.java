
public class BMIMain {
	public static void main(String[] args) {
		
		//	BMI 객체지향 설계
			//	현실을 반영하자
		
		//	기계, 의사, 네이버 계산기
		Doctor d = new Doctor();
		
		//	사람, 고객, 손님, 환자
		Guest g = new Guest();
		
		d.act1(g);

	}
}
