
public class Taxi extends Car{
	private int num;
	
	public Taxi() {
		// TODO Auto-generated constructor stub
	}

	public Taxi(String model, String carNum, int num) {
		super(model, carNum);
		this.num = num;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.printf("기본요금 : %d핑\n", num);
		System.out.println("핑핑핑핑핑핑핑핑핑핑핑핑");
	}
	
	
}
