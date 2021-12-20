package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyboardTester {

	public static void main(String[] args) {
		Map<String,String> ma = new HashMap<>();
		ma.put("Num Key","1,2,3,4,5,6,7,8,9,0");
		ma.put("Character Key", "A-Z");
		ma.put("Special keys","!,@,#,$........");
		
		System.out.println("the values are"+" "+ma.get("Num Key"));
		
		Set se = ma.keySet();
		se.forEach((e)->{
			System.out.println("the types are in key board:-"+" "+e);
		});
	}
}
