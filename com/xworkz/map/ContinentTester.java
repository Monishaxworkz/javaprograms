package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContinentTester {
	public static void main(String[] args) {
		Map<String,String> ma = new HashMap<>();
		ma.put("Asia", "India");
		ma.put("South america", "Argentaina");
		ma.put("North America", "canada");
		ma.put("Africa", "Egypt");
		ma.put("Europe", "Australia");
		
		boolean cont = ma.containsKey("Asia");
		System.out.println("Entered Key is there:-"+" "+cont);
		
		boolean conta = ma.containsValue("India");
		System.out.println("Entered value is there:-"+" "+conta);
		
		String val = ma.get("Asia");
		System.out.println("the value for entered key is="+" "+val);
		
		System.out.println("the size of hash map is "+" "+ma.size());
		
		Set<String> se = ma.keySet();
		
		se.forEach((e)->{
			System.out.println("the continents are:- "+e);
		});
	}

}
