package com.xworkz.Dao.Pgs;

public class PgTester {
	public static void main(String[] args) {
		
		PgDao pg = new PgDao();
		pg.create("Monu pg");
		pg.create("Sunitha pg");
		pg.create("Haritha pg");
		pg.create("Chandu pg");
		
		boolean found = pg.read("Monu pg");
		System.out.println(found);
		
		boolean found1 = pg.caseSensitive("monu Pg");
		System.out.println(found1);
		
		boolean found2 = pg.caseSensitiveAndTrimmed("Haritha pg");
		System.out.println(found2);
	}

}
