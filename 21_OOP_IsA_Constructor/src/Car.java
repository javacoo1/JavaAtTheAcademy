
public class Car {
	private String model;
	private String  carNum;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Car(String model, String carNum) {
		super();
		this.model = model;
		this.carNum = carNum;
	}


	public void info() {
		System.out.printf("    %s\n", model);
		System.out.printf("핑넘버 : %s\n", carNum);
	}
	
	
	
	
}
