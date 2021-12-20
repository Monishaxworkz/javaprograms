package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountryTester {

	public static void main(String[] args) {
		Map<String,Integer> map= new HashMap<String,Integer>();
		   map.put("India", 91);
		   map.put("Canada", 1);
		   map.put("russia", 7);
		   map.put("egypt", 20);
		   
		   boolean contains = map.containsKey("India");
		   System.out.println("The Entered country is prsent:-" + contains);
		   
		   boolean contains1 = map.containsKey("Sri-lanka");
		   System.out.println("The Entered Country is present:-" + contains1);
		   
		   boolean value = map.containsValue(91);
		   System.out.println("value is there="+value);
		   
		   int val = map.get("India");
		   System.out.println(val);
		   
		   int siz = map.size();
		   System.out.println("The size is" +siz);
		   
		   map.replace("United states", 1);
		   
		   Set<String> keys = map.keySet();
		   
		   keys.forEach((e)->{
			   System.out.println("The key value is:-"+" "+e);
		   });
	}
}
