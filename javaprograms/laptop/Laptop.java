package com.xworkz.clone.laptop;

public class Laptop implements Cloneable {
	
	private String name;
	private int cost;
	private int ram;
	private String type;
	
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
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    @Override
    public String toString() {
    	return "Laptop [name=" + name + ", cost=" + cost + ", ram=" + ram + ", type=" + type + "]";
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
    	System.out.println("implements clone");
    	return super.clone();
    }
}
