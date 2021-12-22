package com.xworkz.stream.temple;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempleTester {
	public static void main(String[] args) {
		
		TempleDto dto = new TempleDto("Dharmasthala","Manjunatha Swamy",10000,"South Karnataka");
		TempleDto dto1 = new TempleDto("Murudeshwara","Mahadeva",100000,"Mangalore");
		TempleDto dto2 = new TempleDto("Mantralayam","Raghavendra Swamy",100000,"Andhra Pradesh");
		TempleDto dto3 = new TempleDto("Isckon Temple","Krishna",1000000,"Bangalore");
		TempleDto dto4 = new TempleDto("Sree Virupaksha Temple","Shiva",10000000,"Hampi");
		
		
		Stream<TempleDto> str = Stream.of(dto,dto1,dto2,dto3,dto4);
		
		System.out.println("-------filter ordered by no of visitor>1000 and sort location by ascending order--------");
		
		str.filter((e)->e.getNoOfVisitors()>1000)
		.sorted((a,a1)->a.getLocation()
				.compareTo(a1.getLocation()))
		.collect(Collectors.toList())
		.forEach((s)->System.out.println(s));
	}

}
