package com.xworkz.Dao.Pgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PgDao {
	
	Collection<String> col = new ArrayList<String>();
	
	public boolean create(String name) {
		return col.add(name);
	}
	
	public boolean read(String name) {
		return col.contains(name);
	}
	
	public boolean caseSensitive(String value) {
		Iterator<String> it = col.iterator();
		 while(it.hasNext()) {
			 String val = it.next();
			 if(val.equalsIgnoreCase(value)) {
				 System.out.println("The pg Name is"+ val);
				 return true;
			 }
		 }
		 return false;
	}
	public boolean caseSensitiveAndTrimmed(String name) {
		Iterator<String> it2 = col.iterator();
		  while(it2.hasNext()) {
			   String val2 = it2.next();
			   val2 = val2.replace(" ", "");
			   if(val2.equalsIgnoreCase(name)) {
				   return true;
			   }
		  }
		  return false;
	}

}
