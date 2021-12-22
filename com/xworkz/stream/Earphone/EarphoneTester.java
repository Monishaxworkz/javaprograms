package com.xworkz.stream.Earphone;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EarphoneTester {

	public static void main(String[] a) {
		
		EarphoneDto Ear = new EarphoneDto("Redmi",1300,14,"Bluetooth");
		EarphoneDto Ear1 = new EarphoneDto("Apple",319,12,"wired and Bluetooth");
		EarphoneDto Ear2 = new EarphoneDto("Boat",400,13,"Wired");
		EarphoneDto Ear3 = new EarphoneDto("one plus",800,54,"Bluetooth ear buds");
		
		Stream<EarphoneDto> str = Stream.of(Ear,Ear1,Ear2,Ear3);
		
		System.out.println("--------filter by where cost>500 and sorted by brand in ascending order-----");
		
		str.filter((e)->e.getCost()>500)
		.sorted((e,e1)->e.getBrand()
				.compareTo(e1.getBrand()))
		.collect(Collectors.toList())
		.forEach((m)->System.out.println(m));
		
		System.out.println("-------print only models-----------");
		Stream<EarphoneDto> str1 = Stream.of(Ear,Ear1,Ear2,Ear3);
		str1.sorted((e,e1)->e.getBrand()
				.compareTo(e.getBrand()))
		.map((e)->e.getBrand())
		.collect(Collectors.toList())
		.forEach((m)->System.out.println(m));
	}
}
