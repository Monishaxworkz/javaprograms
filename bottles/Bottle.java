package com.xworkz.clone.bottles;

public class Bottle implements Cloneable {
	
	   private String brand;
	   private int cost;
	   private String type;
	   private int quantity;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	   @Override
	   public String toString() {
		   return "Bottle [brand=" + brand + ", cost=" + cost + ", type=" + type + " ,quantity=" + quantity +"]";
		   
	   }
	   
	   @Override
	   public Object clone() throws CloneNotSupportedException {
		   System.out.println("implements clone");
		   return super.clone();
	   }
	   

}
