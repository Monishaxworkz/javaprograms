package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTester {
 
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap();
		
		map.put("IND", 91);
		map.put("UGANDA", 256);
		map.put("TURKEY", 90);
		map.put("SWEDEN", 46);
		map.put("SAUDI", 966);
		map.put("RUSSIA", 7);
		map.put("IND", 93);
		System.out.println(map.size());
		
		Integer value = map.get("IND");
		System.out.println(value);
		
		// one element
		// all --> keys , values , both
		boolean contains = map.containsKey("PAK");
		System.out.println(contains);
		
		contains = map.containsValue(256);
		System.out.println(contains);
		
		//access all element
		
		Set<String> keys = map.keySet();
		//iterator, for each , forEach
		
		//consumer--Functional Interface--accept(E)
		keys.forEach((e)->{
			System.out.println(e);
		});
		
	}
}
