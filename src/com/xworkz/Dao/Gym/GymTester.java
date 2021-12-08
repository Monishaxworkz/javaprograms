package com.xworkz.Dao.Gym;

public class GymTester {
	public static void main(String[] args) {
		
		GymDao gym = new GymDao();
		
		gym.create("Appu Gym");
		gym.create("hatrick Gym");
		gym.create("kiccha Gym");
		gym.create("Yash Gym");
		gym.create("Monu Gym");
		
		boolean value = gym.read("hatrick Gym");
		System.out.println(value);
		
		boolean value1 = gym.ignoreCases("kiccha Gym");
		System.out.println(value1);
		
		boolean value2 = gym.ignoreCasesAndSpaces("Appu Gym");
		System.out.println(value2);
	}

}
