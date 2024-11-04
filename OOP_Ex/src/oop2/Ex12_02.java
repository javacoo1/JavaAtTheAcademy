package oop2;

class Car02 {
	public Car02() {
		System.out.println("슈퍼클래스 생성자");
	}
}

class Sedan02 extends Car02{
	public Sedan02() {
		System.out.println("서브클래스 생성자");
	}
}


public class Ex12_02 {
	public static void main(String[] args) {
		Sedan02 sedan02 = new Sedan02();
	}
}
