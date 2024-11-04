package oop2;

interface Car09 {
	int CAR_COUNT = 0;
	
//	abstract void work();
	void work();

	}

class Sedan09 implements Car09{
	
	@Override
	public void work() {
		System.out.println("도윤이형님 태우고 인천가기");
	}
}

class Truck09 implements Car09{
	
	@Override
	public void work() {
		System.out.println("도윤이형님 짐 싣고 인천가기");	
	}
}


public class Ex12_09 {
	public static void main(String[] args) {

		Car09 car = new Sedan09();
		
		Sedan09 s = new Sedan09();
		s.work();
		
		Truck09 t = new Truck09();
		t.work();
	}
}
