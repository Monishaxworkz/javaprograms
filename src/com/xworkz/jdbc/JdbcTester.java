package com.xworkz.jdbc;

public class JdbcTester {

	public static void main(String[] args) {
		String driverFQN="com.mysql.cj.jdbc.Driver";
		System.out.println("load and register");
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
