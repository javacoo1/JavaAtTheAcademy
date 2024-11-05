package exam;

interface Soundable {
	String sound();
}

class Cat implements Soundable {

	@Override
	public String sound() {
		return "난 나옹이다옹";
	}

}

class Dog implements Soundable {

	@Override
	public String sound() {
		return "멍멍";
	}
}

public class SoundableExample {
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Dog());
		printSound(new Cat());
	}
}
