package com.xworkz.stream.zoo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZooTester {

	public static void main(String[] args) {
		ZooDto zoo = new ZooDto("Bannerghatta",1,"Bangalore",200.00f);
        ZooDto zoo1 = new ZooDto("Mysore Zoo",2,"Mysore",300.00f);
	    ZooDto zoo2 = new ZooDto("National Zoological park",3,"New Delhi",80.00f);
	    ZooDto zoo3 = new ZooDto("Government Aquarium",4,"Bangalore",100.00f);
        ZooDto zoo4 = new ZooDto("Kudremukh mini zoo",5,"India",500.00f);
        
        System.out.println("--------Looping by id<5 and sorting by price in ascending order---------");
        
        Stream<ZooDto> str = Stream.of(zoo,zoo1,zoo2,zoo3,zoo4);
        
        str.filter((e)->e.getId()<5).sorted((e,e1)->e.getTicketPrice().compareTo(e1.getTicketPrice())).collect(Collectors.toList()).forEach((s)->System.out.println(s));
	
	}
}
