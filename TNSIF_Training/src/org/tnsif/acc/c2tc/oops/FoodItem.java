package org.tnsif.acc.c2tc.oops;

public class FoodItem {
	//variable
	String name;
	double price;
	String category;
	
	//method
	
	void displayDetails() {
		System.out.println("Food Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Category:"+category);
		System.out.println("-----");
	}
public static void main(String[] args) {
	FoodItem fI1=new FoodItem();
	fI1.name="Biriyani";
	fI1.price=300.00;
	fI1.category="Non Veg";
	
	fI1.displayDetails();
	
	FoodItem fI2=new FoodItem();
	fI2.name="Pizza";
	fI2.price=599.00;
	fI2.category="Fast Food";

	fI2.displayDetails();
}
}
