package com.xworkz.clone.institute;

public class InstituteTester {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Institute ins=new Institute();
		ins.setName("Xworkz");
		ins.setType("training institute");
		ins.setHrName("Akshara");
		ins.setNoOfBranches(2);
		
		
		Object obj=ins.clone();
		Institute ins1=(Institute)obj;
		System.out.println(ins1.toString());
	}
}
