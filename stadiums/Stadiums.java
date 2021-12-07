package com.xworkz.clone.stadiums;

public class Stadiums implements Cloneable {
	
	private String name;
	private int strength;
	private String place;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    @Override
    public String toString() {
    	return "Stadiums [name=" + name + ", strength=" + strength + ", place=" + place + ", type=" + type + "]";
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
    	System.out.println("implemented clonable");
    	return super.clone();
    }
}
