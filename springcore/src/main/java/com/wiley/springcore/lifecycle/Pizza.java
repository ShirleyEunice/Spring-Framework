package com.wiley.springcore.lifecycle;

public class Pizza {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pizza(double price) {
		super();
		this.price = price;
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}
	public void init() {
		System.out.println("Iniside the init method");
	}
	public void destroy() {
		System.out.println("Inside the destroy method");
	}
	

}
