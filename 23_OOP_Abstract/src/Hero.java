
public abstract class Hero {
//	1. 추상 클래스는 인스턴스화 할 수 없다. (개념 자체가 추상적이어서)	
//	2. 추상 클래스를 하나라도 가지고 있는 클래스는 추상 클래스여야 한다.
	String name;

	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(String name) {
		super();
		this.name = name;
	}

	// 강제성, 규격
	abstract void attack();
}

class SuperMan extends Hero {

	@Override
	void attack() {
		System.out.println("레이저");
	}

}

class IronMam extends Hero {
	@Override
	void attack() {
		System.out.println("펄스건 이즈리얼");
	}
}

class Hulk extends Hero {
	@Override
	void attack() {
		System.out.println("근육 마쵸");
	}
}
