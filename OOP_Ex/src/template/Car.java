package template;

abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void turnOn() {
		System.out.println("시동on");
	}
	
	public void turnOff() {
		System.out.println("시동off");		
	}
	
	
	//	템플릿 메서드
	public final void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
}
