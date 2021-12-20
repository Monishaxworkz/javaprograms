package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LaptopTester {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		
		map.put("Dell", "intel core 15.6");
		map.put("Acer","pentium quad core");
		map.put("Hp", "intel core i5");
		
		String val = map.get("Dell");
		System.out.println("the model is:"+val);
		
		boolean cont = map.containsKey("Hp");
		System.out.println("the entered model is there"+cont);
		
		Set<String> se = map.keySet();
		
		se.forEach((e)->{
			System.out.println("the type of laptop are"+ e);
		});
	}
}
