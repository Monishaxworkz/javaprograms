package com.xworkz.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Area {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Rajkumar road","Mothi circle","Royal circle","gandhi nagar","ABVL road",
				                          "SP Circle","Avanbhavi","Cantonment","Moka road","Bangalore road","Jain market",
				                          "Rajajinagar","BTM layout","Rajrajeshwar","Jayanagar","Marathalli","Uttarhalli",
				                          "Hebbal","Electronic city","Hoskote");
		List<String> list = stream.map(String::toLowerCase).sorted().collect(Collectors.toList());
		list.forEach((area)->System.out.println(area));
		System.out.println();
		
		Stream<String> stream1 = Stream.of("Rajkumar road","Mothi circle","Royal circle","gandhi nagar","ABVL road",
                "SP Circle","Avanbhavi","Cantonment","Moka road","Bangalore road","Jain market",
                "Rajajinagar","BTM layout","Rajrajeshwar","Jayanagar","Marathalli","Uttarhalli",
                "Hebbal","Electronic city","Hoskote");
		List<String> list1 = stream1.map(String::toUpperCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        list1.forEach((area)->System.out.println(area));
	}
}
