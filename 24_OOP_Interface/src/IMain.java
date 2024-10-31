interface Coffee {
	void name();
	void price();
	default void hotOrIced() {
	}
}


class Espresso implements Coffee{
	@Override
	public void name() {
		System.out.println("エスプレッソ");
	}
	@Override
	public void price() {
		System.out.println(500);
	}
}

class CafeLatte implements Coffee{
	@Override
	public void name() {
		System.out.println("カフェラテ");
	}
	@Override
	public void price() {
		System.out.println(600);
	}
	@Override
	public void hotOrIced() {
		System.out.println("暖かくしますか？それともアイスでしますか？");
		Coffee.super.hotOrIced();
	}
}

class VanillaLatte implements Coffee{
	@Override
	public void name() {
		System.out.println("バニララテ");
	}
	@Override
	public void price() {
		System.out.println(650);
	}
	@Override
	public void hotOrIced() {
		System.out.println("暖かくしますか？それともアイスでしますか？");
		Coffee.super.hotOrIced();
	}
}

class Frappuccino implements Coffee{
	@Override
	public void name() {
		System.out.println("フラペチーノ");
	}
	@Override
	public void price() {
		System.out.println(650);
	}
}


public class IMain {
	public static void main(String[] args) {
		//	다형성 (polymorphism)
	
		Coffee cof = new CafeLatte();
		cof.name();
		cof.price();
		cof.hotOrIced();
		
		Coffee vcof = new VanillaLatte();
		vcof.name();
		vcof.price();
		cof.hotOrIced();
		
		System.out.println("--------------------");
		
		CafeLatte cafe = new CafeLatte();
		cafe.name();
		cafe.price();
		cof.hotOrIced();
		
		VanillaLatte van = new VanillaLatte();
		van.name();
		van.price();
		cof.hotOrIced();
	
	}
}
