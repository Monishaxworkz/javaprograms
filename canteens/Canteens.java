package com.xworkz.clone.canteens;

public class Canteens implements Cloneable{
	
	  private String name;
	  private String type;
	  private int noOfDishes;
	  private String famousDish;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfDishes() {
		return noOfDishes;
	}
	public void setNoOfDishes(int noOfDishes) {
		this.noOfDishes = noOfDishes;
	}
	public String getFamousDish() {
		return famousDish;
	}
	public void setFamousDish(String famousDish) {
		this.famousDish = famousDish;
	}
	@Override
	public String toString() {
		 return "Canteens [name=" + name + ", type=" + type + ", noOfDishes=" + noOfDishes + ", famousDish=" + famousDish + "]";
		 
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("invoked cloneable");
		return super.clone();
	}
	

}
