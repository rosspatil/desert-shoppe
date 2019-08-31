package com.dessertitem;

public abstract class DessertItem {
	private String name;
	
	public DessertItem() {
		name="Empty";
	}
	public DessertItem(String name) {
		this.name = name;
	}

	public abstract double costOfItem();
	
	public final String nameOfItem(){
		return this.name;
	}
	@Override
	public String toString() {
		return "DessertItem [name=" + name + "]\n";
	}
	
	
}
