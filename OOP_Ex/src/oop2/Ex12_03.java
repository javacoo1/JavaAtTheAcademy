package oop2;

class Car03 {
	public Car03() {
		System.out.println("super class");
	}
	
	public Car03(String str) {
		System.out.println("super class" +str);
	}
}

class Sedan03 extends Car03 {
	public Sedan03(String str) {
		super("페라리");
		System.out.println("sub class" +str);
	
	}
}


public class Ex12_03 {
	public static void main(String[] args) {
		Sedan03 sedan3 = new Sedan03("람보르기니");
	}
}
