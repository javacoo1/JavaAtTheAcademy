
public class Bus extends Car{
	private int roNum;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(String model, String carNum, int roNum) {
		super(model, carNum);
		this.roNum = roNum;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.printf("노선번호 : %d\n", roNum);
		System.out.println("핑핑핑핑핑핑핑핑핑핑핑핑");
	}
	
	
	
}
