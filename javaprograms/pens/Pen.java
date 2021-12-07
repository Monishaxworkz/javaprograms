package com.xworkz.clone.pens;

public class Pen implements Cloneable {
	
	private String name;
	private int cost;
	private String type;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Pen [name=" + name + ", cost=" + cost + ", type=" + type + ", color=" + color + "]";
	}
   @Override
   public Object clone() throws CloneNotSupportedException{
	   System.out.println("implements clonable");
	   return super.clone();
   }
}
