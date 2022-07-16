package com.staticall;

public class StaticBlock {
	
	static int num = 50;
	static int num1 = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =11;
		System.out.println("Hello");
		System.out.println(num);
		System.out.println(StaticBlock.num);
	}
	
	
	static {
		System.out.println(num + "-> " + num1);
		System.out.println("Hai");
		
		System.out.println(10);
	}
	
	

}
