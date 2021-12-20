package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthYear {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1998,1997,1996,1995,2000,2001,2002,1999,2005,1978,1964,2003,1998,2000,2010,2009,2008,2006,2007,2021);
		List<Integer> list= stream.filter((year)->year>1999).sorted().collect(Collectors.toList());
			list.forEach((year)->System.out.println(year));	
	
	}
}
