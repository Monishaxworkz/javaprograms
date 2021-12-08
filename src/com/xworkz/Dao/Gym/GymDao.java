package com.xworkz.Dao.Gym;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GymDao {
	
	Collection<String> col = new ArrayList<String>();
	
	public boolean create(String name) {
		return col.add(name);	
		}
	
	public boolean read(String name) {
		return col.contains(name);
	}
	public boolean ignoreCases(String name) {
		Iterator<String> it=col.iterator();
		  while(it.hasNext()) {
			  String str = it.next();
			   if(str.equalsIgnoreCase(name)) {
				   System.out.println("Inside IgnoreCases method.....");
				   System.out.println("the Gym name is "+ str);
				   return true;
			   }
		  }
		  return false;
		
	}
	public boolean ignoreCasesAndSpaces(String name) {
		
		Iterator<String> it2 = col.iterator();
		while(it2.hasNext()) {
			 String str = it2.next();
			 String str1 = name.replace(" ", "");
			 
			 if(str1.equalsIgnoreCase(name)) {
				 
				 System.out.println("Inside IgnoreCasesAndSpaces");
				 return true;
			 }
		}
		return false;
	}

}
