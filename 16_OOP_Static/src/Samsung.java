
public class Samsung {

	private String name;
	private int price;
	static final String MAKER = "SAMSUNG";
	private static int count;
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Samsung.count = count;
	}

	public Samsung() {
		count++;
	}
	
	public Samsung(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		count++;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getMaker() {
		return MAKER;
	}

	void info() {
		System.out.printf("product : %s\n", name);
		System.out.printf("price : %d\n", price);
		System.out.printf("maker : %s\n", MAKER);
		System.out.println("--------------------");
	}
}
