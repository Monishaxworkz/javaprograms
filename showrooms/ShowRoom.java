package com.xworkz.clone.showrooms;

public class ShowRoom implements Cloneable {
	
	private String name;
	private String type;
	private int capacity;
	private String place;
	
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
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
    @Override
    public String toString() {
    	return "ShowRoom [name=" + name + ", type=" + type + ", capacity=" + capacity + ", place=" + place + "]";
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
    	System.out.println("invoked cloneable");
    	return super.clone();
    }
}
