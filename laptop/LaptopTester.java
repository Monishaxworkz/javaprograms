package com.xworkz.clone.laptop;

public class LaptopTester {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Laptop lap=new Laptop();
		lap.setName("Lenovo");
		lap.setCost(30000);
		lap.setRam(4);
		lap.setType("Company");
		
		Object obj = lap.clone();
		Laptop lap2=(Laptop)obj;
		System.out.println(lap2.toString());
	}

}
