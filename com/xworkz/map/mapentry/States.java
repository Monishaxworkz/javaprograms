package com.xworkz.map.mapentry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class States {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Karnataka", 31);
		map.put("Goa", 4);
		map.put("TamilNadu", 38);
		map.put("Maharastra", 36);
		map.put("Punjab", 23);
		map.put("Uttar Pradesh", 71);
		
		Collection<String> se = map.keySet();
		Iterator<String> it = se.iterator();
		
		while(it.hasNext()) {
			String val = it.next();
			System.out.println(val);
		}
		System.out.println("-----------------------------");
		
		Collection<Integer> valu = map.values();
		valu.forEach((e)->{System.out.println("The value of the given map is "+" "+e);});
		
		System.out.println("----------------------------");
		
		Set<Map.Entry<String,Integer>> se1 = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> itr1 = se1.iterator();
		System.out.println("States"+"     "+"No of districts");
		
		while(itr1.hasNext()) {
			Map.Entry<String, Integer> val1 = itr1.next();
			
			System.out.println("Name of the state is:-"+" "+val1.getKey());
			System.out.println("Total no of disricts in:-"+" "+val1.getKey()+" "+val1.getValue());
			}
		System.out.println("-------------after sorting in descending----------");
		
		Map<String,Integer> map2 = new TreeMap<String,Integer>((e1,e2)->e2.compareTo(e1));
		map2.put("Karnataka", 31);
		map2.put("Goa", 4);
		map2.put("TamilNadu", 38);
		map2.put("Maharastra", 36);
		map2.put("Punjab", 23);
		map2.put("Uttar Pradesh", 71);
		
		Set<String> se2 = map2.keySet();
		Iterator<String> it2 = se2.iterator();
		
		while(it2.hasNext()) {
			String val2 = it2.next();
			System.out.println(val2);
		}
		System.out.println("----------ascending order----------");
		
		Map<String,Integer> map3 = new TreeMap<>((e,e4)->e.compareTo(e4));
		map3.put("Karnataka", 31);
		map3.put("Goa", 4);
		map3.put("TamilNadu", 38);
		map3.put("Maharastra", 36);
		map3.put("Punjab", 23);
		map3.put("Uttar Pradesh", 71);
		
		Set<String> se3 = map3.keySet();
		Iterator<String> it3 = se3.iterator();
		
		while(it3.hasNext()){
			String val3 = it3.next();
			System.out.println(val3);
		}
		}
}
