
public class SpCar extends Car{
	
	public SpCar() {
		// TODO Auto-generated constructor stub
	}
	
	public SpCar(String model, String carNum) {
		super(model, carNum);
	}

	@Override
	public void info() {
		super.info();
		System.out.println("핑핑핑핑핑핑핑핑핑핑핑핑");
	}
}
