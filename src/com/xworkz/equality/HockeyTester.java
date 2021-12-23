package com.xworkz.equality;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.equality.dto.HockeyDTO;

public class HockeyTester {

	public static void main(String[] args) {
		
		HockeyDTO dto = new HockeyDTO("BharatArmy",81,12,"India");
		HockeyDTO dto1 = new HockeyDTO("Punjab Warriors",78,14,"India");
		HockeyDTO dto2 = new HockeyDTO("Red Sticks",10,9,"spain");
		HockeyDTO dto3 = new HockeyDTO("Seattle kraken",30,8,"India");
		HockeyDTO dto4 = new HockeyDTO("Detroit Red Wings",35,5,"Germany");
		
		boolean val1 = dto.getPlace().equals(dto1.getPlace());
		System.out.println("the places are equal:"+"  "+val1);
		
		Set<HockeyDTO> se = new HashSet<HockeyDTO>();
		se.add(dto4);
		se.add(dto2);
		se.add(dto3);
		se.add(dto1);
		se.add(dto);
		
		Optional<HockeyDTO> val = se.stream().filter((e)->e.getWins()>10).sorted((q,q1)->q.getPlace().compareTo(q1.getPlace())).findFirst();
		System.out.println(val);
		System.out.println("The size is"+"  "+se.size());
	}
}
