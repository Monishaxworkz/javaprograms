package com.xworkz.fuctional.president;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PresidentDao {

	Collection col = new ArrayList();
	
	boolean add(PresidentDto president) {
		return col.add(president);
	}
	
	public boolean find(PresidentInterface ipre , String str) {
		Iterator<PresidentDto> itr = col.iterator();
		while(itr.hasNext()) {
			PresidentDto dto1 = itr.next();
			if(ipre.search(dto1, str)) {
				return true;
			}
		}
		return false;
	}
}
