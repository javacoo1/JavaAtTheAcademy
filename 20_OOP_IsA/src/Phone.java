
public class Phone extends Product{

	private double display;
	private double weight;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Phone(String name, int price, double display, double weight) {
		super(name, price);
		this.display = display;
		this.weight = weight;
	}

	


	public double getDisplay() {
		return display;
	}



	public void setDisplay(double display) {
		this.display = display;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	@Override
	void info() {
		super.info();
		System.out.println(display);
		System.out.println(weight);
	}
}
