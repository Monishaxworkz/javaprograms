package com.xworkz.map.mapentry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Bar {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		map.put("Whisky", 450);
		map.put("Tequila", 400);
		map.put("Rum", 350);
		map.put("Vodka", 200);
		map.put("Brandy", 100);
		
		System.out.println("-------Brands are-------");
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String val = it.next();
			System.out.println(val);
		}
		System.out.println("-----cost is------");
		Collection<Integer> set1 = map.values();
		Iterator<Integer> it1 = set1.iterator();
		while(it1.hasNext()) {
			int val2 = it1.next();
			System.out.println(val2);
		}
		System.out.println("-----ascending order------");
		
		Map<String,Integer> map1 = new TreeMap<String,Integer>();
		map1.put("Whisky", 450);
		map1.put("Tequila", 400);
		map1.put("Rum", 350);
		map1.put("Vodka", 200);
		map1.put("Brandy", 100);
		
		Set<String> set2 = map1.keySet();
		Iterator<String> it3 = set2.iterator();
		while(it3.hasNext()) {
			String val3 = it3.next();
			System.out.println(val3);
		}
		System.out.println("-------descending order------");
		
		Map<String,Integer> map2 = new TreeMap<String,Integer>();
		map2.put("Whisky", 450);
		map2.put("Tequila", 400);
		map2.put("Rum", 350);
		map2.put("Vodka", 200);
		map2.put("Brandy", 100);
		
		Set<String> set3 = map1.keySet();
		Iterator<String> it4 = set2.iterator();
		while(it4.hasNext()) {
			String val4 = it4.next();
			System.out.println(val4);
		}
	}
}
