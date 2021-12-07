package com.xworkz.clone.hospitals;

public class HospitalTester {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Hospital hos= new Hospital();
		hos.setName("Manipal Hospital");
		hos.setCapacity(100);
		hos.setPlace("Jayanagar");
		hos.setType("heart hospital");
		
		Object obj=hos.clone();
		Hospital hos1=(Hospital)obj;
		System.out.println(hos1.toString());
	}

}
