package com.dessertitem.icecream;

import com.dessertitem.DessertItem;

public class IceCream extends DessertItem {
	private int cost;

	public IceCream(int cost) {
		super();
		this.cost = cost;
	}
	public IceCream() {
		cost=10;
	}
	@Override
	public String toString() {
		return "IceCream [cost=" + cost + "]\n";
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public double costOfItem() {
		return cost;
	}
	
	
}
