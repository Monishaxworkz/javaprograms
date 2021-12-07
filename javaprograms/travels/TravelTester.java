package com.xworkz.clone.travels;

public class TravelTester {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Travels tra = new Travels();
		tra.setName("V R L");
		tra.setOwner("Someshwara");
		tra.setMainBranch("Ballari");
		tra.setNoOfVehicles(10);
		
		
		Object obj = tra.clone();
		Travels tra1=(Travels)obj;
		System.out.println(tra1.toString());
	}

}
