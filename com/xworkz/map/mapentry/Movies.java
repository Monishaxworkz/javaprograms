package com.xworkz.map.mapentry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Movies {

	public static void main(String[] args) {
		
		Map<String,Double> map = new HashMap<String,Double>();
		map.put("Appu", 9.3);
		map.put("Abhi", 9.1);
		map.put("Akash", 9.4);
		map.put("Yuvaratna", 8.3);
		map.put("Arasu", 9.0);
		map.put("Power", 7.3);
		map.put("Chakravuyha", 9.5);
		map.put("James", 9.9);
		
		System.out.println("---------------movie names are-----------");
		Set<String> se = map.keySet();
		se.forEach((e)->System.out.println(e));
		
		System.out.println("--------movies ratings are---------");
		Collection<Double> se1 = map.values();
		se1.forEach((e)->System.out.println(e));
		
		System.out.println("------movies and their imdb ratings--------");
		Collection<Map.Entry<String,Double>> col3= map.entrySet();
		Iterator<Map.Entry<String, Double>> itr=col3.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Double> val3=itr.next();
			System.out.println(val3);
		}
		System.out.println("-------Arranging in ascending order-------");
		
		Map<String,Double> map1 = new TreeMap<String,Double>();
		map1.put("Appu", 9.3);
		map1.put("Abhi", 9.1);
		map1.put("Akash", 9.4);
		map1.put("Yuvaratna", 8.3);
		map1.put("Arasu", 9.0);
		map1.put("Power", 7.3);
		map1.put("Chakravuyha", 9.5);
		map1.put("James", 9.9);
		
		System.out.println("-----------movie names are--------");
		Set<String> se3 = map1.keySet();
		se3.forEach((e)->System.out.println(e));
		
		System.out.println("--------Arranging in descending order-------");
		
		Map<String,Double> map2 = new TreeMap<String,Double>();
		map2.put("Appu", 9.3);
		map2.put("Abhi", 9.1);
		map2.put("Akash", 9.4);
		map2.put("Yuvaratna", 8.3);
		map2.put("Arasu", 9.0);
		map2.put("Power", 7.3);
		map2.put("Chakravuyha", 9.5);
		map2.put("James", 9.9);
		
		System.out.println("-----------movie names are--------");
		Set<String> se4 = map2.keySet();
		se4.forEach((e)->System.out.println(e));
	}
}
