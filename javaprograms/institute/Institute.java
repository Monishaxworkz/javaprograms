package com.xworkz.clone.institute;

public class Institute implements Cloneable {
	
	private String name;
	private String type;
	private int noOfBranches;
	private String hrName;
	
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
	public int getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
     @Override
     public String toString() {
    	 return "Institute [name=" + name + ", type=" + type + ", noOfBranches=" + noOfBranches + ", hrName=" + hrName + "]";
     }
     @Override
     public Object clone() throws CloneNotSupportedException{
    	 System.out.println("implements clonable");
    	 return super.clone();
     }
}
