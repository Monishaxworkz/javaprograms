package com.xworkz.map.mapentry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Area {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("ABVL", "418sq.ft");
		map.put("Gandhi nagar", "100.58sq.mi");
		map.put("Mothi Circle", "2184sq.ft");
		map.put("Royal Circle", "1200sq.ft");
		
		System.out.println("---------------print keys only-----------");
		Set<String> se = map.keySet();
		se.forEach((e)->System.out.println(e));
		
		System.out.println("--------print values ony---------");
		Collection<String> se1 = map.values();
		se1.forEach((e)->System.out.println(e));
		
		System.out.println("------print both keys and values--------");
		Set<Map.Entry<String,String>> se2= map.entrySet();
		Iterator<Map.Entry<String, String>> it=se2.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> val=it.next();
			System.out.println(val);
		}
		System.out.println("-------Arranging in ascending order-------");
		
		Map<String,String> map1 = new TreeMap<String,String>();
		map1.put("ABVL", "418sq.ft");
		map1.put("Gandhi nagar", "100.58sq.mi");
		map1.put("Mothi Circle", "2184sq.ft");
		map1.put("Royal Circle", "1200sq.ft");
		
		System.out.println("---------------print keys only-----------");
		Set<String> se4 = map1.keySet();
		se4.forEach((e)->System.out.println(e));
		
		System.out.println("--------Descending order---------");
		
		Map<String,String> map2 = new TreeMap<String,String>();
		map2.put("ABVL", "418sq.ft");
		map2.put("Gandhi nagar", "100.58sq.mi");
		map2.put("Mothi Circle", "2184sq.ft");
		map2.put("Royal Circle", "1200sq.ft");
		
		System.out.println("---------------print keys only-----------");
		Set<String> se5 = map2.keySet();
		se.forEach((e)->System.out.println(e));
		
	}
}
