package oop2;

interface Car11 {
	void work();
}

interface Cannon {
	void attack();
}

class Tank implements Car11, Cannon{
	@Override
	public void work() {
		System.out.println("돌격!");
	}
	
	@Override
	public void attack() {
		System.out.println("발포!");
	}
}

public class Ex12_10 {
	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.work();
		tank.attack();
	}
}
