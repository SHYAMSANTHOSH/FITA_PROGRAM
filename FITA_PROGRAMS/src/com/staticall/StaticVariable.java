package com.staticall;

public class StaticVariable {
	static String company = "CTS";
	public void displayEmployee(String name,int empid){
		System.out.println("Name : " + name + " Emp id : " + empid + " company " + StaticVariable.company);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sv = new StaticVariable();
		sv.displayEmployee("Mani", 198);
		sv.displayEmployee("Peter", 209);
		sv.displayEmployee("Shyam", 8);
		sv.displayEmployee("Barani", 27);
	}

}
