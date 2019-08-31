package com.dessertitem.icecream.sundae;

import com.dessertitem.icecream.IceCream;

public class Sundae extends IceCream {
	private int costOfTopping;
	public Sundae() {
		costOfTopping=0;
	}
	public int getCostOfTopping() {
		return costOfTopping;
	}
	public void setCostOfTopping(int costOfTopping) {
		this.costOfTopping = costOfTopping;
	}
	public Sundae(int cost, int costOfTopping) {
		super(cost);
		this.costOfTopping = costOfTopping;
	}
	@Override
	public String toString() {
		return "Sundae [cost of Icecream="+super.getCost()+" ,costOfTopping=" + costOfTopping + "]\n";
	}
	
	@Override
	public double costOfItem() {		
		return super.costOfItem()+costOfTopping;
	}
	
	
}
