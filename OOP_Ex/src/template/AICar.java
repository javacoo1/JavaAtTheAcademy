package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("알아서 운전");
	}

	@Override
	public void stop() {
		System.out.println("알아서 멈춤");
	}

}
