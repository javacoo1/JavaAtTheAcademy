package com.jh.product;

public class Printer extends Product{

	public Printer() {
		super();
	}

	public Printer(String name, int price) {
		super(name, price);
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
	}

	@Override
	public String toString() {
		return "Printer [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
