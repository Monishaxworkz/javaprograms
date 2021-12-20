package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountNo {

	public static void main(String[] args) {
		Stream<Long> stream = Stream.of(12345678934567L,90876543215674L,73382566635463L,80884700165432L,87654321984567L,
				                        67895463216534L,32415467431867L,98763452165432L,76548904325643L,34526173465321L,
				                        67542389102345L,23418759067321L,94810478002341L,94801785625436L,93535666064321L,
				                        87655643214789L,56001658310178L,56784321766567L,55533664488966L,33211677889934L,
				                        55667744339985L);
		List<Long> list = stream.collect(Collectors.toList());
		list.forEach((accno)->System.out.println(accno));
				
	}
}
