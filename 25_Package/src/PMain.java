import java.util.Random;

import com.jh.product.Computer;
import com.jh.product.Printer;
import com.jh.product.Scanner;

public class PMain{
	public static void main(String[] args) {
		
		//	프린터
			//이름, 가격
		Printer pr = new Printer("린푸린", 10);
		System.out.println(pr);
		pr.printInfo();
		System.out.println("----------------------");
		//	스캐너
			//이름, 가격
		Scanner sc = new Scanner("캔스캔", 20);
		System.out.println(sc);
		java.util.Scanner scc = new java.util.Scanner(System.in);
		Random ran = new Random();
		
		//	java.lang은 import 필요없음
		String name = "asd";
		java.lang.String str = new String("asdmo");
		
		//	컴퓨터
			//이름 가격, cpu, ram, hdd
		Computer com = new Computer();
		com.cpu = "i8";	//public
//		com.ran = 1;	//default
//		com.hdd = 256;	//protected
				//	내가 어디에서 쓰려고 하는지

	}
}
