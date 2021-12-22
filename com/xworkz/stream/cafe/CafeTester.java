package com.xworkz.stream.cafe;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CafeTester {

	public static void main(String[] args) {
		
		CafeDto dto = new CafeDto("Tosta Cafe","Veg","CB Main road",4.3f,1);
		CafeDto dto1 = new CafeDto("Lassi Day","Veg","Devi Nagar",4.0f,2);
		CafeDto dto2 = new CafeDto("5pm cafe","Veg","Siddarath Nagar",4.1f,3);
		CafeDto dto3 = new CafeDto("new stonedcafe","Veg","near OPD",4.0f,4);
		
		Stream<CafeDto> se = Stream.of(dto, dto1,dto2,dto3);
		se.filter((e)->e.getRatings()>3)
		.sorted((e,e1)->e1.getName()
				.compareTo(e.getName()))
		.collect(Collectors.toList())
		.forEach((a)->System.out.println(a));
		//se.collect(Collectors.toList()).forEach((e)->System.out.println(e));
		//se.forEach((e)->System.out.println(e));
	}
}
