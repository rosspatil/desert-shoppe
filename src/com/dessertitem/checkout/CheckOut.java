package com.dessertitem.checkout;


import com.dessertitem.DessertItem;

public class CheckOut {
	
	public static int countOfItem=0;	
	private DessertItem dessertItem[]=new DessertItem[10];
	public void addItem(DessertItem dsIt){
		dessertItem[++countOfItem]=dsIt;
	}
	
	public void clearItem(){
		
		for (int i = 0; i < dessertItem.length; i++) {			
				dessertItem[i]=null;			
		}
		countOfItem=0;
	}
	
	public void totalItem(){
		System.out.println(CheckOut.countOfItem);
	}
	
	public double totalCost(){
		double total=0.0;
		for (int i = 0; i < dessertItem.length; i++) {
			if(dessertItem[i]!=null){
				total+=dessertItem[i].costOfItem();
			}
		}
		return total;
	}

	@Override
	public String toString() {
		String allItem="Total Item:\n";
		for (int i = 0; i < dessertItem.length; i++) {
			if(dessertItem[i]!=null){
				allItem+=dessertItem[i].toString();
				
			}
		}
		return allItem;
	}
	

}
