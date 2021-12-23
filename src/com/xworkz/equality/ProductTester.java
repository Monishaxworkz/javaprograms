package com.xworkz.equality;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.equality.dto.ProductDTO;

public class ProductTester {

	public static void main(String[] args) {
		ProductDTO dto = new ProductDTO(1,"Amul","Milk","100","3");
		ProductDTO dto1 = new ProductDTO(2,"Bata","flipflop","250","1pair");
		ProductDTO dto2 = new ProductDTO(3,"v-one","bag","500","1");
		ProductDTO dto3 = new ProductDTO(1,"Amul","Milk","100","3");
		ProductDTO dto4 = new ProductDTO(1,"Amul","Milk","100","3");
		
		Set<ProductDTO> se = new HashSet<ProductDTO>();
		se.add(dto4);
		se.add(dto2);
		se.add(dto1);
		se.add(dto3);
		se.add(dto);
		
		System.out.println(se.size());
		Optional<ProductDTO> optio = se.stream().filter((e)->e.getId()>3).sorted((w,w1)->w.getName().compareTo(w1.getName())).findFirst();
		System.out.println(optio);
	}
}
