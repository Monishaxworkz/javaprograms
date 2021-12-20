package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AdharTester {
	public static void main(String[] args) {
		Map ma = new HashMap<>();
		
		ma.put("8765 3452 2341", "Monisha");
		ma.put("8088 4700 1633", "Neha");
		ma.put("9481 4780 6543", "Haritha");
		
		Set se = ma.keySet();
		se.forEach((e)->{
			System.out.println("The adhar numbers are:-"+""+e);
		});
	}
}
