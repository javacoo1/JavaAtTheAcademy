package template;

public class ManualCar extends Car{ 
	
	@Override
	public void drive() {
	System.out.println("내가 운전");
	}
	
	@Override
	public void stop() {
		System.out.println("내가 멈춤");
	}

}
