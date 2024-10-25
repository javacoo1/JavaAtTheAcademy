import java.util.Scanner;

public class Guest {
	
	String name;
	double weight;
	double height;
	Scanner mouth; 
	
	public void act2() {
		mouth = new Scanner(System.in);
		System.out.print("이름 : ");
		name = mouth.next();
		System.out.print("키 : ");
		height = mouth.nextDouble();
		System.out.print("체중 : ");
		weight = mouth.nextDouble();
		
		
	}

}
