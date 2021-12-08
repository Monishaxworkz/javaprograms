package com.xworkz.Dao.iplTeams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IplDao {
	
	Collection<String> col = new ArrayList<String>();
	
	public boolean create(String name) {
		return col.add(name);
	}
	
	public boolean read(String name) {
		return col.contains(name);
	}
	
	public boolean ignoreCaseSensitive(String name) {
		Iterator<String> itr = col.iterator();
		 while(itr.hasNext()) {
			 String val = itr.next();
			    if(val.equalsIgnoreCase(name)) {
			    	System.out.println("The ipl team is ="+" " +val);
			    	return true;
			    }
		 }
		 return false;
	}
	public boolean ignoreCaseSensitiveAndSpaces(String name) {
		Iterator<String> it = col.iterator();
		while(it.hasNext()) {
			String value = it.next();
			value = name.replace(" ", "");
			if(value.equalsIgnoreCase(name)) {
				System.out.println("inside ignoreCaseSensitiveAndSpaces method");
				return true;
			}
		}
		return false;
	}

}
