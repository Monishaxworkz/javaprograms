package com.xworkz.clone.mobiles;

public class MobileTester {
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Mobile mob=new Mobile();
		mob.setName("Redmi Note 9");
		mob.setCost(11000);
		mob.setRam("4gb");
		mob.setBatteryCapacity("4500mah");
		
		Object obj=mob.clone();
		Mobile mob1=(Mobile)obj;
		System.out.println(mob1.toString());
	}

}
