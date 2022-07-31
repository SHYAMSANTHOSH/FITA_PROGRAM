package com.oops;

public class EncapsulationProgram {
	
	private int num;
	private String name;
	private String dept;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num1) {
		this.num = num1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name1) {
		this.name = name1;
	}

	public static void main(String[] args) {
		// Wrapping of Data into Single Unit -> We can use getter and setter methods -> Store the value as private
		
		/*
		 * int num = 10; String name = "Shyam"; String dept = "CSE";
		 */
		
		EncapsulationProgram encap = new EncapsulationProgram();
		encap.setNum(10);
		encap.setName("SHYAM");
		System.out.println(encap.getName());
		System.out.println(encap.getNum());

	}

}
