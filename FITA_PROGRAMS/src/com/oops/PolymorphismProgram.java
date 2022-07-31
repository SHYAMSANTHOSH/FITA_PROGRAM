package com.oops;

public class PolymorphismProgram {
	
	public void shape(int a) {
		System.out.println("Square Value = " + a*a);
	}
	public void shape(int a,int b) {
		System.out.println("Rectable Value -> \n Length = " + a + "breadth =  " + b);
	}
	public void shape(int a,int b,int c) {
		System.out.println("Triangle Value -> \n Length = " + a + " Breadth = " + b + "Height = " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Compile time Polymorphism");
		PolymorphismProgram p = new PolymorphismProgram();
		p.shape(20);
		p.shape(10,20);
		p.shape(10,20,30);
		

	}

}
