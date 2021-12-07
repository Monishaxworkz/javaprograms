package com.xworkz.clone.hospitals;

public class Hospital implements Cloneable {
	
	private String name;
	private String place;
	private int capacity;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		 return "Hospital [name=" + name + ", place=" + place + ", capacity=" + capacity + ", type=" + type + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("invoked clonable");
		return super.clone();
	}

}
