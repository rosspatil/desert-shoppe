package com.dessertitem.checkout;

import java.util.Scanner;
import com.dessertitem.DessertItem;
import com.dessertitem.candy.Candy;
import com.dessertitem.cookie.Cookie;
import com.dessertitem.icecream.IceCream;
import com.dessertitem.icecream.sundae.Sundae;

public class TestCheckOut {


	public static void main(String... args) {
		Scanner sc=new Scanner(System.in);
		int ch=0, ch1=0;
		DessertItem dsit=null;
		CheckOut checkOut=new CheckOut();

		while(true){
			System.out.println("****** Welcome To Dessert Shoppe ******");
			System.out.println("---------------------------------------");
			System.out.println("1.Add Items \n2.Print number of Items");
			System.out.println("3.Print total cost of Items");
			System.out.println("4.Print all items \n5.Clear all items");
			System.out.print("Enter your choice: ");
			ch=sc.nextInt();
			switch (ch) {
			case 1:{

				System.out.println("Select among the items: ");
				System.out.println("1.Candy\n2.Cookie\n3.Icecream\n4.Sundaes");
				ch1=sc.nextInt();
				switch (ch1) {
				case 1:
					double weight;
					int price;
					System.out.print("Enter weight: ");
					weight=sc.nextDouble();
					System.out.print("Enter price: ");
					price=sc.nextInt();
					dsit=new Candy(weight, price);
					checkOut.addItem(dsit);
					break;

				case 2:
					int number;
					int price1;
					System.out.print("Enter number: ");
					number=sc.nextInt();
					System.out.print("Enter price: ");
					price1=sc.nextInt();
					dsit=new Cookie(number, price1);
					checkOut.addItem(dsit);
					break;
				case 3:
					int cost;
					System.out.print("Enter price: ");
					cost=sc.nextInt();
					dsit=new IceCream(cost);
					checkOut.addItem(dsit);
					break;
				case 4:
					int cost1,cost2;
					System.out.print("Enter price of Icecream : ");
					cost1=sc.nextInt();
					System.out.print("Enter price of Topping : ");
					cost2=sc.nextInt();
					dsit=new Sundae(cost1,cost2);
					checkOut.addItem(dsit);
					break;					
				}
			}

			break;

			case 2:{
				checkOut.totalItem();
			}

			break;
			case 3:{
				System.out.println(checkOut.totalCost());
			}

			break;
			case 4:{
				System.out.println(checkOut);
			}

			break;
			case 5:{
				checkOut.clearItem();
			}

			break;
			}
		}
	}

}
