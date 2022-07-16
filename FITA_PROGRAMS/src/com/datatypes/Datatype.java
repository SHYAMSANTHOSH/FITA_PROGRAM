package com.datatypes;

public class Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		//int a= 890000;
		int a = 89000;
		boolean condition = false;
		int age = 17;
		String name = "Rahul";
		if(age > 18) {
			condition = true;
		}else {
			condition = false;
		}
		if(condition == true) {
			System.out.println(name + "Is eligible for vote");
		}else {
			System.out.println(name + "Is not eligible");
		}
		//short b = 89000;
		
		
	}

}
