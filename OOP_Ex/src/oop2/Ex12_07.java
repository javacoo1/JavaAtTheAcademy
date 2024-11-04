package oop2;

class Car07 {
	int speed;
	
	final void upSpeed(int speed) {
		this.speed = speed;
	}
}

class Sedan07 extends Car07{
	final static String CAR_TYPE = "sedan";
	
	
}


public class Ex12_07 {
	public static void main(String[] args) {
		System.out.println(Sedan07.CAR_TYPE);
	}
}
