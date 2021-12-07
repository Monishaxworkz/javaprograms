package com.xworkz.clone.showrooms;

public class ShowroomTester {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		ShowRoom show=new ShowRoom();
		show.setName("Tata Motors");
		show.setPlace("Ballari");
		show.setCapacity(10);
		show.setType("Toyata");
		
		Object obj=show.clone();
		ShowRoom show1=(ShowRoom)obj;
		System.out.println(show1.toString());
	}

}
