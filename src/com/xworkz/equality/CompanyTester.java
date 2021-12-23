package com.xworkz.equality;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.equality.dto.CompanyDTO;

public class CompanyTester {

	public static void main(String[] args) {
		
		CompanyDTO dto = new CompanyDTO(1,"capgemini","Aiman Ezzat",7648362568321.00);
		CompanyDTO dto1 = new CompanyDTO(2,"cognizant","Brian Humphries",186472621734.00);
		CompanyDTO dto2 = new CompanyDTO(3,"Accenture","Julie sweet",1672912673735.00);
		CompanyDTO dto3 = new CompanyDTO(4,"Wipro","Thierry Delaporte",342987546457.00);
		CompanyDTO dto4 = new CompanyDTO(5,"Apple","Tim cook",1234789465282.00);
		CompanyDTO dto5 = new CompanyDTO(6,"Apple","Tim cook",1234789465282.00);
		
		Set<CompanyDTO> dtos = new LinkedHashSet<CompanyDTO>();
		dtos.add(dto4);
		dtos.add(dto5);
		dtos.add(dto3);
		dtos.add(dto1);
		dtos.add(dto2);
		dtos.add(dto);
		
		boolean b = dto4.equals(dto5);
		System.out.println(b);
		
		Optional<CompanyDTO> optional = dtos.stream().filter((a)->a.getTurnOver()>140000000000.00).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
		
	}
}
