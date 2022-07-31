package com.oops;

public class ObjectProgram {

	public void teamname(int id,String nameValue,String department) {
		System.out.println(nameValue + " is " + department + " and his employee id is : " + id);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int empid = 100;
		String name = "Shyam";
		String dep = "Developer";
		ObjectProgram op = new ObjectProgram();
		op.teamname(empid, name, dep);

	}

}
