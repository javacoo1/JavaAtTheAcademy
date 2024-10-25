
public class Product {

	String name;
	String origin;
	int price;
	
	void info() {
		System.out.printf("%s : %dwon, made from %s\n", name, price, origin);
	}
}
