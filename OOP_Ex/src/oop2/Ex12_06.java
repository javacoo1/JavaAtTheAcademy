package oop2;

class Car06 {
	int speed;

	void upSpeed(int speed) {
		this.speed = speed;
		System.out.println("현재속도(슈퍼클래스) : " + this.speed);
	}
}

class Sedan06 extends Car06{
	
	@Override
	void upSpeed(int speed) {
		this.speed += speed;
		if (this.speed >200) {
			this.speed = 200;
			System.out.println("현재속도(서브클래스) : " + this.speed);
		}
	}
}

class Truck06 extends Car06 {
	
}

public class Ex12_06 {
	public static void main(String[] args) {
		Sedan06 sedan6 = new Sedan06();
		Truck06 truck6 = new Truck06();
		
		truck6.upSpeed(300);
		sedan6.upSpeed(300);
	}
}
