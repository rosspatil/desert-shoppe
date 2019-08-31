package com.dessertitem.cookie;

import com.dessertitem.DessertItem;

public class Cookie extends DessertItem{
	private int number;
	private int price;
	public Cookie(int number, int price) {
		super();
		this.number = number;
		this.price = price;
	}
	
	public Cookie() {
		number=0;
		price=0;
	}

	@Override
	public String toString() {
		return "Cookie [number=" + number + ", price=" + price + "]\n";
	}
	
	@Override
	public double costOfItem() {
		
		return number/12*price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
