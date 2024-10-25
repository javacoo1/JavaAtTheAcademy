
public class Doctor {

	private String res;
	
	public void act1(Guest g) {	//손님을 맞이하기
	//	손님한테 정보 물어보기
	//	검사하려면 손님 정보가 필요
	System.out.println("정보 내놔(이름, 키, 체중)");
	g.act2();				//	게스트가 본인정보 대답
//	act3(g);	//	bmi 수치 계산
	act4(act3(g), g.name);		//	결과 안내
	
	}


	private double act3(Guest g) {
	if (g.height > 10) {
		g.height /= 100;
	}
	double bmi = g.weight / (g.height * g.height);
	return bmi;
	}

	private void act4(double bmi, String name) {
		if (bmi >= 35) {
		String res = "3단계 비만";
	} else if (bmi >= 30) {
		String res = "2단계 비만";
	} else if (bmi >= 25) {
		String res = "1단계 비만";
	} else if (bmi >= 23) {
		String res = "비만 전단계";
	} else if (bmi >= 18.5) {
		String res = "정상";
	} else {
		String res = "저체중";
		}		
		
		System.out.printf("BMI 지수 %.2f: \n", bmi);
		System.out.printf("%s님, 당신은 %s 입니다.", name, res);
	}
}
