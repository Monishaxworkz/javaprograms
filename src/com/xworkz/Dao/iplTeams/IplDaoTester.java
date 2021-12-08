package com.xworkz.Dao.iplTeams;

public class IplDaoTester {
	public static void main(String[] args) {
		
		IplDao ipl = new IplDao();
		
		ipl.create("K X1 p");
		ipl.create("R C B");
		ipl.create("M I");
		ipl.create("D C");
		ipl.create("C S K");
		
		boolean found = ipl.read("MI");
		System.out.println(found);
		
		boolean found1 = ipl.read("r c b");
		System.out.println(found1);
		
		boolean found2 = ipl.ignoreCaseSensitiveAndSpaces("Rcb");
		System.out.println(found2);
	}

}
