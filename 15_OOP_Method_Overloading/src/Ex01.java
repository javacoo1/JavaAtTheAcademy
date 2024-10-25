class Car {
	String color;
	int speed;

	void upSpeed(int value) {
		speed += value;
	}

	void downSpeed(int value) {
		speed -= value;		
	}
}



public class Ex01 {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 0;
		
		myCar.upSpeed(100);
		System.out.println(myCar.speed);
		myCar.downSpeed(30);
		System.out.println(myCar.speed);
	}
}
