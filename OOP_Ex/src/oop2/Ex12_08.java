package oop2;

abstract class Car08 {
	int speed;
	
	void upSpeed(int speed) {
		this.speed = speed;
	}

	abstract void work();

}

class Sedan08 extends Car08{
	
	@Override
	void work() {
		System.out.println("도윤이형님 태우고 인천가기");
	}
	
}

class Truck08 extends Car08{
	
	@Override
	void work() {
		System.out.println("도윤이형님 짐 싣고 인천가기");	
	}
}


public class Ex12_08 {
	public static void main(String[] args) {

		Car08 car = new Sedan08();
		
		Sedan08 s = new Sedan08();
		s.work();
		
		Truck08 t = new Truck08();
		t.work();
	}
}
