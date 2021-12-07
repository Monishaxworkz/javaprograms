package com.xworkz.clone.stadiums;

public class StadiumTester {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Stadiums sta=new Stadiums();
		sta.setName("Kanteerava Stadium");
		sta.setPlace("Bangalore");
		sta.setStrength(35000);
		sta.setType("Outdoor Stadium");
		
		
		Object obj=sta.clone();
		Stadiums sta2=(Stadiums)obj;
		System.out.println(sta2.toString());
	}

}
