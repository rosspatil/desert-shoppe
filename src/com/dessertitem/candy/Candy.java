package com.dessertitem.candy;

import com.dessertitem.DessertItem;

public class Candy extends DessertItem {
	
	
	private double weight;
	private int price;
	
	public Candy() {
		weight=0.0;
		price=0;
	}

	public Candy(double weight, int price) {
		super();
		this.weight = weight;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Candy [weight=" + weight + ", price=" + price + "]\n";
	}

	@Override
	public double costOfItem() {
		
		return (weight/1000)*price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
