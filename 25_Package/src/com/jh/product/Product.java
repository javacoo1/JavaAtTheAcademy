package com.jh.product;

public class Product {
	String name;
	int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	void printInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
		
		
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
