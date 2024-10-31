package com.jh.product;

public class Scanner extends Product{

	public Scanner() {
		super();
	}

	public Scanner(String name, int price) {
		super(name, price);
	}

	@Override
	public void printInfo() {
		super.printInfo();
	}
	
	@Override
	public String toString() {
		return "Scanner [name=" + name + ", price=" + price + "]";
	}

	
	
}
