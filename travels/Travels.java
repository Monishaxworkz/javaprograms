package com.xworkz.clone.travels;

public class Travels implements Cloneable {
	
	private String name;
	private String owner;
	private int noOfVehicles;
	private String mainBranch;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getNoOfVehicles() {
		return noOfVehicles;
	}
	public void setNoOfVehicles(int noOfVehicles) {
		this.noOfVehicles = noOfVehicles;
	}
	public String getMainBranch() {
		return mainBranch;
	}
	public void setMainBranch(String mainBranch) {
		this.mainBranch = mainBranch;
	}
    @Override
    public String toString() {
    	return "Travels [name=" + name + ", owner=" + owner + ", noOfVehicles=" + noOfVehicles +", mainBranch=" + mainBranch + "]";
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
    	System.out.println("invoked clonable");
    	return super.clone();
    }
}
