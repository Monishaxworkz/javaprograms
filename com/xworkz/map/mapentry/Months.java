package com.xworkz.map.mapentry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Months {

	public static void main(String[] args) {
		
		Map<String,Integer> ma = new HashMap();
		ma.put("January", 31);
		ma.put("Febrauary", 28);
		ma.put("March", 31);
		ma.put("April", 30);
		ma.put("May", 31);
		ma.put("June", 30);
		ma.put("July", 31);
		ma.put("August", 31);
		ma.put("September", 30);
		ma.put("October", 31);
		ma.put("November", 30);
		ma.put("December", 31);
		
		System.out.println("---------------the months are-----------");
		Set<String> se = ma.keySet();
		se.forEach((e)->System.out.println(e));
		
		System.out.println("--------No of days are---------");
		Collection<Integer> se1 = ma.values();
		se1.forEach((e)->System.out.println(e));
		
		System.out.println("------Name of the month and No of days--------");
		Set<Map.Entry<String,Integer>> se2= ma.entrySet();
		Iterator<Map.Entry<String, Integer>> it=se2.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Integer> val3=it.next();
			System.out.println(val3);
		}
		System.out.println("-------Arranging in ascending order-------");
		
		Map<String,Integer> ma1 = new TreeMap<String,Integer>((e,e1)->e.compareTo(e1));
		
		ma1.put("January", 31);
		ma1.put("Febrauary", 28);
		ma1.put("March", 31);
		ma1.put("April", 30);
		ma1.put("May", 31);
		ma1.put("June", 30);
		ma1.put("July", 31);
		ma1.put("August", 31);
		ma1.put("September", 30);
		ma1.put("October", 31);
		ma1.put("November", 30);
		ma1.put("December", 31);
		
		System.out.println("-----------the months are---------");
		Set<String> se4 = ma1.keySet();
		se4.forEach((e)->System.out.println(e));
		
		System.out.println("--------Arranging in descending order-------");
		
		Map<String,Integer> ma2 = new TreeMap<String,Integer>((e,e1)->e.compareTo(e1));
		
		ma2.put("January", 31);
		ma2.put("Febrauary", 28);
		ma2.put("March", 31);
		ma2.put("April", 30);
		ma2.put("May", 31);
		ma2.put("June", 30);
		ma2.put("July", 31);
		ma2.put("August", 31);
		ma2.put("September", 30);
		ma2.put("October", 31);
		ma2.put("November", 30);
		ma2.put("December", 31);
		
		System.out.println("--------the months are--------");
		Set<String> se5 = ma2.keySet();
		se5.forEach((e)->System.out.println(e));
		
		
		
		
		
		
	}
}
