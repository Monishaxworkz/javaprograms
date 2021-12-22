package com.xworkz.stream.river;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RiverTester {

	public static void main(String[] args) {
		 RiverDto dto = new RiverDto("Yamuna", "India",526,"uttharakshi");
		 RiverDto dto1 = new RiverDto("Tunga", "Karnataka",126,"Chikkamagaluru");
		 RiverDto dto2 = new RiverDto("Kaveri", "Karnataka and TamilNadu",260,"Talakaveri");
		 RiverDto dto3 = new RiverDto("Krishna", "Vijaywada and Sangali",1600,"Mahabaleshwara");
		 
		 Stream<RiverDto> str = Stream.of(dto,dto1,dto2,dto3);
		 
		 System.out.println("------Filtered by where length>100 and sorted in decending order");
		 str.filter((dt)->dt.getLonger()>500)
		 .sorted((dt1,dt2)->dt1.getLonger()
				 .compareTo(dt2.getLonger()))
		 .collect(Collectors.toList())
		 .forEach((a)->System.out.println(a));
		 
		 System.out.println("-------sorted in descending order---------");
		 Stream<RiverDto> str1 = Stream.of(dto,dto1,dto2,dto3);
		 str1.filter((dt)->dt.getLonger()>500)
		 .sorted((dt1,dt2)->dt2.getLonger()
				 .compareTo(dt1.getLonger()))
		 .collect(Collectors.toList())
		 .forEach((m)->System.out.println(m));
		 
		 
		 
	}
	
}
