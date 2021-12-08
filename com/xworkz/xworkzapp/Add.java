package com.xworkz.xworkzapp;

import java.util.ArrayList;
import java.util.Collection;

public class Add {
	public static void main(String[] a) {
		
		//Abstraction
		Collection collection = new ArrayList<>();
		
		collection.add(1);
		collection.add("snapchat");
		collection.add(263.00);
		collection.add('D');
		
	    collection.remove("snapchat");
	    
	// collection.removeAll(collection);
		
	System.out.println(	collection.size());
	collection.forEach(System.out::println);
	
	
	}

}
