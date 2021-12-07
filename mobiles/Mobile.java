package com.xworkz.clone.mobiles;

public class Mobile implements Cloneable {
	
	private String name;
	private int cost;
	private String ram;
	private String batteryCapacity;
	
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
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
    @Override
    public String toString() {
    	return "Mobile [name=" + name + ", cost=" + cost + ", ram=" + ram + ", batteryCapacity=" + batteryCapacity + "]";
    }
    @Override
      public Object clone() throws CloneNotSupportedException{
    	System.out.println("implements clonable");
    	return super.clone();
    }
}
