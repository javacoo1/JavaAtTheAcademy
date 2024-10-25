import java.util.Scanner;

public class Operator01 {
public static void main(String[] args) {
	//import 단축키 : command + shift + o
	
	//키보드 입력 받을 준비
	Scanner keyboard = new Scanner(System.in);
	
	//대입 연산자 : =	<- 같다는 뜻x,
	int x = 10;

// 상담때문에 못들음*******************************
	
	x += 1;	// x = x + 1;
	
	x -= 2;	// x = x - 2;
	System.out.println(x);
	
	x *= 2;	// x = x * 2;
	System.out.println(x);
	
	x /= 2;	// x = x / 2;
	System.out.println(x);
	
	x %= 2;
	System.out.println(x);

	// 증감연산자
	x++;	// 1증가		++x;
	System.out.println(x);
	x--;	// 1감소		--x;
	System.out.println(x);
	
	

}
}
