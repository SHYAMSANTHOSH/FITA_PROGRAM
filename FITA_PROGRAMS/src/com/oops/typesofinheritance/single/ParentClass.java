package com.oops.typesofinheritance.single;

public class ParentClass {

	int x = 100;
	String name = "Test";
	private long phone= 9876543210L;
	
	public void display(int num,String value) {
		System.out.println(num);
		System.out.print(value);
	}
	
	public void displayall(int num,String value,long ph) {
		System.out.println(ph + "-->" + value + "<--" + num);
	}
}
