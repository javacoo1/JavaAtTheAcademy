
public class AppleGoods {

	private String name;
	private int price;
	static final String MAKER = "Apple";

	public AppleGoods() {

	}

	// command + option + S
	public AppleGoods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void info() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(MAKER);
	}

//	int getPrice() {
//		return price;
//	}
//
//	void setPrice(int sp) {
//		if (sp < 0) {
//			System.out.println("가격을 다시 설정해 주세요(0~200)");
//			return;
//		} else if (sp > 200) {
//			System.out.println("가격을 다시 설정해 주세요(0~200)");
//			return;
//		}
//		
//		this.price = sp;
//	}

	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}

	
	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

}
