package com.xworkz.clone.canteens;

public class CanteenTester {
	 public static void main(String[] args) throws CloneNotSupportedException {
		 
		 Canteens can=new Canteens();
		 can.setName("Donne Biriyani");
		 can.setType("non-vegetarian");
		 can.setNoOfDishes(5);
		 can.setFamousDish("Chicken-65");
		 
		 Object obj=can.clone();
		 Canteens can1=(Canteens)obj;
		 System.out.println(can1.toString());
	 }

}
